/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songs;

/**
 *
 * @author njugu
 */
public class Info {
    private String songTitle;
    private String artistName;
    private int releaseYear;
    
    public void printInfo(){
        System.out.println("The song '" + getSongTitle() + "' was sang by '" + getArtistName() + "' and was released in the year " + getReleaseYear() + ".");
    }

    /**
     * @return the songTitle
     */
    public String getSongTitle() {
        return songTitle;
    }

    /**
     * @param songTitle the songTitle to set
     */
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    /**
     * @return the artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName the artistName to set
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return the releaseYear
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * @param releaseYear the releaseYear to set
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
}
