package com.spotify.mobile.android.recentlyplayed;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.recentlyplayed.model.DeleteModel;
import dagger.android.f;
import io.reactivex.android.schedulers.a;
import java.util.concurrent.TimeUnit;

public class RecentlyPlayedService extends f {
    public static final /* synthetic */ int b = 0;
    fb1 a;

    public RecentlyPlayedService() {
        super("RecentlyPlayedService");
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.spotify.mobile.android.recentlyplayed.service.RecentlyPlayedService.action.HIDE".equals(action)) {
            if (!this.a.b(new DeleteModel(intent.getStringArrayExtra("uris"))).A(a.b()).j(3000, TimeUnit.MILLISECONDS)) {
                Logger.d("Failed to hide recently played item", new Object[0]);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(je.y0("Unsupported action ", action, " in RecentlyPlayedService."));
    }
}
