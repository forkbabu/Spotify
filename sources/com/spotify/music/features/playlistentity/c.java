package com.spotify.music.features.playlistentity;

import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import io.reactivex.z;

public final /* synthetic */ class c implements vkb {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // defpackage.vkb
    public final z a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        String B = l0.z(intent.getDataString()).B();
        B.getClass();
        return z.z(elb.d(PlaylistFragment.K4(B, false, false, Optional.absent())));
    }
}
