package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w0  reason: default package */
public class w0 {
    final ArrayList<x4> a = new ArrayList<>();
    private long b = -1;
    private Interpolator c;
    y4 d;
    private boolean e;
    private final z4 f = new a();

    /* renamed from: w0$a */
    class a extends z4 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // defpackage.y4
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == w0.this.a.size()) {
                y4 y4Var = w0.this.d;
                if (y4Var != null) {
                    y4Var.b(null);
                }
                this.b = 0;
                this.a = false;
                w0.this.b();
            }
        }

        @Override // defpackage.z4, defpackage.y4
        public void c(View view) {
            if (!this.a) {
                this.a = true;
                y4 y4Var = w0.this.d;
                if (y4Var != null) {
                    y4Var.c(null);
                }
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<x4> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.e = false;
    }

    public w0 c(x4 x4Var) {
        if (!this.e) {
            this.a.add(x4Var);
        }
        return this;
    }

    public w0 d(x4 x4Var, x4 x4Var2) {
        this.a.add(x4Var);
        x4Var2.h(x4Var.c());
        this.a.add(x4Var2);
        return this;
    }

    public w0 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public w0 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public w0 g(y4 y4Var) {
        if (!this.e) {
            this.d = y4Var;
        }
        return this;
    }

    public void h() {
        if (!this.e) {
            Iterator<x4> it = this.a.iterator();
            while (it.hasNext()) {
                x4 next = it.next();
                long j = this.b;
                if (j >= 0) {
                    next.d(j);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.d != null) {
                    next.f(this.f);
                }
                next.j();
            }
            this.e = true;
        }
    }
}
