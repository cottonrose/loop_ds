package com.cottonrose;

import com.cottonrose.Loop;
/**
 * Auther:cottonrose
 * Created: ${date}
 */
public class loopTest {
    public static void main(String[] args){
        Loop<Integer> integerLoop = new Loop<>();
        integerLoop.add(1);
        integerLoop.add(2);
        integerLoop.add(3);
        integerLoop.add(4);
        integerLoop.add(5);
        integerLoop.printLoop();
        Loop<String> stringLoop = new Loop<>();
        stringLoop.add("hello");
        stringLoop.add("world");
        stringLoop.add("!!!");
        stringLoop.printLoop();

    }
}
