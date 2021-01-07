package defpackage;

import android.os.Bundle;

/* renamed from: t77  reason: default package */
public final class t77 implements fjf<String> {
    private final wlf<Bundle> a;

    public t77(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString("ARGUMENT_EPISODE_URI", "");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
