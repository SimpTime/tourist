package com.guilin.tourist.dao.base;

import java.util.List;

public interface BaseDao<T>{

    T selectOne(T t);

    List<T> select(T t);

    int selectCount(T t);

    int insert(T t);

    int insertSelective(T t);

    int insertList(List<T> list);

    int delete(T t);

}
