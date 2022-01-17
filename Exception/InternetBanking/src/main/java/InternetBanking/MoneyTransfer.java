package InternetBanking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DecimalFormat;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MoneyTransfer {
    static DecimalFormat format = new DecimalFormat("###,###");
    private Bank bank;
    private String accountNumber;
    private double money;
    private String Note;

    @Override
    public String toString() {
        return "Số TK thụ hưởng : "+ accountNumber + " - " +"Ngân hàng : "+bank+ " - "+"Số tiền chuyển : "+ format.format(money)+" Vnd"+" - "+"Ghi chú : "+getNote();
    }
}
