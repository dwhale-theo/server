package dwhale.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Clap {
    public String email;
    public String password;
    public String name;
    public String nickname;
    public String phone;
    public String address;
    public int age;
    public int money;
}