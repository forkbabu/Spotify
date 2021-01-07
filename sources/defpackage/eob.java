package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: eob  reason: default package */
public final class eob implements cqd {
    private final fob a;
    private final wlf<lob> b;

    public eob(fob fob, wlf<lob> wlf) {
        this.a = fob;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<lob> wlf = this.b;
        wlf.getClass();
        return new dob(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "audio_ads_mode";
    }
}
