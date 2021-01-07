package com.spotify.music.features.podcast.entity;

import android.os.Bundle;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.util.filterheader.b;
import com.spotify.music.util.filterheader.c;
import com.spotify.playlist.models.Show;
import java.util.ArrayList;
import java.util.List;

public class g {
    private final List<com.spotify.music.util.filterheader.b> a;
    private final List<SortOption> b = new ArrayList();
    private final List<f> c = new ArrayList();
    private final List<o> d = new ArrayList();
    private final SortOption e = new SortOption("consumptionOrder", (int) C0707R.string.sort_order_date);
    private final SortOption f;
    private final SortOption g;
    private final j h;
    private final String i;
    private com.spotify.music.util.filterheader.b j;
    private SortOption k;
    private com.spotify.music.util.filterheader.b l;
    private com.spotify.music.util.filterheader.b m;
    private com.spotify.music.util.filterheader.b n;
    private final b.AbstractC0352b o;
    private final c.b p;

    class a implements b.AbstractC0352b {
        a() {
        }

        @Override // com.spotify.music.util.filterheader.b.AbstractC0352b
        public void a(com.spotify.music.util.filterheader.b bVar) {
            boolean z = bVar.a() == g.this.j.a();
            for (com.spotify.music.util.filterheader.b bVar2 : g.this.a) {
                bVar2.f(false);
            }
            if (z) {
                g gVar = g.this;
                gVar.j = gVar.l;
            } else {
                g.this.j = bVar;
            }
            g.this.j.f(true);
            g.e(g.this, bVar, z);
        }
    }

    class b implements c.b {
        b() {
        }

        @Override // com.spotify.music.util.filterheader.c.b
        public void a(SortOption sortOption) {
            g.this.k = sortOption;
            g.this.h.d(g.this.i, g.this.k.b());
            g.j(g.this, sortOption);
        }
    }

    g(j jVar, boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        SortOption sortOption = new SortOption("number", C0707R.string.sort_order_date, true);
        SortOption sortOption2 = new SortOption("publishDate", true);
        sortOption2.i(new SortOption("name"));
        sortOption.i(sortOption2);
        this.f = sortOption;
        SortOption sortOption3 = new SortOption("number", C0707R.string.sort_order_date, true);
        sortOption3.h(true, false);
        SortOption sortOption4 = new SortOption("publishDate", true);
        sortOption4.h(true, false);
        sortOption4.i(new SortOption("name"));
        sortOption3.i(sortOption4);
        this.g = sortOption3;
        a aVar = new a();
        this.o = aVar;
        this.p = new b();
        this.h = jVar;
        this.i = str;
        arrayList.clear();
        com.spotify.music.util.filterheader.b bVar = new com.spotify.music.util.filterheader.b(aVar, C0707R.string.filter_show_all_episodes);
        bVar.g(0);
        this.l = bVar;
        com.spotify.music.util.filterheader.b bVar2 = new com.spotify.music.util.filterheader.b(aVar, C0707R.string.filter_show_unheard_only);
        bVar2.g(2);
        this.m = bVar2;
        com.spotify.music.util.filterheader.b bVar3 = new com.spotify.music.util.filterheader.b(aVar, C0707R.string.filter_show_only_offlined_content);
        bVar3.g(3);
        this.n = bVar3;
        arrayList.add(this.l);
        if (z) {
            arrayList.add(this.n);
        }
        arrayList.add(this.m);
        com.spotify.music.util.filterheader.b bVar4 = this.l;
        this.j = bVar4;
        bVar4.f(true);
    }

    static void e(g gVar, com.spotify.music.util.filterheader.b bVar, boolean z) {
        for (f fVar : gVar.c) {
            fVar.b(bVar, gVar.i, z);
        }
    }

    static void j(g gVar, SortOption sortOption) {
        for (o oVar : gVar.d) {
            oVar.c(sortOption);
        }
    }

    public List<com.spotify.music.util.filterheader.b> k() {
        return this.a;
    }

    public List<SortOption> l() {
        return this.b;
    }

    public SortOption m() {
        SortOption sortOption = this.k;
        if (sortOption != null) {
            return sortOption;
        }
        return this.h.a(this.i, this.e, Collections2.newArrayList(new SortOption(this.g), new SortOption(this.f)));
    }

    public c.b n() {
        return this.p;
    }

    public int o() {
        return this.j.b();
    }

    public void p(Show.ConsumptionOrder consumptionOrder) {
        this.b.clear();
        if (consumptionOrder == Show.ConsumptionOrder.SEQUENTIAL) {
            this.b.add(new SortOption(this.g));
            this.k = this.h.a(this.i, this.g, this.b);
            return;
        }
        this.b.add(new SortOption(this.f));
        this.k = this.h.a(this.i, this.f, this.b);
    }

    public boolean q() {
        return this.m.c() || this.n.c();
    }

    public boolean r() {
        return this.n.c();
    }

    public boolean s() {
        return this.m.c();
    }

    public void t(Bundle bundle) {
        com.spotify.music.util.filterheader.b bVar = this.j;
        if (bVar != null) {
            bundle.putInt("filter", bVar.a());
        }
    }

    public void u(f fVar) {
        this.c.add(fVar);
    }

    public void v(o oVar) {
        this.d.add(oVar);
    }

    public void w(f fVar) {
        this.c.remove(fVar);
    }

    public void x(o oVar) {
        this.d.remove(oVar);
    }

    public void y() {
        for (com.spotify.music.util.filterheader.b bVar : this.a) {
            bVar.f(false);
        }
        com.spotify.music.util.filterheader.b bVar2 = this.l;
        this.j = bVar2;
        bVar2.f(true);
    }

    public void z(Bundle bundle) {
        int i2 = bundle != null ? bundle.getInt("filter", 0) : 0;
        for (com.spotify.music.util.filterheader.b bVar : this.a) {
            if (i2 == bVar.a()) {
                this.j = bVar;
                bVar.f(true);
            } else {
                bVar.f(false);
            }
        }
        this.j = (com.spotify.music.util.filterheader.b) x.n(this.j, this.l);
    }
}
