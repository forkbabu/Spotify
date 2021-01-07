package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.q;
import io.reactivex.functions.b;
import io.reactivex.y;

/* renamed from: zp3  reason: default package */
public class zp3 implements b {
    private final SlotApi a;
    private final com.spotify.music.features.ads.api.b b;
    private final uec c;
    private final AndroidLibsAdsCommonProperties d;
    private final y e;
    private final q f = new q();

    public zp3(SlotApi slotApi, com.spotify.music.features.ads.api.b bVar, uec uec, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties, y yVar) {
        this.a = slotApi;
        this.b = bVar;
        this.c = uec;
        this.d = androidLibsAdsCommonProperties;
        this.e = yVar;
    }

    /* renamed from: b */
    public void a(Ad ad, Long l) {
        String id = ad.id();
        this.f.a(this.b.a("clicked", id, Long.valueOf(l != null ? l.longValue() : 0).longValue(), null).subscribe(new rp3("clicked", id), new qp3("clicked", id)));
        String dependentSlot = ad.getDependentSlot() != null ? ad.getDependentSlot() : "watchnow";
        if (!this.d.f()) {
            this.f.a(this.a.a(dependentSlot, SlotApi.Intent.CLEAR).h(this.c.a()).B(this.e).subscribe(new sp3(dependentSlot), new pp3(dependentSlot)));
        }
    }
}
