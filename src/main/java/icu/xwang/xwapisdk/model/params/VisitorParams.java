package icu.xwang.xwapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/23 23:54
 * @Version: 1.0
 * @Description: 获取操作系统，浏览器，浏览器版本，访客IP地址，访问时间，访客IP地址天气
 */
@Data
@Accessors(chain = true)
public class VisitorParams implements Serializable {
    private static final long serialVersionUID = 6702952418188340682L;
}
