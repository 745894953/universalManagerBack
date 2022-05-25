package com.example.back.module.sys.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hcf
 * @since 2022-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysRole对象", description="")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色主键")
    private String trId;

    @ApiModelProperty(value = "上级角色ID")
    private String parentTrId;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "角色状态")
    private String roleState;

    @ApiModelProperty(value = "创建角色")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "角色描述")
    private String description;


}
