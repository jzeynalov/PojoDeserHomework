
package pojo.game_of_thrones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

// https://api.got.show/api/book/characterlocations

public class CharacterLocationsPojo {

    private String message;
    private List<Object> data;
    private List<String> locations;
    private int _id;
    private String name;
    private String slug;
    private int __v;

}


    /*
    {
    "message": "Success",
    "data": [
        {
            "locations": [
                "Ashford",
                "Oldtown"
            ],
            "_id": "5cc08eb5888dfb00103ce5e9",
            "name": "Abelar Hightower",
            "slug": "Abelar_Hightower",
            "__v": 0
        },
     */


