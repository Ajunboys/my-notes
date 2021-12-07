## 前言：Maven介绍

我们使用maven构建应用环境，因此我们先来简单介绍maven。Maven是什么？如何回答这个问题 要看你怎么看这个问题。 绝大部分Maven用户都称Maven是一个"构建工具"：一个用来把源代码构建成可发布的构件的工具。构建工程师和项目经理会说Maven是一个更复杂 的东西：一个项目管理工具。那么区别是什么？ 像Ant这样的构建工具仅仅是关注预处理，编译，打包，测试和分发，而 Maven 这样的一个项目管理工具提供了构建工具所提供功能的超集， 除了提供构建的功能，Maven还可以生成报告，生成Web站点，并且帮助推动工作团 队成员间的交流。

Maven目前最新版本是2.1.0. 因为maven2.0的版本与maven1.0相比完全是重新设计的，而且速度比以前更快，所以称为 maven2. 目前很多的开源项目都已经采用maven2构建，足见其流行好用的程度。 注：

## 一、环境变量

环境设置：%MAVEN_HOME% = D:\Program Files\apache-maven-3.6.3\bin

```PowerShell
%MAVEN_HOME% = D:\Program Files\apache-maven-3.6.3\bin
```

## 二、本地仓库设置

进入安装目录下的conf修改settings.xml 本地仓库位置

```XML
<!--指定本地仓库位置-->
<localRepository>
E:\\BaiduNetdiskWorkspace\\dve-software\\maven-local-repository
</localRepository>
<!--加入镜像路径-->
<mirror>
    <id>nexus-aliyun</id>
    <mirrorOf>central</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>
```

## 三、Maven常用命令

**maven 命令除了常用的几个，大部分经常记不住，整理一下，方便查询。**

> maven 命令的格式为 mvn [plugin-name]:[goal-name]，可以接受的参数如下，
>  -D 指定参数，如 -Dmaven.test.skip=true 跳过单元测试；
>  -P 指定 Profile 配置，可以用于区分环境；
>  -e 显示maven运行出错的信息；
>  -o 离线执行命令,即不去远程仓库更新包；
>  -X 显示maven允许的debug信息；
>  -U 强制去远程更新snapshot的插件或依赖，默认每天只更新一次。

### 1. 常用Maven命令

- 创建maven项目：mvn archetype:create

  指定 group： -DgroupId=packageName

  指定 artifact：-DartifactId=projectName

  创建web项目：-D archetype ArtifactId=maven-archetype-webapp

- 创建maven项目：mvn archetype:generate

- 验证项目是否正确：mvn validate

- maven 打包：mvn package

- 只打jar包：mvn jar:jar

- 生成源码jar包：mvn source:jar

- 产生应用需要的任何额外的源代码：mvn generate-sources

- 编译源代码： mvn compile

- 编译测试代码：mvn test-compile

- 运行测试：mvn test

- 运行检查：mvn verify

- 清理maven项目：mvn clean

- 生成eclipse项目：mvn eclipse:eclipse

- 清理eclipse配置：mvn eclipse:clean

- 生成idea项目：mvn idea:idea

- 安装项目到本地仓库：mvn install

- 发布项目到远程仓库：mvn:deploy

- 在集成测试可以运行的环境中处理和发布包：mvn integration-test

- 显示maven依赖树：mvn dependency:tree

- 显示maven依赖列表：mvn dependency:list

- 下载依赖包的源码：mvn dependency:sources

- 安装本地jar到本地仓库：mvn install:install-file -DgroupId=packageName -DartifactId=projectName -Dversion=version -Dpackaging=jar -Dfile=path

### 2. web项目相关命令

- 启动tomcat：mvn tomcat:run
- 启动jetty：mvn jetty:run
- 运行打包部署：mvn tomcat:deploy
- 撤销部署：mvn tomcat:undeploy
- 启动web应用：mvn tomcat:start
- 停止web应用：mvn tomcat:stop
- 重新部署：mvn tomcat:redeplo
- 部署展开的war文件：mvn war:exploded tomcat:exploded

### 3. 例子(构建项目)

建立一个Java项目

```PowerShell
mvn archetype:create -DgroupId=com.codedot -DartifactId=java-project

# 或
mvn archetype:generate -DgroupId=com.codedot -DartifactId=java-project
```

建立一个web项目

```PowerShell
mvn archetype:create -DgroupId=com.codedot -DartifactId=web-app -DarchetypeArtifactId=maven-archetype-webapp
```

**生成 Eclipse 项目**

普通 Eclipse 项目执行 ： **mvn eclipse:eclipse**

Eclipse WTP 项目执行 ： **mvn eclipse:eclipse –Dwtpversion=1.0**