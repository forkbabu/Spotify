package defpackage;

import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: ue6  reason: default package */
public final class ue6 implements fjf<te6> {
    private final wlf<HomeMixFormatListAttributesHelper> a;

    public ue6(wlf<HomeMixFormatListAttributesHelper> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new te6(this.a.get());
    }
}
