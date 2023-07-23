package ua.hillel.mvn.wdManager.lesson28;

import org.testng.annotations.Test;
import pageObject.DownloaderPage;
import pageObject.UploaderPage;
import ua.hillel.mvn.wdManager.BaseTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class DownloadAndUploadTest extends BaseTest {
    @Test
    public void downloadPageTest() throws IOException {
        DownloaderPage downloaderPage = openApp().goToDownloadPage()
                .downloadFile().waitForDownloadFile();

        File alarmsFile = new File("alarms.csv");
        List<String> lines = Files.readAllLines(alarmsFile.toPath());

        File downloadedFile = new File("target/download/some-file.txt");
        System.out.println(Files.readAllLines(downloadedFile.toPath()));
        Files.write(downloadedFile.toPath(), lines);

        UploaderPage uploaderPage = openApp().goToUploadPage().uploadFile();
    }

}
