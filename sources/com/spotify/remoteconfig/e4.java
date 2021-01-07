package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;
import com.spotify.remoteconfig.fi;

public final /* synthetic */ class e4 implements o0e {
    public static final /* synthetic */ e4 a = new e4();

    private /* synthetic */ e4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AppsMusicLibsRemoteconfigProperties.RcAaTestProperty rcAaTestProperty = AppsMusicLibsRemoteconfigProperties.RcAaTestProperty.TIGGER;
        AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel settingsDebugLabel = AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel.DEBUG_TOOLS;
        AppsMusicLibsRemoteconfigProperties.SimpleMessageTest simpleMessageTest = AppsMusicLibsRemoteconfigProperties.SimpleMessageTest.DEFAULT;
        fi.b bVar = new fi.b();
        bVar.b(rcAaTestProperty);
        bVar.c(settingsDebugLabel);
        bVar.d(simpleMessageTest);
        bVar.b((AppsMusicLibsRemoteconfigProperties.RcAaTestProperty) p0e.b("apps-music-libs-remoteconfig", "rc_aa_test_property", rcAaTestProperty));
        bVar.c((AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel) p0e.b("apps-music-libs-remoteconfig", "settings_debug_label", settingsDebugLabel));
        bVar.d((AppsMusicLibsRemoteconfigProperties.SimpleMessageTest) p0e.b("apps-music-libs-remoteconfig", "simple_message_test", simpleMessageTest));
        return bVar.a();
    }
}
