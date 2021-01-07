package defpackage;

import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: nc2  reason: default package */
public final /* synthetic */ class nc2 implements l {
    public final /* synthetic */ SlotApi a;

    public /* synthetic */ nc2(SlotApi slotApi) {
        this.a = slotApi;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SlotApi slotApi = this.a;
        r.a aVar = (r.a) obj;
        String slotId = AdSlot.STREAM.getSlotId();
        SlotApi.Intent intent = SlotApi.Intent.CLEAR;
        return a.z(slotApi.a(slotId, intent), slotApi.a(AdSlot.PREROLL.getSlotId(), intent)).P(s.b()).E(ad2.a).P();
    }
}
