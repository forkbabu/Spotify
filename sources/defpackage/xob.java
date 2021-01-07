package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.Format;
import io.reactivex.functions.n;

/* renamed from: xob  reason: default package */
public final /* synthetic */ class xob implements n {
    public static final /* synthetic */ xob a = new xob();

    private /* synthetic */ xob() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj).getFormat() == Format.AUDIO;
    }
}
