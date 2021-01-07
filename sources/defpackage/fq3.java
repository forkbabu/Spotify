package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;

/* renamed from: fq3  reason: default package */
public final /* synthetic */ class fq3 implements g {
    public static final /* synthetic */ fq3 a = new fq3();

    private /* synthetic */ fq3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b bVar = (b) obj;
        Logger.g("subscribed to %s", AdSlot.SPONSORED_PLAYLIST.getCosmosEndpoint());
    }
}
