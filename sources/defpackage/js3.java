package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.n;

/* renamed from: js3  reason: default package */
public final /* synthetic */ class js3 implements n {
    public static final /* synthetic */ js3 a = new js3();

    private /* synthetic */ js3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return Ad.AdType.END_CARD_AD == ((Ad) obj).getAdType();
    }
}
