package exmp.musicdataapi.entity;

import java.util.List;

public class Albums {

    private Long id;
    private String name;
    private String artistName;
    private String releaseDate;
    private List<String> styleMusic;
    private String recordLabel; //gravadora

    //construtor
    public Albums(String name, String artistName, String releaseDate,
                  List<String> styleMusic, String recordLabel){
        this.name = name;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.styleMusic = styleMusic;
        this.recordLabel = recordLabel;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getStyleMusic() {
        return styleMusic;
    }

    public void setStyleMusic(List<String> styleMusic) {
        this.styleMusic = styleMusic;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
}
