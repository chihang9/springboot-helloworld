package com.chihang.sys.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
	private String userName;

	public UserInfo() {
	}

	public UserInfo(String userName) {
		super();
		this.userName = userName;
	}

}
