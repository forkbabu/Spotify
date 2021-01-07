package com.spotify.music.mainactivity;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.navigation.BackNavigationInteractionType;
import com.spotify.music.navigation.i;
import com.spotify.music.navigation.r;

public class l {
    private final i a;
    private final r b;

    public l(i iVar, r rVar) {
        this.a = iVar;
        this.b = rVar;
    }

    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("fragment_key");
        Fragment u = this.a.u();
        if (u instanceof s) {
            s sVar = (s) u;
            if (stringExtra == null || stringExtra.equals(sVar.i0())) {
                this.b.a(BackNavigationInteractionType.NO_BUTTON_PRESSED);
            }
        }
    }
}
