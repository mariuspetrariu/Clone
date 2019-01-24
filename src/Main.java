public class Main
    {
        public static void main(String[] args) throws CloneNotSupportedException
            {
                Class1 class1      = new Class1(1);
                Class1 cloneClass1 = (Class1) class1.clone();
                // now printing the integer from BoxingInteger
                System.out.println(class1.getComplexClass().getBoxingInteger().getInteger());
                System.out.println(cloneClass1.getComplexClass().getBoxingInteger().getInteger());
                // set integer from class1 to 2
                class1.getComplexClass().getBoxingInteger().setInteger(2);
                // now printing the integers again
                System.out.println(class1.getComplexClass().getBoxingInteger().getInteger());
                System.out.println(cloneClass1.getComplexClass().getBoxingInteger().getInteger());
                //*******************************
                // now doing the same thing with Class2
                //*******************************
                Class2  class2       = new Class2 (1);
                Class2  cloneClass2  = (Class2 ) class2 .clone();
                // now printing the integer from BoxingInteger
                System.out.println(class2 .getComplexClass().getBoxingInteger().getInteger());
                System.out.println(cloneClass2 .getComplexClass().getBoxingInteger().getInteger());
                // set integer from class2  to 2
                class2 .getComplexClass().getBoxingInteger().setInteger(2);
                // now printing the integers again
                System.out.println(class2 .getComplexClass().getBoxingInteger().getInteger());
                System.out.println(cloneClass2 .getComplexClass().getBoxingInteger().getInteger());
                
            }
    }