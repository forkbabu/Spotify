package com.spotify.imageresolve;

import com.spotify.base.java.logging.Logger;
import com.spotify.imageresolve.proto.ProjectionsResponse;
import io.reactivex.functions.l;
import retrofit2.v;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        v vVar = (v) obj;
        if (vVar.f() && vVar.a() != null) {
            return ((ProjectionsResponse) vVar.a()).h();
        }
        Logger.b("IMAGERESOLVE Request failure: %s %s", Integer.valueOf(vVar.b()), vVar.g());
        throw new RuntimeException("Failed fetching projection map");
    }
}
