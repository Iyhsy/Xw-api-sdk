package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.params.NameParams;
import icu.xwang.xwapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: xiaowang
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
