package tugas9_Hash;

public class HashTable {
  int size = 7;
  Node[] dataMap;
  
  public HashTable() {
    dataMap = new Node[size];
  }
  
  public void printTable() {
    for (int i = 0; i < dataMap.length; i++) {
      System.out.println(i + ":");
      Node temp = dataMap[i];
      while (temp != null) {
        System.out.println("   {" + temp.key + "= " + temp.value + "}");
        temp = temp.next;
      }
    }
  }
  
  private int hash(String key) {
    int hash = 0;
    char[] keyChars = key.toCharArray();
    for (int i = 0; i < keyChars.length; i++) {
      int asciiValue = keyChars[i];
      hash = (hash + asciiValue * 23) % dataMap.length;
    }
    return hash;
  }
  
  public void set(String key, int value) {
    int index = hash(key);
    Node newNode = new Node(key, value);
    if (dataMap[index] == null) {
      dataMap[index] = newNode;
    } else {
      Node temp = dataMap[index];
      if (temp.key == key) {
        temp.value += value;
        return;
      }
      while (temp.next != null) {
        temp = temp.next;
        if (temp.key == key) {
          temp.value += value;
          return;
        }
      }
      temp.next = newNode;
    }
  }
  
  public int get(String key) {
    // Modifikasi bagian ini, silahkan ubah return value.
    int index = hash(key);
    Node head = dataMap[index];
    
    while (head != null){
      if (head.key.equals(key)) {
        return head.value;
      }
      
      head = head.next;
    }
    
    return -1;
  }
  
  //Dapat juga menggunakan wrapper class Integer untuk return null jika tidak ditemukan
}