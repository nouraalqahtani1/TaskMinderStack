//Done by:
//Fatimah Alsayednasser 
//Shahad Mohammed Alowfi
//Naimah Nayef Aldossary
//Noura Saad Alqahtani

package com.mycompany.dstructure;
public class StackLinkedList {
    
    class Node {
    String TaskName;
    String DueDate;
    int duration;
    Node next;
    public Node(String TaskName, String DueDate, int duration) {
            this.TaskName = TaskName;
            this.DueDate = DueDate;
            this.duration = duration;
            this.next = null;}}
    
    Node top = null;
    int size=0;
    
    StackLinkedList(){}
    public boolean isEmpty(){
    return size==0;}
    
    public void Top(){
    if (top==null){
        System.out.println("Stack is Empty!"); return;}
    System.out.println("Top Task of Stack is: " + top.TaskName + ", Due Date:" + top.DueDate + ", Duration:"+top.duration);}
    
    public void Display(){
        if (top==null){
            System.out.println("Stack is Empty!"); return;}
        Node temp=top;
        System.out.println("The Tasks List: ");
        while(temp!=null){
            System.out.println(temp.TaskName + ", Due Date:" + temp.DueDate + ", Duration:"+temp.duration);
            temp=temp.next;}}
    
    public void push(String n, String due, int d) {
        Node newNode = new Node(n, due, d);
        newNode.next = top;
        top = newNode;
        size++;}
    
    public void Pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty!"); return;}
    System.out.println(top.TaskName + ", " + top.DueDate + ", "+ top.duration);
    top=top.next;
    size--;}
    
    public int size(){
    return size;}
    
    public void makeEmpty(){
    if(isEmpty()){
        System.out.println("Stack Already Empty!"); return;}
    while(!isEmpty()){
        top=top.next;
        size--;}}
}


