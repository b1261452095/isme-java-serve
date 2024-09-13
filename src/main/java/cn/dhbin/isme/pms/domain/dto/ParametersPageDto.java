package cn.dhbin.isme.pms.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户分页数据
 */
@Data
public class ParametersPageDto {

    private Long id;

    private String sysName;

    private String sysCode;

    private String sysValue;

    private Boolean enable;

    private Boolean isDelete;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
