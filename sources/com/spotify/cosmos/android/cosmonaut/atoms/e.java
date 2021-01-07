package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.v;

public final /* synthetic */ class e implements ResponseTransformer {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // com.spotify.cosmos.android.cosmonaut.atoms.ResponseTransformer, io.reactivex.w
    public final v<Object> apply(s<Response> sVar) {
        ResponseTransformer responseTransformer = ResponseTransformers.PASS_THROUGH;
        return sVar.j0(g.a);
    }
}
