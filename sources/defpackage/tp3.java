package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.q;
import io.reactivex.functions.b;
import io.reactivex.y;

/* renamed from: tp3  reason: default package */
public class tp3 implements b {
    private final com.spotify.music.features.ads.api.b a;
    private final SlotApi b;
    private final uec c;
    private final AndroidLibsAdsCommonProperties d;
    private final y e;
    private final q f = new q();

    public tp3(com.spotify.music.features.ads.api.b bVar, SlotApi slotApi, uec uec, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties, y yVar) {
        this.a = bVar;
        this.b = slotApi;
        this.c = uec;
        this.d = androidLibsAdsCommonProperties;
        this.e = yVar;
    }

    /* renamed from: b */
    public void a(Ad ad, Long l) {
        String id = ad.id();
        this.f.a(this.a.a("clicked", id, l.longValue(), null).subscribe(new op3("clicked", id), new mp3("clicked", id)));
        String dependentSlot = ad.getDependentSlot();
        if (dependentSlot == null) {
            dependentSlot = "watchnow";
        }
        if (!this.d.f()) {
            this.f.a(this.b.a(dependentSlot, SlotApi.Intent.NEXT_TRACK).h(this.c.a()).B(this.e).subscribe(new np3(dependentSlot), new lp3(dependentSlot)));
        }
    }
}
