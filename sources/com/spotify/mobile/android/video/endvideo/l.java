package com.spotify.mobile.android.video.endvideo;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent;
import com.spotify.mobile.android.video.endvideo.n;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.f0;
import com.spotify.mobile.android.video.tracking.f;
import com.spotify.mobile.android.video.tracking.i;
import com.spotify.mobile.android.video.tracking.k;
import com.spotify.mobile.android.video.tracking.q;
import com.spotify.player.model.ContextTrack;
import io.reactivex.disposables.b;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class l extends i {
    private final i O;
    private final LinkedBlockingQueue<PendingEndVideoEvent> P = new LinkedBlockingQueue<>();
    private final io.reactivex.functions.a Q = new a();
    private final d0 R;
    private final cqe S;
    private final y T;
    private final p U;
    private final o V;
    private final String W;
    private final gl0<u> X;
    private volatile PendingMessageResponse Y;
    private volatile b Z;
    private volatile boolean a0;
    private long b0 = -1;
    private b72 c0;
    private Optional<ConnectionType> d0 = Optional.absent();
    private Optional<ConnectionType> e0 = Optional.absent();
    private d0 f0;
    private final f0 g0;
    private boolean h0;
    private final io.reactivex.y i0;
    private Optional<Long> j0 = Optional.absent();

    class a implements io.reactivex.functions.a {
        a() {
        }

        @Override // io.reactivex.functions.a
        public void run() {
            if (l.this.Z != null) {
                l.this.Z.dispose();
            }
            l.this.S();
        }
    }

    public l(d0 d0Var, a0 a0Var, f0 f0Var, String str, cqe cqe, y yVar, i iVar, gl0<u> gl0, io.reactivex.y yVar2, p pVar, o oVar) {
        super(d0Var, cqe);
        this.R = d0Var;
        this.g0 = f0Var;
        this.W = str;
        this.S = cqe;
        this.T = yVar;
        this.O = iVar;
        this.X = gl0;
        this.i0 = yVar2;
        this.U = pVar;
        this.V = oVar;
        this.c0 = a0Var.c() ? z62.e : z62.f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void S() {
        Long l;
        if ((this.Z == null || this.Z.d()) && !this.P.isEmpty()) {
            PendingEndVideoEvent poll = this.P.poll();
            PendingMessageResponse pendingMessageResponse = this.Y;
            if (poll.b() == PendingEndVideoEvent.Kind.CREATE_IF_NOT_EXISTS && this.Y == null) {
                this.Z = this.O.a().o0(this.i0).I(this.Q).subscribe(new f(this), new e(this));
            } else if (poll.b() == PendingEndVideoEvent.Kind.UPDATE) {
                if (pendingMessageResponse == null || pendingMessageResponse.sequenceId == null || (l = pendingMessageResponse.sequenceNumber) == null) {
                    this.X.c(q.c(this.R, this.W, new EndVideoReportException("Could not update pending message because a previous creation of pending message failed.")));
                } else {
                    this.Z = this.O.c(l.longValue(), poll.c().a(pendingMessageResponse.sequenceNumber.longValue(), pendingMessageResponse.sequenceId)).o0(this.i0).I(this.Q).subscribe(new d(this, poll), new a(this));
                }
            } else if (poll.b() == PendingEndVideoEvent.Kind.SEND) {
                if (pendingMessageResponse == null || pendingMessageResponse.sequenceId == null || pendingMessageResponse.sequenceNumber == null) {
                    poll.e();
                    this.X.c(q.c(this.R, this.W, new EndVideoReportException("Could not send pending message because a previous creation of pending message failed.")));
                } else if (this.a0) {
                    poll.e();
                    this.X.c(q.c(this.R, this.W, new EndVideoReportException("Processing send event for EndVideo already sent.")));
                } else {
                    this.Z = this.O.b(pendingMessageResponse.sequenceNumber.longValue()).o0(this.i0).I(this.Q).J(new h(poll)).subscribe(new c(this), new g(this, poll));
                }
            }
            S();
        }
    }

    private n T(f fVar, b72 b72) {
        String str;
        String str2;
        n.b bVar = new n.b(this.R.c().get("endvideo_playback_id"));
        bVar.R0(this.R.d());
        bVar.h0(this.R.a("media.manifest_id", ""));
        bVar.Y(this.R.a("endvideo_context_uri", ""));
        bVar.b0(this.R.a("endvideo_feature_identifier", ""));
        bVar.c0(this.R.a("endvideo_feature_version", ""));
        bVar.d0(this.R.a("endvideo_device_identifier", ""));
        bVar.C0(this.R.a("endvideo_track_uri", ""));
        long j = 0;
        bVar.M0(this.j0.or((Optional<Long>) 0L).longValue());
        bVar.G0(this.R.a("endvideo_reason_start", ""));
        bVar.S0(this.R.a("endvideo_view_uri", ""));
        bVar.I0("com.spotify");
        bVar.H0(this.R.a("endvideo_referrer_identifier", ""));
        bVar.J0(this.R.a("endvideo_feature_version", ""));
        bVar.E0(this.R.a("endvideo_provider", ""));
        bVar.B0(this.R.a(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID, ""));
        bVar.f0(this.R.a(ContextTrack.Metadata.KEY_INTERACTION_ID, ""));
        bVar.F0(b72);
        bVar.Z(H().orNull());
        Iterator<k<com.spotify.mobile.android.video.events.y>> it = M().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            k<com.spotify.mobile.android.video.events.y> next = it.next();
            if (next.a().isPresent()) {
                str = next.a().get().b();
                break;
            }
        }
        bVar.X(str);
        Iterator<k<j0>> it2 = N().iterator();
        while (true) {
            if (!it2.hasNext()) {
                str2 = "";
                break;
            }
            k<j0> next2 = it2.next();
            if (next2.a().isPresent()) {
                str2 = next2.a().get().b();
                break;
            }
        }
        bVar.Q0(str2);
        bVar.e0((long) fVar.u());
        bVar.g0(this.S.d());
        bVar.j0(fVar.f());
        bVar.i0(fVar.d());
        bVar.l0(fVar.g());
        bVar.k0(fVar.l());
        bVar.n0(L().or((Optional<Long>) -1L).longValue());
        bVar.r0(fVar.j());
        bVar.q0(fVar.i());
        bVar.s0(fVar.k());
        bVar.y0(fVar.q());
        bVar.z0(fVar.r());
        bVar.t0(fVar.n());
        bVar.u0(fVar.o());
        bVar.A0(fVar.s());
        bVar.x0(fVar.p());
        bVar.p0(fVar.h());
        bVar.P0(fVar.b());
        bVar.v0(F().or((Optional<Long>) -1L).longValue());
        bVar.o0(K().or((Optional<Long>) -1L).longValue());
        bVar.m0(G().or((Optional<Long>) -1L).longValue());
        bVar.w0(this.b0);
        Optional<ConnectionType> optional = this.d0;
        ConnectionType connectionType = ConnectionType.CONNECTION_TYPE_UNKNOWN;
        bVar.L0(optional.or((Optional<ConnectionType>) connectionType));
        bVar.a0(this.e0.or((Optional<ConnectionType>) connectionType));
        bVar.N0(((uv8) this.U).d().or((Optional<String>) ""));
        bVar.D0(((wv8) this.V).a());
        bVar.K0(false);
        long j2 = fVar.j();
        long j3 = 0;
        for (k<j0> kVar : N()) {
            if (!kVar.a().isPresent()) {
                j3 += kVar.b().or((Optional<Long>) 0L).longValue();
            }
        }
        long j4 = j2 - j3;
        if (j4 != 0) {
            for (k<j0> kVar2 : N()) {
                if (kVar2.a().isPresent()) {
                    double a2 = (double) kVar2.a().get().a();
                    double longValue = (double) kVar2.b().or((Optional<Long>) 0L).longValue();
                    double d = (double) j4;
                    Double.isNaN(longValue);
                    Double.isNaN(d);
                    Double.isNaN(longValue);
                    Double.isNaN(d);
                    Double.isNaN(longValue);
                    Double.isNaN(d);
                    Double.isNaN(a2);
                    Double.isNaN(a2);
                    Double.isNaN(a2);
                    j += (long) ((longValue / d) * a2);
                }
            }
        }
        bVar.O0(j);
        return new n(bVar, null);
    }

    private void b0(Optional<Long> optional, String str) {
        n T2 = T(A(optional), this.c0);
        if (T2.b()) {
            if (this.Y == null) {
                this.P.add(PendingEndVideoEvent.a());
            }
            this.P.add(PendingEndVideoEvent.g(T2, str));
            S();
        }
    }

    public void U(PendingMessageResponse pendingMessageResponse) {
        if (pendingMessageResponse == null || pendingMessageResponse.sequenceNumber == null || pendingMessageResponse.sequenceId == null) {
            this.X.c(q.c(this.R, this.W, new EndVideoReportException("Could not create pending message. Invalid cosmos response.")));
            return;
        }
        this.Y = pendingMessageResponse;
    }

    public void V(Throwable th) {
        this.X.c(q.c(this.R, this.W, new EndVideoReportException("Could not create pending message.")));
    }

    public void W(PendingEndVideoEvent pendingEndVideoEvent, Response response) {
        if (response.getStatus() != 200) {
            StringBuilder sb = new StringBuilder("Error trying to update pending end video, status code ");
            sb.append(response.getStatus());
            sb.append(". Reason for update: ");
            sb.append(pendingEndVideoEvent.d());
            if (this.Y != null) {
                sb.append(". Sequence number: ");
                sb.append(this.Y.sequenceNumber);
                sb.append(". Sequence id: ");
                sb.append(this.Y.sequenceId);
            } else {
                sb.append(". No EndVideoMessageId");
            }
            this.X.c(q.c(this.R, this.W, new EndVideoReportException(sb.toString())));
        }
    }

    public void X(Throwable th) {
        this.X.c(q.c(this.R, this.W, new EndVideoReportException("Could not update pending message.")));
    }

    public void Y(Response response) {
        if (response.getStatus() != 200) {
            StringBuilder V0 = je.V0("Could not send pending message, got status code ");
            V0.append(response.getStatus());
            this.X.c(q.c(this.R, this.W, new EndVideoReportException(V0.toString())));
            return;
        }
        this.a0 = true;
    }

    public void Z(PendingEndVideoEvent pendingEndVideoEvent, Throwable th) {
        this.X.c(q.c(this.R, this.W, new EndVideoReportException("Could not send pending message.")));
        pendingEndVideoEvent.e();
    }

    public /* synthetic */ void a0(long j) {
        b0(Optional.of(Long.valueOf(j)), "fiften-seconds");
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void c(long j) {
        this.c0 = z62.e;
        b0(Optional.absent(), "resumed");
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void e(long j, long j2) {
        super.e(j, j2);
        if (!this.h0) {
            this.h0 = true;
            ((com.spotify.mobile.android.video.exo.f) this.g0).c(15, j, new b(this));
        }
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void m(boolean z, long j) {
        super.m(z, j);
        this.d0 = Optional.of(this.T.a());
        b0(Optional.absent(), "started");
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void n(d0 d0Var, long j) {
        this.f0 = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r3 != 3) goto L_0x0054;
     */
    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(com.spotify.mobile.android.video.v r2, com.spotify.mobile.android.video.events.ReasonEnd r3, long r4, long r6) {
        /*
            r1 = this;
            z62 r0 = defpackage.z62.g
            super.p(r2, r3, r4, r6)
            com.spotify.mobile.android.util.connectivity.y r6 = r1.T
            com.spotify.mobile.android.util.connectivity.ConnectionType r6 = r6.a()
            com.google.common.base.Optional r6 = com.google.common.base.Optional.of(r6)
            r1.e0 = r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.common.base.Optional r4 = com.google.common.base.Optional.of(r4)
            com.spotify.mobile.android.video.tracking.f r4 = r1.A(r4)
            com.spotify.mobile.android.video.d0 r5 = r1.f0
            if (r5 == 0) goto L_0x003c
            java.util.Map r3 = r5.c()
            java.lang.String r6 = "endvideo_reason_start"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0054
            java.util.Map r3 = r5.c()
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            a72 r0 = defpackage.a72.b(r3)
            goto L_0x0054
        L_0x003c:
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0052
            r5 = 1
            if (r3 == r5) goto L_0x004f
            r5 = 2
            if (r3 == r5) goto L_0x004c
            r5 = 3
            if (r3 == r5) goto L_0x004f
            goto L_0x0054
        L_0x004c:
            z62 r0 = defpackage.z62.d
            goto L_0x0054
        L_0x004f:
            z62 r0 = defpackage.z62.b
            goto L_0x0054
        L_0x0052:
            z62 r0 = defpackage.z62.c
        L_0x0054:
            com.spotify.mobile.android.video.endvideo.n r3 = r1.T(r4, r0)
            boolean r4 = r3.b()
            if (r4 != 0) goto L_0x005f
            goto L_0x0087
        L_0x005f:
            com.spotify.mobile.android.video.v$b r2 = r2.d()
            com.spotify.mobile.android.video.endvideo.PendingMessageResponse r4 = r1.Y
            if (r4 != 0) goto L_0x0070
            java.util.concurrent.LinkedBlockingQueue<com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent> r4 = r1.P
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent r5 = com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.a()
            r4.add(r5)
        L_0x0070:
            java.util.concurrent.LinkedBlockingQueue<com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent> r4 = r1.P
            java.lang.String r5 = "send-report"
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent r3 = com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.g(r3, r5)
            r4.add(r3)
            java.util.concurrent.LinkedBlockingQueue<com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent> r3 = r1.P
            com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent r2 = com.spotify.mobile.android.video.endvideo.PendingEndVideoEvent.f(r2)
            r3.add(r2)
            r1.S()
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.endvideo.l.p(com.spotify.mobile.android.video.v, com.spotify.mobile.android.video.events.ReasonEnd, long, long):void");
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        super.q(streamingType, j, j2);
        if (!this.j0.isPresent()) {
            this.j0 = Optional.of(Long.valueOf(j));
        }
        try {
            long parseLong = Long.parseLong(this.R.c().get("endvideo_command_initiated_time_ms"));
            this.b0 = parseLong > 0 ? this.S.d() - parseLong : -1;
        } catch (NumberFormatException e) {
            Logger.c(e, "Unparseable commandInitiatedTime in playback metadata", new Object[0]);
        }
        b0(this.j0, "started");
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void x(long j, long j2) {
        super.x(j, j2);
        this.c0 = z62.f;
        b0(Optional.of(Long.valueOf(j)), "paused");
    }
}
