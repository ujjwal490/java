class LinkedList {
  class Node {
    String data ;
    node next ;

  Node(String data){
    this.data=data;
    this.next=null;
  }
  }
  //add element
public void addFirst(String data){
  Node newNode=new Node(data);
  if(head== null){
    head=newNode ;
    return;
  }
  newNode.next=head;
  head=newNode;
}
  public void addLast(Strong data){
    Node newNode=new Node(data);
    if(head==Null){
      head=newNode;
      return;
    }
    Node currNode=head;
    while(curr Node.next !=Null){
currNode.next=newNode ;
    }
    currNode.next=newNode;
  }
  //print
  public void printList(){
    if(head==null){
      System.out.println("empty List");
      return ;
    }
    Node currNode=head;
    while(currNode !=null){
      System.out.print(currNode.data +" ->");
      currNode=currNode.next;
    }
    System.out.println("NULL");
  }
  public static void main(String [] args){
    LinkedList List=new LinkedList();
    list.addFirst("a");
    list.addFirst("is");
    list.printList();

    list.addLast("last");
    list.printlist();

    list.addFirst("this");
    list.printList();
  }
}

  
