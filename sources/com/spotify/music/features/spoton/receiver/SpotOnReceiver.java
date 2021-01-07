package com.spotify.music.features.spoton.receiver;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.spoton.SpotOnAction;
import com.spotify.music.features.spoton.service.SpotOnService;
import dagger.android.a;
import dagger.android.d;

public class SpotOnReceiver extends d {
    private static final String b = SpotOnReceiver.class.getSimpleName();
    h2e a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SpotOnAction spotOnAction = SpotOnAction.NONE;
        Logger.g("onReceive: %s", intent);
        a.c(this, context);
        SpotOnAction spotOnAction2 = "com.spotify.music.features.spoton.ACTION_PLAY_SPOTIFY".equals(intent.getAction()) ? SpotOnAction.PLAY : spotOnAction;
        if (spotOnAction2 != spotOnAction) {
            String stringExtra = intent.getStringExtra("com.spotify.music.features.spoton.extras.CLIENT_ID");
            String stringExtra2 = intent.getStringExtra("com.spotify.music.features.spoton.extras.BRAND");
            String stringExtra3 = intent.getStringExtra("com.spotify.music.features.spoton.extras.MODEL");
            String stringExtra4 = intent.getStringExtra("com.spotify.music.features.spoton.extras.VERSION");
            String stringExtra5 = intent.getStringExtra("com.spotify.music.features.spoton.extras.DEVICE_NAME");
            int i = SpotOnService.w;
            Intent intent2 = new Intent(context, SpotOnService.class);
            intent2.putExtra("action", spotOnAction2);
            intent2.putExtra("pending-intent", (PendingIntent) intent.getParcelableExtra("com.spotify.music.features.spoton.extras.PENDING_INTENT"));
            intent2.putExtra("client-id", stringExtra);
            intent2.putExtra("brand", stringExtra2);
            intent2.putExtra("model", stringExtra3);
            intent2.putExtra("version", stringExtra4);
            intent2.putExtra("device-name", stringExtra5);
            this.a.b(context, intent2, b, new Object[0]);
        }
    }
}
