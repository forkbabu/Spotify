package defpackage;

import android.util.Pair;
import com.google.protobuf.u;
import com.spotify.contexts.Sdk;

/* access modifiers changed from: package-private */
/* renamed from: ok0  reason: default package */
public class ok0 implements fk0 {
    ok0() {
    }

    @Override // defpackage.fk0
    public u c() {
        Sdk.b i = Sdk.i();
        i.m("0.7.0");
        return i.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_sdk";
    }
}
