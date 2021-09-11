package my_Comp_ArrayList_Classes;

public class Notes_Sections {
    //Fields
    private String name;
    private String date;
    private String time;

    //Constructor
    public Notes_Sections(String name, String date, String time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    //Methods
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    //Do not require this method but would be better to implement
    public Notes_Sections notes_sections (String name, String date, String time) {
       Notes_Sections notes_sections = new Notes_Sections(name, date, time);
       return notes_sections;
    }
}
