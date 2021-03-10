/*
 * Copyright 2014-2017 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr.service;

import com.aaihc.crm.ws.ivr.dao.IVRWsDao;

public class IVRWsServiceImpl implements IVRWsService {
	private IVRWsDao dao;

	public void setDao(IVRWsDao dao) {
		this.dao = dao;
	}

	@Override
	public String IVR_EVT0001(String CallKey, String IvrSysNo, String TrmsDttm, String IvrDnisNo, String CID) {
		return dao.IVR_EVT0001(CallKey, IvrSysNo, TrmsDttm, IvrDnisNo, CID);
	}

}
