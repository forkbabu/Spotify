package com.spotify.mobile.android.ui.layout_traits;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.ui.layout_traits.a;

public class TraitsLayoutManager extends GridLayoutManager {
    private final a.b Y = new a();
    private final RecyclerView.l Z = new b();
    private final a a0;
    a.e b0;

    class a implements a.b {
        a() {
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.b
        public int a(int i) {
            return TraitsLayoutManager.this.G2().c(i, b());
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.b
        public int b() {
            return TraitsLayoutManager.this.C2();
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.b
        public int c(int i) {
            return TraitsLayoutManager.this.G2().d(i, b());
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.b
        public int d(int i) {
            return TraitsLayoutManager.this.G2().e(i);
        }
    }

    class b extends RecyclerView.l {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            RecyclerView.b0 a0 = recyclerView.a0(view);
            RecyclerView.e<?> adapter = recyclerView.getAdapter();
            if (a0 != null && a0.w() != -1 && adapter != null) {
                TraitsLayoutManager traitsLayoutManager = TraitsLayoutManager.this;
                if (traitsLayoutManager.b0 != null) {
                    traitsLayoutManager.a0.b(rect, a0.w(), adapter.u(), TraitsLayoutManager.this.Y, TraitsLayoutManager.this.b0, adapter);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements a.e {
        final /* synthetic */ RecyclerView.e a;

        c(TraitsLayoutManager traitsLayoutManager, RecyclerView.e eVar) {
            this.a = eVar;
        }
    }

    public TraitsLayoutManager(Context context, a aVar, int i) {
        super(context, i);
        aVar.getClass();
        this.a0 = aVar;
    }

    private void O2(RecyclerView.e eVar) {
        if (eVar != null) {
            this.b0 = new c(this, eVar);
        } else {
            this.b0 = null;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    public void J2(int i) {
        if (!(this.a0 == null || i == C2())) {
            this.a0.d();
        }
        super.J2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void K0(RecyclerView.e eVar, RecyclerView.e eVar2) {
        O2(eVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void M0(RecyclerView recyclerView) {
        b bVar = new b(this, recyclerView);
        bVar.f(true);
        K2(bVar);
        recyclerView.k(this.Z, -1);
        O2(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void O0(RecyclerView recyclerView, RecyclerView.s sVar) {
        N0();
        K2(new GridLayoutManager.a());
        recyclerView.A0(this.Z);
        O2(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void W0(RecyclerView recyclerView, int i, int i2) {
        super.W0(recyclerView, i, i2);
        this.a0.d();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void X0(RecyclerView recyclerView) {
        super.X0(recyclerView);
        this.a0.d();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        super.Y0(recyclerView, i, i2, i3);
        this.a0.d();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        super.Z0(recyclerView, i, i2);
        this.a0.d();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.b1(recyclerView, i, i2, obj);
        this.a0.d();
    }
}
