package defpackage;

import android.util.Log;
import com.spotify.eventsender.u;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: eg3  reason: default package */
final class eg3 implements kl0 {
    final u a = new u();

    eg3() {
    }

    @Override // defpackage.kl0
    public void a(Throwable th, String str) {
        this.a.getClass();
        Log.e("EventSender", str, th);
        Assertion.w("Error in EventSender", th);
    }

    @Override // defpackage.kl0
    public /* synthetic */ void b(String str, Object... objArr) {
        jl0.a(this, str, objArr);
    }

    @Override // defpackage.kl0
    public void d(String str) {
        this.a.getClass();
    }

    @Override // defpackage.kl0
    public void w(String str) {
        this.a.getClass();
    }
}
