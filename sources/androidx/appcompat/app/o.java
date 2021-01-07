package androidx.appcompat.app;

import android.view.View;

/* access modifiers changed from: package-private */
public class o extends z4 {
    final /* synthetic */ j a;

    o(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.y4
    public void b(View view) {
        this.a.y.setAlpha(1.0f);
        this.a.B.f(null);
        this.a.B = null;
    }

    @Override // defpackage.z4, defpackage.y4
    public void c(View view) {
        this.a.y.setVisibility(0);
        this.a.y.sendAccessibilityEvent(32);
        if (this.a.y.getParent() instanceof View) {
            q4.F((View) this.a.y.getParent());
        }
    }
}
