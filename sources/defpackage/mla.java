package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: mla  reason: default package */
public class mla {
    private final s<String> a;
    private final Context b;
    private final i c;

    public mla(s<String> sVar, Context context, i iVar) {
        this.a = sVar;
        this.b = context;
        this.c = iVar;
    }

    public s<Boolean> a() {
        return this.a.J0(new jla(this));
    }

    public /* synthetic */ void b(String str, boolean z) {
        SpSharedPreferences.a<Object> b2 = this.c.b(this.b, str).b();
        b2.a(ola.a, z);
        b2.j();
    }

    public /* synthetic */ v c(String str) {
        return s.i0(Boolean.valueOf(this.c.b(this.b, str).d(ola.a, true)));
    }

    public a d(boolean z) {
        return this.a.Y(new kla(this, z));
    }
}
