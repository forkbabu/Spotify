package defpackage;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Set;

/* renamed from: yfa  reason: default package */
public final /* synthetic */ class yfa implements Predicate {
    public static final /* synthetic */ yfa a = new yfa();

    private /* synthetic */ yfa() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        SpSharedPreferences.b<Object, Set<String>> bVar = gga.e;
        return ((l0) obj).q() != LinkType.DUMMY;
    }
}
