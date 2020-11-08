import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class WholeProcess {


    Scanner sc = new Scanner(System.in);

    ArrayList<String> versatile = new ArrayList<>();
    ArrayList<String> versatile2 = new ArrayList<>();
    ArrayList<String> versatile3 = new ArrayList<>();

    Iterator<String> iter = versatile.iterator();
    Iterator<String> iter2 = versatile2.iterator();
    Iterator<String> iter3 = versatile3.iterator();

    String userInput;
    private int numOfInputs;

    public void start(){
        myScanner();
    }

    private  void myScanner(){

        // this is for the first list entry
        while(true){
            System.out.println("\nEnter anything");
            userInput = sc.next();

            versatile.add(userInput);
            numOfInputs++;
            if(numOfInputs == 5 ){
                break;
            }
        }

        System.out.println("=====================This is the first list =======================");
        iter = versatile.iterator();
        while(iter.hasNext()){
            String e = iter.next();
            System.out.println(e);
        }

        // this is for the second list entry
        while (true){
            System.out.println("\nEnter anything");
            userInput = sc.next();

            versatile2.add(userInput);
            numOfInputs++;
            if (numOfInputs == 10){
                break;
            }
        }

        System.out.println("=====================This is the second list =======================");
        iter2 = versatile2.iterator();
        while(iter2.hasNext()){
            String e = iter2.next();
            System.out.println(e);
        }


       //Now we will have 2 list mixed into 3
        Collections.reverse(versatile2);

        HERE:   // break throws us here
        for (String temp : versatile){
            versatile3.add(temp);
            for (String temp1 :versatile2){
                versatile3.add(temp1);
                versatile2.remove(temp1);
                break;
            }
        }
        System.out.println("\nОбъединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}");
        System.out.println("==================You have got mixed ones here===================");
        iter3 = versatile3.iterator();
        while(iter3.hasNext()){
            String e = iter3.next();
            System.out.println(e);
        }


        System.out.println("=====================We have sorted by the length ================");
        Collections.sort(versatile3, new StringLengthComp());


        iter3 = versatile3.iterator();
        while(iter3.hasNext()){
            String e = iter3.next();
            System.out.println(e);
        }
    }
}

