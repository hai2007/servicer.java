
/*************************** [bundle] ****************************/
// Original file:./src/pages/begin/index.paper
/*****************************************************************/
window.__etcpack__bundleSrc__['23']=function(){
    var __etcpack__scope_bundle__={};
    var __etcpack__scope_args__;
    

    // 导入js
__etcpack__scope_args__=window.__etcpack__getBundle('29');
var script =__etcpack__scope_args__.default;


    // 导入css
__etcpack__scope_args__=window.__etcpack__getBundle('30');


    script.render=function(createElement){

        return createElement('div',{"quickpaper":"","data-quickpaper-b6ec1c8a":""},[createElement('div',{"class":"doc-view","data-quickpaper-b6ec1c8a":""},[createElement('header',{"data-quickpaper-b6ec1c8a":""},["安装"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["你需要在Maven的配置中添加下面语句："]),createElement('pre',{"q-code":"html","data-quickpaper-b6ec1c8a":""},["<dependencies>↵    <dependency>↵        <groupId>io.gitee.hai2007.servicer</groupId>↵        <artifactId>servicer</artifactId>↵        <version>1.5.3</version>↵    </dependency>↵</dependencies>"]),createElement('p',{"class":"warn","data-quickpaper-b6ec1c8a":""},["上面版本以1.5.3为例子，具体使用换成具体版本即可。"]),createElement('header',{"data-quickpaper-b6ec1c8a":""},["使用"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["配置好了以后，就可以查看文档进行使用了。"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["本项目的核心就是提供一个服务器开发基础平台，首先，你需要引入服务器包："]),createElement('pre',{"q-code":"","data-quickpaper-b6ec1c8a":""},["import io.gitee.hai2007.servicer.Servicer;"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["然后，使用即可："]),createElement('pre',{"q-code":"","data-quickpaper-b6ec1c8a":""},["// 启动服务器并传递请求处理实例↵new Servicer(8080).run(new Handler());"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["上面的Handler是一个类，需要这样实现："]),createElement('pre',{"q-code":"","data-quickpaper-b6ec1c8a":""},["public class Handler implements io.gitee.hai2007.servicer.Handler {↵↵    // 处理请求↵    public String doResolve(String request) {↵↵        // request表示请求端携带的数据↵        return <给请求端响应的内容>;↵    }↵}"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["更多说明你可以",createElement('a',{"href":"#/api","target":"_blank","class":"link","data-quickpaper-b6ec1c8a":""},["点击此处"]),"进行查看！"]),createElement('header',{"data-quickpaper-b6ec1c8a":""},["版本"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["如果在使用的时候，发现文档中有的方法无法使用，可能是你的版本过低导致的，你可以",createElement('a',{"href":"https://github.com/hai2007/servicer.java/blob/master/CHANGELOG","target":"_blank","class":"link","data-quickpaper-b6ec1c8a":""},["点击此处"]),"查看版本日志。"]),createElement('header',{"data-quickpaper-b6ec1c8a":""},["建议"]),createElement('p',{"data-quickpaper-b6ec1c8a":""},["由于项目的建立是来自日常工作的需求，如果你希望下一版本提供新的功能，可以提",createElement('a',{"href":"https://github.com/hai2007/servicer.java/issues","target":"_blank","class":"link","data-quickpaper-b6ec1c8a":""},["issue"]),"告知我们！"])])])

    };

    __etcpack__scope_bundle__.default= script;

  
    return __etcpack__scope_bundle__;
}

/*************************** [bundle] ****************************/
// Original file:./src/pages/begin/index.paper?QuickPaper&type=script&lang=js&hash=b6ec1c8a
/*****************************************************************/
window.__etcpack__bundleSrc__['29']=function(){
    var __etcpack__scope_bundle__={};
    var __etcpack__scope_args__;
    __etcpack__scope_bundle__.default= {};
  
    return __etcpack__scope_bundle__;
}

/*************************** [bundle] ****************************/
// Original file:./src/pages/begin/index.paper?QuickPaper&type=style&lang=css&hash=b6ec1c8a
/*****************************************************************/
window.__etcpack__bundleSrc__['30']=function(){
    var __etcpack__scope_bundle__={};
    var __etcpack__scope_args__;
    var styleElement = document.createElement('style');
var head = document.head || document.getElementsByTagName('head')[0];
styleElement.innerHTML = "\n [quickpaper][data-quickpaper-b6ec1c8a]{\n\nheight: calc(100vh - 60px);\n\noverflow: auto;\n\n}\n\n [quickpaper]>div[data-quickpaper-b6ec1c8a]{\n\nwidth: 670px;\n\nmargin: auto;\n\n}\n";
styleElement.setAttribute('type', 'text/css');head.appendChild(styleElement);
  
    return __etcpack__scope_bundle__;
}
