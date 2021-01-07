package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;
import com.google.android.gms.internal.cast.r5.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class r5<MessageType extends r5<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends q4<MessageType, BuilderType> {
    private static Map<Object, r5<?, ?>> zzbqz = new ConcurrentHashMap();
    protected c8 zzbqx = c8.g();
    private int zzbqy = -1;

    public static class a<T extends r5<T, ?>> extends u4<T> {
        public a(T t) {
        }
    }

    public static abstract class b<MessageType extends r5<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends s4<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        protected boolean c = false;

        protected b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) ((r5) messagetype.j(4, null, null));
        }

        private static void g(MessageType messagetype, MessageType messagetype2) {
            l7.b().c(messagetype).e(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.cast.a7
        public final /* synthetic */ z6 c() {
            return this.a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.cast.r5$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            b bVar = (b) this.a.j(5, null, null);
            bVar.j((r5) m());
            return bVar;
        }

        public final BuilderType j(MessageType messagetype) {
            if (this.c) {
                k();
                this.c = false;
            }
            g(this.b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void k() {
            MessageType messagetype = (MessageType) ((r5) this.b.j(4, null, null));
            l7.b().c(messagetype).e(messagetype, this.b);
            this.b = messagetype;
        }

        public z6 m() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            l7.b().c(messagetype).g(messagetype);
            this.c = true;
            return this.b;
        }

        public z6 n() {
            r5 r5Var = (r5) m();
            if (r5Var.isInitialized()) {
                return r5Var;
            }
            throw new zzou();
        }
    }

    static final class c implements o5<c> {
        @Override // com.google.android.gms.internal.cast.o5
        public final y6 B0(y6 y6Var, z6 z6Var) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.cast.o5
        public final zzph Y() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.cast.o5
        public final zzpo e0() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.cast.o5
        public final int j() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.cast.o5
        public final boolean p0() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.cast.o5
        public final e7 y(e7 e7Var, e7 e7Var2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.cast.o5
        public final boolean y0() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends r5<MessageType, BuilderType> implements a7 {
        protected n5<c> zzbre = n5.p();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class e {
        private static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    static <T extends r5<?, ?>> T i(Class<T> cls) {
        r5<?, ?> r5Var = zzbqz.get(cls);
        if (r5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r5Var = (T) zzbqz.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (r5Var == null) {
            r5Var = (T) ((r5) ((r5) f8.o(cls)).j(6, null, null));
            if (r5Var != null) {
                zzbqz.put(cls, r5Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) r5Var;
    }

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends r5<?, ?>> void l(Class<T> cls, T t) {
        zzbqz.put(cls, t);
    }

    @Override // com.google.android.gms.internal.cast.z6
    public final /* synthetic */ y6 b() {
        b bVar = (b) j(5, null, null);
        bVar.j(this);
        return bVar;
    }

    @Override // com.google.android.gms.internal.cast.a7
    public final /* synthetic */ z6 c() {
        return (r5) j(6, null, null);
    }

    @Override // com.google.android.gms.internal.cast.z6
    public final void d(zzlo zzlo) {
        l7.b().c(this).f(this, h5.a(zzlo));
    }

    @Override // com.google.android.gms.internal.cast.z6
    public final int e() {
        if (this.zzbqy == -1) {
            this.zzbqy = l7.b().c(this).c(this);
        }
        return this.zzbqy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return l7.b().c(this).b(this, (r5) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.q4
    public final void g(int i) {
        this.zzbqy = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.q4
    public final int h() {
        return this.zzbqy;
    }

    public int hashCode() {
        int i = this.zzbmy;
        if (i != 0) {
            return i;
        }
        int a2 = l7.b().c(this).a(this);
        this.zzbmy = a2;
        return a2;
    }

    @Override // com.google.android.gms.internal.cast.a7
    public final boolean isInitialized() {
        byte byteValue = ((Byte) j(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = l7.b().c(this).d(this);
        j(2, d2 ? this : null, null);
        return d2;
    }

    /* access modifiers changed from: protected */
    public abstract Object j(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public final <MessageType extends r5<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m() {
        return (BuilderType) ((b) j(5, null, null));
    }

    public String toString() {
        return s.c(this, super.toString());
    }
}
