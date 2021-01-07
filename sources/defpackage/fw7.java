package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.f;
import com.spotify.music.features.queue.a0;
import com.spotify.music.features.queue.v;
import com.spotify.rxjava2.p;
import com.squareup.picasso.Picasso;

/* renamed from: fw7  reason: default package */
public class fw7 extends RecyclerView.e<RecyclerView.b0> implements mx7 {
    private final SparseArray<f<?>> c;
    private final nw7 f;
    private final v n;
    private final p o = new p();

    public fw7(v vVar, a0 a0Var, ox7 ox7, Picasso picasso, Context context, boolean z) {
        SparseArray<f<?>> sparseArray = new SparseArray<>(4);
        this.c = sparseArray;
        U(z);
        vVar.getClass();
        this.n = vVar;
        ow7 ow7 = new ow7();
        lw7 lw7 = new lw7(a0Var);
        kw7 kw7 = new kw7(context, picasso, a0Var);
        nw7 nw7 = new nw7(a0Var, ox7, a0Var);
        this.f = nw7;
        sparseArray.put(1, kw7);
        sparseArray.put(2, nw7);
        sparseArray.put(3, nw7);
        sparseArray.put(4, ow7);
        sparseArray.put(5, lw7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        this.c.get(this.n.j(i)).a(b0Var, this.n.h(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return this.c.get(i).c(viewGroup);
    }

    public void X() {
        this.f.e();
        z();
    }

    public void Y(boolean z) {
        this.f.h(z);
        z();
    }

    public void Z(int i, int i2) {
        this.n.m(i, i2);
        D(i, i2);
    }

    public void b0(boolean z) {
        this.f.i(z);
        z();
    }

    public void onStart() {
        this.o.b(this.n.e().subscribe(new ew7(this)));
    }

    public void onStop() {
        this.o.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.n.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return this.n.i(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.n.j(i);
    }
}
