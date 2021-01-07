package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.n;

/* renamed from: zs3  reason: default package */
public final /* synthetic */ class zs3 implements n {
    public static final /* synthetic */ zs3 a = new zs3();

    private /* synthetic */ zs3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((Ad) obj).isSkippableAd();
    }
}
