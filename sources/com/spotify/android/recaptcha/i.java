package com.spotify.android.recaptcha;

import com.google.common.collect.ImmutableMap;
import io.reactivex.z;

public class i {
    private final j a;

    public i(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/z<Ljava/lang/String;>; */
    /* access modifiers changed from: protected */
    public z a(String str, String str2) {
        return this.a.a(ImmutableMap.of("token", str2, "spotify_id", str));
    }
}
