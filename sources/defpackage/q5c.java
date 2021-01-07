package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.Format;
import io.reactivex.functions.n;

/* renamed from: q5c  reason: default package */
public final /* synthetic */ class q5c implements n {
    public static final /* synthetic */ q5c a = new q5c();

    private /* synthetic */ q5c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj).getFormat() == Format.VIDEO;
    }
}
