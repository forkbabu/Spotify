package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.w;
import dagger.android.f;
import java.io.IOException;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.y;

public class DynamicUpsellLoggerService extends f {
    w a;

    public DynamicUpsellLoggerService() {
        super("DynamicUpsellLoggerService");
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            Logger.l("Null intent passed to service.", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            Logger.l("No target defined.", new Object[0]);
            return;
        }
        y a2 = this.a.a();
        String uri = data.toString();
        a0.a aVar = new a0.a();
        aVar.j(uri);
        aVar.d();
        try {
            d0 h = a2.b(aVar.b()).h();
            Logger.l("Dynamic Upsell - Status: %s", h.f() == 200 ? "OK" : "NOT OK");
            if (h.a() != null) {
                h.a().close();
            }
        } catch (IOException unused) {
            Logger.l("Logging dynamic upsell failed", new Object[0]);
        }
    }
}
