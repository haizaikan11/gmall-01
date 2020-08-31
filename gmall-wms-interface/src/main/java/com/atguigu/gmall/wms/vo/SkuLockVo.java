package com.atguigu.gmall.wms.vo;


import lombok.Data;

@Data
public class SkuLockVo {
    private Long skuId;
    private Integer count;  //锁多少件
    private Boolean lock;   //锁定状态
    private Long wareSkuId;  //记录锁定成功的仓库id
}
