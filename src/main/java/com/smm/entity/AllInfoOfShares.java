package com.smm.entity;

import java.util.Date;

/**
 * 股票总信息实体类
 */
public class AllInfoOfShares {
    private String gpmc;
    private int gpbm;
    private double mrj;
    private double mcj;
    private int mrgs;
    private int mcgs;
    private double sxf;
    private String gplx;
    private int jlr;
    private Date time;

    public AllInfoOfShares() {
    }

    public AllInfoOfShares(String gpmc, int gpbm, double mrj, double mcj, int mrgs, int mcgs, double sxf, String gplx, int jlr, Date time) {
        this.gpmc = gpmc;
        this.gpbm = gpbm;
        this.mrj = mrj;
        this.mcj = mcj;
        this.mrgs = mrgs;
        this.mcgs = mcgs;
        this.sxf = sxf;
        this.gplx = gplx;
        this.jlr = jlr;
        this.time = time;
    }


    public String getGpmc() {
        return gpmc;
    }

    public void setGpmc(String gpmc) {
        this.gpmc = gpmc;
    }

    public int getGpbm() {
        return gpbm;
    }

    public void setGpbm(int gpbm) {
        this.gpbm = gpbm;
    }

    public double getMrj() {
        return mrj;
    }

    public void setMrj(double mrj) {
        this.mrj = mrj;
    }

    public double getMcj() {
        return mcj;
    }

    public void setMcj(double mcj) {
        this.mcj = mcj;
    }

    public int getMrgs() {
        return mrgs;
    }

    public void setMrgs(int mrgs) {
        this.mrgs = mrgs;
    }

    public int getMcgs() {
        return mcgs;
    }

    public void setMcgs(int mcgs) {
        this.mcgs = mcgs;
    }

    public double getSxf() {
        return sxf;
    }

    public void setSxf(double sxf) {
        this.sxf = sxf;
    }

    public String getGplx() {
        return gplx;
    }

    public void setGplx(String gplx) {
        this.gplx = gplx;
    }

    public double getJlr() {
        return jlr;
    }

    public void setJlr(int jlr) {
        this.jlr = jlr;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "AllInfoOfShares{" +
                "gpmc='" + gpmc + '\'' +
                ", gpbm='" + gpbm + '\'' +
                ", mrj=" + mrj +
                ", mcj=" + mcj +
                ", mrgs=" + mrgs +
                ", mcgs=" + mcgs +
                ", sxf=" + sxf +
                ", gplx='" + gplx + '\'' +
                ", jlr=" + jlr +
                ", time=" + time +
                '}';
    }
}
