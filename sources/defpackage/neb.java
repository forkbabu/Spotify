package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.ubi.specification.factories.q1;
import kotlin.jvm.internal.h;

/* renamed from: neb  reason: default package */
public final class neb implements meb {
    private final wlf<LegacyPlayerState> a;
    private final ere b;
    private final q1 c;

    public neb(wlf<LegacyPlayerState> wlf, ere ere, q1 q1Var) {
        h.e(wlf, "playerStateProvider");
        h.e(ere, "userBehaviourEventLogger");
        h.e(q1Var, "mobileLyricsEventFactory");
        this.a = wlf;
        this.b = ere;
        this.c = q1Var;
    }

    private final String f() {
        String trackUri = PlayerStateUtil.getTrackUri(this.a.get());
        h.d(trackUri, "PlayerStateUtil.getTrack…layerStateProvider.get())");
        return trackUri;
    }

    @Override // defpackage.meb
    public void a(String str, String str2, String str3) {
        je.x(str, "socialMediaId", str2, "lyrics", str3, "shareId");
        this.b.a(this.c.d(f()).c(str).a(str2, str3));
    }

    @Override // defpackage.meb
    public void b() {
        this.b.a(this.c.d(f()).d().a());
    }

    @Override // defpackage.meb
    public void c() {
        this.b.a(this.c.e(f()).c().a(""));
    }

    @Override // defpackage.meb
    public void d() {
        this.b.a(this.c.e(f()).b().a());
    }

    @Override // defpackage.meb
    public void e() {
        this.b.a(this.c.d(f()).b().a());
    }
}
