/**
 * Created by zhangyidan on 16/3/30.
 */
import java.util.Scanner;// 导入一个SCANNER的包
public class taskMUXI {
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
}
