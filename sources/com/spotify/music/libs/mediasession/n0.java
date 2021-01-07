package com.spotify.music.libs.mediasession;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* access modifiers changed from: package-private */
public interface n0 {
    void a();

    void b(i0 i0Var);

    void c();

    boolean d();

    void e(Bundle bundle);

    void f(MediaMetadataCompat mediaMetadataCompat);

    void g(PlaybackStateCompat playbackStateCompat);

    MediaSessionCompat.Token getToken();

    MediaSessionCompat h();

    void start();

    void stop();
}
