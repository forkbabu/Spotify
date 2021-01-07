package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.n;

/* renamed from: tq3  reason: default package */
public final /* synthetic */ class tq3 implements n {
    public static final /* synthetic */ tq3 a = new tq3();

    private /* synthetic */ tq3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Ad) obj).isVoiceAd();
    }
}
