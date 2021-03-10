/*
 * Copyright 2014-2015 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aaihc.crm.ws.ivr.ws.IVRWs;

public class IvrWsCXF {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/ws/client-bean.xml" });

		IVRWs ivr = (IVRWs) context.getBean("client1");

		String CallKey = "00000000000000000000";
		String IvrSysNo = "0000";
		String TrmsDttm = "2015092619191729";
		String IvrDnisNo = "00000000000000000000";
		String IvrSvcCode = "000000000000000";
		String CID = "010714077361";
		String InputTelNo = "";
		String InputBirth = "140404";
		String InputSex = "";
		String InputETC = "";
		String Passkey = "00000";

		System.out.println("\n################################################");
		System.out.println("#. IVR_EVT0001");
		System.out.println("################################################");
		String IVR_N0001 = ivr.IVR_EVT0001(CallKey, IvrSysNo, TrmsDttm, IvrDnisNo, CID);

		System.out.println("result:" + IVR_N0001);

	}
}
