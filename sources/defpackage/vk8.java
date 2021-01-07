package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.z;

/* renamed from: vk8  reason: default package */
public class vk8 implements uk8 {
    private final SpSharedPreferences.b<Object, Integer> a = SpSharedPreferences.b.e("key_spoton_onboarded");
    private final Context b;
    private final i c;
    private final g<SessionState> d;

    public vk8(Context context, i iVar, g<SessionState> gVar) {
        this.b = context;
        this.c = iVar;
        this.d = gVar;
    }

    @Override // defpackage.uk8
    public z<Boolean> a(int i) {
        return this.d.O(tk8.a).E().A(new rk8(this)).A(new qk8(this, i));
    }

    @Override // defpackage.uk8
    public a b() {
        return this.d.O(tk8.a).E().A(new pk8(this)).t(new sk8(this));
    }

    public /* synthetic */ SpSharedPreferences c(String str) {
        return this.c.b(this.b, str);
    }

    public e d(SpSharedPreferences spSharedPreferences) {
        int i = 0;
        try {
            i = spSharedPreferences.f(this.a, 0);
        } catch (Exception unused) {
        }
        SpSharedPreferences.a b2 = spSharedPreferences.b();
        b2.b(this.a, i + 1);
        b2.i();
        return b.a;
    }

    public /* synthetic */ SpSharedPreferences e(String str) {
        return this.c.b(this.b, str);
    }

    public Boolean f(int i, SpSharedPreferences spSharedPreferences) {
        int i2;
        boolean z = false;
        try {
            i2 = spSharedPreferences.f(this.a, 0);
        } catch (Exception unused) {
            i2 = 0;
        }
        if (i2 >= i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
