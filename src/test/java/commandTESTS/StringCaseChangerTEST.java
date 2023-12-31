package commandTESTS;
import command.StringDrink;

import org.junit.jupiter.api.Test;
import command.StringCaseChanger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCaseChangerTEST {
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
