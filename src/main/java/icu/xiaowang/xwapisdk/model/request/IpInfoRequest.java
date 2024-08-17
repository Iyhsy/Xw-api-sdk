package icu.xiaowang.xwapisdk.model.request;

import icu.xiaowang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xiaowang.xwapisdk.model.params.IpInfoParams;
import icu.xiaowang.xwapisdk.model.response.NameResponse;
import icu.xiaowang.xwapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: xiaowang
 * @Date: 2023/09/22 09:04:04
 * @Version: 1.0
 * @Description: 获取ip地址请求
 */
@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/ipInfo";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
