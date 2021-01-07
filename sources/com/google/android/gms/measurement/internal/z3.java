package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class z3 implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Object f;
    private final /* synthetic */ Object n;
    private final /* synthetic */ a4 o;

    z3(a4 a4Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.o = a4Var;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.f = obj2;
        this.n = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n4 w = this.o.a.w();
        if (!w.s()) {
            this.o.z(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.o.c == 0) {
            if (this.o.j().y()) {
                this.o.c = 'C';
            } else {
                this.o.c = 'c';
            }
        }
        if (this.o.d < 0) {
            this.o.d = 31049;
        }
        char charAt = "01VDIWEA?".charAt(this.a);
        char c2 = this.o.c;
        long j = this.o.d;
        String y = a4.y(true, this.b, this.c, this.f, this.n);
        StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j);
        sb.append(":");
        sb.append(y);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.b.substring(0, 1024);
        }
        w.d.b(sb2);
    }
}
