package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.g;

/* renamed from: iq3  reason: default package */
public final /* synthetic */ class iq3 implements g {
    public final /* synthetic */ AdSlot a;

    public /* synthetic */ iq3(AdSlot adSlot) {
        this.a = adSlot;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("error registering %s", this.a.slot_id), new Object[0]);
    }
}
