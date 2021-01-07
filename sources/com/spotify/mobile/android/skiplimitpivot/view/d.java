package com.spotify.mobile.android.skiplimitpivot.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class d extends r51 {
    private final RecyclerView a;
    private final RecyclerView b;
    private final GlueHeaderLayout c;
    private final FrameLayout d;
    private final Context e;

    public d(Context context, m mVar, c cVar) {
        h.e(context, "context");
        h.e(mVar, "layoutManagerFactory");
        h.e(cVar, "impressionLogger");
        this.e = context;
        RecyclerView D = r51.D(context);
        D.setLayoutManager(mVar.create());
        this.a = D;
        RecyclerView E = r51.E(context);
        this.b = E;
        h.d(D, "body");
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        glueHeaderLayout.z(D);
        glueHeaderLayout.G(new GlueNoHeaderView(context), new GlueNoHeaderBehavior(), true);
        this.c = glueHeaderLayout;
        h.d(E, "overlay");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(C0707R.id.hub_glue_header_layout_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.addView(glueHeaderLayout, layoutParams);
        frameLayout.addView(E, layoutParams);
        this.d = frameLayout;
        cVar.g(D);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        RecyclerView recyclerView = this.a;
        h.d(recyclerView, "body");
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        RecyclerView recyclerView = this.b;
        h.d(recyclerView, "overlay");
        return recyclerView;
    }

    @Override // defpackage.e61
    public View b() {
        return this.d;
    }
}
