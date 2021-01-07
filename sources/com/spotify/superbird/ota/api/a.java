package com.spotify.superbird.ota.api;

import com.spotify.superbird.ota.model.e;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        e eVar = (e) obj;
        if (eVar.success() && eVar.errors().isEmpty()) {
            return eVar.results();
        }
        throw new SuperbirdOtaResponseException(eVar);
    }
}
