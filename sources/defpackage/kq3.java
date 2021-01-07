package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

/* renamed from: kq3  reason: default package */
public final /* synthetic */ class kq3 implements l {
    public final /* synthetic */ lq3 a;

    public /* synthetic */ kq3(lq3 lq3) {
        this.a = lq3;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((AdSlotEvent) obj);
    }
}
