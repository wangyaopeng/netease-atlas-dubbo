package com.netease.atlas.dubbo;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.container.Main;
/**
 * 交易服务启动类 Provider
 * 
 * @author wylingxiao
 * @version 1.0
 * @since 1.0
 */
public class TradeProvider {
	/** The Constant LOGGER. */
	private static Logger logger=LoggerFactory.getLogger(TradeProvider.class);
	public static void main(String[] args) throws IOException {
		logger.info("test");
		Main.main(args);
	}


}
