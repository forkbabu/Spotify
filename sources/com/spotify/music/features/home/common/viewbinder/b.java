package com.spotify.music.features.home.common.viewbinder;

import com.spotify.android.glue.patterns.header.GlueHeaderLayout;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ GlueHeaderLayout a;

    public /* synthetic */ b(GlueHeaderLayout glueHeaderLayout) {
        this.a = glueHeaderLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GlueHeaderLayout glueHeaderLayout = this.a;
        if (!glueHeaderLayout.D()) {
            glueHeaderLayout.A(false);
        }
    }
}
