package com.spotify.podcast.endpoints;

import com.spotify.podcast.endpoints.exceptions.UnableToParseMessageException;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u3 u3Var = (u3) obj;
        S s = u3Var.b;
        if (s == null) {
            return s.P(new UnableToParseMessageException(u3Var.a));
        }
        return s.i0(s);
    }
}
