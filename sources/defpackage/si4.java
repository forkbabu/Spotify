package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: si4  reason: default package */
public final class si4 {
    private final PublishSubject<List<ty4>> a;

    public si4() {
        PublishSubject<List<ty4>> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<List<SpotifyEntity>>()");
        this.a = h1;
    }

    public final void a(List<? extends ty4> list) {
        h.e(list, "spotifyEntities");
        this.a.onNext(list);
    }

    public final s<List<ty4>> b() {
        return this.a;
    }
}
