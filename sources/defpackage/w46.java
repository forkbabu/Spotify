package defpackage;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: w46  reason: default package */
public final class w46 implements fjf<v46> {
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> a;
    private final wlf<m56> b;
    private final wlf<y56> c;

    public w46(wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf, wlf<m56> wlf2, wlf<y56> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v46(this.a, this.b, this.c);
    }
}
