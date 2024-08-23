package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.params.ItNewsParams;
import icu.xwang.xwapisdk.model.response.ResultResponse;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/24 00:46
 * @Version: 1.0
 * @Description: IT热榜资讯
 */
public class ItNewsRequest extends BaseRequest<ItNewsParams, ResultResponse>{
    @Override
    public String getPath() {
        return "/itNews";
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
