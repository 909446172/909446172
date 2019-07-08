package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.PmsProductSaleAttr;
import com.atguigu.gmall.beans.PmsSkuInfo;

import java.util.List;

public interface SkuService {

    List<PmsProductSaleAttr> spuSaleAttrListCheckedBySkuId(String spuId,String skuId);

    List<PmsSkuInfo> checkSkuBySpuId(String spuId);

    String checkSkuByValueIdsTwo(String[] ids);

    String checkSkuByValueIds(String[] ids);

    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuById(String skuId,String ip);

    List<PmsSkuInfo> getAllSku();
}
