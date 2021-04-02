package Models;

public class CatModel {
    private String id;
    private String breed;
    private String description;
    private String wikipedia_url;

    public CatModel(String id, String breed, String description, String wikipedia_url) {
        this.id = id;
        this.breed = breed;
        this.description = description;
        this.wikipedia_url = wikipedia_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWikipedia_url() {
        return wikipedia_url;
    }

    public void setWikipedia_url(String wikipedia_url) {
        this.wikipedia_url = wikipedia_url;
    }
}



