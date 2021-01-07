package defpackage;

import com.spotify.music.libs.carmodeengine.util.y;
import io.reactivex.internal.operators.observable.t;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: r7a  reason: default package */
public final class r7a implements fjf<s<Boolean>> {
    private final wlf<s<d7a>> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;
    private final wlf<y> d;

    public r7a(wlf<s<d7a>> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<d7a> sVar = this.a.get();
        wlf<Boolean> wlf = this.b;
        wlf<Boolean> wlf2 = this.c;
        y yVar = this.d.get();
        h.e(sVar, "carModeStateObservable");
        h.e(wlf, "isVoiceEnabledProvider");
        h.e(wlf2, "isLandscapeProvider");
        h.e(yVar, "carModeFeatureAvailability");
        s l = s.l(sVar, yVar.c(), new t(new p7a(0, wlf)), new t(new p7a(1, wlf2)), q7a.a);
        h.d(l, "Observable.combineLatest…e\n            }\n        )");
        s E = l.E();
        h.d(E, "isVoiceButtonVisible.distinctUntilChanged()");
        return E;
    }
}
