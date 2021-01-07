package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.m;
import com.spotify.music.podcastentityrow.u;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gsc  reason: default package */
public class gsc extends RecyclerView.e<RecyclerView.b0> implements io.doist.recyclerviewext.sticky_headers.a {
    private final Picasso c;
    private final zrc f;
    private final isc n;
    private esc o;
    private List<csc> p = new ArrayList();

    /* renamed from: gsc$a */
    class a extends RecyclerView.q {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                gsc.this.c.q(u.a);
            } else {
                gsc.this.c.n(u.a);
            }
        }
    }

    public gsc(Picasso picasso, zrc zrc, isc isc) {
        this.c = picasso;
        this.f = zrc;
        this.n = isc;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        recyclerView.n(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        csc csc = this.p.get(i);
        csc.getClass();
        csc csc2 = csc;
        if (csc2.d()) {
            b0Var.a.setVisibility(0);
            this.f.c(csc2, b0Var, i);
            return;
        }
        b0Var.a.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return this.f.b(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void P(RecyclerView.b0 b0Var) {
        int w = b0Var.w();
        if (w > -1) {
            csc csc = this.p.get(w);
            if (csc.d()) {
                this.f.d(csc, b0Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void Q(RecyclerView.b0 b0Var) {
        int w = b0Var.w();
        if (w > -1) {
            csc csc = this.p.get(w);
            if (csc.d()) {
                this.f.a(csc, b0Var);
            }
        }
    }

    public int Y(String str) {
        List<dsc> d = b0().d();
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i).e().getUri().equals(str)) {
                return b0().e().size() + i;
            }
        }
        return -1;
    }

    public int Z(Class<? extends csc> cls) {
        esc esc = this.o;
        if (esc == null) {
            return -1;
        }
        List<csc> e = esc.e();
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).getClass() == cls) {
                return i;
            }
        }
        List<csc> c2 = this.o.c();
        for (int i2 = 0; i2 < c2.size(); i2++) {
            if (c2.get(i2).getClass() == cls) {
                return this.o.d().size() + this.o.e().size() + i2;
            }
        }
        return -1;
    }

    public esc b0() {
        esc esc = this.o;
        return esc != null ? esc : new esc();
    }

    public void c0(esc esc) {
        ArrayList arrayList = new ArrayList(esc.c().size() + esc.d().size() + esc.e().size());
        ArrayList arrayList2 = new ArrayList();
        for (csc csc : esc.e()) {
            if (csc.d()) {
                arrayList2.add(csc);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(esc.d());
        ArrayList arrayList3 = new ArrayList();
        for (csc csc2 : esc.c()) {
            if (csc2.d()) {
                arrayList3.add(csc2);
            }
        }
        arrayList.addAll(arrayList3);
        this.n.f(this.p, arrayList);
        m.c a2 = m.a(this.n);
        esc esc2 = new esc();
        esc2.h(arrayList2);
        esc2.g(esc.d());
        esc2.f(arrayList3);
        this.o = esc2;
        this.p = arrayList;
        a2.a(new b(this));
    }

    @Override // io.doist.recyclerviewext.sticky_headers.a
    public boolean k(int i) {
        List<csc> list = this.p;
        if ((list != null && i >= list.size()) || i < 0) {
            return false;
        }
        return this.p.get(i).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.p.get(i).a().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.f.e(this.p.get(i));
    }
}
