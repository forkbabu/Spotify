package com.spotify.music.premiummini;

import com.spotify.offline.OfflineUtilImpl;
import com.spotify.offline.data.a;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class f<T, R> implements l<a, e> {
    final /* synthetic */ PremiumMiniPlugin a;

    f(PremiumMiniPlugin premiumMiniPlugin) {
        this.a = premiumMiniPlugin;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public e apply(a aVar) {
        a aVar2 = aVar;
        h.e(aVar2, "offlineResource");
        if (!PremiumMiniPlugin.g(this.a, aVar2)) {
            return b.a;
        }
        return ((OfflineUtilImpl) this.a.p).b(aVar2.b());
    }
}
