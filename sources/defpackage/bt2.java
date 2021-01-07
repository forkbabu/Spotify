package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.h;

/* renamed from: bt2  reason: default package */
public final class bt2 implements fjf<Bundle> {
    private final wlf<Fragment> a;

    public bt2(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Fragment fragment = this.a.get();
        h.e(fragment, "fragment");
        Bundle D2 = fragment.D2();
        return D2 != null ? D2 : new Bundle();
    }
}
