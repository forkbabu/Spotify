package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.g;

/* renamed from: qr3  reason: default package */
public final /* synthetic */ class qr3 implements g {
    public static final /* synthetic */ qr3 a = new qr3();

    private /* synthetic */ qr3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
        Logger.g("AdSlotEvent Emitted %s %s %s %s", adSlotEvent.getFormat(), adSlotEvent.getAd().getAdType(), adSlotEvent.getEvent(), adSlotEvent);
    }
}
