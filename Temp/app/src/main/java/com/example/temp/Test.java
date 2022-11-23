package com.example.temp;

public class Test {
    //class 안에서 사용되면 전부 멤버임
    //멤버 : 내가 알고 있는 모든 것들은 멤버로 사용 가능

    //ex1. MainActivity에서 인스턴스멤버, static 멤버 전부 다 호출 사용하기.
        // 인스턴스 멤버 특징 : 해당하는 클래스가 인스턴스화 되어야지만 접근이 가능하다.
        //instance 멤버 3개 만들기 :변수 2, 메소드1
        int num1,  num2;
        void iMethod(){
            a = 1;
            b = 2;
            //int test = 0 ; 이 안되는 이유 :  test 변수가 없다?
        }

        //static 멤버 3개 만들기
        //  :변수 2, 메소드1
        static int a, b;
        static void sMethod() {
            //위와 달리  a = 10;  이 오류인 이유?
            //static은  인스턴스화 되지 않았다. ->그래서 인스턴스화 시켜야한다.

            //메모리에 올라가는 순서는 static 먼저, > instance 순서대로.
            //static에서 인스턴스멤버 사용시  일반적 접근 불가하므로
            //static 이 메모리에 올라갈때 인스턴스화 해서 가지고 가야한다.
          Test t1 = new Test();
          t1.num1 = 10;
        }//sMethod



    //ex2. mainActivity에서 sub의 모든 멤버 접근해서 사용하기
            class Sub {
                String sub_v1;
                void subMethod(){
                }
            }//Sub
    
    //ex3.  --static vs instance
        static class sSub {
            static int sub_v2;
            static void subMethod2(){
            } //static
            String subV1;
            void subMethod(){
            }//instance
        }//sSub

    //ex4. lclass에 있는 모든 멤버를 사용하기
        //메소드 내부에서 만든 것들은 로컬멤버, 해당 메소드 밖에서는 사용 불가 ▶ 메소드내부에서 사용!
        void lMethod(){
            class lClass {
                String lV;
                void lMethod(){

                }
            }//lClass
            //-------------메소드 내부에서 사용-------------
            lClass lc = new lClass();
            lc.lV = "aa";
            lc.lMethod();
            //----------------------------------------------
            }//lMethod
/*
            int lMethod2() {
                class lclass{
                    int a , b;
                }
                lClass lc = new lClass();
                lc.a = 10;
                lc.b = 20;
                return lc.a + lc.b;
            }
*/



}
