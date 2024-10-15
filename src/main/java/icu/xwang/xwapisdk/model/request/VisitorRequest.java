package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.params.VisitorParams;
import icu.xwang.xwapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/24 00:11
 * @Version: 1.0
 * @Description: 获取操作系统，浏览器，浏览器版本，访客IP地址，访问时间,访客IP地址天气
 */
@Accessors(chain = true)
public class VisitorRequest extends BaseRequest<VisitorParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/VisitorInfo";
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
