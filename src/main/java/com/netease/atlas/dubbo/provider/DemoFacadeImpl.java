package com.netease.atlas.dubbo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netease.atlas.dto.demo.DemoReq1;
import com.netease.atlas.dto.demo.DemoResp1;
import com.netease.atlas.dubbo.TradeProvider;
import com.netease.atlas.facade.demo.DemoFacade1;

public class DemoFacadeImpl implements DemoFacade1{

	private static Logger logger=LoggerFactory.getLogger(TradeProvider.class);

	
	public DemoResp1 process(DemoReq1 req) {
		logger.info("收到dubbo调用请求"+req);
		DemoResp1 resp=new DemoResp1();
		resp.setRespInfo1("result"+req.getReqInfo1());
 		return resp;
	}

}
