package com.spotify.mobile.android.hubframework.defaults.view;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;

final class d extends r51 {
    private final RecyclerView a;
    private final RecyclerView b;
    private final ViewGroup c;

    static final class b implements HubsGlueViewBinderFactories.e {
        private final m b;

        private b(m mVar) {
            this.b = mVar;
        }

        static b c(m mVar) {
            return new b(mVar);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.e
        public e61 a(Context context, w51 w51) {
            return new d(context, this.b, HubsGlueViewBinderFactories.e.a, null);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.e
        public e61 b(Context context, w51 w51, RecyclerView.q qVar) {
            return new d(context, this.b, qVar, null);
        }
    }

    d(Context context, m mVar, RecyclerView.q qVar, a aVar) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        RecyclerView D = r51.D(context);
        this.a = D;
        D.setLayoutManager(mVar.create());
        qVar.getClass();
        D.n(qVar);
        RecyclerView E = r51.E(context);
        this.b = E;
        frameLayout.addView(D, -1, -1);
        frameLayout.addView(E, -1, -1);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.b;
    }

    @Override // defpackage.e61
    public View b() {
        return this.c;
    }

    @Override // defpackage.r51, defpackage.e61
    public Parcelable e() {
        RecyclerView.m layoutManager = this.a.getLayoutManager();
        layoutManager.getClass();
        Parcelable i1 = layoutManager.i1();
        RecyclerView.m layoutManager2 = this.b.getLayoutManager();
        layoutManager2.getClass();
        return new c(i1, layoutManager2.i1(), null, HubsGlueViewBinderFactories.a(this.a));
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            RecyclerView.m layoutManager = this.a.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(cVar.a);
            RecyclerView.m layoutManager2 = this.b.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(cVar.b);
        }
    }
}
