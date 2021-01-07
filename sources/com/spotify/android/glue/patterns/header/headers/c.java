package com.spotify.android.glue.patterns.header.headers;

import com.spotify.android.glue.patterns.header.backgrounds.a;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;

/* access modifiers changed from: package-private */
public class c {
    private final GlueHeaderView a;
    qc0 b;
    com.spotify.android.glue.components.toolbar.c c;
    a d;

    public c(GlueHeaderView glueHeaderView, a aVar) {
        this.a = glueHeaderView;
        this.d = aVar;
    }

    private static void d(float f, g90 g90) {
        GlueHeaderView.GlueHeaderViewLayoutParams glueHeaderViewLayoutParams;
        ic0 ic0;
        if (g90 != null && (glueHeaderViewLayoutParams = (GlueHeaderView.GlueHeaderViewLayoutParams) g90.getView().getLayoutParams()) != null && (ic0 = glueHeaderViewLayoutParams.c) != null) {
            ic0.a(f);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i, float f) {
        d(f, this.c);
        d(f, this.b);
        qc0 qc0 = this.b;
        if (qc0 instanceof tc0) {
            ((tc0) qc0).e0(i, f);
        }
        this.d.a(i, f);
    }

    /* access modifiers changed from: package-private */
    public void b(qc0 qc0) {
        GlueHeaderView.GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = new GlueHeaderView.GlueHeaderViewLayoutParams(-1, -1);
        qc0 qc02 = this.b;
        if (qc02 != null) {
            this.a.removeView(qc02.getView());
        }
        this.b = qc0;
        if (qc0 != null) {
            this.a.addView(qc0.getView(), 1, glueHeaderViewLayoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(com.spotify.android.glue.components.toolbar.c cVar, int i) {
        GlueHeaderView.GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = new GlueHeaderView.GlueHeaderViewLayoutParams(-1, i);
        if (cVar != null) {
            glueHeaderViewLayoutParams.c = new ic0(cVar);
        }
        com.spotify.android.glue.components.toolbar.c cVar2 = this.c;
        if (cVar2 != null) {
            this.a.removeView(cVar2.getView());
        }
        this.c = cVar;
        if (cVar != null) {
            this.a.addView(cVar.getView(), this.b != null ? 2 : 1, glueHeaderViewLayoutParams);
        }
    }
}
