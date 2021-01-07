package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

final class Iterables$10 implements Function<Iterable<? extends T>, Iterator<? extends T>> {
    Iterables$10() {
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        return ((Iterable) obj).iterator();
    }
}
