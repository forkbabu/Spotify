package com.spotify.feature.speakerdeeplink;

import io.reactivex.functions.n;
import java.util.List;

public final /* synthetic */ class j implements n {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((List) obj).size() > 1;
    }
}
