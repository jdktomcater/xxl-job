package com.xxl.job.admin.core.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

/**
 * @author xuxueli 2019-05-04 16:43:12
 */
@Setter
@Getter
public class XxlJobUser {
	
	private int id;
	private String username;		// 账号
	private String password;		// 密码
	private int role;				// 角色：0-普通用户、1-管理员
	private String permission;	// 权限：执行器ID列表，多个逗号分割
    // plugin
	public boolean validPermission(int jobGroup){
		if (this.role == 1) {
			return true;
		} else {
			if (StringUtils.hasText(this.permission)) {
				for (String permissionItem : this.permission.split(",")) {
					if (String.valueOf(jobGroup).equals(permissionItem)) {
						return true;
					}
				}
			}
			return false;
		}

	}

}
