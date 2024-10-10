package icu.xwang.xwapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: XiaoWang
 * @Date: 2024/10/10 23:50
 * @Version: 1.0
 * @Description: 微博实时热搜热榜API
 */
@Data
@Accessors(chain = true)
public class WbHotParams implements Serializable {
    private static final long serialVersionUID = -5292671167305791831L;
}
