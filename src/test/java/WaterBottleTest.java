import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class WaterBottleTest {

//    Create a water bottle class with a volume property.
//    The volume should start at 100.
//    Add a drink function that takes 10 from the volume each time it is called.
//    Create an empty function that brings the volume down to 0.
//    Create a fill function that fills the volume back to 100.

    WaterBottle mybottle;

    @Before
    public void before(){
        mybottle = new WaterBottle(100);
    }


    @Test
    public void volumeStartsAt100(){
        assertEquals(100, mybottle.getVolume());
    }

    @Test
    public void canDrink(){
        mybottle.drink();
        assertEquals(90, mybottle.getVolume());
    }

    @Test
    public void canDrinkMoreThanOnce(){
        mybottle.drink();
        mybottle.drink();
        mybottle.drink();
        assertEquals(70, mybottle.getVolume());

    }

    @Test
    public void canEmptyBottle(){
        mybottle.drinkAll();
        assertEquals(0, mybottle.getVolume());
    }

    @Test
    public void canFillBottleFull(){
        mybottle.fill();
        assertEquals(100, mybottle.getVolume());
    }


}
