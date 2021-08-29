package com.example.spring.doc.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class UserRespDto {

    @Schema(description ="",required = true, example = "37423702-051a-46b4-bf2b-f190759cc0b8")
    private String userId;

//    @ApiModelProperty(required = true)
//    private List<RoleDto> permissions;

    /**
     * set tenant response value.
     */
//    public void setResponse(TenantPo tenantPo) {
//        this.setUserId(tenantPo.getTenantId());
//        this.setUsername(tenantPo.getUsername());
//        this.setMailAddress(tenantPo.getMailAddress());
//        this.setTelephone(tenantPo.getTelephoneNumber());
//        this.setAllowed(tenantPo.isAllowed());
//        this.setCreateTime(tenantPo.getCreateTime());
//    }

    /**
     * set tenant role permission.
     */
//    public void setPermission(List<RolePo> rolePos) {
//        List<RoleDto> roleDtos = new ArrayList<>();
//        for (RolePo rolePo : rolePos) {
//            RoleDto dto = new RoleDto();
//            dto.setPlatform(rolePo.getPlatform());
//            dto.setRole(rolePo.getRole());
//            roleDtos.add(dto);
//        }
//        this.setPermissions(roleDtos);
//    }

}
