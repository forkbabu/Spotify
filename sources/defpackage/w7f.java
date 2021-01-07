package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.VoiceExperienceSource;

/* renamed from: w7f  reason: default package */
public final class w7f {
    private final gl0<u> a;

    public w7f(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(v2f v2f) {
        gl0<u> gl0 = this.a;
        VoiceExperienceSource.b n = VoiceExperienceSource.n();
        n.p(v2f.g());
        n.n(v2f.c());
        n.o(v2f.e());
        gl0.c(n.build());
    }
}
