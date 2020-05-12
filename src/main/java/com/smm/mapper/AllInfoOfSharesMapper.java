package com.smm.mapper;

import com.smm.entity.AllInfoOfShares;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("allInfoOfShares")
public interface AllInfoOfSharesMapper {

    // 查询表中所有信息
    public List<AllInfoOfShares> findAll();

    /**
     * 无条件插入所有字段信息
     * @return
     */
    public int addAll(AllInfoOfShares allInfoOfShares);
}
