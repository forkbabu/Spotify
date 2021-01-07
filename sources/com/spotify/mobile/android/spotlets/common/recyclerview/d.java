package com.spotify.mobile.android.spotlets.common.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import java.util.ArrayList;
import java.util.List;

public abstract class d<VH extends e<D>, D> extends b<VH> {
    private List<D> c = new ArrayList();
    private boolean f = true;

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((e) b0Var).h0(this.c.get(i), i);
    }

    public D Z(int i) {
        return this.c.get(i);
    }

    public List<D> b0() {
        return this.c;
    }

    public void c0(int i, D d) {
        this.c.set(i, d);
        if (this.f) {
            A(i);
        }
    }

    public void f0(List<D> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.c = list;
        if (this.f) {
            z();
        }
    }

    public void g0(boolean z) {
        this.f = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
