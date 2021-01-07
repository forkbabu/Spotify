package defpackage;

import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import defpackage.ff2;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: hh2  reason: default package */
public class hh2 {
    private final y a;
    private final g<SetupSubscriptionEvent> b;

    public hh2(y yVar, g<SetupSubscriptionEvent> gVar) {
        this.a = yVar;
        this.b = gVar;
    }

    public void a(og0<String, ff2> og0, ff2.a aVar) {
        sr1 sr1 = (sr1) og0;
        sr1.a.d(sr1.b, "com.spotify.superbird.setup.event", new gh2(aVar, this.a, this.b));
    }
}
