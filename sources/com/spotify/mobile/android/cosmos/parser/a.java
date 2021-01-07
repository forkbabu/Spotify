package com.spotify.mobile.android.cosmos.parser;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ JacksonResponseParser a;

    public /* synthetic */ a(JacksonResponseParser jacksonResponseParser) {
        this.a = jacksonResponseParser;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a((Response) obj);
    }
}
