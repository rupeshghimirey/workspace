package enumPackage;

import java.util.EnumSet;

public class MyFamilyClient {
    public static void main(String[] args) {
        MyFamily[] family = MyFamily.values();

        for(MyFamily member: family) {
            System.out.println(member);
        }

        System.out.println("USING ENUM RANGE");
        for (MyFamily namesOfFamilyMembers: EnumSet.range(MyFamily.RUPESH, MyFamily.VIAAN)) {
            System.out.println(namesOfFamilyMembers);
        }


    }
}
