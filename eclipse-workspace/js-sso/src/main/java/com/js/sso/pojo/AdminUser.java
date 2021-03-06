package com.js.sso.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "ly_admin_user")
public class AdminUser extends BasePojo{
	
	@Id // 设置主键
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 设置自增，底层数据库支持
	private Long id;
	@Column(name = "mobile_phone")
	private String mobilePhone;
	@Column(name = "password")
	private String password;
	@Column(name="device_id")
	private String deviceId;
	@Column(name="email")
	private String email;
	@Column(name="authentication")
	private String authentication;
	@Column(name="user_type")
	private String userType;
	@Transient
	private String operationType;
	@Transient
    private AdminUserExpand adminUserExpand;
	@Transient
	private Company company;
	@Transient
	private List<AdminUserCredentials> adminUserCredentialsList;
	@Transient
	private List<File> fileList;
	
	public List<File> getFileList() {
		return fileList;
	}

	public String getEmail() {
		return email;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getAuthentication() {
		return authentication;
	}

	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	

	public List<AdminUserCredentials> getAdminUserCredentialsList() {
		return adminUserCredentialsList;
	}

	public void setAdminUserCredentialsList(List<AdminUserCredentials> adminUserCredentialsList) {
		this.adminUserCredentialsList = adminUserCredentialsList;
	}

	public AdminUserExpand getAdminUserExpand() {
		return adminUserExpand;
	}

	public void setAdminUserExpand(AdminUserExpand adminUserExpand) {
		this.adminUserExpand = adminUserExpand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
