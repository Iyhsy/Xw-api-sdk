package icu.xiaowang.xwapisdk.model.request;

import icu.xiaowang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xiaowang.xwapisdk.model.params.HoroscopeParams;
import icu.xiaowang.xwapisdk.model.response.NameResponse;
import icu.xiaowang.xwapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: xiaowang
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 随机情话
 */
@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/horoscope";
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
