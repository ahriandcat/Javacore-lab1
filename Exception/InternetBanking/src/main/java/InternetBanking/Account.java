package InternetBanking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {
    private String phoneNumber;
    private String passWord;
    private double money;

    @Override
    public String toString() {
        return "InternetBanking.Account{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", passWord='" + passWord + '\'' +
                ", money=" + money +
                '}';
    }
}
