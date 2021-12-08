package Functional;

import java.io.IOException;

public class NoCheckedException {
    static void main(String[] args){
        try {
            canThrowAnException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void canThrowAnException() throws IOException{
        throw new IOException();
    }
    static void canThrowAnErr(){
        throw new IllegalStateException();
    }
}