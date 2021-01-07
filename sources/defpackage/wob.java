package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

/* renamed from: wob  reason: default package */
public final /* synthetic */ class wob implements l {
    public static final /* synthetic */ wob a = new wob();

    private /* synthetic */ wob() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((AdSlotEvent) obj).getAd();
    }
}
