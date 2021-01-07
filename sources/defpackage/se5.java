package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.remoteconfig.x6;
import java.util.HashSet;
import java.util.Set;

/* renamed from: se5  reason: default package */
public class se5 {
    private final Set<String> a;
    private final x6 b;
    private final ve5 c;

    public se5(x6 x6Var, ve5 ve5) {
        ImmutableSet of = ImmutableSet.of("1d2cf25b1643474983fae381b00cea3c", "e11b1a8713164f739d2a9d9fed5a4c01", "bdbbbe571cef4b148a51a0defb957475", "microsoft-surface-buds-legacy-client-id");
        this.b = x6Var;
        this.c = ve5;
        this.a = new HashSet(of);
    }

    public boolean a(me5 me5) {
        me5.getClass();
        String b2 = ((ne5) me5).b();
        if (!this.b.a()) {
            Logger.b("Go: Access Control is off. Authorizing client id: %s", b2);
            return true;
        } else if (!this.a.contains(b2)) {
            Logger.b("Go: Unauthorized client id: %s", b2);
            return false;
        } else if (this.c.a(b2).a()) {
            return true;
        } else {
            Logger.b("Go: Disabled client id: %s", b2);
            return false;
        }
    }
}
