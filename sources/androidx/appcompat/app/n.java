package androidx.appcompat.app;

import android.view.View;

/* access modifiers changed from: package-private */
public class n implements Runnable {
    final /* synthetic */ j a;

    class a extends z4 {
        a() {
        }

        @Override // defpackage.y4
        public void b(View view) {
            n.this.a.y.setAlpha(1.0f);
            n.this.a.B.f(null);
            n.this.a.B = null;
        }

        @Override // defpackage.z4, defpackage.y4
        public void c(View view) {
            n.this.a.y.setVisibility(0);
        }
    }

    n(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.a;
        jVar.z.showAtLocation(jVar.y, 55, 0, 0);
        this.a.L();
        if (this.a.b0()) {
            this.a.y.setAlpha(0.0f);
            j jVar2 = this.a;
            x4 a2 = q4.a(jVar2.y);
            a2.a(1.0f);
            jVar2.B = a2;
            this.a.B.f(new a());
            return;
        }
        this.a.y.setAlpha(1.0f);
        this.a.y.setVisibility(0);
    }
}
