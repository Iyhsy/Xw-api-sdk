package icu.xwang.xwapisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: XiaoWang
 * @Date: 2024/8/24 12:58
 * @Version: 1.0
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PhoneReponse extends ResultResponse {
    private static final long serialVersionUID = -5249839051573602501L;
    // 用户电话号码
    private String phone;
    // 运营商名称
    private String op;
    // 用户所在省份
    private String province;
    // 用户所在城市
    private String city;
    // 邮政编码
    private String zipcode;
    // 区号
    private String areacode;
}
