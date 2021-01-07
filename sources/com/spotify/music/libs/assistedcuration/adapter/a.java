package com.spotify.music.libs.assistedcuration.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.libs.assistedcuration.adapter.AssistedCurationCardAdapter;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.preview.q;
import com.spotify.music.preview.v;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

public class a extends RecyclerView.e<tz9> {
    private final AssistedCurationCardAdapter.a c;
    private final q f;
    private final Picasso n;
    private final b o;
    private List<h> p = Collections.emptyList();
    private boolean q;
    private boolean r;
    private boolean s;

    /* renamed from: com.spotify.music.libs.assistedcuration.adapter.a$a  reason: collision with other inner class name */
    public interface AbstractC0280a {
        a a(AssistedCurationCardAdapter.a aVar, v vVar);
    }

    public a(q.a aVar, Picasso picasso, b bVar, AssistedCurationCardAdapter.a aVar2, v vVar) {
        this.o = bVar;
        this.f = aVar.a(vVar);
        this.n = picasso;
        this.c = aVar2;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(tz9 tz9, int i) {
        ((sz9) tz9).h0(X(i), this.r, this.q);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public tz9 M(ViewGroup viewGroup, int i) {
        return new sz9(viewGroup, this.c, this.f, this.n, this.o);
    }

    public h X(int i) {
        if (!this.s) {
            return this.p.get(i);
        }
        List<h> list = this.p;
        return list.get((list.size() - i) - 1);
    }

    public int Y() {
        if (this.s) {
            return u() - 1;
        }
        return 0;
    }

    public int Z(int i) {
        return this.s ? (u() - i) - 1 : i;
    }

    public void b0(List<h> list, boolean z, boolean z2) {
        this.p = list;
        this.q = z2;
        this.r = z;
        z();
    }

    public void c0(boolean z) {
        if (this.s != z) {
            this.s = z;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) X(i).d().hashCode();
    }
}
