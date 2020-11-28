package co.com.ceiba.mobile.pruebadeingreso.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(suppressConstructorProperties = true)
@NoArgsConstructor
public class PostModel {

    public int id;
    public int userId;
    public String body;
    public String title;

}
