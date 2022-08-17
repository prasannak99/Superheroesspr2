package utils;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.Header;
import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestListener;

import static io.restassured.RestAssured.given;

public class TestngListener implements ITestListener {
    public static JSONObject UserData;

    @Override
    public void onStart(ITestContext context){
        UserData= JsonInputParser.inputData();
        QAProperties.init();
        RestAssured.baseURI=QAProperties.getValue("baseurl");
        RestAssured.requestSpecification=given().header(new Header("Accept","application/json")).
                header(new Header("Content-Type","application/json")).
                header(new Header("Authorization","Basic dXNlcm5hbWU6cGFzc3dvcmQ=" )).log().all();
        RestAssured.responseSpecification=new ResponseSpecBuilder().log(LogDetail.ALL).build();
    }
}
