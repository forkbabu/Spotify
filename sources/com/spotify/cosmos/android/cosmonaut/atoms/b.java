package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.MoreObjects;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import java.lang.reflect.Type;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ Converter a;
    public final /* synthetic */ Type b;

    public /* synthetic */ b(Converter converter, Type type) {
        this.a = converter;
        this.b = type;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Converter converter = this.a;
        Type type = this.b;
        ResponseTransformer responseTransformer = ResponseTransformers.PASS_THROUGH;
        Object convert = converter.convert(type, ((Response) obj).getBody());
        MoreObjects.checkNotNull(convert, "%s returned null for %s", converter, type);
        return convert;
    }
}
