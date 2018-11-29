package com.xuecheng.framework.domain.cms.request;

import lombok.Data;
import lombok.ToString;

/**
 * ty
 */
@Data
@ToString
public class QueryPageRequest {
    // 接受页面的查询条件
    //站点id
    private String siteId;
    //页面id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板id
    private String templateId;
    //..
}
