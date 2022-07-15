import java.util.ArrayList;
import java.util.Date;

public interface IUser {

    public ArrayList<User> Users = new ArrayList<User>();

    public Users AddUserId(int UserId);
    public Users RemoveUserId(int UserId);
    public Users AddEmail(String Email);
    public Users RemoveEmail(String Email);
    public Users AddPassword(String Password);
    public Users RemovePassword(String Password);
    public Users AddAdmin(boolean isAdmin);
    public Users AddDateCreated(Date DateCreated);

    public Users GetUsers(int Userid);
}

