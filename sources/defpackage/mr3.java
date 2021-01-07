package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.n;

/* renamed from: mr3  reason: default package */
public final /* synthetic */ class mr3 implements n {
    public static final /* synthetic */ mr3 a = new mr3();

    private /* synthetic */ mr3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj).getEvent() == AdSlotEvent.Event.PLAY;
    }
}
