package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.i0;

public class j {
    private final l<?> a;

    private j(l<?> lVar) {
        this.a = lVar;
    }

    public static j b(l<?> lVar) {
        e2.c(lVar, "callbacks == null");
        return new j(lVar);
    }

    public void a(Fragment fragment) {
        l<?> lVar = this.a;
        lVar.f.g(lVar, lVar, null);
    }

    public void c() {
        this.a.f.o();
    }

    public void d(Configuration configuration) {
        this.a.f.p(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f.q(menuItem);
    }

    public void f() {
        this.a.f.r();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f.s(menu, menuInflater);
    }

    public void h() {
        this.a.f.t();
    }

    public void i() {
        this.a.f.v();
    }

    public void j(boolean z) {
        this.a.f.w(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f.x(menuItem);
    }

    public void l(Menu menu) {
        this.a.f.y(menu);
    }

    public void m() {
        this.a.f.A();
    }

    public void n(boolean z) {
        this.a.f.B(z);
    }

    public boolean o(Menu menu) {
        return this.a.f.C(menu);
    }

    public void p() {
        this.a.f.E();
    }

    public void q() {
        this.a.f.F();
    }

    public void r() {
        this.a.f.H();
    }

    public boolean s() {
        return this.a.f.N(true);
    }

    public Fragment t(String str) {
        return this.a.f.V(str);
    }

    public o u() {
        return this.a.f;
    }

    public void v() {
        this.a.f.t0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return ((m) this.a.f.c0()).onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        l<?> lVar = this.a;
        if (lVar instanceof i0) {
            lVar.f.F0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.a.f.G0();
    }
}
