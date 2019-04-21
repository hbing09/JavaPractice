package foundation.flowControl;

public class FlowControl {
    public static void main(String[] args) {
        int index = 5;
        while (index > 0) {
            System.out.println(index);
            index--;
        }
        do {
            System.out.println(index);
            index--;
        } while (index > 0);

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 2; j < 5; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println("j = " + j);
                //break;
            }
        }
    }
}
