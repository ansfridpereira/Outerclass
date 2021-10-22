 class Outerclass {
    private static int serialNo = 25;
    private int panNo = 10;
    static class InnerClass
    {
        int getSerialValue()
        {
            return serialNo;
        }
    }
}
 class StaticNestedClassExample {
    public static void main(String[] args)
    {
        Outerclass.InnerClass m1 = new Outerclass.InnerClass();
        System.out.println("Sr. Number :" + m1.getSerialValue());
    }
}

