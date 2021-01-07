package com.spotify.music.premiummini;

import com.spotify.offline.OfflineUtilImpl;
import com.spotify.offline.data.b;
import io.reactivex.disposables.a;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class g<T> implements io.reactivex.functions.g<b> {
    final /* synthetic */ PremiumMiniPlugin a;

    g(PremiumMiniPlugin premiumMiniPlugin) {
        this.a = premiumMiniPlugin;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(b bVar) {
        for (T t : bVar.a()) {
            if (PremiumMiniPlugin.g(this.a, t)) {
                PremiumMiniPlugin premiumMiniPlugin = this.a;
                io.reactivex.disposables.b subscribe = ((OfflineUtilImpl) premiumMiniPlugin.p).b(t.b()).subscribe();
                h.d(subscribe, "offlineUtil\n            …             .subscribe()");
                a aVar = this.a.a;
                premiumMiniPlugin.getClass();
                aVar.b(subscribe);
            }
        }
    }
}
