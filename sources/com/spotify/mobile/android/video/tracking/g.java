package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.v;

public class g extends i {
    private final gl0<u> O;
    private final d0 P;
    private final y Q;
    private final String R;
    private String S = "unknown";
    private float T;
    private StreamingType U = StreamingType.UNKNOWN;
    private Optional<Long> V = Optional.absent();

    public g(d0 d0Var, cqe cqe, y yVar, String str, gl0<u> gl0) {
        super(d0Var, cqe);
        this.P = d0Var;
        this.Q = yVar;
        this.R = t72.b(d0Var).or((Optional<String>) str);
        this.O = gl0;
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void b(j0 j0Var, long j, long j2) {
        super.b(j0Var, j, j2);
        if (j0Var.d() > 0) {
            this.T = ((float) j0Var.e()) / ((float) j0Var.d());
        }
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void m(boolean z, long j) {
        super.m(z, j);
        this.S = t72.a(this.Q.a());
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        super.p(vVar, reasonEnd, j, j2);
        f A = A(Optional.of(Long.valueOf(j)));
        if (!"appload".equals(this.P.a("endvideo_reason_start", "")) || A.j() >= 100) {
            String a = t72.a(this.Q.a());
            BetamaxPlaybackSession.b C0 = BetamaxPlaybackSession.C0();
            C0.R(this.P.d());
            C0.r(this.R);
            C0.x(this.P.b());
            C0.s(this.P.f());
            C0.S(A.u());
            C0.C(F().or((Optional<Long>) -1L).longValue());
            C0.L(this.V.or((Optional<Long>) 0L).longValue());
            C0.M(L().or((Optional<Long>) -1L).longValue());
            C0.F(K().or((Optional<Long>) -1L).longValue());
            C0.D(G().or((Optional<Long>) -1L).longValue());
            C0.E(A.g());
            C0.y(A.c());
            C0.z(A.d());
            C0.A(A.e());
            C0.B(A.f());
            C0.Q(A.s());
            C0.O(A.q());
            C0.P(A.r());
            C0.G(A.j());
            C0.J(A.i());
            C0.H(A.k());
            C0.I(A.l());
            C0.K(A.m());
            C0.T(this.U.d());
            C0.o(this.S);
            C0.n(a);
            C0.t(I());
            C0.p(H().or((Optional<EncryptionType>) EncryptionType.NONE).toString());
            C0.v(0);
            C0.u(D() / 1000);
            C0.N((long) E());
            int ordinal = reasonEnd.ordinal();
            C0.q(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "unknown" : "shutdown" : AppProtocol.LogMessage.SEVERITY_ERROR : "requested-end" : "played-to-end");
            C0.m(this.T);
            C0.w(J());
            this.O.c((BetamaxPlaybackSession) C0.build());
        }
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        super.q(streamingType, j, j2);
        this.U = streamingType;
        if (!this.V.isPresent()) {
            this.V = Optional.of(Long.valueOf(j));
        }
    }
}
