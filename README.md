# Servicer 基于JDK1.8+开发的服务器项目

## Issues
使用的时候遇到任何问题或有好的建议，请点击进入[issue](https://github.com/hai2007/servicer.java/issues)，欢迎参与维护！

## How to test?

首先，需要进行打包：

```
mvn clean package
```

然后，命令行进入```target/classes```后执行：

```
java io.gitee.hai2007.servicer.Test
```

而对于普通测试，直接在```src/test```下新增测试用例后，执行：

```
mvn test
```

## How to publish?

```
mvn clean deploy -e
```

开源协议
---------------------------------------
[MIT](https://github.com/hai2007/servicer.java/blob/master/LICENSE)

Copyright (c) 2022 [hai2007](https://hai2007.gitee.io/sweethome/) 走一步，再走一步。