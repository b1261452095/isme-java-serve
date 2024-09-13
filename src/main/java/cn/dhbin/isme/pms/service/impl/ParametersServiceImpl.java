package cn.dhbin.isme.pms.service.impl;


import cn.dhbin.isme.common.exception.BadRequestException;
import cn.dhbin.isme.pms.domain.entity.*;
import cn.dhbin.isme.pms.domain.request.*;
import cn.dhbin.isme.pms.mapper.ParametersMapper;
import cn.dhbin.isme.pms.service.*;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Parameters Service impl
 *
 * @author lat
 */
@Service
@RequiredArgsConstructor
public class ParametersServiceImpl extends ServiceImpl<ParametersMapper, Parameters> implements ParametersService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addParameter(AddParameterRequest request) {
        Parameters parameters = request.convert(Parameters.class);

        boolean exists = this.lambdaQuery().eq(Parameters::getSysCode, request.getSysCode())
                .or()
                .eq(Parameters::getSysName, request.getSysName())
                .exists();

        if (exists) {
            throw new BadRequestException("系统参数已存在（系统参数名和系统参数编码不能重复）");
        }

        this.save(parameters);

    }

}
