package com.example.spring.doc.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "用户DTO")
public class UserDto {
    @Schema(description = "id")
    private Long id;
    @Schema(description = "用户名", required = true, example = "飞翔的小白菜")
    private String username;
    @Schema(description = "密码", required = true, example = "小白菜")
    private String password;
    @Schema(description = "公司", required = true, example = "huawei")
    private String company;
    @Schema(description = "性别", required = true, example = "male")
    private String gender;
    @Schema(description = "电话", required = true, example = "15533449966")
    private String telephone;
    @Schema(description = "邮箱", required = true, example = "test@edgegallery.org")
    private String mailAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
    
}
