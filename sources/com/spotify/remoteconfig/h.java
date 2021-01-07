package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties;
import com.spotify.remoteconfig.kh;

public final /* synthetic */ class h implements o0e {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop playlistLayoutWorkshop = AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop.LIST;
        boolean a2 = p0e.a("android-libs-your-library-flags", "your_library_persist_active_tab", false);
        int c = p0e.c("android-libs-your-library-flags", "your_library_persist_active_tab_duration_in_hours", 0, 87600, 0);
        boolean a3 = p0e.a("android-libs-your-library-flags", "your_library_settings_button_in_header_enabled", false);
        kh.b bVar = new kh.b();
        bVar.b(playlistLayoutWorkshop);
        bVar.c(false);
        bVar.d(0);
        bVar.e(false);
        bVar.b((AndroidLibsYourLibraryFlagsProperties.PlaylistLayoutWorkshop) p0e.b("android-libs-your-library-flags", "playlist_layout_workshop", playlistLayoutWorkshop));
        bVar.c(a2);
        bVar.d(c);
        bVar.e(a3);
        AndroidLibsYourLibraryFlagsProperties a4 = bVar.a();
        if (a4.c() >= 0 && a4.c() <= 87600) {
            return a4;
        }
        throw new IllegalArgumentException("Value for yourLibraryPersistActiveTabDurationInHours() out of bounds");
    }
}
