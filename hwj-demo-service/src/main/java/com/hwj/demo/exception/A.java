package com.hwj.demo.exception;

/**
 * @Auther: heweijian
 * @Date: 2020/3/3
 * @Description:
 */
public class A {

    public C method() throws RuntimeException {
        C c = new C();
        int i = 0;
        try {
            return c;
        } catch (Exception e) {
            return null;
        } finally {
//            c.setNum(100);
            i = 2; // 语句一 函数最终返回1,return复制了一份基本数据类型
//            return 2; // 语句二 函数最终返回2,finally都是最终返回
        }
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.method().getNum());
    }

    //引用数据类型传递得是引用，修改也是引用
    private class C{
        private int num;


        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    //异常设计思路：exception，检查异常必须显示处理（可恢复得条件），非检查异常（不可恢复条件），try-》catch补一个exception，
    //潜在异常处理，finally释放占用得资源，logger打印异常

    //try-with-resource 优雅得关闭资源，try(new 资源流对象){}catch（exception e）.省略了finally中得！ close关闭
}
