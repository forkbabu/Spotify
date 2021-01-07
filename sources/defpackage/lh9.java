package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import kotlin.jvm.internal.h;

/* renamed from: lh9  reason: default package */
public final class lh9 implements kh9 {
    private static final SpSharedPreferences.b<Object, String> c;
    private static final SpSharedPreferences.b<Object, String> d;
    private final SpSharedPreferences<Object> a;
    private final wbb b;

    static {
        SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.e("YourLibraryX.sortOption");
        h.d(e, "SpSharedPreferences.Pref…YourLibraryX.sortOption\")");
        c = e;
        SpSharedPreferences.b<Object, String> e2 = SpSharedPreferences.b.e("YourLibraryX.viewDensity");
        h.d(e2, "SpSharedPreferences.Pref…ourLibraryX.viewDensity\")");
        d = e2;
    }

    public lh9(SpSharedPreferences<Object> spSharedPreferences, wbb wbb) {
        h.e(spSharedPreferences, "preferences");
        h.e(wbb, "flags");
        this.a = spSharedPreferences;
        this.b = wbb;
    }

    @Override // defpackage.kh9
    public void a(YourLibraryXSortOption yourLibraryXSortOption) {
        h.e(yourLibraryXSortOption, "sortOption");
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(c, yourLibraryXSortOption.name());
        b2.i();
    }

    @Override // defpackage.kh9
    public void b(YourLibraryXViewMode yourLibraryXViewMode) {
        h.e(yourLibraryXViewMode, "viewDensity");
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(d, yourLibraryXViewMode.name());
        b2.i();
    }

    @Override // defpackage.kh9
    public YourLibraryXSortOption c() {
        String m = this.a.m(c, this.b.c());
        Object obj = YourLibraryXSortOption.RECENTLY_PLAYED;
        if (m != null) {
            try {
                Object valueOf = Enum.valueOf(YourLibraryXSortOption.class, m);
                h.d(valueOf, "java.lang.Enum.valueOf(T::class.java, type)");
                obj = valueOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        return (YourLibraryXSortOption) obj;
    }

    @Override // defpackage.kh9
    public YourLibraryXViewMode d() {
        String m = this.a.m(d, this.b.b());
        Object obj = YourLibraryXViewMode.a;
        if (m != null) {
            try {
                Object valueOf = Enum.valueOf(YourLibraryXViewMode.class, m);
                h.d(valueOf, "java.lang.Enum.valueOf(T::class.java, type)");
                obj = valueOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        return (YourLibraryXViewMode) obj;
    }
}
