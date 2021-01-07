package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Format;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;

/* renamed from: pr3  reason: default package */
public final /* synthetic */ class pr3 implements g {
    public final /* synthetic */ Format a;

    public /* synthetic */ pr3(Format format) {
        this.a = format;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b bVar = (b) obj;
        Logger.g("subscribed to %s", this.a.getCosmosEndpoint());
    }
}
