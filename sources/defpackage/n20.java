package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.d;
import com.google.gson.internal.f;
import com.google.gson.internal.n;
import com.google.gson.internal.q;
import com.google.gson.stream.JsonToken;
import com.google.gson.w;
import com.google.gson.x;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: n20  reason: default package */
public final class n20 implements x {
    private final f a;
    private final d b;
    private final n c;
    private final h20 f;
    private final x20 n = x20.a();

    /* renamed from: n20$a */
    public static final class a<T> extends w<T> {
        private final q<T> a;
        private final Map<String, b> b;

        a(q<T> qVar, Map<String, b> map) {
            this.a = qVar;
            this.b = map;
        }

        @Override // com.google.gson.w
        public T read(com.google.gson.stream.a aVar) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.b();
                while (aVar.l()) {
                    b bVar = this.b.get(aVar.B());
                    if (bVar != null) {
                        if (bVar.c) {
                            bVar.a(aVar, a2);
                        }
                    }
                    aVar.b0();
                }
                aVar.h();
                return a2;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, T t) {
            if (t == null) {
                bVar.r();
                return;
            }
            bVar.d();
            try {
                for (b bVar2 : this.b.values()) {
                    if (bVar2.c(t)) {
                        bVar.p(bVar2.a);
                        bVar2.b(bVar, t);
                    }
                }
                bVar.h();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: n20$b */
    static abstract class b {
        final String a;
        final boolean b;
        final boolean c;

        protected b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(com.google.gson.stream.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void b(com.google.gson.stream.b bVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean c(Object obj);
    }

    public n20(f fVar, d dVar, n nVar, h20 h20) {
        this.a = fVar;
        this.b = dVar;
        this.c = nVar;
        this.f = h20;
    }

    public boolean a(Field field, boolean z) {
        n nVar = this.c;
        return !nVar.c(field.getType(), z) && !nVar.e(field, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0189 A[SYNTHETIC] */
    @Override // com.google.gson.x
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.w<T> b(com.google.gson.j r36, defpackage.z20<T> r37) {
        /*
        // Method dump skipped, instructions count: 492
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n20.b(com.google.gson.j, z20):com.google.gson.w");
    }
}
