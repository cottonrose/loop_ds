package com.cottonrose;

/**
 * Auther:cottonrose
 * Created: ${date}
 */


//add(e), add(index,e)
//remove(e), remove(inex)
//set(index,e)
//get(index)
//size()


public class Loop<E> {

    private static class Node<E>{
        E item;
        Node next;
        Node prev;

        public Node(){

        }
        public Node(E item,Node next,Node prev){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node<E> head;
    public int size = 0;

    public Loop(){
        head = new Node<>();
        head.next = head;
        head.prev = head;
    }

    public int getSize(){
        return size;
    }
    //打印环
    public void printLoop(){
        Node<E> cur = new Node<E>(null,null,null);
        assert(head!=null);
        if(head.next==null){
            System.out.println("这是一个空环");
            return ;
        }
        cur = head.next;
        while(cur!=head){
            System.out.print(cur.item+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //添加数据
    public void add(E e){
        Node<E> newNode = new Node<>(e,null,null);
        assert(head!=null);
        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;
        size++;
    }
    //指定位置添加数据
    public void add(int index,E e){
        Node<E> newNode = new Node<>(e,null,null);

    }



}
