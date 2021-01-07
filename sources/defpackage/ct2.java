package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.h;

/* renamed from: ct2  reason: default package */
public final class ct2 implements fjf<String> {
    private final wlf<Bundle> a;

    public ct2(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Bundle bundle = this.a.get();
        h.e(bundle, "arguments");
        String string = bundle.getString("username");
        h.c(string);
        return string;
    }
}
