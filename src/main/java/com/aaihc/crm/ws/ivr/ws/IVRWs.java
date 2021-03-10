/*
 * Copyright 2014-2017 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IVRWs {
	public String IVR_EVT0001(@WebParam(name = "CallKey") String CallKey, @WebParam(name = "IvrSysNo") String IvrSysNo,
			@WebParam(name = "TrmsDttm") String TrmsDttm, @WebParam(name = "IvrDnisNo") String IvrDnisNo,
			@WebParam(name = "CID") String CID);
}
