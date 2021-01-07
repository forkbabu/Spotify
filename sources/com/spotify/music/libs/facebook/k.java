package com.spotify.music.libs.facebook;

import com.spotify.music.libs.facebook.o;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((SocialEvent) obj).socialError() == SocialError.SERVICE_CONNECT_NOT_PERMITTED) {
            return s.i0(new o.b());
        }
        return s.i0(new o.a());
    }
}
