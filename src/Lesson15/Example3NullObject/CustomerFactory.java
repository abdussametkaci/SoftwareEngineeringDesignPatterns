package Lesson15.Example3NullObject;

import com.sun.org.apache.regexp.internal.RE;
import java.util.ArrayList;

public class CustomerFactory {

    static ArrayList<AbstractCustomer> customers = new ArrayList();

    static void addCustomer(String name) {
        if (!"".equals(name)) {
            AbstractCustomer realCustomer = new RealCustomer();
            realCustomer.name = name;
            customers.add(realCustomer);
        } else {
            AbstractCustomer nullCustomer = new NullCustomer();
            nullCustomer.name = "No name";
            customers.add(nullCustomer);
        }

    }
}
