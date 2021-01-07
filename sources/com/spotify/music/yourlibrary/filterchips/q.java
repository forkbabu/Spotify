package com.spotify.music.yourlibrary.filterchips;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.transition.AutoTransition;
import androidx.transition.n;
import androidx.transition.u;

class q implements p {
    private final LinearLayout a;
    private final n b;
    private final k c;
    private final m d;
    private final h e;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    q(Context context, s sVar) {
        n nVar = new n(context);
        k kVar = new k(context);
        m mVar = new m(context);
        h hVar = new h();
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.b = nVar;
        linearLayout.addView(nVar.c());
        this.c = kVar;
        this.d = mVar;
        this.e = hVar;
        f fVar = new f(sVar);
        nVar.g(fVar);
        mVar.c(fVar);
        mVar.d(new c(sVar));
    }

    /* access modifiers changed from: private */
    public void l() {
        this.b.f();
        this.a.removeAllViews();
        this.a.addView(this.b.c());
        u.a(this.a, null);
    }

    public void a(l lVar, int i) {
        this.b.a(lVar, i);
    }

    public int b(String str) {
        return this.b.b(str);
    }

    public LinearLayout c() {
        return this.a;
    }

    public boolean d() {
        return this.a.getChildAt(0).equals(this.d.a());
    }

    public void f() {
        h hVar = this.e;
        LinearLayout linearLayout = this.a;
        ViewGroup a2 = this.d.a();
        hVar.getClass();
        u.d(new n(linearLayout, a2), new AutoTransition());
    }

    public void g(String str) {
        this.b.e(str);
    }

    public void h(int i) {
        this.c.b(i);
    }

    public void i(l lVar, int i) {
        this.d.f(lVar, i);
        this.c.d(lVar);
    }

    public void j(boolean z) {
        if (z) {
            this.a.removeAllViews();
            this.a.addView(this.c.a());
            this.c.a().post(new d(this));
            return;
        }
        this.a.removeAllViews();
        this.a.addView(this.d.a());
        u.a(this.a, null);
    }

    public void k(boolean z) {
        this.d.e(8);
        this.c.c();
        if (z) {
            h hVar = this.e;
            LinearLayout linearLayout = this.a;
            LinearLayout a2 = this.c.a();
            e eVar = new e(this);
            hVar.getClass();
            n nVar = new n(linearLayout, a2);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.b(new g(hVar, eVar));
            u.d(nVar, autoTransition);
            return;
        }
        l();
    }
}
