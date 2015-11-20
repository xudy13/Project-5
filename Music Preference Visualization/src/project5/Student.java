package project5;

/**
 * This class will be used to import and store
 * data that is gathered from the given files
 * 
 * @author Faizan Hasnany fhasnany
 * @author Daniel Xu xudy13
 * @author Jonathan Yu jyu96
 * @version 11.17.2015
 *
 */
public class Student 
{
    // Fields
    private String[] info;
    private String hobby;
    private String region;
    private String major;
    
    // Constructor
    /**
     * Establishes a student
     * @param hobby hobby of the student
     * @param region region student is from
     * @param major major student is in
     */
    public Student(String hobby, String region, String major, 
            String[] info)
    {
        this.hobby = hobby;
        this.region = region;
        this.major = major;
        this.info = info;
    }
    
    // Methods
    /**
     * Returns yes if student has heard song
     * @param songName Song that would be heard
     * @return If song has been heard = yes, no otherwise
     */
    public boolean getHeard(String songName)
    {
        // TODO Use the getinfo method
        return false;
    }
    
    /**
     * Returns yes if student likes song
     * @param songName Song that may be liked
     * @return If the song is liked = yes, no otherwise
     */
    public boolean getLike(String songName)
    {
        // TODO Use the getinfo method
        return false;
    }
    
    /**
     * Returns the hobby of the student
     * @return hobby of the student
     */
    public String getHobby()
    {
        return hobby;
    }
    
    /**
     * Returns the region of the student
     * @return region of the student
     */
    public String getRegion()
    {
        return region;
    }
    
    /**
     * Returns the major of the student
     * @return major of the student
     */
    public String getMajor()
    {
        return major;
    }
    
    /**
     * Returns the likes/heard of the student
     * @return likes/heard of the student
     */
    private String[] getInfo()
    {
        return info;
    }
}
