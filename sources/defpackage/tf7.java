package defpackage;

import android.os.Bundle;
import defpackage.rf7;
import kotlin.jvm.internal.h;

/* renamed from: tf7  reason: default package */
public final class tf7 implements fjf<String> {
    private final wlf<Bundle> a;

    public tf7(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Bundle bundle = this.a.get();
        rf7.a aVar = rf7.a;
        h.e(bundle, "bundle");
        String string = bundle.getString("show_uri", "");
        h.d(string, "bundle.getString(Notific…nt.SHOW_URI_ARGUMENT, \"\")");
        return string;
    }
}
