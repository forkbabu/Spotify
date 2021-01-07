package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

public final /* synthetic */ class o implements n {
    public final /* synthetic */ String a;

    public /* synthetic */ o(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.equals(((GaiaDevice) obj).getPhysicalIdentifier());
    }
}
