package com.cctv.controller;

import com.cctv.result.RpcResult;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 封心
 */
@RestController
@RequestMapping("/order")
public class OrderConsumerController {

  @DubboReference
  private OrderDubboService orderDubboService;

  @GetMapping("getOrder")
  public RpcResult getOrder() {
    return orderDubboService.getOrder();
  }

}
