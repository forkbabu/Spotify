package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
