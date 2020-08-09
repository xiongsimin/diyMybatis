package com.lagou.config;

import com.lagou.utils.ParameterMapping;

import java.util.List;

/**
 * @author xiongsm
 */
public class BoundSql {
    //解析过后的sql
    private String sqlText;

    public BoundSql(String sqlText, List<ParameterMapping> parameterMappingList) {
        this.sqlText = sqlText;
        this.parameterMappingList = parameterMappingList;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public List<ParameterMapping> getParameterMappingList() {
        return parameterMappingList;
    }

    public void setParameterMappingList(List<ParameterMapping> parameterMappingList) {
        this.parameterMappingList = parameterMappingList;
    }

    private List<ParameterMapping> parameterMappingList;
}
