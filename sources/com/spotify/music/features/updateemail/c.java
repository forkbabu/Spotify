package com.spotify.music.features.updateemail;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

public final class c implements blb {

    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, com.spotify.android.flags.c cVar, SessionState sessionState) {
            h.d(intent, "intent");
            Bundle extras = intent.getExtras();
            String str2 = null;
            String string = extras != null ? extras.getString("EXTRA_EMAIL") : null;
            if (true ^ (string == null || string.length() == 0)) {
                str2 = string;
            }
            UpdateEmailFragment updateEmailFragment = new UpdateEmailFragment();
            Bundle bundle = new Bundle();
            if (str2 != null) {
                bundle.putString("EXTRA_EMAIL", str2);
            }
            updateEmailFragment.r4(bundle);
            return updateEmailFragment;
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).i(LinkType.UPDATE_EMAIL_ADDRESS, "Show Update Email Fragment", a.a);
    }
}
