package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.n;

/* renamed from: dq3  reason: default package */
public final /* synthetic */ class dq3 implements n {
    public static final /* synthetic */ dq3 a = new dq3();

    private /* synthetic */ dq3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return AdSlotEvent.Event.PLAY == ((AdSlotEvent) obj).getEvent();
    }
}
