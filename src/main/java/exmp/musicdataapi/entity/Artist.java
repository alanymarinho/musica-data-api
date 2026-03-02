package exmp.musicdataapi.entity;

import java.util.List;

public class Artist {

    private Long id;
    private String name;
    private Boolean inActivity;
    private String activityPeriod;
    private String type;
    private List<String> styleMusic;

    //construtor
    public Artist(String name, Boolean inActivity, String activityPeriod,String type, List<String> styleMusic){
        this.name = name;
        this.inActivity = inActivity;
        this.activityPeriod = activityPeriod;
        this.type = type;
        this.styleMusic = styleMusic;
    }

    public Artist(){}

    //getters and setters
    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getInActivity(){
        return inActivity;
    }

    public String getActivityPeriod() {
        return activityPeriod;
    }

    public String getType() {
        return type;
    }

    public List<String> getStyleMusic() {
        return styleMusic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInActivity(Boolean inActivity){
        this.inActivity = inActivity;
    }

    public void setActivityPeriod(String activityPeriod) {
        this.activityPeriod = activityPeriod;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStyleMusic(List<String> styleMusic) {
        this.styleMusic = styleMusic;
    }



}
