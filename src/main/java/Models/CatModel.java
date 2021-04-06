package Models;

public class CatModel {
    private String id;
    private String name;
    private String description;
    private String wikipedia_url;
    private CatImage image;

    public CatModel(String id, String name, String description, String wikipedia_url, CatImage image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wikipedia_url = wikipedia_url;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public CatImage getImage() { return image; }

    public void setImage(CatImage image) { this.image = image; }
}



