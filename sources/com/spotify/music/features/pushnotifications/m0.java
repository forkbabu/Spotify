package com.spotify.music.features.pushnotifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.o;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.UUID;

public class m0 {
    private final Context a;
    private final o b;

    public m0(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
    }

    private PendingIntent g(Intent intent) {
        return PendingIntent.getService(this.a, UUID.randomUUID().hashCode(), intent, 134217728);
    }

    public PendingIntent a(int i, String str, String str2) {
        Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_PUSH_ACTIONS");
        c.putExtra("push_data", lv7.create(i, str, str2));
        return g(c);
    }

    public PendingIntent b(int i, String str, String str2) {
        Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_PUSH_ACTIONS");
        c.putExtra("push_data", rv7.create(i, str, str2));
        return g(c);
    }

    public PendingIntent c(int i, String str, String str2) {
        Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.URL_OPEN");
        mv7 b2 = mv7.b(i, str, str2);
        c.setData(Uri.parse(ViewUris.M1.toString()));
        c.putExtra("push_data", b2);
        return g(c);
    }

    public PendingIntent d(int i, boolean z, String str, String str2, String str3) {
        Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.URL_OPEN");
        if (!MoreObjects.isNullOrEmpty(str)) {
            c.setData(Uri.parse(str));
        }
        c.putExtra("push_data", nv7.b(i, str2, str3, str, z));
        return g(c);
    }

    public PendingIntent e(int i, String str, String str2, String str3) {
        Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_PUSH_ACTIONS");
        if (!MoreObjects.isNullOrEmpty(str)) {
            c.setData(Uri.parse(str));
        }
        c.putExtra("push_data", ov7.create(i, str2, str3, str));
        return g(c);
    }

    public PendingIntent f(int i, String str, String str2, String str3) {
        Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_PUSH_ACTIONS");
        if (!MoreObjects.isNullOrEmpty(str)) {
            c.setData(Uri.parse(str));
        }
        c.putExtra("push_data", qv7.create(i, str2, str3, str));
        return g(c);
    }
}
