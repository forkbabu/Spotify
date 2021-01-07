package com.spotify.music.libs.mediasession;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.music.internal.receiver.MediaButtonReceiver;

public class o0 {
    private final Context a;
    private final pea b;

    public o0(Context context, pea pea) {
        this.a = context;
        this.b = pea;
    }

    public n0 a(l0 l0Var) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(new ComponentName(this.a.getPackageName(), MediaButtonReceiver.class.getName()));
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a.getApplicationContext(), 0, intent, 0);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.a, "spotify-media-session", new ComponentName(this.a, MediaButtonReceiver.class), broadcast);
        mediaSessionCompat.n(broadcast);
        pea pea = this.b;
        d0 d0Var = new d0(l0Var, pea);
        return new s0(new j0(this.a, mediaSessionCompat, l0Var, pea, new f0(mediaSessionCompat), d0Var));
    }
}
