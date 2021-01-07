package com.spotify.music.features.entityselector.pages.search;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import kotlin.text.e;

final class b<T, R> implements l<String, com.spotify.libs.search.online.entity.b> {
    final /* synthetic */ boolean a;

    b(boolean z) {
        this.a = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public com.spotify.libs.search.online.entity.b apply(String str) {
        String str2 = str;
        boolean z = true;
        if (!MoreObjects.isNullOrEmpty(str2)) {
            if (e.f(str2, "true", true) || h.a("1", str2)) {
                h.d(Boolean.TRUE, "TRUE");
                return new com.spotify.libs.search.online.entity.b(z, this.a);
            } else if (e.f(str2, "false", true) || h.a(Ad.DEFAULT_SKIPPABLE_AD_DELAY, str2)) {
                h.d(Boolean.FALSE, "FALSE");
            }
        }
        z = false;
        return new com.spotify.libs.search.online.entity.b(z, this.a);
    }
}
