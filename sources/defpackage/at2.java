package defpackage;

import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.sociallistening.participantlist.impl.m;
import kotlin.jvm.internal.h;

/* renamed from: at2  reason: default package */
public final class at2 implements fjf<yn0> {
    private final wlf<s> a;

    public at2(wlf<s> wlf) {
        this.a = wlf;
    }

    public static yn0 a(s sVar) {
        h.e(sVar, "fragmentIdentifier");
        yn0 b = m.b(sVar);
        h.d(b, "FeatureIdentifiers.Argum…errer(fragmentIdentifier)");
        return b;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
