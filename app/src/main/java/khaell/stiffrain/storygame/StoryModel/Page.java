package khaell.stiffrain.storygame.StoryModel;

import java.util.Map;

public class Page {

     private String text;
     private String type;
     private Map<String, Map<String, Object>> actions;

     public Page(String text, String type, Map<String, Map<String, Object>> actions) {
         this.text = text;
         this.type = type;
         this.actions = actions;
     }

     public Page() {

     }

     public String getText() {
         return text;
     }

     public String getType() {
         return type;
     }

     public  Map<String, Map<String, Object>> getActions() {
         return actions;
     }

}
