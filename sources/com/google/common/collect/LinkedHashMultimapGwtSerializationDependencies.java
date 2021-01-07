package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class LinkedHashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    LinkedHashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
