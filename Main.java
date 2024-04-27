package tugas9_Hash;

public class Main {
  public static void main(String[] args) {
    
    HashTable myHashTable = new HashTable();
    
    myHashTable.set("paint", 20);
    myHashTable.set("bolts", 40);
    myHashTable.set("nails", 100);
    myHashTable.set("tile", 50);
    myHashTable.set("lumber", 80);
    
    myHashTable.printTable();
    
    int value = myHashTable.get("lumber");
    System.out.println("\nValue of Lumber is " + value);
  }
}