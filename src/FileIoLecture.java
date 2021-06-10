import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class FileIoLecture {

    public void readFileAndOutput(Path pathToFile) {
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String line : currentList) {
            System.out.println(line);
        }
    }


    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path); //Looks like it returns a string but it is not. It is a representation of the "path" object
//        System.out.println(path.toAbsolutePath());//This show path all the way from root/hard drive.

//        Path path = Paths.get("src", "FileIOLecture.java"); //Takes string, can take multiple arguments. Cannot take more than one path.
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        Path pathToSrc = Paths.get("src");
//        System.out.println(pathToSrc);
//        Path thisWillWork = Paths.get(String.valueOf(pathToSrc), "FileIOLecture.java");

        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");

//        try {
//            if(Files.notExists(toOurDataPlace)){
//                Files.createDirectories(toOurDataPlace);
//            } else {
//                System.out.println("The " + toOurDataPlace + " directory already exists.");
//            }
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }

        //Create a file
        try {
            if (Files.notExists(toOurDataFile)) {
                Files.createFile(toOurDataFile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
//
//        Write to a file//
//        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messalina", "Julia Donna");
//
//        try {
//            2 arguments for Files.write
//            The path to our file, the data we want to write
//            Files.write(toOurDataFile, romanEmpresses);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        //Read from a file//

        //Create a place to put information we read from the file
        List<String> currentList = new ArrayList<>();

        //Read the information from the file
        try {
            currentList = Files.readAllLines(toOurDataFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //Loop through the ArrayList and output each item
        for (String line : currentList) {
            System.out.println(line);
        }

        FileIoLecture io = new FileIoLecture();
        io.readFileAndOutput(toOurDataFile);


        //Append a single item to our list

//        try{
//            Files.writeString(toOurDataFile, "Carrington\n", StandardOpenOption.APPEND);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }

//        io.readFileAndOutput(toOurDataFile);

        //Append a list to a list

        List<String> lateRomanEmpresses = new ArrayList<>();
        lateRomanEmpresses.add("Gallas Placidia");
        lateRomanEmpresses.add("Theodora");
        lateRomanEmpresses.add("Licinia Eudoxia");

//        try{
//            Files.write(toOurDataFile, lateRomanEmpresses, StandardOpenOption.APPEND);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        io.readFileAndOutput(toOurDataFile);

        List<String> currentlist = new ArrayList<>();
        try{
            currentlist = Files.readAllLines(toOurDataFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        Iterator<String> listIterator = currentlist.iterator();
        while(listIterator.hasNext()){
            String empress = listIterator.next();
            if (empress.equals("Carrington")){
                listIterator.remove();
            }
            if (empress.equals("Julia Donna")){
                listIterator.remove();
            }
            if (empress.equals("Gallas Placidia")){
                listIterator.remove();
            }
        }

        try{
            Files.write(toOurDataFile, currentlist);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        io.readFileAndOutput(toOurDataFile);
    }
}
