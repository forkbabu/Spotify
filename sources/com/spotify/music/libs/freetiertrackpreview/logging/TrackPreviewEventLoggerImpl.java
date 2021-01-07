package com.spotify.music.libs.freetiertrackpreview.logging;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.protobuf.u;
import com.spotify.messages.PreviousPlayingTrackResumed;
import com.spotify.messages.ShufflePlaySessionStarted;
import com.spotify.messages.TrackPreviewStarted;
import com.spotify.messages.TrackPreviewStopped;
import com.spotify.messages.TrackPreviewStoppedAppBackground;
import com.spotify.music.preview.v;
import com.spotify.music.preview.z;
import com.spotify.remoteconfig.f8;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class TrackPreviewEventLoggerImpl implements m, a {
    private final io.reactivex.disposables.a a;
    private z b = z.a;
    private boolean c;
    private final gl0<u> f;
    private final v n;
    private final f8 o;
    private final s<Boolean> p;

    /* compiled from: java-style lambda group */
    static final class a<T> implements g<z> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public final void accept(z zVar) {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ((TrackPreviewEventLoggerImpl) this.b).b = zVar;
                    return;
                }
                throw null;
            } else if (zVar.b()) {
                ((TrackPreviewEventLoggerImpl) this.b).c = false;
            }
        }
    }

    static final class b<T, R> implements l<Boolean, Boolean> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "appInForeground");
            return Boolean.valueOf(!bool2.booleanValue());
        }
    }

    static final class c<T> implements n<Boolean> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "appInBackground");
            return bool2.booleanValue();
        }
    }

    static final class d<T> implements g<Boolean> {
        final /* synthetic */ TrackPreviewEventLoggerImpl a;

        d(TrackPreviewEventLoggerImpl trackPreviewEventLoggerImpl) {
            this.a = trackPreviewEventLoggerImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            TrackPreviewEventLoggerImpl.e(this.a);
        }
    }

    public TrackPreviewEventLoggerImpl(gl0<u> gl0, v vVar, f8 f8Var, s<Boolean> sVar) {
        h.e(gl0, "eventPublisher");
        h.e(vVar, "previewPlayer");
        h.e(f8Var, "trackPreviewProperties");
        h.e(sVar, "appForegroundObservable");
        this.f = gl0;
        this.n = vVar;
        this.o = f8Var;
        this.p = sVar;
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        this.a = aVar;
        if (f8Var.a()) {
            aVar.b(vVar.g().E().N(new a(0, this)).subscribe(new a(1, this)));
            aVar.b(sVar.j0(b.a).Q(c.a).subscribe(new d(this)));
        }
    }

    public static final void e(TrackPreviewEventLoggerImpl trackPreviewEventLoggerImpl) {
        if (trackPreviewEventLoggerImpl.c) {
            String g = trackPreviewEventLoggerImpl.b.g();
            h.d(g, "previewPlayerState.previewId()");
            TrackPreviewStoppedAppBackground.b i = TrackPreviewStoppedAppBackground.i();
            i.m(g);
            trackPreviewEventLoggerImpl.f.c((TrackPreviewStoppedAppBackground) i.build());
            trackPreviewEventLoggerImpl.c = false;
        }
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.a
    public void a(String str) {
        h.e(str, "previewId");
        TrackPreviewStopped.b i = TrackPreviewStopped.i();
        i.m(str);
        this.f.c((TrackPreviewStopped) i.build());
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.a
    public void b(String str) {
        h.e(str, "trackUri");
        PreviousPlayingTrackResumed.b i = PreviousPlayingTrackResumed.i();
        i.m(str);
        this.f.c((PreviousPlayingTrackResumed) i.build());
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.a
    public void c(String str) {
        h.e(str, "contextUri");
        ShufflePlaySessionStarted.b i = ShufflePlaySessionStarted.i();
        i.m(str);
        this.f.c((ShufflePlaySessionStarted) i.build());
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.a
    public void d(String str) {
        h.e(str, "previewId");
        TrackPreviewStarted.b i = TrackPreviewStarted.i();
        i.m(str);
        this.f.c((TrackPreviewStarted) i.build());
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.a.f();
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        z zVar = this.b;
        h.d(zVar, "previewPlayerState");
        if (zVar.e() && this.o.a()) {
            this.c = true;
            this.n.h();
        }
    }
}
