package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.j;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.squareup.picasso.g;

/* access modifiers changed from: package-private */
public class d<T extends j> extends c<T> {
    private final c<T> a;

    class a extends dwd {
        a() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            d.this.p(i);
        }
    }

    d(GluePrettyListCompatStates gluePrettyListCompatStates, e eVar, Context context, Fragment fragment, u uVar, n nVar) {
        this.a = gluePrettyListCompatStates.d(eVar, context, fragment, uVar, nVar);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public g a() {
        return new a();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView e() {
        return this.a.e();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView f() {
        return this.a.f();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public RecyclerView g() {
        return this.a.g();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public StickyListView h() {
        return this.a.h();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public View i() {
        return this.a.i();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public T j() {
        return this.a.j();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void k(a0 a0Var, Context context) {
        this.a.k(a0Var, context);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void l(boolean z) {
        this.a.l(z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void m(boolean z) {
        this.a.m(z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void n(View view) {
        this.a.n(view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void o(int i) {
        this.a.o(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void p(int i) {
        this.a.p(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void q(View view) {
        this.a.q(view);
    }
}
