package com.smm.service.impl;

import com.smm.entity.AllInfoOfShares;
import com.smm.mapper.AllInfoOfSharesMapper;
import com.smm.service.SharesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharesInfoServiceImpl implements SharesInfoService {

    @Autowired
    private AllInfoOfSharesMapper allInfoOfSharesMapper;

    /**
     * 存储前台输入股票的相关信息以及计算结果
     * @param allInfoOfShares
     */
    public int saveSharesInfo(AllInfoOfShares allInfoOfShares) {
        int i = allInfoOfSharesMapper.addAll(allInfoOfShares);
        if (i == 1){
            System.out.println("存入成功");
        }else {
            System.out.println("存入失败，管理员请检查数据信息");
        }
        return i;
    }
}
