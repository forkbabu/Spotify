package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.f4.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class f4<MessageType extends f4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends z2<MessageType, BuilderType> {
    private static Map<Object, f4<?, ?>> zzd = new ConcurrentHashMap();
    protected n6 zzb = n6.a();
    private int zzc = -1;

    public static class a<T extends f4<T, ?>> extends d3<T> {
        public a(T t) {
        }
    }

    public static abstract class b<MessageType extends f4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends b3<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        protected boolean c = false;

        protected b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) ((f4) messagetype.p(4, null, null));
        }

        private static void o(MessageType messagetype, MessageType messagetype2) {
            u5.a().c(messagetype).g(messagetype, messagetype2);
        }

        /* JADX WARN: Incorrect args count in method signature: ([BIILcom/google/android/gms/internal/measurement/u3;)TBuilderType; */
        private final b p(byte[] bArr, int i, u3 u3Var) {
            if (this.c) {
                q();
                this.c = false;
            }
            try {
                u5.a().c(this.b).h(this.b, bArr, 0, i, new g3(u3Var));
                return this;
            } catch (zzig e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzig.a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.measurement.f4$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            b bVar = (b) this.a.p(5, null, null);
            bVar.n((f4) r());
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.m5
        public final /* synthetic */ l5 j() {
            return this.a;
        }

        @Override // com.google.android.gms.internal.measurement.b3
        public final /* synthetic */ b3 k(byte[] bArr, int i, int i2) {
            p(bArr, i2, u3.a());
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.b3
        public final /* synthetic */ b3 m(byte[] bArr, int i, int i2, u3 u3Var) {
            p(bArr, i2, u3Var);
            return this;
        }

        public final BuilderType n(MessageType messagetype) {
            if (this.c) {
                q();
                this.c = false;
            }
            o(this.b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void q() {
            MessageType messagetype = (MessageType) ((f4) this.b.p(4, null, null));
            u5.a().c(messagetype).g(messagetype, this.b);
            this.b = messagetype;
        }

        public l5 r() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            u5.a().c(messagetype).f(messagetype);
            this.c = true;
            return this.b;
        }

        public l5 s() {
            f4 f4Var = (f4) r();
            if (f4Var.d()) {
                return f4Var;
            }
            throw new zzko();
        }
    }

    static final class c implements b4<c> {
        @Override // com.google.android.gms.internal.measurement.b4
        public final o5 K(o5 o5Var, o5 o5Var2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.b4
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.b4
        public final zzle b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.b4
        public final zzlh c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.b4
        public final boolean e() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.b4
        public final boolean f() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.b4
        public final k5 i0(k5 k5Var, l5 l5Var) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends f4<MessageType, BuilderType> implements m5 {
        protected a4<c> zzc = a4.c();

        /* access modifiers changed from: package-private */
        public final a4<c> u() {
            if (this.zzc.n()) {
                this.zzc = (a4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class e {
        private static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public static class f<ContainingType extends l5, Type> extends v3<ContainingType, Type> {
    }

    static <T extends f4<?, ?>> T m(Class<T> cls) {
        f4<?, ?> f4Var = zzd.get(cls);
        if (f4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f4Var = (T) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (f4Var == null) {
            f4Var = (T) ((f4) ((f4) q6.c(cls)).p(6, null, null));
            if (f4Var != null) {
                zzd.put(cls, f4Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) f4Var;
    }

    protected static <E> m4<E> n(m4<E> m4Var) {
        int size = m4Var.size();
        return m4Var.g(size == 0 ? 10 : size << 1);
    }

    protected static n4 o(n4 n4Var) {
        a5 a5Var = (a5) n4Var;
        int size = a5Var.size();
        return a5Var.g(size == 0 ? 10 : size << 1);
    }

    static Object q(Method method, Object obj, Object... objArr) {
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

    protected static <T extends f4<?, ?>> void r(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final int c() {
        if (this.zzc == -1) {
            this.zzc = u5.a().c(this).c(this);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final boolean d() {
        byte byteValue = ((Byte) p(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = u5.a().c(this).e(this);
        p(2, e2 ? this : null, null);
        return e2;
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final /* synthetic */ k5 e() {
        b bVar = (b) p(5, null, null);
        bVar.n(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return u5.a().c(this).d(this, (f4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final void f(zzhf zzhf) {
        u5.a().c(this).i(this, t3.a(zzhf));
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final /* synthetic */ k5 g() {
        return (b) p(5, null, null);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b2 = u5.a().c(this).b(this);
        this.zza = b2;
        return b2;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final /* synthetic */ l5 j() {
        return (f4) p(6, null, null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.z2
    public final int k() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.z2
    public final void l(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public abstract Object p(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public final <MessageType extends f4<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType) ((b) p(5, null, null));
    }

    public final BuilderType t() {
        BuilderType buildertype = (BuilderType) ((b) p(5, null, null));
        buildertype.n(this);
        return buildertype;
    }

    public String toString() {
        return o2.m(this, super.toString());
    }
}
