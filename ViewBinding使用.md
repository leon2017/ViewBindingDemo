

### ViewBinding


#### ViewBinding是什么?

View Binding是Android Studio 3.6推出的新特性，主要为了替代目前的findViewById。通过ViewBinding，系统会为该模块中的每个 XML 布局文件生成一个绑定类，绑定类的实例包含对在该布局中具有id的所有视图的直接引用。

#### 使用方法
> 具体见：https://developer.android.com/topic/libraries/view-binding

#### ViewBinding实现原理
原理就是Google在那个用来编译的gradle插件中增加了新功能，当某个module开启ViewBinding功能后，编译的时候就去扫描此模块下的layout文件，生成对应的binding类

#### 与findViewById、Kotlin Extension对比，ViewBinding解决了什么问题
- Null 安全
- 类型安全