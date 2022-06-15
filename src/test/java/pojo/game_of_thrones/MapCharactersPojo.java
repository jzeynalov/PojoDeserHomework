package pojo.game_of_thrones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

//https://api.got.show/api/map/characters

public class MapCharactersPojo {

    private List<Object> data;
    private  List<String> titles;
    private  List<String> books;
    private String message;
    private int _id;
    private String male;
    private String house;
    private String slug;
    private String name;
    private String createdAt;
    private String updatedAt;
    private int __v;
    private String imageLink;
    private String culture;

}


/*
{
    "message": "Success",
    "data": [
        {
            "titles": [
                "Ser"
            ],
            "books": [
                "The Hedge Knight"
            ],
            "_id": "5cc0743504e71a0010b84f3d",
            "male": true,
            "house": "House Hightower",
            "slug": "Abelar_Hightower",
            "name": "Abelar Hightower",
            "createdAt": "2019-04-24T14:35:33.772Z",
            "updatedAt": "2019-04-24T14:35:33.772Z",
            "__v": 0
        },
 */