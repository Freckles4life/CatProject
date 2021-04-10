package Models;

public class CatImage {
    private int height;
    private String id;
    private String url;
    private int width;

    public CatImage() { }

    public CatImage(int height, String id, String url, int width) {
        this.height = height;
        this.id = id;
        this.url = url;
        this.width = width;
    }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() { return width; }

    public void setWidth(int width) {this.width = width; }
}
