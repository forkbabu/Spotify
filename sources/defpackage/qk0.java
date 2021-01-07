package defpackage;

import android.util.Pair;
import com.google.protobuf.u;
import com.spotify.contexts.Time;

/* access modifiers changed from: package-private */
/* renamed from: qk0  reason: default package */
public class qk0 implements fk0 {
    qk0() {
    }

    @Override // defpackage.fk0
    public u c() {
        Time.b i = Time.i();
        i.m(System.currentTimeMillis());
        return i.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_time";
    }
}
