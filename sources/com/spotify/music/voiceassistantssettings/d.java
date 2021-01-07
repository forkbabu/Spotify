package com.spotify.music.voiceassistantssettings;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

public final class d implements blb {

    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            return new VoiceAssistantsSettingsFragment();
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.VOICE_ASSISTANTS_SETTINGS, "Voice assistants settings fragment", a.a);
    }
}
