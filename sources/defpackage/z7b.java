package defpackage;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: z7b  reason: default package */
public final /* synthetic */ class z7b implements Predicate {
    public static final /* synthetic */ z7b a = new z7b();

    private /* synthetic */ z7b() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        int i = g8b.a;
        return l0.b((String) obj, LinkType.TRACK);
    }
}
