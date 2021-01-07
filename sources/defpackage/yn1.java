package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.service.session.d;
import com.spotify.rxjava2.r;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

/* renamed from: yn1  reason: default package */
public class yn1 {
    private static final String c = "yn1";
    private final g<SessionState> a;
    private final r<SessionState> b;

    public yn1(d dVar, y yVar) {
        r<SessionState> rVar = new r<>(c, dVar.a().E().v0(1).h1().o0(yVar));
        this.b = rVar;
        this.a = s.y(rVar).Y0(BackpressureStrategy.LATEST);
    }

    @Deprecated
    public g<SessionState> a() {
        return this.a;
    }

    public List<com.spotify.rxjava2.y> b() {
        return this.b.a();
    }
}
