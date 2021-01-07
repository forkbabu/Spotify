package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;

class o extends dwd {
    final /* synthetic */ GlueHeaderView b;

    o(n.b bVar, GlueHeaderView glueHeaderView) {
        this.b = glueHeaderView;
    }

    @Override // defpackage.dwd
    public void onColorExtracted(int i) {
        this.b.setColor(i);
    }
}
