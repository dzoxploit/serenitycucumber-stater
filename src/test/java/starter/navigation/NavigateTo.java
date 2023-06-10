package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAtoorDefaultPage() {
        return Task.where("{0} opens the Atoor default page",
                Open.browserOn().the(AtoorDefaultPage.class));
    }
}
