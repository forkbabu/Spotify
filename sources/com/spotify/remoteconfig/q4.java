package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties;
import com.spotify.remoteconfig.mh;

public final /* synthetic */ class q4 implements o0e {
    public static final /* synthetic */ q4 a = new q4();

    private /* synthetic */ q4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption defaultSortOption = AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption.RECENTLY_PLAYED;
        AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption defaultSortOption2 = (AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption) p0e.b("android-libs-your-library-x-flags", "default_sort_option", defaultSortOption);
        AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity defaultViewDensity = AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity.LIST;
        AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity defaultViewDensity2 = (AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity) p0e.b("android-libs-your-library-x-flags", "default_view_density", defaultViewDensity);
        boolean a2 = p0e.a("android-libs-your-library-x-flags", "enable_your_library_x", false);
        boolean a3 = p0e.a("android-libs-your-library-x-flags", "hide_most_relevant_sort_option", true);
        int c = p0e.c("android-libs-your-library-x-flags", "page_size", 1, Integer.MAX_VALUE, 200);
        int c2 = p0e.c("android-libs-your-library-x-flags", "page_threshold", 0, Integer.MAX_VALUE, 40);
        boolean a4 = p0e.a("android-libs-your-library-x-flags", "pin_to_top_enabled", false);
        mh.b bVar = new mh.b();
        bVar.b(defaultSortOption);
        bVar.c(defaultViewDensity);
        bVar.d(false);
        bVar.e(true);
        bVar.f(200);
        bVar.g(40);
        bVar.h(false);
        bVar.b(defaultSortOption2);
        bVar.c(defaultViewDensity2);
        bVar.d(a2);
        bVar.e(a3);
        bVar.f(c);
        bVar.g(c2);
        bVar.h(a4);
        AndroidLibsYourLibraryXFlagsProperties a5 = bVar.a();
        if (a5.e() < 1 || a5.e() > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Value for pageSize() out of bounds");
        } else if (a5.f() >= 0 && a5.f() <= Integer.MAX_VALUE) {
            return a5;
        } else {
            throw new IllegalArgumentException("Value for pageThreshold() out of bounds");
        }
    }
}
