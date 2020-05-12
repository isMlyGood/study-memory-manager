package com.smm.service;

import com.smm.entity.AllInfoOfShares;

public interface SharesInfoService {

    /**
     * 存入股票相关信息
     */
    public int saveSharesInfo(AllInfoOfShares allInfoOfShares);

}
