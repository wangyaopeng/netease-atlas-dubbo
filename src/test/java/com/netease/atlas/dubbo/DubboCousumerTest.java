package com.netease.atlas.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.netease.atlas.dto.demo.DemoReq1;
import com.netease.atlas.dto.demo.DemoReq2;
import com.netease.atlas.dto.demo.DemoResp1;
import com.netease.atlas.dto.demo.DemoResp2;
import com.netease.atlas.facade.demo.DemoFacade1;
import com.netease.atlas.facade.demo.DemoFacade2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-bootstrap.xml", "classpath:dubbo-consumer-test.xml"})
public class DubboCousumerTest {
	
	@Autowired
	private DemoFacade1 demoFacade1;
	
//	@Autowired
	private DemoFacade2 demoFacade2;
	
	@Test
	public void  testConsumer1(){
		
		DemoReq1 req=new DemoReq1();
		req.setReqInfo1("dubbotestfacade1");
		DemoResp1 resp=demoFacade1.process(req);
		System.err.println(resp);
	}
	
//	@Test
	public void testConsumer2(){
		
		DemoReq2 req=new DemoReq2();
		req.setReqInfo2("dubbotestfacade2");
		DemoResp2 resp=demoFacade2.process(req);
		System.out.println(resp);
	}

}
