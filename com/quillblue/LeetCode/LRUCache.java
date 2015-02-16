package com.quillblue.LeetCode;

import java.util.HashMap;

public class LRUCache {
    HashMap<Integer,DoubleLinkNode> cache;
    DoubleLinkNode head,tail;
    int capacity;

    public LRUCache(int capacity) {
        cache=new HashMap<Integer,DoubleLinkNode>();
        this.capacity=capacity;
        head=new DoubleLinkNode(0,0);
        tail=new DoubleLinkNode(0,0);
        head.next=tail;
        tail.next=head;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            DoubleLinkNode current=cache.get(key);
            current.prev.next=current.next;
            current.next.prev=current.prev;
            head.next.prev=current;
            current.next=head.next;
            current.prev=head;
            head.next=current;
            return current.val;
        }

        return -1;
    }

    public void set(int key, int value) {
        if(cache.containsKey(key)){
            DoubleLinkNode current=cache.get(key);
            current.val=value;
            current.prev.next=current.next;
            current.next.prev=current.prev;
            head.next.prev=current;
            current.next=head.next;
            current.prev=head;
            head.next=current;
        }
        else{
            DoubleLinkNode dln=new DoubleLinkNode(key,value);
            cache.put(key,dln);
            head.next.prev=dln;
            dln.next=head.next;
            dln.prev=head;
            head.next=dln;
            if(cache.size()>capacity){
                cache.remove(tail.prev.key);
                tail.prev.prev.next=tail;
                tail.prev=tail.prev.prev;
            }
        }
    }
}

class DoubleLinkNode{
    int key,val;
    DoubleLinkNode prev,next;
    DoubleLinkNode(int k,int v){
        this.key=k;
        this.val=v;
        this.prev=null;
        this.next=null;
    }
}
