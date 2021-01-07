package defpackage;

import android.view.View;
import defpackage.q5;
import defpackage.r5;
import java.util.ArrayList;

/* renamed from: r5  reason: default package */
public abstract class r5<T extends r5<T>> implements q5.b {
    public static final m l = new d("scaleX");
    public static final m m = new e("scaleY");
    public static final m n = new f("rotation");
    public static final m o = new g("rotationX");
    public static final m p = new h("rotationY");
    public static final m q = new i("x");
    public static final m r = new a("y");
    public static final m s = new b("alpha");
    float a = 0.0f;
    float b = Float.MAX_VALUE;
    final Object c;
    final s5 d;
    boolean e = false;
    float f = Float.MAX_VALUE;
    float g = -3.4028235E38f;
    private long h = 0;
    private float i;
    private final ArrayList<k> j = new ArrayList<>();
    private final ArrayList<l> k = new ArrayList<>();

    /* renamed from: r5$a */
    static class a extends m {
        a(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: r5$b */
    static class b extends m {
        b(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getAlpha();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: r5$c */
    static class c extends m {
    }

    /* renamed from: r5$d */
    static class d extends m {
        d(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getScaleX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: r5$e */
    static class e extends m {
        e(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getScaleY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: r5$f */
    static class f extends m {
        f(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getRotation();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: r5$g */
    static class g extends m {
        g(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getRotationX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: r5$h */
    static class h extends m {
        h(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getRotationY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: r5$i */
    static class i extends m {
        i(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s5
        public float a(View view) {
            return view.getX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // defpackage.s5
        public void b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: r5$j */
    static class j {
        float a;
        float b;

        j() {
        }
    }

    /* renamed from: r5$k */
    public interface k {
        void a(r5 r5Var, boolean z, float f, float f2);
    }

    /* renamed from: r5$l */
    public interface l {
        void a(r5 r5Var, float f, float f2);
    }

    /* renamed from: r5$m */
    public static abstract class m extends s5<View> {
        m(String str, c cVar) {
            super(str);
        }
    }

    <K> r5(K k2, s5<K> s5Var) {
        this.c = k2;
        this.d = s5Var;
        if (s5Var == n || s5Var == o || s5Var == p) {
            this.i = 0.1f;
        } else if (s5Var == s) {
            this.i = 0.00390625f;
        } else if (s5Var == l || s5Var == m) {
            this.i = 0.00390625f;
        } else {
            this.i = 1.0f;
        }
    }

    private static <T> void e(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.q5.b
    public boolean a(long j2) {
        long j3 = this.h;
        if (j3 == 0) {
            this.h = j2;
            h(this.b);
            return false;
        }
        this.h = j2;
        boolean i2 = i(j2 - j3);
        float min = Math.min(this.b, this.f);
        this.b = min;
        float max = Math.max(min, this.g);
        this.b = max;
        h(max);
        if (i2) {
            this.e = false;
            q5.c().e(this);
            this.h = 0;
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                if (this.j.get(i3) != null) {
                    this.j.get(i3).a(this, false, this.b, this.a);
                }
            }
            e(this.j);
        }
        return i2;
    }

    public T b(k kVar) {
        if (!this.j.contains(kVar)) {
            this.j.add(kVar);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.i * 0.75f;
    }

    public void d(k kVar) {
        ArrayList<k> arrayList = this.j;
        int indexOf = arrayList.indexOf(kVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public T f(float f2) {
        this.f = f2;
        return this;
    }

    public T g(float f2) {
        this.g = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        this.d.b(this.c, f2);
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, this.b, this.a);
            }
        }
        e(this.k);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i(long j2);
}
