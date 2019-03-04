import java.io.IOException;
import java.util.ArrayList;


public class AllNotes extends CommonCode {
 private ArrayList<Note> allNotes = new ArrayList<>();
 private String crse = "";
 AllNotes() {
 readAllNotes();
 }
 private void readAllNotes() {
 ArrayList<String> readNotes = new ArrayList<>();
 readNotes = readTextFile(appDir + "\\Notestemp.txt");
 System.out.println(readNotes.get(0));
 if ("File not found".equals(readNotes.get(0))) {
 } else {
 allNotes.clear();
 for (String str : readNotes) {
 String[] tmp = str.split("\t");
 Note n = new Note();
 n.setNoteID(Integer.parseInt(tmp[0]));
 n.setCourse(tmp[1]);
 n.setDayte(tmp[2]);
 n.setNote(tmp[3]);
 allNotes.add(n);
 }
 }
 }
 public void addNote(int noteID, String course, String note) {
 Note myNote = new Note();
 myNote.setNoteID(noteID);
 myNote.setCourse(course);
 myNote.setDayte();
 myNote.setNote(note);
 allNotes.add(myNote);
 writeAllNotes();
 }
 public ArrayList<Note> getAllNotes() {
 return allNotes;
 }
 private void writeAllNotes() {
 String path = appDir + "\\Notestemp.txt";
 ArrayList<String> writeNote = new ArrayList<>();
 for (Note n : allNotes) {
 String tmp = n.getNoteID() + "\t";
 tmp += n.getCourse() + "\t";
 tmp += n.getDayte() + "\t";
 tmp += n.getNote();
 writeNote.add(tmp);

 }
 try {
 writeTextFile(path, writeNote);
 } catch (IOException ex) {
 System.out.println("Problem! " + path);
 }
 }
}