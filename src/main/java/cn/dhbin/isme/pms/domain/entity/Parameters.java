package cn.dhbin.isme.pms.domain.entity;

import cn.dhbin.mapstruct.helper.core.Convert;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户
 *
 * @author dhb
 */
@Data
@TableName("sys_parameter")
public class Parameters implements Convert {

    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;

    @TableField("sysCode")
    private String sysCode;

    @TableField("sysName")
    private String sysName;

    @TableField("sysValue")
    private String sysValue;

    private Boolean enable;

    private Boolean isDelete;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;

}
