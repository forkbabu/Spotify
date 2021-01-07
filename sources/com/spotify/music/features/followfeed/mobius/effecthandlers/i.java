package com.spotify.music.features.followfeed.mobius.effecthandlers;

import com.spotify.music.features.followfeed.mobius.effecthandlers.k;
import defpackage.o25;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

final class i<T, R> implements l<Boolean, v<? extends o25>> {
    final /* synthetic */ k.a a;
    final /* synthetic */ String b;

    i(k.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends o25> apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "updated");
        if (!bool2.booleanValue()) {
            return k.b(this.a.a, this.b);
        }
        s i0 = s.i0(o25.o.a);
        h.d(i0, "Observable.just(FeedEvent.FollowArtistSucceeded)");
        return i0;
    }
}
