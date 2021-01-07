package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.g;

/* renamed from: tt3  reason: default package */
public class tt3 implements g<AdSlotEvent> {
    private final pt3 a;

    public tt3(pt3 pt3) {
        this.a = pt3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(AdSlotEvent adSlotEvent) {
        AdSlotEvent adSlotEvent2 = adSlotEvent;
        Ad ad = adSlotEvent2.getAd();
        boolean z = AdSlotEvent.Event.AVAILABLE == adSlotEvent2.getEvent();
        boolean isPreview = ad.isPreview();
        Logger.b("SPL isAdSlotEventAvailable: %b", Boolean.valueOf(z));
        Logger.b("SPL isPreview: %b", Boolean.valueOf(isPreview));
        if (z && isPreview) {
            this.a.i(ad);
        }
    }
}
