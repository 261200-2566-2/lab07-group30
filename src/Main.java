public class Main {
    public static void main(String[] args) {

        HashSets<String> hashSet = new HashSets<>();


        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");


        System.out.println("Contains Apple: " + hashSet.contains("Apple"));


        System.out.println("Size: " + hashSet.size());


        hashSet.remove("Banana");


        System.out.println("Is Empty: " + hashSet.isEmpty());


        for (String element : hashSet) {
            System.out.println(element);
        }


        hashSet.clear();


        System.out.println("Size after clear: " + hashSet.size());
    }
}
