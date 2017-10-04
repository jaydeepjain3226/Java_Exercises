class caller {
    int n;
    public caller(int n) {
        this.n = n;
    }
    public void exist() {
        System.out.println("Inside caller class");
    }
}
class create {
    public caller made() {
        caller obj = new caller(1) {
            public void exist() {
                System.out.println("The exist method has been over ridden.");
            }
        };
        return obj;
    }
}
public class Pe1 {
    public static void main(String[] args) {
        create ob = new create();
        caller obj2 = ob.made();
        System.out.println(obj2.n);
        obj2.exist();
    }
}
