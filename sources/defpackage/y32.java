package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;

/* renamed from: y32  reason: default package */
public class y32 {
    private final z3<Integer> a;
    private final x3<Integer> b;

    public y32(z3<Integer> z3Var, x3<Integer> x3Var) {
        this.b = x3Var;
        this.a = z3Var;
    }

    public r3 a(String str, String str2) {
        return r3.a(y3.k(PageIdentifiers.CONTEXTMENU_EPISODE_SPEEDCONTROL, str, str2), this.a, this.b);
    }
}
