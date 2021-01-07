package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import kotlin.jvm.internal.h;

/* renamed from: zs2  reason: default package */
public final class zs2 implements fjf<c> {
    private final wlf<Fragment> a;

    public zs2(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Fragment fragment = this.a.get();
        h.e(fragment, "fragment");
        c c = d.c(fragment);
        h.d(c, "FlagsArgumentHelper.getFlags(fragment)");
        return c;
    }
}
