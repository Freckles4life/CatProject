package Models;

public class CatModel {
    private String id;
    private String name;
    private String description;
    private String temperament;
    private CatImage image;

    public CatModel(String id, String name, String description, String wikipedia_url, CatImage image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.temperament = temperament;
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

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public CatImage getImage() { return image; }

    public void setImage(CatImage image) { this.image = image; }
}



