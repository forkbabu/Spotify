package defpackage;

import android.os.Build;
import android.util.Pair;
import com.google.protobuf.u;
import com.spotify.contexts.DeviceAndroid;
import com.spotify.eventsender.t;

/* access modifiers changed from: package-private */
/* renamed from: dk0  reason: default package */
public class dk0 implements fk0 {
    private final t a;

    dk0(t tVar) {
        this.a = tVar;
    }

    @Override // defpackage.fk0
    public u c() {
        DeviceAndroid.b p = DeviceAndroid.p();
        p.n(Build.MANUFACTURER);
        p.p(Build.VERSION.RELEASE);
        p.q(Build.VERSION.SDK_INT);
        p.o(Build.MODEL);
        p.m(this.a.a());
        return p.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_device_android";
    }
}
