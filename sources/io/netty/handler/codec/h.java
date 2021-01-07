package io.netty.handler.codec;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class h {

    static class a extends AbstractList<String> {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            Object obj = this.a.get(i);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
        public int size() {
            return this.a.size();
        }
    }

    private static final class b implements Map.Entry<String, String> {
        private final Map.Entry<CharSequence, CharSequence> a;
        private String b;
        private String c;

        b(Map.Entry<CharSequence, CharSequence> entry) {
            this.a = entry;
        }

        /* renamed from: a */
        public String getValue() {
            if (this.c == null && this.a.getValue() != null) {
                this.c = this.a.getValue().toString();
            }
            return this.c;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map.Entry
        public String getKey() {
            if (this.b == null) {
                this.b = this.a.getKey().toString();
            }
            return this.b;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.Map.Entry
        public String setValue(String str) {
            String a2 = getValue();
            this.a.setValue(str);
            return a2;
        }

        @Override // java.lang.Object
        public String toString() {
            return this.a.toString();
        }
    }

    private static final class c implements Iterator<Map.Entry<String, String>> {
        private final Iterator<Map.Entry<CharSequence, CharSequence>> a;

        public c(Iterator<Map.Entry<CharSequence, CharSequence>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public Map.Entry<String, String> next() {
            return new b(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.a.remove();
        }
    }

    public static <K, V> List<String> a(g<K, V, ?> gVar, K k) {
        return new a(gVar.r0(k));
    }

    public static Iterator<Map.Entry<String, String>> b(Iterable<Map.Entry<CharSequence, CharSequence>> iterable) {
        return new c(((e) iterable).iterator());
    }
}
