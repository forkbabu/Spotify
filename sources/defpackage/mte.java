package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.VoiceLatency;
import com.spotify.messages.VoiceLibraryAudioInput;
import com.spotify.messages.VoiceLibraryError;
import com.spotify.messages.VoiceLibraryResult;
import com.spotify.messages.VoiceLibraryStatus;

/* renamed from: mte  reason: default package */
public class mte {
    private final gl0<u> a;

    mte(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(ote ote) {
        gl0<u> gl0 = this.a;
        VoiceLibraryAudioInput.b m = VoiceLibraryAudioInput.m();
        m.o(ote.c());
        m.n(ote.b());
        m.m(ote.d());
        gl0.c(m.build());
    }

    public void b(ute ute) {
        gl0<u> gl0 = this.a;
        VoiceLibraryError.b o = VoiceLibraryError.o();
        o.q(ute.e());
        o.p(ute.b());
        o.n(ute.d().toString());
        o.o(ute.f().b());
        o.m(ute.c());
        gl0.c(o.build());
    }

    public void c(vte vte) {
        gl0<u> gl0 = this.a;
        VoiceLatency.b m = VoiceLatency.m();
        m.o(vte.c());
        m.m(vte.b());
        gl0.c(m.build());
    }

    public void d(wte wte) {
        gl0<u> gl0 = this.a;
        VoiceLibraryResult.b l = VoiceLibraryResult.l();
        l.n(wte.c());
        l.m(wte.b());
        gl0.c(l.build());
    }

    public void e(xte xte) {
        gl0<u> gl0 = this.a;
        VoiceLibraryStatus.b o = VoiceLibraryStatus.o();
        o.q(xte.d());
        o.p(xte.c());
        o.o(xte.e());
        o.n(xte.f());
        o.m(xte.b());
        gl0.c(o.build());
    }
}
