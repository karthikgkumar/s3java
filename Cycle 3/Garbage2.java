
public class Garbage2 {
    String temp = "dsfadfgdfadsgsdfgasg";
    int[] i = new int[1000];

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        long memoryBeforeObjectCreation= r.freeMemory();

        Garbage2 g = new Garbage2();

        long memoryAfterObjectCreation = r.freeMemory();

        g = null;

        long memoryAfterObjectSetToNull = r.freeMemory();

        r.gc();

        long memoryAfterGarbageCollection = r.freeMemory();

        System.out.println("Memory before:" + memoryBeforeObjectCreation);
        System.out.println("Memory after: " + memoryAfterObjectCreation);
        System.out.println("Memory after object set to null: " + memoryAfterObjectSetToNull);
        System.out.println("Memory after garbage collection: " + memoryAfterGarbageCollection);
    }

}
