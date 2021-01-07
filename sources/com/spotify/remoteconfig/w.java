package com.spotify.remoteconfig;

import com.spotify.remoteconfig.NotificationSettingsProperties;
import com.spotify.remoteconfig.ti;

public final /* synthetic */ class w implements o0e {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("notification-settings", "show_email_first", false);
        NotificationSettingsProperties.StartingPage startingPage = NotificationSettingsProperties.StartingPage.COMBINED;
        ti.b bVar = new ti.b();
        bVar.b(false);
        bVar.c(startingPage);
        bVar.b(a2);
        bVar.c((NotificationSettingsProperties.StartingPage) p0e.b("notification-settings", "starting_page", startingPage));
        return bVar.a();
    }
}
