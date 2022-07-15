import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IGame {

    ArrayList<Game> Games = new ArrayList<Game>();

    public Games AddId(int GameId);

    public Games RemoveId(int Gameid);
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

    public  Games GetGames(int GameId);
}