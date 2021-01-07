package io.netty.util;

public interface k<T> {
    public static final k a = new a();

    static class a implements k {
        a() {
        }

        @Override // io.netty.util.k
        public int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @Override // io.netty.util.k
        public boolean b(Object obj, Object obj2) {
            return obj == obj2 || (obj != null && obj.equals(obj2));
        }
    }

    int a(T t);

    boolean b(T t, T t2);
}
