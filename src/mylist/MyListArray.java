package mylist;

import java.util.Scanner;

public class MyListArray {
    //last is a position on which insert and delete is permitted
    //it can be named as position
    private int last;
    private int[] list;
    public void insert(int element){
        if(last<list.length-1){
        last++;
        this.list[last]=element;
        }else {
            System.out.println("Element not inserted list is full");
        }
    }
    public void delete(){
        if(last>=0){
        this.list[last]=0;
        last--;
        }else {
            System.out.println("list is empty");
        }
    }
    //search first occurence of the element
    public boolean searchElement(int element){
        boolean response=false;
        for(int i=0;i<last;i++){
            if(this.list[i]==element){
                response=true;
                break;
            }
        }
        return response;
    }
    public void display(){
        /*
        //using foreach loop
        for (int element:list){
            System.out.println(element);
        }
        //ye list.length tak ja ra tha
        */
        for(int i=0;i<=last;i++){
            System.out.println(list[i]);
        }
        System.out.println("------------------");
    }
    //sorting in descending order
    public int[] sort(){
        int[] response=null;
        for(int j=0;j<last;j++) {
            for (int i = 0; i < last; i++) {
                if (list[i] < list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i +1];
                    list[i + 1] = temp;
                    break;
                }
            }
        }

        return response;
    }

    public MyListArray(int last, int[] list) {
        this.last = last;
        this.list = list;
    }

    public static void main(String[] args) {
        int[] list= new int[10];
        int last = -1;
        MyListArray obj= new MyListArray(last,list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element");
        int element =sc.nextInt();
        obj.insert(element++);
        obj.insert(element++);
        obj.insert(element++);
        obj.insert(element++);
        obj.insert(element);
        obj.display();
        obj.delete();
        obj.delete();
        obj.display();
    }
}
