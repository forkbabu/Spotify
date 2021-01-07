package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.n;

/* renamed from: jr3  reason: default package */
public final /* synthetic */ class jr3 implements n {
    public static final /* synthetic */ jr3 a = new jr3();

    private /* synthetic */ jr3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj).getEvent() == AdSlotEvent.Event.PLAY;
    }
}
