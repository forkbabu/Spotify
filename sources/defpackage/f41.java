package defpackage;

import com.google.android.exoplayer2.y;
import com.spotify.mobile.android.audioplayer.domain.AudioFocusUpdate;
import com.spotify.mobile.android.audioplayer.domain.d;
import com.spotify.mobile.android.audioplayer.domain.g;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: f41  reason: default package */
public final class f41 {
    public static final q<d> a(y yVar, cqe cqe, s<g> sVar, s<AudioFocusUpdate> sVar2) {
        h.e(yVar, "exoPlayer");
        h.e(cqe, "clock");
        h.e(sVar, "previewPlayerCommandsEvents");
        h.e(sVar2, "audioFocusUpdates");
        h.e(yVar, "player");
        h.e(cqe, "clock");
        s y = s.y(new d41(cqe, yVar));
        h.d(y, "Observable.create<AudioP…er(eventListener) }\n    }");
        h.e(sVar, "previewPlayerCommandsEvents");
        h.e(cqe, "clock");
        s<R> j0 = sVar.j0(new e41(cqe));
        h.d(j0, "previewPlayerCommandsEve…lock.elapsedRealtime()) }");
        h.e(sVar2, "audioFocusUpdates");
        return i.a(y, j0, sVar2.j0(c41.a));
    }
}
