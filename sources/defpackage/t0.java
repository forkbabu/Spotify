package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.q0;
import java.lang.ref.WeakReference;

/* renamed from: t0  reason: default package */
public class t0 extends q0 implements g.a {
    private Context c;
    private ActionBarContextView f;
    private q0.a n;
    private WeakReference<View> o;
    private boolean p;
    private g q;

    public t0(Context context, ActionBarContextView actionBarContextView, q0.a aVar, boolean z) {
        this.c = context;
        this.f = actionBarContextView;
        this.n = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.H(1);
        this.q = gVar;
        gVar.G(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        return this.n.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(g gVar) {
        k();
        this.f.k();
    }

    @Override // defpackage.q0
    public void c() {
        if (!this.p) {
            this.p = true;
            this.f.sendAccessibilityEvent(32);
            this.n.a(this);
        }
    }

    @Override // defpackage.q0
    public View d() {
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.q0
    public Menu e() {
        return this.q;
    }

    @Override // defpackage.q0
    public MenuInflater f() {
        return new v0(this.f.getContext());
    }

    @Override // defpackage.q0
    public CharSequence g() {
        return this.f.getSubtitle();
    }

    @Override // defpackage.q0
    public CharSequence i() {
        return this.f.getTitle();
    }

    @Override // defpackage.q0
    public void k() {
        this.n.d(this, this.q);
    }

    @Override // defpackage.q0
    public boolean l() {
        return this.f.h();
    }

    @Override // defpackage.q0
    public void m(View view) {
        this.f.setCustomView(view);
        this.o = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.q0
    public void n(int i) {
        this.f.setSubtitle(this.c.getString(i));
    }

    @Override // defpackage.q0
    public void o(CharSequence charSequence) {
        this.f.setSubtitle(charSequence);
    }

    @Override // defpackage.q0
    public void q(int i) {
        this.f.setTitle(this.c.getString(i));
    }

    @Override // defpackage.q0
    public void r(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // defpackage.q0
    public void s(boolean z) {
        super.s(z);
        this.f.setTitleOptional(z);
    }
}
