package org.msgpack.value;

import java.util.Iterator;

public interface a extends v, Iterable<v> {
    @Override // java.lang.Iterable
    Iterator<v> iterator();

    int size();
}
