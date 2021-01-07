package defpackage;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;

/* renamed from: r8c  reason: default package */
public class r8c {
    private final AndroidLibsOfflineTrialsProperties a;

    public r8c(AndroidLibsOfflineTrialsProperties androidLibsOfflineTrialsProperties) {
        this.a = androidLibsOfflineTrialsProperties;
    }

    public AndroidLibsOfflineTrialsProperties.OfflineDailyCap a() {
        return this.a.a();
    }

    public boolean b() {
        int ordinal = this.a.a().ordinal();
        return ordinal == 1 || ordinal == 2;
    }

    public boolean c() {
        return this.a.c();
    }
}
