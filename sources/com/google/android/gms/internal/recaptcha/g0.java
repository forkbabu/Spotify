package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;
import com.google.android.gms.internal.recaptcha.g0.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class g0<MessageType extends g0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends p<MessageType, BuilderType> {
    private static Map<Object, g0<?, ?>> zzd = new ConcurrentHashMap();
    protected d2 zzb = d2.a();
    private int zzc = -1;

    public static class a<T extends g0<T, ?>> extends s<T> {
        public a(T t) {
        }
    }

    public static abstract class b<MessageType extends g0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends q<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        protected boolean c = false;

        protected b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) ((g0) messagetype.c(4, null, null));
        }

        public final BuilderType c(MessageType messagetype) {
            if (this.c) {
                MessageType messagetype2 = (MessageType) ((g0) this.b.c(4, null, null));
                p1.a().c(messagetype2).g(messagetype2, this.b);
                this.b = messagetype2;
                this.c = false;
            }
            MessageType messagetype3 = this.b;
            p1.a().c(messagetype3).g(messagetype3, messagetype);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.recaptcha.g0$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            b bVar = (b) this.a.c(5, null, null);
            bVar.c((g0) e());
            return bVar;
        }

        public f1 e() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            p1.a().c(messagetype).c(messagetype);
            this.c = true;
            return this.b;
        }

        @Override // com.google.android.gms.internal.recaptcha.g1
        public final /* synthetic */ f1 m() {
            return this.a;
        }
    }

    static final class c implements e0<c> {
        @Override // com.google.android.gms.internal.recaptcha.e0
        public final e1 E(e1 e1Var, f1 f1Var) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.e0
        public final k1 R(k1 k1Var, k1 k1Var2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.e0
        public final zzhk b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.e0
        public final zzhr c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.recaptcha.e0
        public final boolean e() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends g0<MessageType, BuilderType> implements g1 {
        protected c0<c> zzc = c0.a();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class e {
        private static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    static <T extends g0<?, ?>> T b(Class<T> cls) {
        g0<?, ?> g0Var = zzd.get(cls);
        if (g0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g0Var = (T) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (g0Var == null) {
            g0Var = (T) ((g0) ((g0) k2.c(cls)).c(6, null, null));
            if (g0Var != null) {
                zzd.put(cls, g0Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) g0Var;
    }

    static Object e(Method method, Object obj, Object... objArr) {
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

    protected static <T extends g0<?, ?>> void f(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* access modifiers changed from: protected */
    public abstract Object c(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.recaptcha.f1
    public final /* synthetic */ e1 d() {
        b bVar = (b) c(5, null, null);
        bVar.c(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return p1.a().c(this).d(this, (g0) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b2 = p1.a().c(this).b(this);
        this.zza = b2;
        return b2;
    }

    @Override // com.google.android.gms.internal.recaptcha.g1
    public final boolean j() {
        byte byteValue = ((Byte) c(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = p1.a().c(this).f(this);
        c(2, f ? this : null, null);
        return f;
    }

    @Override // com.google.android.gms.internal.recaptcha.g1
    public final /* synthetic */ f1 m() {
        return (g0) c(6, null, null);
    }

    public String toString() {
        return k.b(this, super.toString());
    }
}
