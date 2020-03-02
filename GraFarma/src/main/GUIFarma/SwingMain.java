import java.awt.*;


    public class SwingMain {

        public static void main(String[] args) {

            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    GUIFarma.MyJFrame window = new GUIFarma.MyJFrame();
                }
            });
        }
    }

}
