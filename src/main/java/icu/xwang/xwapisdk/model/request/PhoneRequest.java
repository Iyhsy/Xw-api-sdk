package icu.xwang.xwapisdk.model.request;

import icu.xwang.xwapisdk.model.enums.RequestMethodEnum;
import icu.xwang.xwapisdk.model.params.PhoneParams;
import icu.xwang.xwapisdk.model.response.PhoneReponse;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/24 10:32
 * @Version: 1.0
 * @Description: 获取手机号归属地
 */
@Accessors(chain = true)
public class PhoneRequest extends BaseRequest<PhoneParams, PhoneReponse> {

    @Override
    public String getPath() {
        return "/PhoneInfo";
    }

    @Override
    public Class<PhoneReponse> getResponseClass() {
        return PhoneReponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
