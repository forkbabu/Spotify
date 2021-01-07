package com.spotify.mobile.android.service.feature;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.a;
import com.spotify.android.flags.i;

final class l extends a {
    final /* synthetic */ int h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(String str, i iVar, Overridable overridable, int i) {
        super(str, iVar, overridable);
        this.h = i;
    }

    @Override // com.spotify.android.flags.a
    public boolean i(int i) {
        return i == this.h;
    }
}
