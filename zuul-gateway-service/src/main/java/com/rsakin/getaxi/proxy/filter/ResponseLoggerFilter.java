package com.rsakin.getaxi.proxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.rsakin.getaxi.proxy.util.FilterUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ResponseLoggerFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {
        return FilterUtil.SHOULD_FILTER;
    }

    @Override
    public String filterType() {
        return FilterUtil.FILTER_TYPE_POST;
    }

    @Override
    public int filterOrder() {
        return FilterUtil.FILTER_ORDER;
    }

    // Post-filter all requests and do any...
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        log.info("response status logged " + ctx.getResponse().getStatus());

        return null;
    }
}
