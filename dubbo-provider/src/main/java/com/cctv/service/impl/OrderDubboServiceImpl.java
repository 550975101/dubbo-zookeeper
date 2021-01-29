package com.cctv.service.impl;

import com.cctv.domain.OrderDomain;
import com.cctv.result.RpcResult;
import com.cctv.controller.OrderDubboService;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author 封心
 */
@DubboService
public class OrderDubboServiceImpl implements OrderDubboService {

  @Override
  public RpcResult<OrderDomain> getOrder() {
    return RpcResult.success(new OrderDomain(1, 10086, LocalDateTime.now()));
  }

}
