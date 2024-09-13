package cn.dhbin.isme.pms.convert;

import cn.dhbin.isme.pms.domain.entity.Parameters;
import cn.dhbin.isme.pms.domain.entity.Role;
import cn.dhbin.isme.pms.domain.request.AddParameterRequest;
import cn.dhbin.isme.pms.domain.request.CreateRoleRequest;
import cn.dhbin.mapstruct.helper.core.BeanConvertMapper;
import org.mapstruct.Mapper;

import static cn.dhbin.isme.common.mapstruct.MapstructConstant.DEFAULT_COMPONENT_MODEL;

/**
 * CreateRoleRequestToRole
 *
 * @author dhb
 */
@Mapper(componentModel = DEFAULT_COMPONENT_MODEL)
public interface CreateParameterRequestToParameter extends BeanConvertMapper<AddParameterRequest, Parameters> {
}
