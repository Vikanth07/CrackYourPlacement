package StackandQueues;

class twoStacks {
    int arr[];
    int top1;
    int top2;
    twoStacks() {
        arr = new int[200];
        top1=-1;
        top2=0;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        top1+=2;
        arr[top1]=x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        top2+=2;
        arr[top2]=x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(top1==-1)return -1;
        int val = arr[top1];
        top1-=2;
        return val;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(top2==0)return -1;
        int val = arr[top2];
        top2-=2;
        return val;
    }
}
