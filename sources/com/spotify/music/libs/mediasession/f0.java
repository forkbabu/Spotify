package com.spotify.music.libs.mediasession;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.s;
import com.spotify.mobile.android.util.Assertion;

public class f0 implements e0 {
    private final MediaSessionCompat a;

    public f0(MediaSessionCompat mediaSessionCompat) {
        this.a = mediaSessionCompat;
    }

    @Override // com.spotify.music.libs.mediasession.e0
    public String h() {
        s d = this.a.d();
        if (d == null) {
            Assertion.g("Controller Info is Null");
        }
        String a2 = d.a();
        if (a2 == null) {
            Assertion.g("Calling package name is Null");
        }
        return a2;
    }
}
