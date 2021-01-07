package defpackage;

import com.spotify.superbird.ota.model.f;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;

/* renamed from: eoe  reason: default package */
public final class eoe implements fjf<c<f>> {

    /* access modifiers changed from: private */
    /* renamed from: eoe$a */
    public static final class a {
        private static final eoe a = new eoe();
    }

    public static eoe a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishSubject.h1();
    }
}
