package com.spotify.music.lyrics.share.common.sharebutton;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.y;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private a a;
    public LyricsWrapper b;
    public ContextTrack c;
    private q d = new q();
    private final wdb e;
    private final seb f;
    private final afb g;
    private final g<PlayerState> h;
    private final y i;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<List<? extends o8e>, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(List<? extends o8e> list) {
            List<? extends o8e> list2 = list;
            h.e(list2, "it");
            return Boolean.valueOf(!list2.isEmpty());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.lyrics.share.common.sharebutton.b$b  reason: collision with other inner class name */
    public static final class C0307b<T> implements io.reactivex.functions.g<Boolean> {
        final /* synthetic */ b a;
        final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.b b;

        C0307b(b bVar, com.spotify.music.lyrics.core.experience.contract.b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            a a2;
            if (bool.booleanValue() && (a2 = this.a.a()) != null) {
                c cVar = new c(this);
                ShareButton shareButton = (ShareButton) a2;
                h.e(cVar, "listener");
                shareButton.setOnClickListener(cVar);
                shareButton.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements io.reactivex.functions.g<Throwable> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "throwable");
            Logger.e(th2, "Something went wrong", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements n<PlayerState> {
        public static final d a = new d();

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "playerState");
            Optional<ContextTrack> track = playerState2.track();
            h.d(track, "playerState.track()");
            return track.isPresent();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements l<PlayerState, Optional<ContextTrack>> {
        public static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Optional<ContextTrack> apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "obj");
            return playerState2.track();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements io.reactivex.functions.g<PlayerState> {
        final /* synthetic */ b a;

        f(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "playerState");
            b bVar = this.a;
            ContextTrack contextTrack = playerState2.track().get();
            h.d(contextTrack, "playerState.track().get()");
            ContextTrack contextTrack2 = contextTrack;
            bVar.getClass();
            h.e(contextTrack2, "<set-?>");
            bVar.c = contextTrack2;
        }
    }

    public b(wdb wdb, seb seb, afb afb, g<PlayerState> gVar, y yVar) {
        h.e(wdb, "configuration");
        h.e(seb, "navigator");
        h.e(afb, "socialFlow");
        h.e(gVar, "playerStateFlowable");
        h.e(yVar, "scheduler");
        this.e = wdb;
        this.f = seb;
        this.g = afb;
        this.h = gVar;
        this.i = yVar;
    }

    public final a a() {
        return this.a;
    }

    public void b(int i2) {
        Bundle bundle = new Bundle();
        LyricsWrapper lyricsWrapper = this.b;
        if (lyricsWrapper != null) {
            bundle.putParcelable("lyrics", lyricsWrapper.getLyrics());
            LyricsWrapper lyricsWrapper2 = this.b;
            if (lyricsWrapper2 != null) {
                bundle.putParcelable("colors", lyricsWrapper2.getColors());
                ContextTrack contextTrack = this.c;
                if (contextTrack != null) {
                    String str = contextTrack.metadata().get("artist_name");
                    ContextTrack contextTrack2 = this.c;
                    if (contextTrack2 != null) {
                        String str2 = contextTrack2.metadata().get("title");
                        ContextTrack contextTrack3 = this.c;
                        if (contextTrack3 != null) {
                            String e2 = kxd.e(contextTrack3);
                            ContextTrack contextTrack4 = this.c;
                            if (contextTrack4 != null) {
                                bundle.putParcelable("track_infos", new reb(str, str2, e2, contextTrack4.uri()));
                                bundle.putInt("start_y", i2);
                                this.f.a(bundle);
                                return;
                            }
                            h.k(AppProtocol.TrackData.TYPE_TRACK);
                            throw null;
                        }
                        h.k(AppProtocol.TrackData.TYPE_TRACK);
                        throw null;
                    }
                    h.k(AppProtocol.TrackData.TYPE_TRACK);
                    throw null;
                }
                h.k(AppProtocol.TrackData.TYPE_TRACK);
                throw null;
            }
            h.k("lyricsWrapper");
            throw null;
        }
        h.k("lyricsWrapper");
        throw null;
    }

    public void c(a aVar, com.spotify.music.lyrics.core.experience.contract.b bVar, LyricsWrapper lyricsWrapper) {
        h.e(bVar, "lyricsViewBinder");
        h.e(lyricsWrapper, "lyricsWrapper");
        if (aVar != null) {
            this.a = aVar;
            this.b = lyricsWrapper;
            if (this.e.a()) {
                this.d.b(this.g.d().A(a.a).B(this.i).subscribe(new C0307b(this, bVar), c.a), this.h.C(d.a).u(e.a).Q(this.i).subscribe(new f(this)));
            }
        }
    }

    public void d() {
        a aVar;
        if (this.e.a() && (aVar = this.a) != null) {
            ((ShareButton) aVar).setVisibility(8);
        }
        this.d.c();
    }
}
