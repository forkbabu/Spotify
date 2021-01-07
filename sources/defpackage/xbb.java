package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* renamed from: xbb  reason: default package */
public final class xbb implements wbb {
    private final AndroidLibsYourLibraryXFlagsProperties a;

    public xbb(AndroidLibsYourLibraryXFlagsProperties androidLibsYourLibraryXFlagsProperties) {
        h.e(androidLibsYourLibraryXFlagsProperties, "properties");
        this.a = androidLibsYourLibraryXFlagsProperties;
    }

    @Override // defpackage.wbb
    public boolean a() {
        return this.a.g();
    }

    @Override // defpackage.wbb
    public String b() {
        String value = this.a.b().value();
        h.d(value, "properties.defaultViewDensity().value()");
        Locale locale = Locale.ROOT;
        h.d(locale, "Locale.ROOT");
        String upperCase = value.toUpperCase(locale);
        h.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // defpackage.wbb
    public String c() {
        String value = this.a.a().value();
        h.d(value, "properties.defaultSortOption().value()");
        Locale locale = Locale.ROOT;
        h.d(locale, "Locale.ROOT");
        String upperCase = value.toUpperCase(locale);
        h.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // defpackage.wbb
    public boolean d() {
        return this.a.d();
    }

    @Override // defpackage.wbb
    public int e() {
        return this.a.f();
    }

    @Override // defpackage.wbb
    public int f() {
        return this.a.e();
    }

    @Override // defpackage.wbb
    public boolean g() {
        return false;
    }
}
