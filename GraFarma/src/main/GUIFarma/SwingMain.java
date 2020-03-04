import java.awt.*;


    public class SwingMain {

        public static void main(String[] args) {

            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    MyJFrame window = new MyJFrame();
                }
            });
        }
    }


