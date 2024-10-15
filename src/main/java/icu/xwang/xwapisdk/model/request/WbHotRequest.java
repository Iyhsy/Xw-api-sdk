package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.params.WbHotParams;
import icu.xwang.xwapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoWang
 * @Date: 2024/10/10 23:50
 * @Version: 1.0
 * @Description: 微博实时热搜热榜API
 */
@Accessors(chain = true)
public class WbHotRequest extends BaseRequest<WbHotParams, ResultResponse> {
    @Override
    public String getPath() {
        return "/WbHot";
    }

    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
