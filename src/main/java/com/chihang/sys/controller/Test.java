package com.chihang.sys.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.chihang.sys.bean.UserInfo;

public class Test {

	
	@org.junit.Test
	public void sortTest() {
		List<UserInfo> list = new ArrayList<UserInfo>();
		list.add(new UserInfo("1"));
		list.add(new UserInfo("7"));
		list.add(new UserInfo("2"));
		list.add(new UserInfo("5312123213123312"));
		list.add(new UserInfo("7123123213"));
		list.add(new UserInfo("3213123132"));
		list.add(new UserInfo("5"));
		list.add(new UserInfo("4"));
		list.add(new UserInfo("3试试水313123"));
		list.add(new UserInfo("6"));
		Collections.sort(list,(s1,s2)->s1.getUserName().compareTo(s2.getUserName()));
		list.stream().skip(3).collect(Collectors.toList());
		System.out.println(list.stream().skip(3).collect(Collectors.toList()));
		System.out.println(list.toString());
	}
}
