import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter

public class User extends UserDetail {
    private String passWord;

    public User(int userID, String phoneNum, String email, String address, String name, String passWord) {
        super(userID, phoneNum, email, address, name);
        this.passWord = passWord;
    }
}
