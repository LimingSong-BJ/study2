package composite;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component branchA = new Composite("---branchA");
        Component branchB = new Composite("------branchB");
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);
    }
}
