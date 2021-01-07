package com.spotify.pushnotifications;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.disposables.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.x;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class g implements n {
    static final SpSharedPreferences.b<Object, String> g = SpSharedPreferences.b.c("current_push_token");
    static final SpSharedPreferences.b<Object, Long> h = SpSharedPreferences.b.c("last_push_token_update_time");
    private final i a;
    private final a b = new a();
    private final o c;
    private final yzd d;
    private final SpSharedPreferences<Object> e;
    private final cqe f;

    public g(i iVar, o oVar, yzd yzd, SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = iVar;
        this.c = oVar;
        this.d = yzd;
        this.e = spSharedPreferences;
        this.f = cqe;
    }

    @Override // com.spotify.pushnotifications.n
    public void a() {
        a aVar = this.b;
        i iVar = this.a;
        iVar.getClass();
        aVar.b(new x(z.g(new f(iVar)).N().W(1, Functions.b()), null).subscribe(new d(this), new c(this)));
    }

    @Override // com.spotify.pushnotifications.n
    public void b(String str) {
        String m = this.e.m(g, "");
        long days = TimeUnit.MILLISECONDS.toDays(this.f.d() - this.e.j(h, Long.MAX_VALUE));
        if (!str.equals(m) || days >= 7) {
            this.b.b(this.c.a(str).subscribe(new a(this, str), new b(this)));
        }
    }

    @Override // com.spotify.pushnotifications.n
    public void c() {
        this.b.f();
    }

    public /* synthetic */ void d(Throwable th) {
        String format = String.format("Fetching FCM token failed with error %s", th.getMessage());
        Logger.n("errorMessage", new Object[0]);
        this.d.d(format);
    }

    public /* synthetic */ void e(String str) {
        Logger.b("Pushka Token registration successful", new Object[0]);
        this.d.f();
        SpSharedPreferences.a<Object> b2 = this.e.b();
        b2.f(g, str);
        b2.e(h, this.f.d());
        b2.i();
    }

    public /* synthetic */ void f(Throwable th) {
        String format = String.format("Updating token failed with error %s", th.getMessage());
        Logger.b(format, new Object[0]);
        this.d.d(format);
    }
}
