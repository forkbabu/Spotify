package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.components.glue.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import defpackage.s51;

public final class c0 extends b {
    private final Picasso a;
    private final boolean b;

    protected static class a extends b.C0174b {
        private f0 p;
        private String q;
        private final Picasso r;

        protected a(ViewGroup viewGroup, w51 w51, Picasso picasso, boolean z) {
            super(viewGroup, w51, z);
            this.r = picasso;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.b.C0174b, defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            super.z(s81, w51, bVar);
            x81 background = s81.images().background();
            String uri = background != null ? background.uri() : null;
            if (!rw.equal(this.q, uri)) {
                f0 f0Var = this.p;
                if (f0Var != null) {
                    this.r.c(f0Var);
                }
                if (uri != null) {
                    this.p = new owd(this.a, owd.n);
                    z m = this.r.m(uri);
                    m.x(fwd.b);
                    m.o(this.p);
                } else {
                    this.p = null;
                    ((RecyclerView) this.a).setBackgroundResource(0);
                }
                this.q = uri;
            }
        }
    }

    public c0(Picasso picasso, boolean z) {
        this.a = picasso;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, w51, this.a, this.b);
    }
}
