import java.util.List;
//import java.util.ArrayList;

//import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> values = new java.util.ArrayList<>();
    Node<String> cur = head;

    while (cur != null) {
      values.add(cur.val);
      cur = cur.next;
    }

    return values;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

  //  Solution.linkedListValues(a);
    List<String> result = linkedListValues(a);
    System.out.println(result);
    // -> [ "a", "b", "c", "d" ]
  }
}
