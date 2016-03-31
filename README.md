# workforMuxi
theWORKforMuxiTeam
Thankyou for watching!
Here is the code and the answer
package imooctask;
import java.util.Scanner;// 导入一个SCANNER的包

```/**
 * Created by zhangyidan on 16/3/31.
 */
public class taskMuxi2 {
    public static void main(String[] args) {//MAIN方法
        Scanner Input = new Scanner(System.in);//创建SCANNER对象
        int isPrime=1;//定义一个指示数
        System.out.print("请输入一个自然数:");//人机交互
        int inNum=Input.nextInt();//获取输入值
        if(inNum==1) {
            isPrime = 0;
        }else{
            if (inNum == 2) {//去除掉特殊情况:输入数字为1或者2
                isPrime = 1;
            } else {
                if (inNum % 2 == 0) {//判断一下是不是2的倍数,这样就可以从3开始遍历因子,因为3之后就可以每次将因子+2,降低复杂度
                    isPrime = 0;
                } else {
                    for (int i = 3; i * i < inNum; i += 2) {//由数学知识可知,只要因子取到小于等于根号的inNum次方,就可以确定他是不是素数,降低复杂度
                        if (inNum % i != 0) {
                            isPrime = 1;
                        } else {
                            isPrime = 0;
                        }

                    }
                }
            }
        }
        if(isPrime==1){//判断后输出
            System.out.print(inNum+"是素数!");
        }else{
            System.out.print(inNum+"不是素数!");
        }
    }

}```
第二题答案
Answer Sheet of the Task of MuxiTeam
1.
groundCount ：买了几个
groundPrice ：购买groundCount个物品的价格
（比如 买2个苹果5块钱  groundCount就是2 groundPrice就是5）
numberBought ：购买的商品数量
2.
该代码具有的特点：封装性，具有人机交互（在要求输入前会先输出输入样式），对输入的数字有处理（比如在输入数后做一次判断，去掉负数）
3.我认为这个程序是价格计算器


