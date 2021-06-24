import java.util.ArrayList;
public class TVEpisode {
    private String episode;
    private int epLength;
    private String director;
    private ArrayList<String> cast;

    public TVEpisode(String episode, int epLength, String director, ArrayList<String> cast) {
        this.episode = episode;
        this.epLength = epLength;
        this.director = director;
        this.cast = cast;
    }
    public void tvReturn() {
        System.out.println(episode + " " + epLength + " "
                + director + " " + cast);
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public int getEpLength() {
        return epLength;
    }

    public void setEpLength(int epLength) {
        this.epLength = epLength;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }
}
