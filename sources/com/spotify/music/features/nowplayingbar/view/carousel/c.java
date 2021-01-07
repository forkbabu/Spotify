package com.spotify.music.features.nowplayingbar.view.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;

public class c extends z {
    private int f = -1;
    private boolean g;
    private boolean h;
    private RecyclerView i;
    private b j;
    private final RecyclerView.q k = new a();

    class a extends RecyclerView.q {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            int i2;
            if (i == 0) {
                c cVar = c.this;
                cVar.getClass();
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                View f = cVar.f(layoutManager);
                if (f == null) {
                    i2 = -1;
                } else {
                    i2 = layoutManager.o0(f);
                }
                if (c.this.g && i2 < c.this.f) {
                    c cVar2 = c.this;
                    c.p(cVar2, recyclerView, cVar2.f);
                } else if (c.this.h && i2 > c.this.f) {
                    c cVar3 = c.this;
                    c.p(cVar3, recyclerView, cVar3.f);
                } else if (c.this.f != i2) {
                    c.r(c.this, i2);
                    c.this.f = i2;
                }
            }
        }
    }

    public interface b {
        void a();

        void b();
    }

    static void p(c cVar, RecyclerView recyclerView, int i2) {
        cVar.getClass();
        if (i2 != -1) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            RecyclerView.x d = cVar.d(layoutManager);
            d.getClass();
            d.m(i2);
            layoutManager.J1(d);
        }
    }

    static void r(c cVar, int i2) {
        b bVar = cVar.j;
        if (bVar == null) {
            return;
        }
        if (cVar.f > i2) {
            bVar.a();
        } else {
            bVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.f0
    public void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.D0(this.k);
            }
            this.i = recyclerView;
            recyclerView.n(this.k);
        }
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.f0
    public int g(RecyclerView.m mVar, int i2, int i3) {
        if (i2 > 0 && this.h) {
            return this.f;
        }
        if (i2 >= 0 || !this.g) {
            return super.g(mVar, i2, i3);
        }
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public void t(boolean z) {
        this.h = z;
    }

    /* access modifiers changed from: package-private */
    public void u(b bVar) {
        this.j = bVar;
    }

    /* access modifiers changed from: package-private */
    public void v(int i2) {
        this.f = i2;
    }
}
