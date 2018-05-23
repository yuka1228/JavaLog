package jp.techacademy.yuka.satou.javalog;

import android.util.Log;

class BigDog extends Dog {
    //クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name,age);
    }

    //クラス変数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
