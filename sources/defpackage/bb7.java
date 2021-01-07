package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.podcast.episode.transcript.ui.page.TranscriptFragment;
import com.spotify.remoteconfig.m6;
import kotlin.jvm.internal.h;

/* renamed from: bb7  reason: default package */
public final class bb7 implements blb {
    private final m6 a;

    /* renamed from: bb7$a */
    public static final class a implements flb {
        final /* synthetic */ bb7 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bb7 bb7) {
            this.a = bb7;
        }

        @Override // defpackage.flb
        public elb a(Intent intent, c cVar, SessionState sessionState) {
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (!this.a.a.a() || extras == null) {
                elb a2 = elb.a();
                h.d(a2, "NavigateAction.doNothing()");
                return a2;
            }
            h.e(extras, "bundle");
            TranscriptFragment transcriptFragment = new TranscriptFragment();
            transcriptFragment.r4(extras);
            elb d = elb.d(transcriptFragment);
            h.d(d, "NavigateAction.pushFragm…Extras)\n                )");
            return d;
        }
    }

    public bb7(m6 m6Var) {
        h.e(m6Var, "episodeTranscriptProperties");
        this.a = m6Var;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).k(mlb.b(LinkType.SHOW_EPISODE_TRANSCRIPT), "Episode Transcript", new fkb(new a(this)));
    }
}
