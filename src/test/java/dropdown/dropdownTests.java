package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropdownTests extends BaseTests {
    @Test
    public void testSelecteOption(){
        String option = "Option 1";
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option 1 was not selected");

    }
}
