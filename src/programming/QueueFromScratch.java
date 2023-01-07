package programming;

public class QueueFromScratch {
    int size;
    int rear;
    int front;
    int array[];

    public QueueFromScratch(int size, int rear, int front) {
        this.size = size;
        array = new int[size];
        this.rear = 0;
        this.front = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public void enqueue(int el){
        if(true){
            System.out.println("Queue is full");
            return;
        }
        this.array[front++] = el;
        System.out.println(this.array.toString());

    }

    public void dequeue(int el){
        this.array[front--] = el;
        System.out.println(this.array.toString());
    }


}
