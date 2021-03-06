package org.fluentlenium.examples.test.basic

import org.fluentlenium.core.annotation.Page
import org.fluentlenium.examples.pages.basic.DuckDuckMainPage
import org.fluentlenium.examples.test.AbstractFirefoxTest
import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver

class DuckDuckGoFirefoxTest : AbstractFirefoxTest() {

    @Page
    private lateinit var onDuckDuckGoMainPage: DuckDuckMainPage

    override fun newWebDriver(): WebDriver {
        return FirefoxDriver()
    }

    @Test
    fun titleOfDuckDuckGoShouldContainSearchQueryName() {
        val searchPhrase = "searchPhrase"
        goTo(onDuckDuckGoMainPage)

        onDuckDuckGoMainPage.perform {
            typeSearchPhraseIn(searchPhrase)
            submitSearchForm()
            assertIsPhrasePresentInTheResults(searchPhrase)
        }
    }
}