package com.spotify.music.sociallistening.impl.eventsources;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<T> implements n<Response> {
    public static final c a = new c();

    c() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(Response response) {
        Response response2 = response;
        h.e(response2, "response");
        if (response2.getStatus() != 200) {
            return false;
        }
        byte[] body = response2.getBody();
        h.d(body, "response.body");
        return (body.length == 0) ^ true;
    }
}
