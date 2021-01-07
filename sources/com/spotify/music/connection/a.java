package com.spotify.music.connection;

import com.spotify.music.connection.OfflineState;
import com.spotify.music.connection.g;
import io.reactivex.functions.c;

public final /* synthetic */ class a implements c {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        OfflineState.State state = (OfflineState.State) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (state == OfflineState.State.FORCED_OFFLINE) {
            return new g.b(OfflineReason.FORCED_OFFLINE);
        }
        if (!booleanValue) {
            return new g.b(OfflineReason.NO_INTERNET);
        }
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return new g.c();
        }
        if (ordinal != 1) {
            return new g.a();
        }
        return new g.b(OfflineReason.AP_CONNECTION_PROBLEM);
    }
}
