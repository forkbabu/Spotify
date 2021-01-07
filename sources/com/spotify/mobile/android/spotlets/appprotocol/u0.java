package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.a;

public final /* synthetic */ class u0 implements a {
    public final /* synthetic */ AppProtocol.ImageIdentifier a;
    public final /* synthetic */ String b;

    public /* synthetic */ u0(AppProtocol.ImageIdentifier imageIdentifier, String str) {
        this.a = imageIdentifier;
        this.b = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        AppProtocol.ImageIdentifier imageIdentifier = this.a;
        String str = this.b;
        if (imageIdentifier == null || imageIdentifier.id == null) {
            throw IapException.a(str, "wamp.error.invalid_argument");
        }
    }
}
