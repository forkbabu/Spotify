package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.collect.ForwardingObject;
import java.util.concurrent.ConcurrentMap;

public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {
    protected ForwardingCache() {
    }

    @Override // com.google.common.cache.Cache
    public ConcurrentMap<K, V> asMap() {
        return ((LocalCache.ManualSerializationProxy) this).delegate.asMap();
    }
}
