/*
 * Copyright 2014-2017 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr.dao;

public interface IVRWsDao {
	public String IVR_EVT0001(String CallKey, String IvrSysNo, String TrmsDttm, String IvrDnisNo, String CID);
}
