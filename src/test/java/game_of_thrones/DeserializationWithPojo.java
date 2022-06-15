package game_of_thrones;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.junit.Test;
import pojo.game_of_thrones.BookCharacterPojo;
import pojo.game_of_thrones.MapCharactersPojo;
import pojo.game_of_thrones.HousesPojo;
import pojo.game_of_thrones.CharacterLocationsPojo;


import java.io.IOException;

public class DeserializationWithPojo {

/*--------------------------------------------------------------------------------------------------------------------*/

    @Test
    public void namesFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        BookCharacterPojo[] bookCharacters = objectMapper.readValue(response.getEntity().getContent(), BookCharacterPojo[].class);

        for (BookCharacterPojo character : bookCharacters) {
            System.out.println(character.getName());
        }
    }

    @Test
    public void housesFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/houses");

        ObjectMapper objectMapper = new ObjectMapper();
        HousesPojo[] houses = objectMapper.readValue(response.getEntity().getContent(), HousesPojo[].class);

        for (HousesPojo house : houses) {
            System.out.println(house.getName());
        }
    }

    @Test
    public void characterLocationsFromGOT() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/book/characterlocations");

        ObjectMapper objectMapper = new ObjectMapper();
        CharacterLocationsPojo characterLocations = objectMapper.readValue(response.getEntity().getContent(), CharacterLocationsPojo.class);

        System.out.println(characterLocations.getData());
    }

    @Test
    public void getCharacter() throws IOException {
        HttpResponse response = HttpClientUtils.getGetResponse("https://api.got.show/api/map/characters");

        ObjectMapper objectMapper = new ObjectMapper();
        MapCharactersPojo mapCharacters = objectMapper.readValue(response.getEntity().getContent(), MapCharactersPojo.class);

        System.out.println(mapCharacters.getData());
    }
}



