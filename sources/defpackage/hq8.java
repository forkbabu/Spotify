package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.j;
import com.spotify.mobile.android.service.feature.k;
import com.spotify.mobile.android.service.feature.v;

/* renamed from: hq8  reason: default package */
public class hq8 extends v {
    @Deprecated
    public static final j c;
    public static final j d;

    static {
        Overridable overridable = Overridable.INTERNAL;
        c = k.g("and_nft_skip_onboarding", overridable);
        d = k.g("ab_nuod_remove_taste_onboarding", overridable);
    }
}
