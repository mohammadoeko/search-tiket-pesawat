package com.tes.soaltiga.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tes.soaltiga.appium.pages.SearchFlight;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSearchFlight {

        private AndroidDriver<MobileElement> driver;
        private SearchFlight searchFlight;

        @BeforeClass
        public void setUp() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "M2010J19CG");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("appPackage", "com.traveloka.android");
            capabilities.setCapability("appActivity", "com.traveloka.android.appentry.splash.SplashActivity");
            capabilities.setCapability("appium:ignoreHiddenApiPolicyError", "true");


            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }

        @BeforeMethod
        public void pageObject() {
            searchFlight = new SearchFlight(driver);
        }


        @Test
        public void testSearchPenerbangan() {
            searchFlight.searchPenerbangan();
            System.out.println("Search Penerbangan");
            Assert.assertEquals(searchFlight.getTxtResultPenerbangan(), "Surabaya   Banyuwangi");
        }

//        @AfterClass
//        public void closeApp() {
//            driver.quit();
//        }

    private static ExtentTest extentTest;

    @When("TCC.001.SearchTiketPesawat.User click menu tiket pesawat di dashboard")
    public void tcc_001_search_tiket_pesawat_user_click_menu_tiket_pesawat_di_dashboard() {
        searchFlight.clickTiketPesawat();
        extentTest.log(LogStatus.PASS,"click menu tiket pesawat di dashboard");
    }

    @And("TCC.001.SearchTiketPesawat.User memasukkan penerbangan dari")
    public void tcc_001_search_tiket_pesawat_user_memasukkan_penerbangan_dari() {
//        Hooks.delay(2);
        searchFlight.penerbanganDari("Surabaya");
        extentTest.log(LogStatus.PASS,"memasukkan penerbangan dari");
    }

    @And("TCC.001.SearchTiketPesawat.User memasukkan penerbangan ke")
    public void tcc_001_search_tiket_pesawat_user_memasukkan_penerbangan_ke() {
        searchFlight.penerbanganKe("Banyuwangi");
        extentTest.log(LogStatus.PASS,"memasukkan penerbangan ke");
    }

    @And("TCC.001.SearchTiketPesawat.User memasukkan tanggal berangkat")
    public void tcc_001_search_tiket_pesawat_user_memasukkan_tanggal_berangkat() {
        searchFlight.tanggalBerangkat();
        extentTest.log(LogStatus.PASS,"memasukkan tanggal berangkat");
    }

    @And("TCC.001.SearchTiketPesawat.User memilih pulang pergi")
    public void tcc_001_search_tiket_pesawat_user_memilih_pulang_pergi() {
        for (int i = 0; i<2; i++) {
            searchFlight.pulangPergi();
        }
        extentTest.log(LogStatus.PASS,"memilih pulang pergi");
    }

    @And("TCC.001.SearchTiketPesawat.User memasukkan jumlah penumpang")
    public void tcc_001_search_tiket_pesawat_user_memasukkan_jumlah_penumpang() {
        searchFlight.jumlahPenumpang();
        extentTest.log(LogStatus.PASS,"memasukkan jumlah penumpang");
    }

    @And("TCC.001.SearchTiketPesawat.User memilih kelas penerbangan")
    public void tcc_001_search_tiket_pesawat_user_memilih_kelas_penerbangan() {
        searchFlight.kelasPenerbangan();
        extentTest.log(LogStatus.PASS,"memilih kelas penerbangan");
    }

    @And("TCC.001.SearchTiketPesawat.User klik button search")
    public void tcc_001_search_tiket_pesawat_user_klik_button_search() {
        searchFlight.btnSearch();
        extentTest.log(LogStatus.PASS,"klik_button_search");
    }

    @Then("TCC.001.SearchTiketPesawat.User menampilkan penerbangan sesuai yang diinputkan")
    public void tcc_001_search_tiket_pesawat_user_menampilkan_penerbangan_sesuai_yang_diinputkan() {
        Assert.assertEquals(searchFlight.getTxtResultPenerbangan(), "Surabaya   Banyuwangi");
        extentTest.log(LogStatus.PASS,"memilih kelas penerbangan");
    }
}
