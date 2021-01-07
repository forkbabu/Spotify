package com.spotify.music.features.settings;

import android.content.Context;
import android.widget.ListAdapter;
import com.spotify.music.features.settings.adapter.p2;
import com.spotify.music.features.settings.adapter.u2;

final class z0 extends u2 {
    final /* synthetic */ p2 p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z0(Context context, ListAdapter listAdapter, p2 p2Var) {
        super(context, listAdapter);
        this.p = p2Var;
    }

    @Override // com.spotify.music.features.settings.adapter.u2
    public int c(int i) {
        return this.p.o(i);
    }
}
