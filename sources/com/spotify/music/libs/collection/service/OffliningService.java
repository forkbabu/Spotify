package com.spotify.music.libs.collection.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import dagger.android.f;

public class OffliningService extends f {
    FireAndForgetResolver a;

    public OffliningService() {
        super("OffliningService");
    }

    public static void a(Context context, String str, boolean z) {
        Intent y = je.y(context, OffliningService.class, "uri", str);
        y.putExtra("state", z);
        y.setAction("com.spotify.mobile.android.spotlets.collection.service.OffliningService.action.UPDATE");
        context.startService(y);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.spotify.mobile.android.spotlets.collection.service.OffliningService.action.UPDATE".equals(action)) {
            this.a.resolve(new Request(intent.getBooleanExtra("state", false) ? Request.POST : Request.DELETE, String.format("sp://offline/v1/resources?uri=%s", Uri.encode(intent.getStringExtra("uri")))));
            return;
        }
        throw new IllegalArgumentException(je.y0("Unsupported action ", action, " in OffliningService."));
    }
}
