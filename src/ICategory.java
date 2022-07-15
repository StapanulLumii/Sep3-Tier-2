import java.util.ArrayList;
import java.util.Locale;

public interface ICategory {
    public ArrayList<Locale.Category> Categories = ArrayList< Locale.Category >();

    public Categories AddCategoryId(int CategoryId);
    public Categories AddCategoryName(String CategoryName);
    public Categories AddUrl(String URL);
}
