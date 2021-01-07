package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import java.lang.reflect.Type;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ Converter a;
    public final /* synthetic */ Type b;

    public /* synthetic */ c(Converter converter, Type type) {
        this.a = converter;
        this.b = type;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Converter converter = this.a;
        Type type = this.b;
        Response response = (Response) obj;
        ResponseTransformer responseTransformer = ResponseTransformers.PASS_THROUGH;
        return TypedResponse.builder().uri(response.getUri()).headers(response.getHeaders()).status(response.getStatus()).body(converter.convert(type, response.getBody())).build();
    }
}
