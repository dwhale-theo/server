package dwhale.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Clap {

    private String id;
    private int price;
    public String name;
    public String description;
    public String image;
    public String email;
}