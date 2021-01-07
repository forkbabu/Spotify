package io.netty.handler.codec;

import io.netty.handler.codec.g;
import java.util.List;
import java.util.Map;

public interface g<K, V, T extends g<K, V, T>> extends Iterable<Map.Entry<K, V>> {
    List<V> r0(K k);

    int size();
}
