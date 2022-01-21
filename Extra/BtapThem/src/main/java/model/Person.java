package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private LocalDate DoB;
    private Gender gender;
    private String home_town;
    private String phone_number;
    private String email;

    @Override
    public String toString() {
        return
                "Id : " + id +
                ", Tên : " + name +
                ", Ngày sinh : " + DoB +
                ", Giới tính : " + gender +
                ", Quê quán : " + home_town +
                ", Số điện thoại : " + phone_number  +
                ", email : " + email ;
    }
}
