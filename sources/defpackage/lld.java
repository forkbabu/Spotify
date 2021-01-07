package defpackage;

import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import kotlin.jvm.internal.h;

/* renamed from: lld  reason: default package */
public final class lld implements fjf<c<SetupSubscriptionEvent>> {

    /* access modifiers changed from: private */
    /* renamed from: lld$a */
    public static final class a {
        private static final lld a = new lld();
    }

    public static lld a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        PublishSubject h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        return h1;
    }
}
