/*
 * Copyright 2014-2017 by AAI Healthcare Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of AAI Healthcare Corp. ("Confidential Information").
 */

package com.aaihc.crm.ws.ivr.dao;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class IVRWsDaoImpl implements IVRWsDao {
	private static final Logger logger = LoggerFactory.getLogger(IVRWsDaoImpl.class);

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public String IVR_EVT0001(String CallKey, String IvrSysNo, String TrmsDttm, String IvrDnisNo, String CID) {
		String rtnChk = "N";
		try {
			System.out.println("\n####### [IVR][IVR_EVT0001][호인입시 EVT 데이터 전송]");
			System.out.println("CallKey : " + CallKey);
			System.out.println("IvrSysNo : " + IvrSysNo);
			System.out.println("TrmsDttm : " + TrmsDttm);
			System.out.println("IvrDnisNo : " + IvrDnisNo);
			System.out.println("CID : " + CID);

			if(0 < insIVR_EVT0001(CallKey, IvrSysNo, TrmsDttm, IvrDnisNo, CID)){
				rtnChk = "Y";
			}

			System.out.println("\n####### [IVR][IVR_EVT0001][호인입시 EVT 데이터 전송][RETURN] : " + rtnChk);

			logger.debug("\n####### [IVR][IVR_EVT0001][호인입시 EVT 데이터 전송][RETURN] : " + rtnChk);;
		} catch (Exception e) {
			logger.debug("\n####### [IVR][IVR_EVT0001][Exception]: \n{} \n#######", e.getMessage());
		}

		return rtnChk;
	}

	public int insIVR_EVT0001(String CallKey, String IvrSysNo, String TrmsDttm, String IvrDnisNo, String CID) {

		int rtnChk = -1;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("\n INSERT INTO [dbo].[T_LA_IVR_EVT] ( ");
			sql.append("\n     [callkey]                 ");
			sql.append("\n     ,[ivrsysno]               ");
			sql.append("\n     ,[trmsdttm]               ");
			sql.append("\n     ,[ivrdnisno]              ");
			sql.append("\n     ,[cid]                    ");
			sql.append("\n     ,[tbluser]                ");
			sql.append("\n     ,[tbldatatime]            ");
			sql.append("\n ) VALUES (                    ");
			sql.append("\n     ?,?,?,?,?                 ");
			sql.append("\n     ,?,GETDATE()              ");
			sql.append("\n )                             ");

			Object[] obj = new Object[6];
			obj[0] = CallKey;
			obj[1] = IvrSysNo;
			obj[2] = TrmsDttm;
			obj[3] = IvrDnisNo;
			obj[4] = isMobileEncrypt(CID);
			obj[5] = "IVR";

			for (int i = 0; i < obj.length; i++)
				System.out.println(" [IVR][IVR_EVT0001][호인입시 EVT 데이터 전송][RETURN] : I : " + i + " : " + obj[i]);

			rtnChk = jdbcTemplate.update(sql.toString(), obj);
		} catch (Exception e) {
			logger.debug("\n#######  [IVR][IVR_EVT0001][호인입시 EVT 데이터 전송][RETURN] Exception [INSERT]: \n{} \n#######", e.getMessage());
		}
		return rtnChk;
	}

	public String isMobileEncrypt(String v) {
		String rtnChk = "";
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("\n SELECT [dbo].[EncryptT](?) AS Encrypt ");
			Object[] obj = new Object[1];
			obj[0] = v;
			rtnChk = jdbcTemplate.queryForObject(sql.toString(),obj, String.class);
		} catch (Exception e) {
			logger.debug("\n####### [SVC] Exception [SELECT]: \n{} \n#######", e.getMessage());
		}
		return rtnChk;
	}

}
