package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.nlu.ttsresolve.v1.ResolveRequest$AudioFormat;
import com.spotify.nlu.voiceview.v1.VoiceRequest;
import com.spotify.player.controls.c;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.play.f;
import com.spotify.voice.api.l;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import com.spotify.voice.interaction.v1.InteractionRequest;
import defpackage.p2f;
import defpackage.q2f;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Set;
import kotlin.collections.d;

/* renamed from: k7f  reason: default package */
public final class k7f {
    private static s<q2f> a(l lVar, p7f p7f, String str, VoiceRequest voiceRequest) {
        return p7f.a(str, voiceRequest).P().j0(a3f.a).j0(p4f.a).h(q2f.c.class).N(new o6f(lVar)).h(q2f.class).r0(y2f.a);
    }

    static /* synthetic */ v b(l lVar, p7f p7f, String str, Set set, p2f.a aVar) {
        VoiceRequest.b l = VoiceRequest.l();
        l.n(ResolveRequest$AudioFormat.MP3);
        InteractionRequest.b p = InteractionRequest.p();
        p.q(InteractionRequest.InteractionEvent.GENERIC_ACTION);
        p.r(lVar.b());
        p.p(true);
        p.n("action", "SKIP_TURN");
        p.n("reason", "TIME_EXPIRED");
        p.m(d.v(set, i5f.a));
        l.m((InteractionRequest) p.build());
        return a(lVar, p7f, str, (VoiceRequest) l.build());
    }

    static /* synthetic */ v c(l lVar, p7f p7f, String str, ExperimentsViewFactory.Experiment experiment, Set set, p2f.w wVar) {
        VoiceRequest.b l = VoiceRequest.l();
        l.n(ResolveRequest$AudioFormat.MP3);
        InteractionRequest.b p = InteractionRequest.p();
        p.q(InteractionRequest.InteractionEvent.GENERIC_ACTION);
        p.r(lVar.b());
        p.p(true);
        p.n("action", "SAVE");
        p.o(experiment.i());
        p.m(d.v(set, l5f.a));
        l.m((InteractionRequest) p.build());
        return a(lVar, p7f, str, (VoiceRequest) l.build());
    }

    static v d(q7f q7f, f fVar, com.spotify.player.controls.d dVar, a8f a8f, p2f.l lVar) {
        lVar.getClass();
        return i(q7f.b(null), fVar, dVar, null, 0, null, a8f);
    }

    static /* synthetic */ v e(l lVar, p7f p7f, String str, ExperimentsViewFactory.Experiment experiment, Set set, p2f.c cVar) {
        VoiceRequest.b l = VoiceRequest.l();
        l.n(ResolveRequest$AudioFormat.MP3);
        InteractionRequest.b p = InteractionRequest.p();
        p.q(InteractionRequest.InteractionEvent.GENERIC_ACTION);
        p.r(lVar.b());
        p.p(true);
        p.n("action", cVar.a());
        p.o(experiment.i());
        p.m(d.v(set, v5f.a));
        l.m((InteractionRequest) p.build());
        return a(lVar, p7f, str, (VoiceRequest) l.build());
    }

    static v g(q7f q7f, f fVar, com.spotify.player.controls.d dVar, a8f a8f, p2f.k kVar) {
        a dismiss = q7f.dismiss();
        kVar.getClass();
        return i(dismiss, fVar, dVar, null, 0, null, a8f);
    }

    static /* synthetic */ v h(l lVar, p7f p7f, String str, ExperimentsViewFactory.Experiment experiment, Set set, p2f.t tVar) {
        VoiceRequest.b l = VoiceRequest.l();
        l.n(ResolveRequest$AudioFormat.MP3);
        InteractionRequest.b p = InteractionRequest.p();
        p.p(true);
        p.q(InteractionRequest.InteractionEvent.ENTER_DIALOG);
        p.o(experiment.i());
        p.m(d.v(set, b6f.a));
        l.m((InteractionRequest) p.build());
        return a(lVar, p7f, str, (VoiceRequest) l.build());
    }

    /* access modifiers changed from: private */
    public static s<q2f> i(a aVar, f fVar, com.spotify.player.controls.d dVar, String str, int i, String str2, a8f a8f) {
        if (MoreObjects.isNullOrEmpty(str)) {
            return dVar.a(c.e()).p(new m4f(a8f, str2)).t(new t4f(aVar)).N();
        }
        return fVar.a(PlayCommand.create(Context.fromUri(str), PlayOrigin.create("voice"))).p(new c4f(a8f, str2)).E(new k4f(new y4f(a8f, str2, str))).v(new o4f(i)).Y(new s4f(aVar)).g(s.i0(q2f.g()));
    }
}
