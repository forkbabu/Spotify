package com.spotify.mobile.android.util.decorator;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import io.reactivex.internal.util.ExceptionHelper;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        c cVar = this.a;
        Response response = (Response) obj;
        cVar.getClass();
        try {
            return cVar.c(response.getBody());
        } catch (Exception e) {
            throw ExceptionHelper.e(e);
        }
    }
}
