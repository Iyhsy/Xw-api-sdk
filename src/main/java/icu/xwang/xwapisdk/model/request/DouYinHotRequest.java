package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.params.DouYinHotParams;
import icu.xwang.xwapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/24 10:40
 * @Version: 1.0
 * @Description: 获取实时抖音热榜
 */
@Accessors(chain = true)
public class DouYinHotRequest extends BaseRequest<DouYinHotParams, ResultResponse> {
    @Override
    public String getPath() {
        return "/douyinHot";
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
