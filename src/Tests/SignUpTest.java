package Tests;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;


public class SignUpTest extends BaseTest {

    @Test
    public void signInTest(){

        beforeTest();
        signin.goTo();
        signin.correctLogin("paulorossi86@gmail.com", "test@12345");

        assert home.hasPagesLink() == true : "Prueba exitosa";
        assertTrue(home.hasPagesLink());
        cleanTest();
    }

    @Test
    public void signInNo(){

        beforeTest();
        signin.goTo();

        signin.noUser("joel@gmail.com", "12834567");
        cleanTest();
    }

    @Test
    public void signInNPassword(){

        beforeTest();
        signin.goTo();
        signin.setNoPassword("paulorossi86@gmail.com", "000");
        cleanTest();
    }
}