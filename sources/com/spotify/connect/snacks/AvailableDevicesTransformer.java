package com.spotify.connect.snacks;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.List;
import kotlin.jvm.internal.h;

public final class AvailableDevicesTransformer implements w<List<? extends GaiaDevice>, List<? extends a>> {
    /* Return type fixed from 'io.reactivex.v<java.util.List<com.spotify.connect.snacks.a>>' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s<java.util.List<com.spotify.libs.connect.model.GaiaDevice>>] */
    @Override // io.reactivex.w
    public v<List<? extends a>> apply(s<List<? extends GaiaDevice>> sVar) {
        h.e(sVar, "upstream");
        s<R> E = sVar.j0(new b(new AvailableDevicesTransformer$apply$1(this))).j0(new b(new AvailableDevicesTransformer$apply$2(this))).E();
        h.d(E, "upstream\n            .ma…  .distinctUntilChanged()");
        return E;
    }
}
