package defpackage;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.g;
import io.reactivex.subjects.a;

/* renamed from: rr3  reason: default package */
public final /* synthetic */ class rr3 implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ rr3(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((AdSlotEvent) obj);
    }
}
