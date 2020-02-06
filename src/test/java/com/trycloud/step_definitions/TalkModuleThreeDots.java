package com.trycloud.step_definitions;

import com.trycloud.pages.TalkPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TalkModuleThreeDots {


    @When("the user navigates to Talk module")
    public void the_user_navigates_to_Talks_module() {
        TalkPage talkPage = new TalkPage();
        talkPage.TalkModuleButton.click();

    }

    @When("the user clicks on three dots")
    public void the_user_clicks_on_three_dots() {
        TalkPage talkPage = new TalkPage();
        talkPage.ThreeDots.click();
    }

    @Then("the user should see {string}")
    public void the_user_should_see(String actualAddFavorites) {

        String expectedAddFavorites = "Add to favorites";
        assertEquals(actualAddFavorites, expectedAddFavorites);

    }

}
