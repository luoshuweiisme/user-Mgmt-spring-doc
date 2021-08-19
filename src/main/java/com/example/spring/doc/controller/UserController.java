package com.example.spring.doc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.doc.dto.UserDto;
import com.example.spring.doc.entity.UserReqDto;
import com.example.spring.doc.service.UserMgmtService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "UserController", description = "API文档标签1")
@RestController
public class UserController {
    private static final String REG_UUID = "[0-9a-f]{32}";

    @Autowired
    private UserMgmtService userMgmtService;
    
	 @Operation(
	            summary = "query users.",
	            description = "返回：所有用户数据",
	            method = MediaType.TEXT_PLAIN_VALUE,
	            security = {@SecurityRequirement(name = "basicScheme")})
	    @GetMapping("/user/list")
	 public List<UserDto> getUsers(
			 @Parameter(description="QueryUserReqDto",required =true)@RequestBody UserReqDto request){
		 return userMgmtService.queryUsers(request);
	 }
	 
 
	    @Operation(
	            summary = "保存用户",
	            description = "返回：新增用户id",
	            method = MediaType.APPLICATION_JSON_VALUE,
	            parameters = @Parameter(ref = "#/components/parameters/myHeader1"))
	    @Parameters({
	            @Parameter(name = "access_token", description = "授权码", required = true, schema = @Schema(implementation = String.class), in = ParameterIn.HEADER, example = "abc"),
	            @Parameter(name = "id", description = "用户id", schema = @Schema(implementation = Long.class), in = ParameterIn.QUERY, example = "123456"),
	    })
	    @ApiResponses(value = {
	            @ApiResponse(responseCode = "400", description = "参数填写错误"),
	            @ApiResponse(responseCode = "500", description = "接口异常")
	    })
	    @PostMapping("/user/insert")
	    public Long registerUser(@RequestBody UserReqDto user) {
	        return userMgmtService.register(user);
	    }
	 
	 
	 @Operation(
	            summary = "delete user by userId",
	            description = "无返回",
	            method = MediaType.TEXT_PLAIN_VALUE,
	            parameters = @Parameter(ref = "#/components/headers/myHeader2"))
	    @DeleteMapping("/user/delete/{userId}")
	    public void deleteUser(
	            @Parameter(name = "id", description = "用户id", required = true, example = "1") @PathVariable("userId")String userId) {

	    	userMgmtService.deleteUser(userId);
	 
	 }
}
