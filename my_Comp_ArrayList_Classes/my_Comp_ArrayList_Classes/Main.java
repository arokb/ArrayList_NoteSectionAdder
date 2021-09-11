package my_Comp_ArrayList_Classes;

public class Main {
    public static void main(String[] args) {
        Notes_Sections noteSections1 = new Notes_Sections("Sports", "Feb 20, 2022", "2:30pm");
        Notes noteTab = new Notes(10, 10);

        noteTab.addNoteSection(noteSections1);

        System.out.println(noteTab + "\n" + noteTab.Notes_SectionsInfo(noteSections1));

        Notes_Sections noteSections2 = new Notes_Sections("Games", "June 20, 2022", "6:00pm");
        noteTab.addNoteSection(noteSections2);

        System.out.println(noteTab + "\n" + noteTab.Notes_SectionsInfo(noteSections2));
    }
}
