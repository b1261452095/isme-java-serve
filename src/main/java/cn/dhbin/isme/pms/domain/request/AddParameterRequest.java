package cn.dhbin.isme.pms.domain.request;

import lombok.Data;
import cn.dhbin.mapstruct.helper.core.Convert;

/**
 * 登录请求参数
 *
 * @author dhb
 */
@Data
public class AddParameterRequest implements Convert {

    /**
     * 系统参数名称
     */
    private String sysName;

    /**
     * 系统参数编码
     */
    private String sysCode;

    /**
     * 系统参数值
     */
    private String sysValue;

    private Boolean enable;

}
