package com.spotify.music.marquee.trigger;

import com.spotify.music.features.ads.api.SlotApi;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ bjb a;
    public final /* synthetic */ zr3 b;

    public /* synthetic */ h(bjb bjb, zr3 zr3) {
        this.a = bjb;
        this.b = zr3;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u3 u3Var = (u3) obj;
        return this.a.a(SlotApi.Intent.FETCH).J0(new k(this.b));
    }
}
