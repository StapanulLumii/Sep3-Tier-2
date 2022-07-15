import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IGame {

    ArrayList<Game> Games = new ArrayList<Game>();

    public Games AddId(int id);

    public Games RemoveId(int id);
    public Games AddName(String Name);
    public Games RemoveName(String Name);
    public Games AddDescription(String Description);
    public Games RemoveDescription(String Description);
    public Games AddImage();
    public Games RemoveImage();
    public Games AddPrice(double Price);
    public Games RemovePrice(double Price);
    public Games AddCategory();
    public Games RemoveCategory();

    public  Games GetGames();
}