package com.google.common.collect;

import java.util.Map;

public interface Table<R, C, V> {
    boolean isEmpty();

    Map<R, Map<C, V>> rowMap();
}
