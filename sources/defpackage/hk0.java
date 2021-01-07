package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.google.protobuf.u;
import com.spotify.contexts.InstallationId;

/* access modifiers changed from: package-private */
/* renamed from: hk0  reason: default package */
public class hk0 implements fk0 {
    private final ik0 a;

    hk0(ik0 ik0) {
        this.a = ik0;
    }

    @Override // defpackage.fk0
    public u c() {
        InstallationId.b i = InstallationId.i();
        i.m(ByteString.h(this.a.a().getBytes()));
        return i.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_installation_id";
    }
}
