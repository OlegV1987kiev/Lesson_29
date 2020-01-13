package lesson_home_work;

import io.restassured.path.json.JsonPath;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

class TestApicall {


    @BeforeClass

    public static void setUp() {



        // First step - set up the base URI

        baseURI = "http(s)://5e184eb9eaa1d2001436e233.mockapi.io/test29/";

    }


    @Test

    public void deleteAnEmployee() {

        final JsonPath jsonPath =

                when().

                        get("/delete/{id}", 139293).

                        then()

                        .assertThat().statusCode(200)

                        .extract().body().jsonPath();

        jsonPath.prettyPrint();

    }
}
