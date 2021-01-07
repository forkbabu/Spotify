package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

/* renamed from: yob  reason: default package */
public final /* synthetic */ class yob implements c {
    public static final /* synthetic */ yob a = new yob();

    private /* synthetic */ yob() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Ad ad = (Ad) obj;
        return Boolean.valueOf(((PlayerState) obj2).restrictions().disallowSkippingNextReasons().isEmpty() && ad.skippable() && ad.getAdType() == Ad.AdType.NORMAL);
    }
}
