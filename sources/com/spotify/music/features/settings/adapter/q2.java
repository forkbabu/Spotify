package com.spotify.music.features.settings.adapter;

import android.database.DataSetObserver;

class q2 extends DataSetObserver {
    final /* synthetic */ p2 a;

    q2(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.a.p0.w();
    }
}
