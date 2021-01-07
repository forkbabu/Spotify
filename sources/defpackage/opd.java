package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties;

/* renamed from: opd  reason: default package */
public final class opd implements fjf<npd> {
    private final wlf<AndroidLibsYourLibraryFlagsProperties> a;

    public opd(wlf<AndroidLibsYourLibraryFlagsProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new npd(this.a.get());
    }
}
