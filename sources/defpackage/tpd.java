package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties;

/* renamed from: tpd  reason: default package */
public class tpd {
    private final AndroidLibsYourLibraryMusicPagesFlagsProperties a;
    private final lbb b;

    public tpd(AndroidLibsYourLibraryMusicPagesFlagsProperties androidLibsYourLibraryMusicPagesFlagsProperties, lbb lbb) {
        this.a = androidLibsYourLibraryMusicPagesFlagsProperties;
        this.b = lbb;
    }

    public boolean a() {
        return this.a.c();
    }

    public boolean b() {
        return this.a.d() || this.a.e() != AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource.NONE;
    }

    public boolean c() {
        return this.a.e() == AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource.SUBJECTIVE;
    }

    public boolean d() {
        return this.b.a();
    }

    public int e() {
        return this.a.i();
    }

    public int f() {
        return this.a.h();
    }

    public boolean g() {
        return this.a.a() == AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource.COLLECTION;
    }

    public boolean h() {
        return this.a.f() == AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType.QUICKSCROLL_WITH_HANDLER;
    }

    public boolean i() {
        return this.a.g() == AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary.QUICKSCROLL_WITH_HANDLER;
    }

    public boolean j() {
        return this.a.f() == AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType.QUICKSCROLL_WITHOUT_HANDLER;
    }

    public boolean k() {
        return this.a.g() == AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary.QUICKSCROLL_WITHOUT_HANDLER;
    }

    public boolean l() {
        return this.a.b();
    }
}
