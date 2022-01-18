package ComponentsTest;

import Components.GearBox;
import Components.GearBoxType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GearBoxTest {
     private GearBox gearBox;

     @Before
    public void before() {
         gearBox = new GearBox(GearBoxType.MANUAL, 6);
     }

     @Test
    public void hasGearBoxType(){
         assertEquals(GearBoxType.MANUAL, gearBox.getGearBoxType());
     }

     @Test
    public void hasNumberOfGears(){
         assertEquals(6, gearBox.getNumberOfGears());
     }
}
