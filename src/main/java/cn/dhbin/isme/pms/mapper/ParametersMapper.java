package cn.dhbin.isme.pms.mapper;

import cn.dhbin.isme.pms.domain.dto.UserPageDto;
import cn.dhbin.isme.pms.domain.entity.Parameters;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper
 *
 * @author dhb
 */
public interface ParametersMapper extends BaseMapper<Parameters> {
    /**
     * 分页查询
     *
     * @param page    分页
     * @param sysName 系统参数名称
     * @param sysCode 系统参数编码
     * @param enable  状态
     * @return 分页结果
     */
    IPage<UserPageDto> pageDetail(
            IPage<Parameters> page,
            @Param("sysName") String sysName,
            @Param("sysCode") String sysCode,
            @Param("enable") Boolean enable
    );
}
