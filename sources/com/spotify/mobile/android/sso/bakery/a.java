package com.spotify.mobile.android.sso.bakery;

import io.reactivex.functions.l;
import java.net.HttpCookie;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Cookie cookie = (Cookie) obj;
        HttpCookie httpCookie = new HttpCookie(cookie.name(), cookie.value());
        httpCookie.setDomain(cookie.domain());
        httpCookie.setMaxAge((long) cookie.maxAge());
        httpCookie.setSecure(cookie.secure());
        return httpCookie;
    }
}
