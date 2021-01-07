package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.v;
import java.lang.reflect.Type;

public final /* synthetic */ class d implements ResponseTransformer {
    public final /* synthetic */ Converter a;
    public final /* synthetic */ Type b;

    public /* synthetic */ d(Converter converter, Type type) {
        this.a = converter;
        this.b = type;
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // com.spotify.cosmos.android.cosmonaut.atoms.ResponseTransformer, io.reactivex.w
    public final v<Object> apply(s<Response> sVar) {
        Converter converter = this.a;
        Type type = this.b;
        ResponseTransformer responseTransformer = ResponseTransformers.PASS_THROUGH;
        return sVar.j0(new b(converter, type));
    }
}
