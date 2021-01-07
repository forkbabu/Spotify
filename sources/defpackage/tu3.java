package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.g;

/* renamed from: tu3  reason: default package */
public final /* synthetic */ class tu3 implements g {
    public final /* synthetic */ AdSlot a;

    public /* synthetic */ tu3(AdSlot adSlot) {
        this.a = adSlot;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("Request to disable %s ad slot failed", this.a.toString());
    }
}
