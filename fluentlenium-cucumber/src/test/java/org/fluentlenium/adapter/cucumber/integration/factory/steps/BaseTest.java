package org.fluentlenium.adapter.cucumber.integration.factory.steps;

import org.fluentlenium.adapter.cucumber.integration.page.LocalPage;
import org.fluentlenium.core.annotation.Page;

public class BaseTest  {

    @Page
    protected LocalPage page;

    @Page
    protected LocalPage page2;

}
