package com.spotify.android.recaptcha;

import com.google.android.gms.common.api.ApiException;
import com.spotify.base.java.logging.Logger;
import com.spotify.rxjava2.p;

public class r implements q {
    private final i a;
    private final o b;
    private final l c;
    private final p d = new p();

    public r(l lVar, i iVar, o oVar) {
        this.c = lVar;
        this.a = iVar;
        this.b = oVar;
    }

    public void a(String str, String str2) {
        ((p) this.b).b(str);
        this.d.b(this.a.a(this.c.a(), str2).subscribe(new g(this, str), new h(this, str)));
    }

    public void b() {
        this.d.a();
    }

    public void c(String str, Exception exc) {
        if (exc != null) {
            if (exc instanceof ApiException) {
                ApiException apiException = (ApiException) exc;
                ((p) this.b).g(str, (long) apiException.b(), apiException.getMessage() == null ? "" : apiException.getMessage());
                return;
            }
            Logger.d(String.format("non ApiException Error: %s", exc.getMessage()), new Object[0]);
        }
    }

    public void d(String str, String str2) {
        ((p) this.b).h(str, str2);
    }

    public /* synthetic */ void e(String str, String str2) {
        ((p) this.b).c(str);
    }

    public /* synthetic */ void f(String str, Throwable th) {
        String str2;
        o oVar = this.b;
        if (th.getMessage() == null) {
            str2 = "";
        } else {
            str2 = th.getMessage();
        }
        ((p) oVar).a(str, str2);
    }
}
