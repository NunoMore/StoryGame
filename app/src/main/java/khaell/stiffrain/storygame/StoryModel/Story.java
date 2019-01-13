package khaell.stiffrain.storygame.StoryModel;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Story implements Parcelable {

    private String title;
    private String description;
    private Map<String, Object> pages;

    public Story(String title, String description, Map<String, Object> pages) {
        this.title = title;
        this.description = description;
        this.pages = pages;
    }

    public Story(){

    }

    public static final Creator<Story> CREATOR = new Creator<Story>() {
        @Override
        public Story createFromParcel(Parcel in) {
            return new Story(in);
        }

        @Override
        public Story[] newArray(int size) {
            return new Story[size];
        }
    };

    public Story(Parcel in) {
        title = in.readString();
        description = in.readString();
        HashMap<String, HashMap<String, HashMap<String, Map<String, Object>>>> parcelPages = new HashMap<>();

        in.readMap(parcelPages, Map.class.getClassLoader());

        int i = 0;
        for ( HashMap<String, HashMap<String, Map<String, Object>>> page : parcelPages.values() ) {

            pages.put("page"+i, new Page(
                    page.get("text").toString(),
                    page.get("type").toString(),
                    page.get("actions")));
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeMap(pages);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Object> getPages() {
        return pages;
    }
}
