package icu.xwang.xwapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/24 10:31
 * @Version: 1.0
 * @Description: 获取手机号归属地
 */
@Data
@Accessors(chain = true)
public class PhoneParams implements Serializable {
    private static final long serialVersionUID = 4006838075552897934L;
    private String phone;
}
