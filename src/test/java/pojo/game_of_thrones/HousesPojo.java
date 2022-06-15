package pojo.game_of_thrones;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter

//https://api.got.show/api/book/houses

public class HousesPojo {

    private List<String> titles;
    private List<String> overlords;
    private List<String> ancestralWeapon;
    private String _id;
    private String  name;
    private String image;
    private String coatOfArms;
    private String words;
    private String currentLord;
    private String seat;
    private String region;
    private String founded;
    private String founder;
    private String cadetBranch;
    private String heir;
    private String  isExtinct;
    private String createdAt;
    private String updatedAt;
    private int __v;

}


/*
[
    {
        "titles": [
            "Seagard"
        ],
        "overlords": [
            "House Tully",
            "House Baelish"
        ],
        "ancestralWeapon": [],
        "_id": "5cc08102888dfb00103ccb9b",
        "name": "House Mallister",
        "image": "https://awoiaf.westeros.org/thumb.php?f=House_Mallister.svg&width=250",
        "coatOfArms": "A silver eagle, displayed, on an indigo field(Purpure, an eagle displayed argent)",
        "words": "Above the Rest",
        "currentLord": "Jason Mallister",
        "seat": "Seagard",
        "region": "Riverlands",
        "founded": null,
        "founder": null,
        "cadetBranch": null,
        "heir": "Patrek Mallister",
        "isExtinct": false,
        "createdAt": "2019-04-24T15:30:10.309Z",
        "updatedAt": "2019-04-24T15:30:10.309Z",
        "__v": 0
    },
 */