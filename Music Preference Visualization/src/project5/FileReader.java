package project5;

import java.util.Scanner;

/**
 * Used to gather data from csv files provided
 * @author Faizan Hasnany fhasnany
 * @author Daniel Xu xudy13
 * @author Jonathan Yu jyu96
 * @version 11.17.2015
 *
 */
public class FileReader 
{
    // Constructor
    /**
     * This will take in a string of the file's name
     * that will be parsed through for data.
     */
    public FileReader(String file)
    {
        
    }
    
    // Method
    /**
     * Scans the file for data and returns all of the
     * data in the form of a StudentBody, or a
     * DoublyLinkedList of students.
     * 
     * @return sBody studentBody based off of survey data
     */
    public StudentBody readSurveyData(String surveyFileName)
    {
        StudentBody sBody = new StudentBody();
        Scanner scan = new Scanner(surveyFileName);
        String s = "";
        String[] sArray = null;
        
        // While scanner has a next line
        while (scan.hasNextLine())
        {
            // Split the string by commas
            s = scan.nextLine();
            sArray = s.split(",");
            
            // Creates a student from the data if the Major, Region,
            // and hobbies slot are filled out.
            if (!(sArray[2] == "") && !(sArray[3] == "") && !(sArray[4] == ""))
            {
                // Recreates the sArray with only the song heard/like info
                // -5 because student#, date, major, hobby, and region
                String[] studentInfo = new String[sArray.length - 5];
                for (int index = 0; index < sArray.length - 5; index++)
                {
                    // +5 to ignore the first 5 columns of data
                    studentInfo[index] = sArray[index + 5];
                }
                // Adds the student into the studentBody
                Student newStudent = new Student(sArray[2], sArray[3],
                        sArray[4], studentInfo);
                sBody.add(newStudent);
            }
            
            // If they are not, the loop will continue and reset data
            s = "";
            sArray = null;
        }
        scan.close();
        return sBody;
    }
    
    /**
     *    // TODO
     * @param songFileName
     * @return
     */
    public SongList readSongData(String songFileName)
    {
        SongList sList = new SongList();
        Scanner scan = new Scanner(songFileName);
        
        while (scan.hasNextLine())
        {
            String s = scan.nextLine();
            String[] sArray = s.split(",");
            
            // song file has it in format of
            // SongTitle,ArtistName,Year,genre
            Song newSong = new Song(sArray[0], sArray[1], 
                    Integer.valueOf(sArray[2]), sArray[3]);
            sList.add(newSong);
        }
        
        return sList;
    }
    
    // Main/Input
    /**
     *     // TODO
     * @param args
     */
    public static void main(String[] args)
    {
        
    }
}
