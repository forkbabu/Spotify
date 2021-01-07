package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.EndTrackPreview;
import com.spotify.messages.StartPreview;
import com.spotify.messages.StopPreview;

/* renamed from: rxc  reason: default package */
public class rxc implements qxc {
    private final gl0<u> a;

    public rxc(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // defpackage.qxc
    public void a(String str, String str2, long j) {
        EndTrackPreview.b m = EndTrackPreview.m();
        m.n(str);
        m.o(str2);
        m.m(j);
        this.a.c(m.build());
    }

    @Override // defpackage.qxc
    public void b(String str, String str2, long j) {
        StopPreview.b m = StopPreview.m();
        m.n(str);
        m.o(str2);
        m.m(j);
        this.a.c(m.build());
    }

    @Override // defpackage.qxc
    public void c(String str, String str2) {
        StartPreview.b l = StartPreview.l();
        l.m(str);
        l.n(str2);
        this.a.c(l.build());
    }
}
