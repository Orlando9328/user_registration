import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserRegister {

    //Declarando nuestra variable
    private WebDriver driver;

    //Pre condiciones
    @Before
    public void setUp(){

        //Establecemos la ruta donde se encuentra nuestro driver
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");

        //Inicializamos variable
        driver = new ChromeDriver();

        //Obtén el control de la ventana del navegador, y luego maximízala para que ocupe toda la pantalla
        driver.manage().window().maximize();

        //Abrir una URL específica en la ventana del navegador controlada por WebDriver
        driver.get("https://buggy.justtestit.org/");

        //Busca y encuentra un elemento en la página web. Lo asigna a la variable para interactuar con el
        WebElement registerButton = driver.findElement(By.className("btn-success-outline"));

        //Simula hacer clic en el botón representado por el elemento web almacenado
        registerButton.click();

    }

    //Registrar un nuevo usuario llenando todos los campos exitosamente
    @Test
    public void successfulRegistration(){

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("orlando_sorto12345689");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Orlando");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Sorto");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Holamundo1@");

        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("Holamundo1@");

        WebElement button = driver.findElement(By.className("btn-default"));
        button.click();

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
