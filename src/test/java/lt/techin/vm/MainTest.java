package lt.techin.vm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainTest extends BaseTest {

    @Test
    void chooseItemsPerPaqe() {
        GreenKartPage page = new GreenKartPage(driver);
        page.setChooseItemsPerPage();
        System.out.println(page.getNames());

        page.clickToSelectByName();
        System.out.println(page.getNames());
        List<String> names = page.getNames();
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        Assertions.assertEquals(sortedNames, names, "names not equal");
        System.out.println(page.getNames());

        String searchText = "at";
        page.setSearchInput(searchText);
        List<String> afterSearchNames = page.getNames();
        for (String name : afterSearchNames) {
            Assertions.assertTrue(name.contains(searchText), "no input text find");
        }
        System.out.println(page.getNames());


    }

@Test
    void testFiveItemsPerPage(){
    GreenKartPage page = new GreenKartPage(driver);
    page.clickToSelectByName();
    System.out.println(page.getNames());
    List<String> names = page.getNames();
    List<String> sortedNames = new ArrayList<>(names);
    Collections.sort(sortedNames);
    Assertions.assertEquals(sortedNames, names, "names not equal");
    System.out.println(page.getNames());
    page.setClickNextIfActive();


}


}

