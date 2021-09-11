package my_Comp_ArrayList_Classes;

import java.util.ArrayList;

public class Notes {
    //fields
    private int width;
    private int height;
    private ArrayList<Notes_Sections> note_sections;

    //Constructor
    public Notes(int width, int height) {
        this.width = width;
        this.height = height;
        this.note_sections = new ArrayList<Notes_Sections>();
    }

    //Methods
    public void addNoteSection(Notes_Sections noteSections) {
        note_sections.add(noteSections);
    }

//    public void printList(Notes_Sections noteSections) {
//        String name = noteSections.getName();
//        String date = noteSections.getDate();
//        String time = noteSections.getTime();
//        System.out.println(name + " " + date + " " + time);
//    }

    public String toString() {
     return "Note Pad Height = " + height + " Note Pad Width = " + height;
    }

    public String Notes_SectionsInfo(Notes_Sections noteSections) {
        String info = "Notes section name: " + noteSections.getName() + ", Note section date: " + noteSections.getDate() + ", Note section time: " + noteSections.getTime();
        return info;
    }
}
