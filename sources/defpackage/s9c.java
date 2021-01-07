package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.a;
import com.spotify.mobile.android.service.feature.k;
import com.spotify.mobile.android.service.feature.v;

/* renamed from: s9c  reason: default package */
public final class s9c extends v {
    @Deprecated
    public static final a c;
    @Deprecated
    public static final a d;

    static {
        Overridable overridable = Overridable.INTERNAL;
        k.f("india-experience", overridable, 1);
        c = k.f("language-onboarding", overridable, 1);
        d = k.e("taste-onboarding-disabled", overridable);
    }
}
