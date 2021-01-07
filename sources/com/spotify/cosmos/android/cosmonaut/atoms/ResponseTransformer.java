package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

interface ResponseTransformer extends w<Response, Object> {
    @Override // io.reactivex.w
    /* synthetic */ v<Downstream> apply(s<Upstream> sVar);
}
