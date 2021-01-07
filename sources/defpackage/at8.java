package defpackage;

import android.os.Bundle;
import defpackage.us8;
import kotlin.jvm.internal.h;

/* renamed from: at8  reason: default package */
public final class at8 implements fjf<String> {
    private final wlf<Bundle> a;

    public at8(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Bundle bundle = this.a.get();
        us8.a aVar = us8.a;
        h.e(bundle, "arguments");
        String string = bundle.getString("topic_uri", "");
        h.d(string, "arguments.getString(Topi…agment.KEY_TOPIC_URI, \"\")");
        return string;
    }
}
