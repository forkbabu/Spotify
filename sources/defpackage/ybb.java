package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties;

/* renamed from: ybb  reason: default package */
public final class ybb implements fjf<xbb> {
    private final wlf<AndroidLibsYourLibraryXFlagsProperties> a;

    public ybb(wlf<AndroidLibsYourLibraryXFlagsProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xbb(this.a.get());
    }
}
