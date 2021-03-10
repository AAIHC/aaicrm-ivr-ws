/*
 * Copyright 2014-2017 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr.vo;

public class IVRWsVo {
	private String callkey = "";
	private String ivrsysno = "";
	private String trmsdttm = "";
	private String ivrdnisno = "";
	private String cid = "";

	public String getCallkey() {
		return callkey;
	}

	public void setCallkey(String callkey) {
		this.callkey = callkey;
	}

	public String getIvrsysno() {
		return ivrsysno;
	}

	public void setIvrsysno(String ivrsysno) {
		this.ivrsysno = ivrsysno;
	}

	public String getTrmsdttm() {
		return trmsdttm;
	}

	public void setTrmsdttm(String trmsdttm) {
		this.trmsdttm = trmsdttm;
	}

	public String getIvrdnisno() {
		return ivrdnisno;
	}

	public void setIvrdnisno(String ivrdnisno) {
		this.ivrdnisno = ivrdnisno;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}
