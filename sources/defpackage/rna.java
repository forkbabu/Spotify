package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.a;
import com.spotify.mobile.android.service.feature.k;
import com.spotify.mobile.android.service.feature.v;

/* renamed from: rna  reason: default package */
public class rna extends v {
    @Deprecated
    public static final a c;
    @Deprecated
    public static final a d;

    static {
        Overridable overridable = Overridable.ALWAYS;
        c = k.e("shows-collection", overridable);
        d = k.e("shows-collection-jam", overridable);
    }
}
