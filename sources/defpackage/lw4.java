package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

/* renamed from: lw4  reason: default package */
public class lw4 extends p.d {
    private final mw4 d;

    public lw4(mw4 mw4) {
        this.d = mw4;
    }

    @Override // androidx.recyclerview.widget.p.d
    public boolean a(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        ((iw4) this.d).getClass();
        return b0Var2.z() == iw4.r;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void b(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        super.b(recyclerView, b0Var);
        ((nw4) b0Var).h();
    }

    @Override // androidx.recyclerview.widget.p.d
    public int f(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        ((iw4) this.d).getClass();
        return p.d.m(b0Var.z() == iw4.r ? 3 : 0, 0);
    }

    @Override // androidx.recyclerview.widget.p.d
    public boolean k() {
        return false;
    }

    @Override // androidx.recyclerview.widget.p.d
    public boolean l() {
        return false;
    }

    @Override // androidx.recyclerview.widget.p.d
    public boolean o(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        ((iw4) this.d).i0(b0Var.w(), b0Var2.w());
        return true;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void p(RecyclerView.b0 b0Var, int i) {
        if (i != 0) {
            ((nw4) b0Var).j();
        }
    }

    @Override // androidx.recyclerview.widget.p.d
    public void q(RecyclerView.b0 b0Var, int i) {
    }
}
