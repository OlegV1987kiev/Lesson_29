import io.restassured.path.json.JsonPath;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;


public class TestClassAPI {
    @BeforeClass

    public static void setUp() {


        baseURI = "http://5e184eb9eaa1d2001436e233.mockapi.io/test29/";


    }


    @Test

    public void getAllUsers() {
        given().

                when().

                get("/users").

                then().

                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();

    }

    @Test

    public void createUser() {


        Users user = new Users("name", "test", "erere", 12);

        final JsonPath jsonPath =

                given()

                        .body(user).

                        when()

                        .post("/users").

                        then()

                        .assertThat().statusCode(201)

                        .extract().body().jsonPath();

        jsonPath.prettyPrint();
    }

    @Test

    public void getUserById() {
        Users user = new Users("name", "test", "erere", 4);


        given()
                .body(user).
                when().
              get("/users/4" ).

                then().

                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();

    }
    @Test
    public void updateUserById() {


        Users user = new Users("2020-01-13T03:26:10.042Z", "Ms. Brook", "https://s3.amazonaws.com/uifaces/faces/twitter/derekcramer/126.jpg", 5);

         JsonPath jsonPath =

                given()

                        .body(user).put("/users/{id}" , 5).





                        then()

                        .assertThat().statusCode(200)

                        .extract().body().jsonPath();

        jsonPath.prettyPrint();
    }
    @Test
    public void deleteUserById() {
        final JsonPath jsonPath =

                when().

                        delete("/users/{id}", 4).

                        then()

                        .assertThat().statusCode(200)

                        .extract().body().jsonPath();

        jsonPath.prettyPrint();
    }
}
