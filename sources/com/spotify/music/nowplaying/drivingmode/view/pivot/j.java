package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class j extends RecyclerView.e<q> {
    private final List<l> c = new ArrayList();
    private final LayoutInflater f;
    private q n;

    j(LayoutInflater layoutInflater) {
        this.f = layoutInflater;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(q qVar, int i) {
        q qVar2 = qVar;
        this.n = qVar2;
        qVar2.h0(this.c.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public q M(ViewGroup viewGroup, int i) {
        return new q(this.f.inflate(C0707R.layout.driving_pivot_item, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void R(q qVar) {
        if (this.n == qVar) {
            this.n = null;
        }
    }

    /* access modifiers changed from: package-private */
    public List<l> X() {
        return this.c;
    }

    public void Y(List<l> list) {
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.c.get(i).c().hashCode();
    }
}
