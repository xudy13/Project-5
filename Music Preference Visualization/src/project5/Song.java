package project5;

/**
 * This class will be used to import and store
 * data that is gathered from the given files
 * like student, but for songs.
 * 
 * @author Faizan Hasnany fhasnany
 * @author Daniel Xu xudy13
 * @author Jonathan Yu jyu96
 * @version 11.17.2015
 *
 */
public class Song 
{
    //_________________________________________________
    // Fields
    //_________________________________________________
    private String songTitle;
    private String artistName;
    private String genre;
    private int year;
    
    //_________________________________________________
    // Constructor
    //_________________________________________________
    /**
     * Constructor for each song
     * 
     * @param songTitle title of the song
     * @param artistName name of the artist
     * @param genre genre of the song
     * @param year year the song was released
     */
    public Song(String songTitle, String artistName, 
            int year, String genre)
    {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.genre = genre;
        this.year = year;
    }
    
    //_________________________________________________
    // Methods
    //_________________________________________________
    /**
     * This method returns the title of the song
     * @return returns title of the song
     */
    public String getSongTitle()
    {
        return songTitle;
    }
    
    /**
     * This method returns the artistName of the song
     * @return returns name of the artist of the song
     */
    public String getArtistName()
    {
        return artistName;
    }
    
    /**
     * This method returns the genre of the song
     * @return returns genre of the song
     */
    public String getGenre()
    {
        return genre;
    }
    
    /**
     * This method returns the year of the song
     * @return year of release of song
     */
    public int getYear()
    {
        return year;
    }
}
