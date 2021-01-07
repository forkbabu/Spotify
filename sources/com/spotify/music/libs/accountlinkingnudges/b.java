package com.spotify.music.libs.accountlinkingnudges;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<Optional<GaiaDevice>, Boolean> {
    final /* synthetic */ DefaultGoogleAccountLinkingNudgeAttacher a;

    b(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher) {
        this.a = defaultGoogleAccountLinkingNudgeAttacher;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Boolean apply(Optional<GaiaDevice> optional) {
        boolean z;
        Optional<GaiaDevice> optional2 = optional;
        h.e(optional2, "it");
        if (optional2.isPresent()) {
            DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher = this.a;
            GaiaDevice gaiaDevice = optional2.get();
            h.d(gaiaDevice, "it.get()");
            if (DefaultGoogleAccountLinkingNudgeAttacher.d(defaultGoogleAccountLinkingNudgeAttacher, gaiaDevice)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
