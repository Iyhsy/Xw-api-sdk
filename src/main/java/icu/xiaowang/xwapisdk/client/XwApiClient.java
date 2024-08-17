package icu.xiaowang.xwapisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xiaowang
 * @Date: 2023/09/15 08:41:51
 * @Version: 1.0
 * @Description: Xw api客户端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class XwApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
