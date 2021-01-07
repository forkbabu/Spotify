package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        h.e("", "displayName");
        h.e("", "imageUrl");
        return new o.c(false, "", "");
    }
}
