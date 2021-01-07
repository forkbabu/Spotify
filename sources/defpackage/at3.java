package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.l;

/* renamed from: at3  reason: default package */
public final /* synthetic */ class at3 implements l {
    public static final /* synthetic */ at3 a = new at3();

    private /* synthetic */ at3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Ad) obj).isSkippableAd());
    }
}
