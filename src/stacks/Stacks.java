/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Scanner;


public class Stacks {
    
    public static int size = 5;
    public int[] data = new int[size];
    
    private int top;
    
    public void push(int element) throws Exception{
        if (top == size){
            throw new Exception("Stack is full");
        }
        
        top++;
        data[top] = element;
    }
    
    public int pop() throws Exception{
    if (top==0){
        throw new Exception("stack is empty");
    }
    int temporary = top;
    data[top] = 0;
    top--;
    return temporary;
    
}
    
    public void display() throws Exception{
        if (top ==0){
            throw new Exception ("stack is empty");
        }
        
        for (int i = top; i > 0; i--){
            System.out.println(data[i]+"->");
        }
        
        System.out.println("NULL");
    }
    
    public int peek() throws Exception {
        if (top == 0){
            throw new Exception("Stack is empty");
        }
        
        return data[top];
    }
            
    
    
  
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Stacks Stack = new Stacks();
        
        while (true){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. Exit");
            
            int element;
            int choice = scn.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("enter value of push");
                    element = scn.nextInt();
                    Stack.push(element);
                    System.out.println("\n");
                    break;
                    
                case 2:
                    System.out.println("deleted na");
                    System.out.println("\n");
                    
                case 3:
                    Stack.display();
                    System.out.println("\n");
                    break;
                    
                case 4:
                   scn.close();
                   System.exit(0);
                    
                
            }
        }
    }
    
}
