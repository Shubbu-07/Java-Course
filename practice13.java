class Computer {
    public void playmusic() { // to access from anywhere - public
        System.out.println("Music Playing..."); // don't want anything in return - void
    }

    public String getmepwn(int cost) {
        if (cost >= 10)
            return "pen";

        return "Nothing";
    }
}

public class practice13 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getmepwn(11);
        System.out.println(str);
    }
}
