package defpackage;

import java.util.ArrayList;

/* renamed from: trf  reason: default package */
public final class trf {
    private static final b[] a;
    static volatile b[] b;
    private static final b c = new a();

    /* access modifiers changed from: package-private */
    /* renamed from: trf$a */
    public static class a extends b {
        a() {
        }

        @Override // defpackage.trf.b
        public void a(String str, Object... objArr) {
            for (b bVar : trf.b) {
                bVar.a(str, objArr);
            }
        }

        @Override // defpackage.trf.b
        public void b(String str, Object... objArr) {
            for (b bVar : trf.b) {
                bVar.b(str, objArr);
            }
        }

        @Override // defpackage.trf.b
        public void c(Throwable th, String str, Object... objArr) {
            for (b bVar : trf.b) {
                bVar.c(th, str, objArr);
            }
        }

        @Override // defpackage.trf.b
        public void d(String str, Object... objArr) {
            for (b bVar : trf.b) {
                bVar.d(str, objArr);
            }
        }

        @Override // defpackage.trf.b
        public void e(String str, Object... objArr) {
            for (b bVar : trf.b) {
                bVar.e(str, objArr);
            }
        }
    }

    /* renamed from: trf$b */
    public static abstract class b {
        public b() {
            new ThreadLocal();
        }

        public abstract void a(String str, Object... objArr);

        public abstract void b(String str, Object... objArr);

        public abstract void c(Throwable th, String str, Object... objArr);

        public abstract void d(String str, Object... objArr);

        public abstract void e(String str, Object... objArr);
    }

    static {
        b[] bVarArr = new b[0];
        a = bVarArr;
        new ArrayList();
        b = bVarArr;
    }

    public static void a(String str, Object... objArr) {
        ((a) c).getClass();
        for (b bVar : b) {
            bVar.a(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        ((a) c).getClass();
        for (b bVar : b) {
            bVar.b(str, objArr);
        }
    }

    public static void c(Throwable th, String str, Object... objArr) {
        ((a) c).getClass();
        for (b bVar : b) {
            bVar.c(th, str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        ((a) c).getClass();
        for (b bVar : b) {
            bVar.d(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        ((a) c).getClass();
        for (b bVar : b) {
            bVar.e(str, objArr);
        }
    }
}
