package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import io.reactivex.functions.l;
import io.reactivex.z;
import java.io.IOException;
import java.util.Collections;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = (f) obj;
        if (fVar.partners() == null) {
            return z.q(new IOException("Wrong response"));
        }
        return z.z(Boolean.valueOf((fVar.partners() == null ? Collections.emptyMap() : fVar.partners()).containsKey("samsung")));
    }
}
