package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.o;

/* renamed from: xx5  reason: default package */
public class xx5 implements wx5 {
    private final o a;
    private final Context b;

    public xx5(o oVar, Context context) {
        this.a = oVar;
        this.b = context;
    }

    @Override // defpackage.wx5
    public PendingIntent a(String str, String str2) {
        Intent c = this.a.c(this.b, "com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION");
        c.putExtra("uri", str);
        c.putExtra("context_source", str2);
        return PendingIntent.getService(this.b, 0, c, 134217728);
    }

    @Override // defpackage.wx5
    public PendingIntent b(String str, String str2) {
        Intent c = this.a.c(this.b, "com.spotify.mobile.android.service.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION");
        c.putExtra("uri", str);
        c.putExtra("context_source", str2);
        return PendingIntent.getService(this.b, 0, c, 134217728);
    }

    @Override // defpackage.wx5
    public PendingIntent c(String str, String str2) {
        Intent c = this.a.c(this.b, "com.spotify.mobile.android.service.action.player.NOTIFICATION_BAN");
        c.putExtra("uri", str);
        c.putExtra("context_source", str2);
        return PendingIntent.getService(this.b, 0, c, 134217728);
    }

    @Override // defpackage.wx5
    public PendingIntent d(String str, String str2) {
        Intent c = this.a.c(this.b, "com.spotify.mobile.android.service.action.player.NOTIFICATION_UNBAN");
        c.putExtra("uri", str);
        c.putExtra("context_source", str2);
        return PendingIntent.getService(this.b, 0, c, 134217728);
    }
}
