package com.spotify.music.features.playlist.participants;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

public final class a implements blb {

    /* renamed from: com.spotify.music.features.playlist.participants.a$a  reason: collision with other inner class name */
    static final class C0239a implements k {
        public static final C0239a a = new C0239a();

        C0239a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            h.e(l0Var, "link");
            String B = l0.A(l0Var.k()).B();
            if (B != null) {
                h.e(B, "playlistUri");
                Bundle bundle = new Bundle();
                bundle.putString("PLAYLIST_URI_KEY", B);
                PlaylistParticipantsFragment playlistParticipantsFragment = new PlaylistParticipantsFragment();
                playlistParticipantsFragment.r4(bundle);
                return playlistParticipantsFragment;
            }
            StringBuilder V0 = je.V0("Spotify uri is null for ");
            V0.append(l0Var.k());
            throw new IllegalArgumentException(V0.toString().toString());
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.PLAYLIST_PARTICIPANTS, "Show the playlist participants feature", C0239a.a);
    }
}
