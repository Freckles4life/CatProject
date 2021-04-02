import Models.CatModel;

public class Program {
    public static void main(String[] args) {
        CatApiClient client = new CatApiClient();
        CatModel[] result = client.GetCatBreeds();
        System.out.println(result);
    }
}
