package com.tes.soaltiga.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchFlight {
    private AndroidDriver driver;

    public SearchFlight(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.traveloka.android:id/input_country")
    MobileElement clickYourLocation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    MobileElement selectCountry;

    @AndroidFindBy(id = "com.traveloka.android:id/on_board_button_continue")
    MobileElement btnLanjutkan;

    @AndroidFindBy(id = "com.traveloka.android:id/text_skip")
    MobileElement btnLewati;

    @AndroidFindBy(id = "com.traveloka.android:id/button_tooltip")
    MobileElement btnLanjutJelajah;

    @AndroidFindBy(id = "com.traveloka.android:id/button_later")
    MobileElement btnNantiSaja;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
    MobileElement clickTiketPesawat;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"flight_searchform_view_container\"]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement clickDari;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"flight_searchform_view_container\"]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement clickKe;

    @AndroidFindBy(id = "com.traveloka.android:id/edit_text_field")
    MobileElement cariKota;

    @AndroidFindBy(id = "com.traveloka.android.flight:id/text_view_location")
    MobileElement clickResultCariKota;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"flight_searchform_view_container\"]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement tanggalBerangkat;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"26\"])[1]")
    MobileElement tanggal26;

    @AndroidFindBy(id = "com.traveloka.android.flight:id/switch_rt")
    MobileElement swipePulangPergi;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"flight_searchform_button_maintab\"]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement penumpang;

    @AndroidFindBy(id = "com.traveloka.android.flight:id/wheel_passenger_adult")
    MobileElement jumlahPenumpangDewasa;

    @AndroidFindBy(id = "com.traveloka.android.flight:id/wheel_passenger_child")
    MobileElement jumlahPenumpangAnak;

    @AndroidFindBy(id= "com.traveloka.android.flight:id/wheel_passenger_infant")
    MobileElement jumlahPenumpangBayi;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]")
    MobileElement btnPilih;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"flight_searchform_button_maintab\"]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement kelasPenerbangan;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RadioButton")
    MobileElement radioBtnEconomy;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
    MobileElement btnSelesai;

    @AndroidFindBy(id = "com.traveloka.android.flight:id/btn_search")
    MobileElement btnSearch;

    @AndroidFindBy(id = "com.traveloka.android.flight:id/button_ok")
    MobileElement btnOk;

    @AndroidFindBy(id = "com.traveloka.android:id/text_view_toolbar_title")
    MobileElement txtResultPenerbangan;


    public void searchPenerbangan() {
        clickYourLocation.click();
        selectCountry.click();
        btnLanjutkan.click();
        btnLewati.click();
        btnLewati.click();
        delay(2);
        btnLanjutJelajah.click();
        btnNantiSaja.click();

        clickTiketPesawat.click();

        delay(2);
        clickDari.click();
        cariKota.sendKeys("Surabaya");
        clickResultCariKota.click();

        clickKe.click();
        cariKota.sendKeys("Banyuwangi");
        clickResultCariKota.click();

        tanggalBerangkat.click();
        delay(2);
        tanggal26.click();

        delay(2);
        for (int i=0; i<2; i++) {
            swipePulangPergi.click();
        }
        penumpang.click();
        btnPilih.click();

        delay(2);
        kelasPenerbangan.click();
        radioBtnEconomy.click();
        btnSelesai.click();

        btnSearch.click();

        delay(2);
        btnOk.click();
        btnLanjutJelajah.click();
        btnLanjutJelajah.click();
    }

    public void clickTiketPesawat() {
        clickYourLocation.click();
        selectCountry.click();
        btnLanjutkan.click();
        btnLewati.click();
        btnLewati.click();
        delay(2);
        btnLanjutJelajah.click();
        btnNantiSaja.click();
        clickTiketPesawat.click();
    }

    public void penerbanganDari(String kota) {
        clickDari.click();
        cariKota.sendKeys(kota);
        clickResultCariKota.click();
    }

    public void penerbanganKe(String kota) {
        clickKe.click();
        cariKota.sendKeys(kota);
        clickResultCariKota.click();
    }

    public void tanggalBerangkat() {
        tanggalBerangkat.click();
        delay(2);
        tanggal26.click();
    }

    public void pulangPergi() {
            swipePulangPergi.click();
    }

    public void jumlahPenumpang() {
        penumpang.click();
        btnPilih.click();
    }

    public void kelasPenerbangan() {
        kelasPenerbangan.click();
        radioBtnEconomy.click();
        btnSelesai.click();
    }

    public void btnSearch() {
        btnSearch.click();
    }

    public String getTxtResultPenerbangan() {
        return txtResultPenerbangan.getText();
    }

    public static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
