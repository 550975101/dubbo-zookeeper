package com.cctv.controller;

import com.cctv.domain.OrderDomain;
import com.cctv.result.RpcResult;

/**
 * @author 封心
 */
public interface OrderDubboService {
  /**
   * 获取订单接口
   * @return
   */
  RpcResult<OrderDomain> getOrder();

}
