import java.util.LinkedList;
import java.util.Queue;
class myQueue{
    private Queue<Integer> q=new LinkedList<>();
    public boolean isEmpty(){
        return q.isEmpty();
    }
    public void enqueue(int data){
        q.add(data);
    }
    public void dequeue(){
        if(isEmpty()){
            q.poll();
        }
    }
    public int getFront(){
        return isEmpty()?-1:q.peek();
    }
    public void display(){
        for(int x:q){
            System.out.print(x+" ");
            System.out.println();
        }
    }
}
class Main {
    static void main(String[]args){
        myQueue q=new myQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.display();
    }
}