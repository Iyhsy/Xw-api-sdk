<p align="center">
    <img src=https://images.xw998.top/xwapi-images/images/015023lWwAmvhFTb4CbC09.png width=188/>
</p>

<h1 align="center">Xw-API-SDK</h1>
<p align="center"><strong>Xw-API 接口开放平台开发者工具包</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
</div>
### 目录结构 📝

```text
Xwapisdk
    ├─client
    ├─config
    ├─exception
    ├─model
    │  ├─enums
    │  ├─params
    │  ├─request
    │  └─response
    ├─service
    │  └─impi
    └─utils
```

### 导航 🧭

- **[Xw-API 接口开放平台 🔗](https://api.xwang.icu/)**
- **[Xw-API-DOC 开发者文档 📖](https://doc.xwang.icu/)**
- **[Xw-API-SDK-demo ✔️](https://github.com/Iyhsy/Xw-api-sdk-demo/blob/master/src/main/java/icu/xwang/Xwapisdkdemo/controller/InvokeController.java)**

###  快速开始 🚀

**要开始使用 Xw-API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml

<dependency>
  <groupId>icu.xwang</groupId>
  <artifactId>Xw-api-sdk</artifactId>
  <version>1.0.0</version>
</dependency>   
```

**可以搭配[EasyWeb](https://github.com/Iyhsy/EasyWeb)依赖快速启动Web项目**

```xml

<dependency>
  <groupId>icu.xwang</groupId>
  <artifactId>EasyWeb</artifactId>
  <version>1.0.0</version>
</dependency>
```

#### 2. 前往[Xw-API 接口开放平台](https://api.xwang.icu/) 获取开发者密钥对

#### 3. 初始化客户端XwApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  XwApiClient client = new XwApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # Xw-API 配置
    qi:
      api:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
          # 本地网关地址，可修改为自己的网关，用于本地测试，线上网关地址等，不配置默认平台的网关
         # host: http://localhost:8090/api
    ```
    
  - properties
  
    ```properties
    qi.api.client.access-key=你的 accessKey
    qi.api.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

   ```java
    @Resource
    private ApiService apiService;
   ```

#### 5. 发起请求示例

示例：随机毒鸡汤

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入
```java
try {
    XwApiClient xwApiClient = new XwApiClient("你的 accessKey", "你的 secretKey");
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup(xwApiClient);
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
```

**搭配[EasyWeb](https://github.com/Iyhsy/EasyWeb)示例：推荐👍**

```java
@GetMapping("/getPoisonousChickenSoup")
public BaseResponse<PoisonousChickenSoupResponse> getPoisonousChickenSoup() {
        PoisonousChickenSoupResponse poisonousChickenSoup = null;
        try {
        poisonousChickenSoup = apiService.getPoisonousChickenSoup();
        } catch (ApiException e) {
        throw new ApiException(e.getCode(), e.getMessage());
        }
        return ResultUtils.success(poisonousChickenSoup);
        }
```

响应示例：

```json
{
  "code": 0,
  "data": {
    "text": "人类三大错觉—手机响了，有人敲门，他（她）喜欢我。"
  },
  "message": "ok"
}
```
- **更多示例详见：[Xw-API-SDK-Demo 示例项目](https://github.com/Iyhsy/Xw-api-sdk-demo/blob/master/src/main/java/icu/xwang/Xwapisdkdemo/controller/InvokeController.java)**
- **更多接口详见：[Xw-API-DOC 开发者文档](https://doc.xwang.icu/)**

### 贡献 🤝

如果您想为 **[Xw-API 接口开放平台](https://api.xwang.icu/)**  做出贡献，请随时提交拉取请求。我们始终在寻找方法来改进项目，使其对像您这样的开发者更有用。

### 联系我们 📩

如果您对 **[Xw-API 接口开放平台](https://api.xwang.icu/)**  平台有任何问题或建议，请随时联系我们:📩邮箱：77bz@163.com。

感谢您使用 **[Xw-API 接口开放平台](https://api.xwang.icu/)**  ！ 😊
