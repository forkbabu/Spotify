package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: b5  reason: default package */
public class b5 {
    public static final b5 b = new a().a().a.a().a.b().c();
    private final i a;

    /* access modifiers changed from: private */
    /* renamed from: b5$e */
    public static class e extends i {
        final WindowInsets b;
        private t2 c = null;

        e(b5 b5Var, WindowInsets windowInsets) {
            super(b5Var);
            this.b = windowInsets;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public final t2 h() {
            if (this.c == null) {
                this.c = t2.a(this.b.getSystemWindowInsetLeft(), this.b.getSystemWindowInsetTop(), this.b.getSystemWindowInsetRight(), this.b.getSystemWindowInsetBottom());
            }
            return this.c;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public b5 i(int i, int i2, int i3, int i4) {
            a aVar = new a(b5.p(this.b));
            aVar.c(b5.m(h(), i, i2, i3, i4));
            aVar.b(b5.m(f(), i, i2, i3, i4));
            return aVar.a();
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public boolean k() {
            return this.b.isRound();
        }
    }

    /* renamed from: b5$f */
    private static class f extends e {
        private t2 d = null;

        f(b5 b5Var, WindowInsets windowInsets) {
            super(b5Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public b5 b() {
            return b5.p(this.b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public b5 c() {
            return b5.p(this.b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public final t2 f() {
            if (this.d == null) {
                this.d = t2.a(this.b.getStableInsetLeft(), this.b.getStableInsetTop(), this.b.getStableInsetRight(), this.b.getStableInsetBottom());
            }
            return this.d;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public boolean j() {
            return this.b.isConsumed();
        }
    }

    /* renamed from: b5$g */
    private static class g extends f {
        g(b5 b5Var, WindowInsets windowInsets) {
            super(b5Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public b5 a() {
            return b5.p(this.b.consumeDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public b4 d() {
            return b4.e(this.b.getDisplayCutout());
        }

        @Override // defpackage.b5.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return g.a(this.b, ((g) obj).b);
        }

        @Override // defpackage.b5.i
        public int hashCode() {
            return this.b.hashCode();
        }
    }

    /* renamed from: b5$h */
    private static class h extends g {
        private t2 e = null;
        private t2 f = null;

        h(b5 b5Var, WindowInsets windowInsets) {
            super(b5Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public t2 e() {
            if (this.f == null) {
                Insets mandatorySystemGestureInsets = this.b.getMandatorySystemGestureInsets();
                this.f = t2.a(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
            }
            return this.f;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.i
        public t2 g() {
            if (this.e == null) {
                Insets systemGestureInsets = this.b.getSystemGestureInsets();
                this.e = t2.a(systemGestureInsets.left, systemGestureInsets.top, systemGestureInsets.right, systemGestureInsets.bottom);
            }
            return this.e;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.e, defpackage.b5.i
        public b5 i(int i, int i2, int i3, int i4) {
            return b5.p(this.b.inset(i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b5$i */
    public static class i {
        final b5 a;

        i(b5 b5Var) {
            this.a = b5Var;
        }

        /* access modifiers changed from: package-private */
        public b5 a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public b5 b() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public b5 c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public b4 d() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public t2 e() {
            return h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (k() != iVar.k() || j() != iVar.j() || !e2.g(h(), iVar.h()) || !e2.g(f(), iVar.f()) || !e2.g(d(), iVar.d())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public t2 f() {
            return t2.e;
        }

        /* access modifiers changed from: package-private */
        public t2 g() {
            return h();
        }

        /* access modifiers changed from: package-private */
        public t2 h() {
            return t2.e;
        }

        public int hashCode() {
            return e2.p(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), f(), d());
        }

        /* access modifiers changed from: package-private */
        public b5 i(int i, int i2, int i3, int i4) {
            return b5.b;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return false;
        }
    }

    private b5(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = new h(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new g(this, windowInsets);
        } else if (i2 >= 21) {
            this.a = new f(this, windowInsets);
        } else if (i2 >= 20) {
            this.a = new e(this, windowInsets);
        } else {
            this.a = new i(this);
        }
    }

    static t2 m(t2 t2Var, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, t2Var.a - i2);
        int max2 = Math.max(0, t2Var.b - i3);
        int max3 = Math.max(0, t2Var.c - i4);
        int max4 = Math.max(0, t2Var.d - i5);
        if (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) {
            return t2Var;
        }
        return t2.a(max, max2, max3, max4);
    }

    public static b5 p(WindowInsets windowInsets) {
        windowInsets.getClass();
        return new b5(windowInsets);
    }

    public b5 a() {
        return this.a.a();
    }

    public b5 b() {
        return this.a.b();
    }

    public b5 c() {
        return this.a.c();
    }

    public b4 d() {
        return this.a.d();
    }

    public t2 e() {
        return this.a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        return e2.g(this.a, ((b5) obj).a);
    }

    public t2 f() {
        return this.a.g();
    }

    public int g() {
        return k().d;
    }

    public int h() {
        return k().a;
    }

    public int hashCode() {
        i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public int i() {
        return k().c;
    }

    public int j() {
        return k().b;
    }

    public t2 k() {
        return this.a.h();
    }

    public b5 l(int i2, int i3, int i4, int i5) {
        return this.a.i(i2, i3, i4, i5);
    }

    public boolean n() {
        return this.a.j();
    }

    public WindowInsets o() {
        i iVar = this.a;
        if (iVar instanceof e) {
            return ((e) iVar).b;
        }
        return null;
    }

    /* renamed from: b5$b */
    private static class b extends d {
        private static Field c = null;
        private static boolean d = false;
        private static Constructor<WindowInsets> e = null;
        private static boolean f = false;
        private WindowInsets b;

        b() {
            this.b = d();
        }

        private static WindowInsets d() {
            if (!d) {
                try {
                    c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                d = true;
            }
            Field field = c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f) {
                try {
                    e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.d
        public b5 a() {
            return b5.p(this.b);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.d
        public void c(t2 t2Var) {
            WindowInsets windowInsets = this.b;
            if (windowInsets != null) {
                this.b = windowInsets.replaceSystemWindowInsets(t2Var.a, t2Var.b, t2Var.c, t2Var.d);
            }
        }

        b(b5 b5Var) {
            this.b = b5Var.o();
        }
    }

    /* renamed from: b5$c */
    private static class c extends d {
        final WindowInsets.Builder b;

        c() {
            this.b = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.d
        public b5 a() {
            return b5.p(this.b.build());
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.d
        public void b(t2 t2Var) {
            this.b.setStableInsets(Insets.of(t2Var.a, t2Var.b, t2Var.c, t2Var.d));
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.b5.d
        public void c(t2 t2Var) {
            this.b.setSystemWindowInsets(Insets.of(t2Var.a, t2Var.b, t2Var.c, t2Var.d));
        }

        c(b5 b5Var) {
            WindowInsets.Builder builder;
            WindowInsets o = b5Var.o();
            if (o != null) {
                builder = new WindowInsets.Builder(o);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b5$d */
    public static class d {
        private final b5 a;

        d() {
            this.a = new b5((b5) null);
        }

        /* access modifiers changed from: package-private */
        public b5 a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void b(t2 t2Var) {
        }

        /* access modifiers changed from: package-private */
        public void c(t2 t2Var) {
        }

        d(b5 b5Var) {
            this.a = b5Var;
        }
    }

    /* renamed from: b5$a */
    public static final class a {
        private final d a;

        public a() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.a = new c();
            } else if (i >= 20) {
                this.a = new b();
            } else {
                this.a = new d();
            }
        }

        public b5 a() {
            return this.a.a();
        }

        public a b(t2 t2Var) {
            this.a.b(t2Var);
            return this;
        }

        public a c(t2 t2Var) {
            this.a.c(t2Var);
            return this;
        }

        public a(b5 b5Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.a = new c(b5Var);
            } else if (i >= 20) {
                this.a = new b(b5Var);
            } else {
                this.a = new d(b5Var);
            }
        }
    }

    public b5(b5 b5Var) {
        this.a = new i(this);
    }
}
