<p align='center'>
    <a href='https://hai2007.github.io/servicer.java/' target='_blank'>
        <img src='./logo.png'>
    </a>
</p>

# Servicer 基于JDK1.8+开发的服务器项目

## Issues
使用的时候遇到任何问题或有好的建议，请点击进入[issue](https://github.com/hai2007/servicer.java/issues)，欢迎参与维护！

## How to test?

打开```eclipse```后，按照下面顺序导入下面：

```
[File] -> [Import] -> [Maven] -> [Existing Maven Projects]
```

然后选择当前项目即可成功导入。

导入后运行只需要把```Test.java```作为入口，选择```run as Application```即可。

## How to publish?

```
mvn clean deploy -e
```

## How to Use?

首先，你需要在Maven的项目中配置文件```pom.xml```里添加下面依赖：
```
<dependencies>
    <dependency>
        <groupId>io.gitee.hai2007.servicer</groupId>
        <artifactId>servicer</artifactId>
        <version>1.5.1</version>
    </dependency>
</dependencies>
```

> 上面版本以```1.5.1```为例子，具体使用换成具体版本即可。

然后，在需要的地方引入服务器包：

```
import io.gitee.hai2007.servicer.Servicer;
```

使用的时候非常简单：

```java
// 启动服务器并传递请求处理实例
new Servicer(9999).run(new Handler());
```

上面的Handler是一个类，需要这样实现：

```java
public class Handler implements io.gitee.hai2007.servicer.Handler {

	// 处理请求
	public String doResolve(String request) {

        // request表示请求端携带的数据
		return <给请求端响应的内容>;
	}

}
```

更多说明你可以[点击此处](https://hai2007.github.io/servicer.java/#/api/)进行查看！

开源协议
---------------------------------------
[MIT](https://github.com/hai2007/servicer.java/blob/master/LICENSE)

Copyright (c) 2022 [hai2007](https://hai2007.gitee.io/sweethome/) 走一步，再走一步。