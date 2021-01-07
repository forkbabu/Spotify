package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.playlist.models.j;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ y3 a;

    public /* synthetic */ c(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return y3.b(this.a, (j) obj);
    }
}
