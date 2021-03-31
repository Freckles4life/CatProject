public class CatModel {
    private int id;
    private String name;
    private String description;
    private String wikipedia_url;

    public CatModel(int id, String name, String description, String wikipedia_url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wikipedia_url = wikipedia_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}

