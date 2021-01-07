package com.spotify.music.features.quicksilver.utils;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.player.model.ContextTrack;
import dagger.android.g;

public class QuicksilverPlaybackService extends g {
    public static final /* synthetic */ int c = 0;
    Player a;
    private int b = -1;

    static void e(QuicksilverPlaybackService quicksilverPlaybackService, int i) {
        if (quicksilverPlaybackService.b == i) {
            quicksilverPlaybackService.stopSelf();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        this.b = i2;
        if (intent != null && intent.hasExtra(ContextTrack.Metadata.KEY_ENTITY_URI)) {
            String stringExtra = intent.getStringExtra(ContextTrack.Metadata.KEY_ENTITY_URI);
            this.a.play(PlayerContext.createFromContextUrl(stringExtra, "context://" + stringExtra), null, new i(this, i2, stringExtra));
            return 2;
        } else if (this.b != i2) {
            return 2;
        } else {
            stopSelf();
            return 2;
        }
    }
}
