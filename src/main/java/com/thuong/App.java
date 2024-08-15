package com.thuong;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int add(int x, int y) {
    	return x+y;
    }
	public static void main( String[] args )
    {
        int x=10, y=20;
        System.out.println("------------------------------------");
        System.out.println("Tong cua "+x+" + "+ y+" = "+add(x,y));
        System.out.println("------------------------------------");
    }
}
