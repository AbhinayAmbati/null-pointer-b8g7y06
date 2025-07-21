
import java.util.Vector;

public class Vector1
{
    public static void main(String[] args) {
        Vector v1 = new Vector<>(3,2);

        v1.addElement(3);

        v1.insertElementAt(1, 0);

        v1.insertElementAt(2, 1);

        v1.addElement(4);

        v1.removeElement(3);

        System.out.println(v1);

    }
}
