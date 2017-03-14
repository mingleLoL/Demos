package testng;

import org.testng.annotations.Test;

/**
 * Created by admin on 2017/3/13.
 */
public class Comments extends Annotations {
    @Test
    public void methodChild(){
        System.out.println("Commnents Method Running");
        //methodBase();
    }
}
