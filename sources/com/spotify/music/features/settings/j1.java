package com.spotify.music.features.settings;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.facebook.FacebookConnectFragment;

public class j1 implements blb {
    /* access modifiers changed from: private */
    public static s a(l0 l0Var, c cVar, SessionState sessionState) {
        int i = FacebookConnectFragment.l0;
        l0Var.getClass();
        if (Uri.parse("https://open.spotify.com/" + l0Var.a).getQueryParameterNames().contains("facebook-connect")) {
            return new FacebookConnectFragment();
        }
        int i2 = SettingsFragment.m1;
        Bundle bundle = new Bundle();
        String currentUserName = sessionState.currentUserName();
        currentUserName.getClass();
        bundle.putString("username", currentUserName);
        xa1 paymentState = sessionState.paymentState();
        String productType = sessionState.productType();
        boolean z = true;
        boolean z2 = productType.equalsIgnoreCase("premium") && paymentState.b();
        boolean equalsIgnoreCase = "premium".equalsIgnoreCase(productType);
        boolean equals = "KR".equals(sessionState.countryCode());
        if ((!z2 && equalsIgnoreCase) || equals) {
            z = false;
        }
        bundle.putBoolean("premium_button_visible", z);
        SettingsFragment settingsFragment = new SettingsFragment();
        settingsFragment.r4(bundle);
        d.a(settingsFragment, cVar);
        return settingsFragment;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.CONFIG, "Settings", j0.a);
        xkb.i(LinkType.SETTINGS, "Settings", k0.a);
    }
}
