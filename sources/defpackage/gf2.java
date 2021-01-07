package defpackage;

import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.superbird.earcon.EarconEndpoints;
import com.spotify.music.appprotocol.superbird.presets.PresetsEndpoints;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: gf2  reason: default package */
public class gf2 implements a, bh2 {
    private final List<bh2> a;
    private final List<a> b;
    private final rg2 c;

    public gf2(vh2 vh2, PresetsEndpoints presetsEndpoints, hg2 hg2, lf2 lf2, uf2 uf2, zg2 zg2, kh2 kh2, EarconEndpoints earconEndpoints, if2 if2, mh2 mh2, ch2 ch2, rg2 rg2) {
        h.e(vh2, "voiceEndpoints");
        h.e(presetsEndpoints, "presetsEndpoints");
        h.e(hg2, "otaEndpoints");
        h.e(lf2, "deviceRegistrationEndpoints");
        h.e(uf2, "instrumentationEndpoints");
        h.e(zg2, "remoteConfigEndpoints");
        h.e(kh2, "tipsAndTricksEndpoints");
        h.e(earconEndpoints, "earconEndpoints");
        h.e(if2, "crashReportingEndpoints");
        h.e(mh2, "ttsEndpoints");
        h.e(ch2, "setupEndpoints");
        h.e(rg2, "pitstopEndpoints");
        this.c = rg2;
        this.a = d.u(hg2, vh2);
        this.b = d.u(vh2, presetsEndpoints, kh2, hg2, lf2, uf2, zg2, rg2, earconEndpoints, if2, mh2, ch2);
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(qg0);
        }
    }

    @Override // defpackage.bh2
    public void b() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // defpackage.bh2
    public void c() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }
}
