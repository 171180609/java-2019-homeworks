import java.util.Arrays;
import java.util.Random;
public class hulusort {
    public static void main(String args[])
    {
        //初始化对象
        sortingmethod temp=new sortingmethod();
        temp.init();
        //随机化生成
        temp.shuffle();
        temp.printname();
        temp.bubblesort();
        temp.printname();
        temp.shuffle();
        temp.printcolor();
        temp.halfinsertsort();
        temp.printcolor();
    }
}
