package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class a3 implements l {
    public static final /* synthetic */ a3 a = new a3();

    private /* synthetic */ a3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = e4.D;
        if (bool.booleanValue()) {
            return s.i0(bool);
        }
        return IapException.b("Playback speed can only be set on local device");
    }
}
