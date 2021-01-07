package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.spotify.music.features.queue.a0;
import com.spotify.music.features.queue.view.a;

/* renamed from: ix7  reason: default package */
public class ix7 extends p.d {
    private kx7 d;
    private mx7 e;
    private int f;
    private int g = -1;

    @Override // androidx.recyclerview.widget.p.d
    public boolean a(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        kx7 kx7 = this.d;
        if (kx7 == null) {
            return true;
        }
        if (((a0) kx7).k(b0Var2.w())) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void b(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        super.b(recyclerView, b0Var);
        if (b0Var instanceof a) {
            ((a) b0Var).m();
        }
    }

    @Override // androidx.recyclerview.widget.p.d
    public int f(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        return p.d.m(3, 0);
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
        this.g = b0Var2.w();
        mx7 mx7 = this.e;
        if (mx7 == null) {
            return true;
        }
        ((fw7) mx7).Z(b0Var.w(), b0Var2.w());
        return true;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void p(RecyclerView.b0 b0Var, int i) {
        kx7 kx7;
        int i2;
        if (i == 2 && (b0Var instanceof a)) {
            ((a) b0Var).o();
            this.f = b0Var.w();
        } else if (i == 0 && (kx7 = this.d) != null) {
            int i3 = this.g;
            if (i3 >= 0 && (i2 = this.f) >= 0) {
                ((a0) kx7).j(i2, i3);
            }
            this.g = -1;
        }
    }

    @Override // androidx.recyclerview.widget.p.d
    public void q(RecyclerView.b0 b0Var, int i) {
    }

    public void r(kx7 kx7) {
        this.d = kx7;
    }

    public void s(mx7 mx7) {
        this.e = mx7;
    }
}
