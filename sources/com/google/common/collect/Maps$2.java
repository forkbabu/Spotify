package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

final class Maps$2 extends TransformedIterator<Map.Entry<K, V>, V> {
    Maps$2(Iterator it) {
        super(it);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.TransformedIterator
    public Object transform(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
