package com.spotify.music.features.search.mobius;

import android.view.View;
import androidx.fragment.app.c;
import defpackage.yg8;

public final /* synthetic */ class d implements yg8.e {
    public final /* synthetic */ SearchMobiusFragment a;

    public /* synthetic */ d(SearchMobiusFragment searchMobiusFragment) {
        this.a = searchMobiusFragment;
    }

    @Override // defpackage.yg8.e
    public final View a() {
        c B2 = this.a.B2();
        if (B2 == null) {
            return null;
        }
        return B2.getCurrentFocus();
    }
}
