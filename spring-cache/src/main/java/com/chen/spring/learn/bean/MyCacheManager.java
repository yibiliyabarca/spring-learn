package com.chen.spring.learn.bean;

import org.springframework.cache.support.AbstractCacheManager;

import java.util.Collection;

/**
 * Created by chenxingyu on 2018/5/22.
 */
public class MyCacheManager extends AbstractCacheManager {
    private Collection<? extends MyCache> caches;

    /**
     * Specify the collection of Cache instances to use for this CacheManager.
     */
    public void setCaches(Collection<? extends MyCache> caches) {
        this.caches = caches;
    }

    @Override
    protected Collection<? extends MyCache> loadCaches() {
        return this.caches;
    }
}
