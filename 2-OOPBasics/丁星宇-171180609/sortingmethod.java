import org.w3c.dom.ls.LSLoadEvent;

import java.util.Random;

public class sortingmethod {
    private static Random rand = new Random();
    public hulubaby []sevenhulu;
    public void init()
    {
        sevenhulu=new hulubaby[7];
        for(int i=0;i<7;i++)
            sevenhulu[i]=new hulubaby();
        sevenhulu[0].name="大娃";
        sevenhulu[0].color="红色";
        sevenhulu[0].colornum=0;
        sevenhulu[0].namenum=0;
        sevenhulu[1].name="二娃";
        sevenhulu[1].color="橙色";
        sevenhulu[1].colornum=1;
        sevenhulu[1].namenum=1;
        sevenhulu[2].name="三娃";
        sevenhulu[2].color="黄色";
        sevenhulu[2].colornum=2;
        sevenhulu[2].namenum=2;
        sevenhulu[3].name="四娃";
        sevenhulu[3].color="绿色";
        sevenhulu[3].colornum=3;
        sevenhulu[3].namenum=3;
        sevenhulu[4].name="五娃";
        sevenhulu[4].color="青色";
        sevenhulu[4].colornum=4;
        sevenhulu[4].namenum=4;
        sevenhulu[5].name="六娃";
        sevenhulu[5].color="蓝色";
        sevenhulu[5].colornum=5;
        sevenhulu[5].namenum=5;
        sevenhulu[6].name="七娃";
        sevenhulu[6].color="紫色";
        sevenhulu[6].colornum=6;
        sevenhulu[6].namenum=6;
    }
    public void bubblesort()//冒泡排序
    {
        int i,j;
        hulubaby temp=new hulubaby();
        for(i=0;i<6;i++)
        {
            for(j=i+1;j<7;j++)
            {
                if(sevenhulu[i].namenum>sevenhulu[j].namenum)
                {
                    temp=sevenhulu[i];
                    sevenhulu[i]=sevenhulu[j];
                    sevenhulu[j]=temp;
                    System.out.println(sevenhulu[i].name+":"+j+"->"+i);
                    System.out.println(sevenhulu[j].name+":"+i+"->"+j);
                }
            }
        }
    }
    public void halfinsertsort()//二分插入排序
    {
        hulubaby temp=new hulubaby();
        for(int i=1; i<7; i++)
        {
            temp=sevenhulu[i];
            int low=0, high=i-1;
            int mid=-1;
            while (low<=high)
            {
                mid=low+(high-low)/2;
                if (sevenhulu[mid].colornum>temp.colornum)
                {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--)
            {
                sevenhulu[j + 1] = sevenhulu[j];
                System.out.println(sevenhulu[j+1].name+":"+j+"->"+(j+1));
            }
            sevenhulu[low] = temp;
            if(low!=i)
            System.out.println(temp.name+":"+i+"->"+low);
        }
    }
    //随机生成函数
    public void shuffle()
    {
        hulubaby []temp;
        temp=new hulubaby[7];

        int tem;
        int []arr={0,1,2,3,4,5,6};
        for (int i = 7; i > 0; i-- ){
            int randInd = rand.nextInt(i);
            {
                tem=arr[randInd];
                arr[randInd]=arr[i-1];
                arr[i-1]=tem;
            }
        }
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<7;i++)
        {
            temp[i]=new hulubaby();
            temp[i]= sevenhulu[i];
        }
        for(int i=0;i<7;i++)
        {
            sevenhulu[i]=temp[arr[i]];
        }
    }
    public void printname()
    {
        for(int i=0;i<7;i++)
            System.out.print(sevenhulu[i].name+" ");
        System.out.println();
    }
    public void printcolor()
    {
        for(int i=0;i<7;i++)
            System.out.print(sevenhulu[i].color+" ");
        System.out.println();
    }
}
