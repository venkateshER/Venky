package com.bridgeit.oops;

import com.bridgeit.utility.LinkedList;

public class UserStocks
{
	private String userName;
	private java.util.LinkedList<ShareList> shareList;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public java.util.LinkedList<ShareList> getShareList() {
		return shareList;
	}
	public void setShareList(java.util.LinkedList<ShareList> shareList2) {
		this.shareList = shareList2;
}
}
