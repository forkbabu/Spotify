package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import io.reactivex.g;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wfd  reason: default package */
public class wfd {
    private static final Set<String> a;
    private static final Set<String> b;

    static {
        HashSet hashSet = new HashSet(Collections.singletonList("disallow-mft-radio"));
        a = hashSet;
        HashSet hashSet2 = new HashSet(Collections.singletonList("disallow-radio"));
        b = hashSet2;
        new PlayerRestrictions(hashSet, Collections.emptySet(), hashSet, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), hashSet2, hashSet2, hashSet2, hashSet, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), hashSet2, hashSet2, hashSet2, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    public wfd(g<c> gVar) {
        gVar.getClass();
    }
}
