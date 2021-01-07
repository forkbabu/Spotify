package io.netty.util;

public final class Signal extends Error implements i<Signal> {
    private static final j<Signal> a = new a();
    private static final long serialVersionUID = -221145131122459977L;
    private final b constant;

    static class a extends j<Signal> {
        a() {
        }

        /* Return type fixed from 'io.netty.util.i' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.j
        public Signal a(int i, String str) {
            return new Signal(i, str, null);
        }
    }

    private static final class b extends a<b> {
        b(int i, String str) {
            super(i, str);
        }
    }

    Signal(int i, String str, a aVar) {
        this.constant = new b(i, str);
    }

    public static Signal d(Class<?> cls, String str) {
        j<Signal> jVar = a;
        jVar.getClass();
        return jVar.b(cls.getName() + '#' + str);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Signal signal = (Signal) obj;
        if (this == signal) {
            return 0;
        }
        return this.constant.compareTo(signal.constant);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.lang.Throwable
    public Throwable initCause(Throwable th) {
        return this;
    }

    @Override // java.lang.Throwable, java.lang.Object
    public String toString() {
        return this.constant.h();
    }
}
