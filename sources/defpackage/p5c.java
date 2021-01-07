package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

/* renamed from: p5c  reason: default package */
public final /* synthetic */ class p5c implements l {
    public static final /* synthetic */ p5c a = new p5c();

    private /* synthetic */ p5c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((AdSlotEvent) obj).getAd();
    }
}
