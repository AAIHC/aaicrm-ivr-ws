/*
 * Copyright 2014-2017 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr.ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.aaihc.crm.ws.ivr.service.IVRWsService;

@WebService(endpointInterface = "com.aaihc.crm.ws.ivr.ws.IVRWs")
public class IVRWsImpl implements IVRWs {
	@Autowired
	private IVRWsService ivrwsservice;

	@Override
	public String IVR_EVT0001(String CallKey, String IvrSysNo, String TrmsDttm, String IvrDnisNo, String CID) {
		return ivrwsservice.IVR_EVT0001(CallKey, IvrSysNo, TrmsDttm, IvrDnisNo, CID);
	}

}
