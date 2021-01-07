package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.Format;
import io.reactivex.functions.n;

/* renamed from: e6c  reason: default package */
public final /* synthetic */ class e6c implements n {
    public static final /* synthetic */ e6c a = new e6c();

    private /* synthetic */ e6c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj).getFormat() == Format.VIDEO;
    }
}
