/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylisttest;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rkaune
 */

 public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList myStrings = new ArrayList();
//		Scanner input = new Scanner(System.in);
//                String name=input.nextLine();
		myStrings.add("Eric");
		myStrings.add("Andrew");
		myStrings.add("Evan");
		myStrings.add("Nick");
		myStrings.add("Eli");
                myStrings.remove(3);
                myStrings.add(4,"Bryce");
                //myStrings.add(4,name);
		System.out.println(myStrings.get(0));
                myStrings.set(0,"Michelle");
		//myStrings.remove("Evan");
		System.out.println(myStrings.size());
                
                
		for (Object name2 : myStrings) {
			System.out.println(name2);
		}
	}
}
    

