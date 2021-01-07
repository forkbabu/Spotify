package defpackage;

import java.util.Locale;

/* renamed from: gvd  reason: default package */
public class gvd {
    private final float a;
    private final float b;
    private final c c;

    /* access modifiers changed from: package-private */
    /* renamed from: gvd$a */
    public static class a implements c {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // defpackage.gvd.c
        public float a(float f, float f2, float f3) {
            return f3;
        }

        public String toString() {
            return String.format(Locale.US, "unit(%.2f, %.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gvd$b */
    public class b implements c {
        b() {
        }

        @Override // defpackage.gvd.c
        public float a(float f, float f2, float f3) {
            return nud.c(gvd.this.f(), gvd.this.e(), f3);
        }

        public String toString() {
            return String.format(Locale.US, "clamp(%.2f, %.2f)", Float.valueOf(gvd.this.f()), Float.valueOf(gvd.this.e()));
        }
    }

    /* renamed from: gvd$c */
    public interface c {
        float a(float f, float f2, float f3);
    }

    public gvd(float f, float f2, c cVar) {
        this.a = f;
        this.b = f2;
        this.c = cVar;
    }

    public static gvd c(float f, float f2) {
        if (d(f, f2)) {
            return new gvd(f, f, new fvd(f));
        }
        return new gvd(f, f2, new a(f, f2));
    }

    private static boolean d(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-6d;
    }

    public gvd b() {
        if (d(this.a, this.b)) {
            return this;
        }
        float f = this.a;
        float f2 = this.b;
        return new gvd(f, f2, new hvd(this, new gvd(f, f2, new b())));
    }

    public float e() {
        return this.b;
    }

    public float f() {
        return this.a;
    }

    public gvd g(float f, float f2) {
        float f3 = this.a;
        float f4 = this.b;
        if (d(f3, f4)) {
            throw new IllegalArgumentException("Can't remap from an empty domain");
        } else if (d(f, f2)) {
            return new gvd(f, f, new fvd(f));
        } else {
            return new gvd(f, f2, new hvd(this, new gvd(f, f2, new ivd(this, f3, f4, f, f2))));
        }
    }

    public float h(float f) {
        if (d(this.a, this.b)) {
            return this.a;
        }
        return this.c.a(this.a, this.b, f);
    }

    public String toString() {
        return String.format(Locale.US, "IntervalTransformer: %s", this.c);
    }
}
