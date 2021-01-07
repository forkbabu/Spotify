package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.VideoType;
import io.reactivex.functions.l;

/* renamed from: h6c  reason: default package */
public final /* synthetic */ class h6c implements l {
    public static final /* synthetic */ h6c a = new h6c();

    private /* synthetic */ h6c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((AdSlotEvent) obj).getAd().getVideoType() == VideoType.PORTRAIT);
    }
}
