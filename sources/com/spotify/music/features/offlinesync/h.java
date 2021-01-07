package com.spotify.music.features.offlinesync;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.core.app.k;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.music.features.offlinesync.e;

public class h implements e.a {
    private final Context a;
    private final l2e b;
    private final String c;
    private k d;

    public h(Context context, l2e l2e, String str) {
        context.getClass();
        this.a = context;
        l2e.getClass();
        this.b = l2e;
        this.c = str;
    }

    @Override // com.spotify.music.features.offlinesync.e.a
    public void a(OfflineProgressModel offlineProgressModel) {
        if (!offlineProgressModel.isSyncing() || offlineProgressModel.getQueuedTracks() <= 0) {
            this.d = null;
            this.b.b(C0707R.id.notification_sync);
            return;
        }
        if (this.d == null) {
            this.d = new k(this.a, "spotify_updates_channel");
        }
        Intent intent = new Intent();
        intent.setClassName(this.a, this.c);
        PendingIntent activity = PendingIntent.getActivity(this.a, 0, intent, 0);
        Resources resources = this.a.getResources();
        k kVar = this.d;
        kVar.h(activity);
        kVar.j(resources.getString(C0707R.string.notification_syncing_title));
        kVar.i(resources.getQuantityString(C0707R.plurals.notification_syncing_text, offlineProgressModel.getTotalTracks(), Integer.valueOf(offlineProgressModel.getSyncedTracks()), Integer.valueOf(offlineProgressModel.getTotalTracks()), Integer.valueOf(Math.round(offlineProgressModel.getPercentComplete()))));
        kVar.D(resources.getString(C0707R.string.notification_syncing_title));
        kVar.z(17301633);
        kVar.u(true);
        kVar.v(true);
        kVar.x(100, Math.round(offlineProgressModel.getPercentComplete()), false);
        kVar.g(a.b(this.a, C0707R.color.notification_bg_color));
        this.b.e(C0707R.id.notification_sync, this.d.a());
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.d = null;
        this.b.b(C0707R.id.notification_sync);
    }
}
