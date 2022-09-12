package com.company;

public class Main {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObj());

        Test<String> tObj = new Test<String>("Test Generic String type");
        System.out.println(tObj.getObj());
    }

    static class Test<T> {
        T obj;

        public Test(T obj) {
            this.obj = obj;
        }

        public T getObj() {
            return obj;
        }
    }

}