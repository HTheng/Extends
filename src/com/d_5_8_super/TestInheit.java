package com.d_5_8_super;

/**
 * Created by hengjiang on 16/5/8.
 */

class FatherClass{
    int value = 100;
    public void f(){
        System.out.println("Father:"+value);
    }
}

class ChildClass extends FatherClass{
    int value = 200;
    public void f(){
        super.f();
        int value = 200;
        System.out.println("Child:"+value);
        System.out.println(value);
        System.out.println(super.value);
    }
}



public class TestInheit {
    public static void main(String arg[]){
        ChildClass s = new ChildClass();
        s.f();
    }

}
