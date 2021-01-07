package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.VoiceExperienceSource;

/* renamed from: s0f  reason: default package */
public final class s0f {
    private final gl0<u> a;

    public s0f(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(cve cve) {
        gl0<u> gl0 = this.a;
        VoiceExperienceSource.b n = VoiceExperienceSource.n();
        n.p(cve.h());
        n.n(cve.e());
        n.o(cve.f());
        n.m(cve.a());
        gl0.c(n.build());
    }
}
