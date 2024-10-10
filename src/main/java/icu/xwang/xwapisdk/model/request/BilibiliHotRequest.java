package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoWang
 * @Date: 2024/10/10 18:50
 * @Version: 1.0
 * @Description: 获取哔哩哔哩全站日榜API
 */
@Accessors(chain = true)
public class BilibiliHotRequest extends BaseRequest<String, ResultResponse> {
    @Override
    public String getPath() {
        return "/biliHot";
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
