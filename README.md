# javacc-demo说明
## 1.背景
  项目需求为,前端引入blocky框架实现可视化编程功能,后端需要根据前端生成的脚本(协商后定位lua脚本)通过语言解析器,<span style="color: red;">解析并执行</span>脚本内容.其中包括if,for,声明,执行动作等,还要求可以嵌套执行.
## 2.框架
  项目框架为 springboot2.3.2.解析器为 javacc.<br>
  语言解析器请先去javacc官网:https://javacc.github.io/javacc/ 学习基本语法与词义<br>
  javacc其实就是通过特定的语法结构转换成可执行的java代码,因此核心点就在于javacc的语法也就是书写符合规则的.jj文件
## 3.脚本内容
```
a=2
b=2
PTP(100,100,0,0,0,0,0,0,0,0)
for c=0,2,1 do
 Lin(测试,100,0,0,0,0,0,0,0,0)
 if a≥b then
    ARC(测试1,100,0,0,0,0,0,0,0,0)
 end
 Circle(测试2,100,0,0,0,0,0,0,0,0)
end
if a==b then
 for c=0,2,1 do
  PTP(100,100,0,0,0,0,0,0,0,0)
  ARC(测试2,100,0,0,0,0,0,0,0,0)
  if a==b then
   Circle(测试2,100,0,0,0,0,0,0,0,0)
  end
  for i=1,2,1 do
   Lin(100,100,0,0,0,0,0,0,0,0)
  end
 end
end
for c=0,2,1 do
 PTP(100,100,0,0,0,0,0,0,0,0)
 Lin(测试2,100,0,0,0,0,0,0,0,0)
end


for c=1,2 do
 PTP(100,100,0,0,0,0,0,0,0,0)
 if c==1 then
     Lin(100,100,0,0,0,0,0,0,0,0)
     for i=1,3 do
         if i==1 then
             Circle(圆1,100,0,0,0,0,0,0,0,0)
            goto continue
         end
          Circle(圆,100,0,0,0,0,0,0,0,0)
     end
    ::continue::
 end
 ARC(测试2,100,0,0,0,0,0,0,0,0)
end

d=1
while(d<3) do
    if d==1 then
        PTP(while11,100,0,0,0,0,0,0,0,0)
        break
    end
  d=d+1
end
```
其中,for c=0,2,1 do end 代表for循环,从0开始到2结束(不包含2)每次递增1 <br>
if a>b then end 代表if条件语句<br>
脚本位置在项目: /resource/static/1.lua
## 4.使用
     项目中集成了swagger,可以通过直接调度测试
### (1)启动项目
      端口是8080,可根据实际需要修改
### (2)访问swagger
      地址:http://127.0.0.1:8080/swagger-ui.html
### (3)找到lua脚本测试
      lua脚本测试,可以通过后端日志查看整个调度过程,还添加了一个调度接口,主要是本地接口,用于在lua脚本中执行
### (4)测试效果
      如图:![image](https://github.com/zhaoyunfei/javacc-demo/assets/87751666/8b313252-dfe0-4b85-8be2-1eb2a5558bf8)

## 5.javacc使用
### (1)下载javacc
       在jjavacc官网:https://javacc.github.io/javacc/ 下载并解压
### (2)使用
       使用有两种方式:一,配置环境变量(前提已安装java),然后在javacc的语法文件xx.jj文件打开cmd,输入
       ``` javacc xx.jj ```即可编译成java代码
       二,直接通过java来执行
       ``` java -classpath "E:\develop\jdk\javacc-javacc-7.0.13\javacc-javacc-7.0.13\bootstrap\javacc.jar" javacc MyParser.jj ```
       通过java -classpath 执行javacc
### (3)构建jj文件
       由于我的规则就是执行if,for,声明,执行动作(调度本地接口).因此就按照规则书写jj文件,文件我也放在项目中了.在![image](https://github.com/zhaoyunfei/javacc-demo/assets/87751666/5355a985-5cf6-497b-937d-0806d4032b1f)

### (4)注意点
       在jj文件中需要关注的我都加了注释,请展开每个详情仔细阅读.尤其是for循环需要重置token,声明的存储,参数解析以及条件判定时else只解析不执行的情况<br>
       关于调度本地接口时,在生成的构造参数中我添加的了本地接口,这里需要根据实际需要灵活处理<br>
       javacc也是只使用了最基本功能,复杂的jjtree并没有使用,如果需要请参考官方文档深入研究学习
       



