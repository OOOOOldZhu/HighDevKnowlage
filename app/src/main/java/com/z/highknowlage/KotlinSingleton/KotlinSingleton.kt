
import android.content.Context

/*
 * ：Created by z on 2019/5/28
 * object放在class之前，标记单例，但是只使用于无参单例模式
 */

object KotlinSingleton {
    init {
        //init something at here
    }
    fun say(){

    }
}
/*
*  通过kotlin转成java代码可以观察到：
*  Kotlin的object关键字，在java表现的特点如下
*  1，类用final标记，标记不可变性。
*  2，内部声明一个static final的当前类对象 INSTANCE 。
*  3，在静态代码块中，进行INSTANCE对象的初始化。
*
*  kotlin的object中，是使用类的的初始化锁来保证线程安全的。
*
*  类的初始化锁：JVM在类的初始化阶段（即在Class被加载之后，且被线程使用之前），会执行类的初始化，在初始化期间，JVM会去获取一个锁，这个锁可以同步多个线程
*  对同一个类的初始化，避免多线程调用时，引发线程安全的问题。
*/

final class SomeSingleton(context:Context){

    private val mContext : Context = context;

    companion object {

        // @Volatile注解类似与java中的static
        @Volatile
        private var instance : SomeSingleton? = null

        fun getInstance(context:Context):SomeSingleton{
            val i = instance
            if(i != null){
                return i
            }

            return synchronized(this){
                val i2 = instance
                if(i2 != null){
                    i2
                }else{
                    val created = SomeSingleton(context)
                    instance = created
                    created
                }
            }
        }
    }

}