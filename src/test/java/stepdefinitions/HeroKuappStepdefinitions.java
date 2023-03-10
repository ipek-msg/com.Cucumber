package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HeroKuappStepdefinitions {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
        Thread.sleep(2000);
        //beklemeye gerek yok ama soruda oldugu için bekledik

    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonu.click();

    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        int flags = 3;

        try {
            herokuappPage.deleteButonu.click();
            Assert.assertFalse(flags == 3);
            // exception olusmazsa bekledigimiz durum gerceklesmedi demektir
            // bu durumda test failed olmali
            // bunun icin 43.satirda failed olacak bir assertion yazdim
        } catch (NoSuchElementException e) {
            Assert.assertTrue(flags == 3);
            // 32.satirda delete butonu gorunmuyorsa exception olusur
            // bu bizim bekledigimiz durum oldugundan testin passed olmasi gerekir
            // exception olusunca onu catch ile yakaladik ve
            // 48.satirda PASSED olacak bir assertion yazdik


        }

    }
}
