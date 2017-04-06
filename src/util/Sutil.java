package util;



import java.awt.Component;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeFunction.function;

public class Sutil {

    public static void msg(Component parent, String message) {
        JOptionPane.showMessageDialog(parent,
                message,
                "App Info",
                1); // 1 = information icon
    }

    public static void mse(Component parent, String message) {
        JOptionPane.showMessageDialog(parent,
                message,
                "App Info",
                2); // 1 = information icon
    }

    public static int msq(Component parent, String message) {
        int respon = JOptionPane.showOptionDialog(parent,
                message,
                "App Info",
                JOptionPane.YES_NO_OPTION,
                3, // 3 = Question icon
                null, null, null);        
        return respon;
    }
   


}
