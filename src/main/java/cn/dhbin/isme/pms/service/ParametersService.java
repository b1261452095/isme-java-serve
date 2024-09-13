package cn.dhbin.isme.pms.service;

import cn.dhbin.isme.common.response.Page;
import cn.dhbin.isme.pms.domain.dto.LoginTokenDto;
import cn.dhbin.isme.pms.domain.dto.UserDetailDto;
import cn.dhbin.isme.pms.domain.dto.UserPageDto;
import cn.dhbin.isme.pms.domain.entity.Parameters;
import cn.dhbin.isme.pms.domain.entity.User;
import cn.dhbin.isme.pms.domain.request.*;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * User Service
 *
 * @author dhb
 */
public interface ParametersService extends IService<Parameters> {



    /**
     * 注册用户
     *
     * @param request 请求
     */
    void addParameter(AddParameterRequest request);

}
