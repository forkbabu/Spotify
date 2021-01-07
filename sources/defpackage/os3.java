package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.screensaver.n0;
import io.reactivex.functions.g;

/* renamed from: os3  reason: default package */
public class os3 implements g<AdSlotEvent> {
    private final n0 a;

    os3(n0 n0Var) {
        this.a = n0Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(AdSlotEvent adSlotEvent) {
        this.a.accept(adSlotEvent);
    }
}
