package com.xworkz.userexception;

public class ClassNotFoundExcpt {

    public void method1() {
        System.out.println("method1 started ");
        method2();
//        Class.forName("com.xworkz.userexception.ClassNFE");
        System.out.println("method1 ended ");
    }
    private void method2(){
        System.out.println("method2 started ");
        method3();
        System.out.println("method2 ended ");
    }
    private void method3(){
        System.out.println("method3 started ");
        method4();
        System.out.println("method3 ended ");
    }
    private void method4(){
        System.out.println("method4 started ");
        try {
            Class.forName("com.xworkz.userexception.ClassNotFoundExcpt");
        }catch (ClassNotFoundException e){
            System.out.println("no class found ");
        }
        System.out.println("method4 ended ");
    }


    public static void main(String args[]) throws ClassNotFoundException{
        System.out.println("Main Started :");

        ClassNotFoundExcpt userInfoExecutor=new ClassNotFoundExcpt();
        userInfoExecutor.method1();

        System.out.println("Main ended ");
    }

}
