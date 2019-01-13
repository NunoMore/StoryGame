package khaell.stiffrain.storygame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

class Story {

     private String title;
     private String description;
     private ArrayList<Page> pages;

    public Story(String title, String description, ArrayList<Page> pages) {
        this.title = title;
        this.description = description;
        this.pages = pages;
    }

    public Story(){

     }

     private class Page{
         private String text;
         private String type;
         private Map<String, Object> consequences;

         public Page(String text, String type, Map<String, Object> consequences) {
             this.text = text;
             this.type = type;
             this.consequences = consequences;
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

}
