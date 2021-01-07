package defpackage;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import kotlin.jvm.internal.h;

/* renamed from: mh9  reason: default package */
public final class mh9 implements kh9 {
    @Override // defpackage.kh9
    public void a(YourLibraryXSortOption yourLibraryXSortOption) {
        h.e(yourLibraryXSortOption, "sortOption");
    }

    @Override // defpackage.kh9
    public void b(YourLibraryXViewMode yourLibraryXViewMode) {
        h.e(yourLibraryXViewMode, "viewDensity");
    }

    @Override // defpackage.kh9
    public YourLibraryXSortOption c() {
        return YourLibraryXSortOption.RECENTLY_PLAYED;
    }

    @Override // defpackage.kh9
    public YourLibraryXViewMode d() {
        return YourLibraryXViewMode.a;
    }
}
