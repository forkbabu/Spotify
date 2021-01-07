package com.google.common.cache;

import java.util.concurrent.ConcurrentMap;

public interface Cache<K, V> {
    ConcurrentMap<K, V> asMap();
}
