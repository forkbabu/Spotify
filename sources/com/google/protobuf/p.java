package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public class p extends q {

    static class b<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, p> a;

        b(Map.Entry entry, a aVar) {
            this.a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            p value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.d();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof u) {
                return this.a.getValue().c((u) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* access modifiers changed from: package-private */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.a.next();
            return next.getValue() instanceof p ? new b(next, null) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.a.remove();
        }
    }

    public u d() {
        return b(null);
    }

    public boolean equals(Object obj) {
        return d().equals(obj);
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString();
    }
}
