package com.spotify.music.features.quicksilver.utils;

import android.content.Intent;
import android.net.Uri;
import androidx.core.app.s;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.w;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import dagger.android.a;
import java.io.IOException;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.y;

public class QuicksilverLoggerService extends s {
    w q;
    jz1 r;
    ColdStartTracker s;

    private void f(y yVar, a0 a0Var, String str) {
        d0 h = yVar.b(a0Var).h();
        Logger.l("QuicksilverLoggerService - Status: %s", h.f() == 200 ? "OK" : "NOT OK");
        if (!(h.f() == 200 || str == null)) {
            this.r.a(new x91(str, a0Var.k().toString(), (long) h.f(), h.q(), ""));
        }
        if (h.a() != null) {
            h.a().close();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.f
    public void d(Intent intent) {
        this.s.o(getClass().getSimpleName());
        Logger.g("Running QuicksilverLoggerService.", new Object[0]);
        Uri data = intent.getData();
        if (data == null) {
            Logger.l("No target defined.", new Object[0]);
            return;
        }
        String uri = data.toString();
        a0.a aVar = new a0.a();
        aVar.j(uri);
        aVar.d();
        try {
            f(this.q.a(), aVar.b(), intent.getStringExtra("error_log_type"));
        } catch (IOException unused) {
            Logger.l("Logging dynamic upsell failed", new Object[0]);
        }
    }

    @Override // androidx.core.app.s, androidx.core.app.f, android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }
}
