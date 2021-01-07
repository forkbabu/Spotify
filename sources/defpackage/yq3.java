package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.Format;
import io.reactivex.functions.n;

/* renamed from: yq3  reason: default package */
public final /* synthetic */ class yq3 implements n {
    public static final /* synthetic */ yq3 a = new yq3();

    private /* synthetic */ yq3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj).getFormat() == Format.AUDIO;
    }
}
