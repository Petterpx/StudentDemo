package com.petterp.guosai.Environment;

/**
 * @author Petterp on 2019/5/4
 * Summary:Bean类，这里的Switch是为了判断返回哪一个数据
 * 邮箱：1509492795@qq.com
 */
public class Frits {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int getPostion(int i){
        switch (i){
            case 0:return a;
            case 1:return b;
            case 2:return c;
            case 3:return d;
            case 4:return e;
            case 5:return f;
            default:break;
        }
        return 0;
    }
}
