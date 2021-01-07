package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import java.lang.reflect.Type;

interface ReturnTypeConverter {
    Object convert(ResponseTransformer responseTransformer, s<Response> sVar);

    boolean isSupported(Type type, String str);
}
