package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public class f implements Iterator {
    private int a = 0;
    private final int b;
    final /* synthetic */ ByteString c;

    f(ByteString byteString) {
        this.c = byteString;
        this.b = byteString.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            ByteString byteString = this.c;
            int i = this.a;
            this.a = i + 1;
            return Byte.valueOf(byteString.c(i));
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
