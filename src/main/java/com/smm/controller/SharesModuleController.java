package com.smm.controller;

import com.smm.entity.AllInfoOfShares;
import com.smm.service.SharesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 股票模块Controller
 */
@Controller
@RequestMapping(value = "/shares")
public class SharesModuleController {

    @Autowired
    private SharesInfoService sharesInfoService;


    /**
     * 获取股票信息
     * @param gpmc
     * @param gpbm
     * @param mrj
     * @param mrgs
     * @param mcj
     * @param mcgs
     * @param sxf
     * @param gplx
     * @param jlr
     * @return
     */
    @RequestMapping(value = "/saveSharesInfo",method = RequestMethod.POST)
    @ResponseBody
    public String getShareInfo(String gpmc,int gpbm,double mrj,int mrgs,double mcj,int mcgs,double sxf,String gplx,int jlr){
        AllInfoOfShares as = new AllInfoOfShares();
        as.setGpmc(gpmc);
        as.setGpbm(gpbm);
        as.setMrj(mrj);
        as.setMrgs(mrgs);
        as.setMcj(mcj);
        as.setMcgs(mcgs);
        as.setSxf(sxf);
        as.setGplx(gplx);
        as.setJlr(jlr);
        int i = sharesInfoService.saveSharesInfo(as);
        if (i==1){
            return "成功";
        }
       return "失败";
    }

}
