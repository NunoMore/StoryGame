package khaell.stiffrain.storygame;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

class Story implements Parcelable {

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
        pages = new HashMap<String, Object>();

        in.readMap(pages, Map.class.getClassLoader());
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

    public class Page{
         private String text;
         private String type;
         private Map<String, Object> consequences;

         public Page(String text, String type, Map<String, Object> consequences) {
             this.text = text;
             this.type = type;
             this.consequences = consequences;
         }

         public Page() {

         }

         public String getText() {
             return text;
         }

         public String getType() {
             return type;
         }

         public  Map<String, Object> getConsequences() {
             return consequences;
         }
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
