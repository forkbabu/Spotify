package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

/* renamed from: nq3  reason: default package */
public final /* synthetic */ class nq3 implements l {
    public static final /* synthetic */ nq3 a = new nq3();

    private /* synthetic */ nq3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((AdSlotEvent) obj).getAd();
    }
}
