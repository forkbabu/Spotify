package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;

/* renamed from: ms3  reason: default package */
public class ms3 implements g<AdSlotEvent> {
    private final SlotApi a;
    private final AndroidLibsAdsCommonProperties b;
    private b c;

    public ms3(SlotApi slotApi, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties) {
        this.a = slotApi;
        this.b = androidLibsAdsCommonProperties;
    }

    /* renamed from: a */
    public void accept(AdSlotEvent adSlotEvent) {
        Ad ad = adSlotEvent.getAd();
        AdSlotEvent.Event event = adSlotEvent.getEvent();
        if (Ad.FeaturedActionType.OPT_OUT == ad.getFeaturedActionType() && AdSlotEvent.Event.PLAY == event) {
            String dependentSlot = ad.getDependentSlot() != null ? ad.getDependentSlot() : AdSlot.WATCHNOW.getSlotId();
            if (!this.b.f()) {
                this.c = this.a.a(dependentSlot, SlotApi.Intent.NEXT_TRACK).subscribe(new gs3(dependentSlot), new fs3(dependentSlot));
            }
        }
    }
}
