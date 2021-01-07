package com.spotify.music.nowplaying.drivingmode.presenter.voice;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.drivingmode.loggers.d;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeVoiceFragment;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.b;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.DrivingVoiceView;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.c;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.voice.api.model.m;
import com.spotify.voice.api.n;
import defpackage.awb;
import defpackage.uvb;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class j implements b.a, zvb {
    private static final Pattern v = Pattern.compile(".*?play\\s", 2);
    public static final /* synthetic */ int w = 0;
    private final wlf<Player> a;
    private final n b;
    private final y c;
    private final fwb d;
    private final h e;
    private final faa f;
    private final d g;
    private final nfd h;
    private final g<PlayerState> i;
    private boolean j;
    private wvb k;
    private b l;
    private c m;
    private com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.b n;
    private io.reactivex.disposables.b o;
    private io.reactivex.disposables.b p;
    private io.reactivex.disposables.b q;
    private PlayerContext r;
    private DrivingVoiceState s = DrivingVoiceState.LISTENING;
    private String t = "";
    private String u;

    public j(wlf<Player> wlf, n nVar, y yVar, fwb fwb, h hVar, faa faa, d dVar, nfd nfd, g<PlayerState> gVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.o = emptyDisposable;
        this.p = emptyDisposable;
        this.q = emptyDisposable;
        this.a = wlf;
        this.b = nVar;
        this.c = yVar;
        this.d = fwb;
        this.e = hVar;
        this.f = faa;
        this.g = dVar;
        this.h = nfd;
        this.i = gVar;
    }

    private void e() {
        this.l.setMicButtonEnabled(true);
    }

    @Override // defpackage.zvb
    public void a(awb awb, String str) {
        ArrayList arrayList;
        e();
        this.u = str;
        this.s = DrivingVoiceState.SUCCESS;
        String e2 = awb.e();
        String[] split = v.split(e2);
        if (split.length > 1) {
            e2 = split[1];
        }
        String format = String.format("Play: %s", e2);
        wvb wvb = this.k;
        List<awb.a> d2 = awb.d();
        if (d2 != null) {
            arrayList = new ArrayList(d2.size());
            for (awb.a aVar : d2) {
                uvb.a a2 = uvb.a();
                a2.a(aVar.d());
                a2.d(aVar.c());
                a2.b(aVar.a());
                a2.c(aVar.b());
                arrayList.add(a2.build());
            }
        } else {
            arrayList = null;
        }
        ((DrivingVoiceView) wvb).d0(arrayList, format);
        if (awb.b()) {
            String a3 = awb.d().get(0).a();
            this.r = PlayerContext.createFromContextUrl(a3, "context://" + a3);
        }
    }

    @Override // defpackage.zvb
    public void b() {
        e();
        this.s = DrivingVoiceState.ERROR;
        ((DrivingVoiceView) this.k).W();
    }

    @Override // defpackage.zvb
    public void c() {
        this.l.setMicButtonEnabled(false);
        this.s = DrivingVoiceState.ERROR;
        ((DrivingVoiceView) this.k).b0();
    }

    @Override // defpackage.zvb
    public void d(float f2) {
        com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.b bVar = this.n;
        if (bVar != null) {
            bVar.setVoiceAudioPeak(f2);
        }
    }

    public void f() {
        int ordinal = this.s.ordinal();
        if (ordinal == 1) {
            ifd ifd = kfd.T;
            l0 z = l0.z(this.r.uri());
            if (x.e(z.q())) {
                this.q = this.f.f(PreparePlayOptions.builder().build(), PlayOrigin.builder(ifd.toString()).viewUri(ViewUris.B.toString()).build(), Collections.emptyMap()).subscribe(b.a, new c(this));
            } else if (x.i(z)) {
                this.h.c(new String[]{z.F()}, ViewUris.B, false, true, -1, ifd, bu9.g, null);
            } else {
                this.a.get().play(this.r, null);
            }
            this.p = this.i.s().O(f.a).C(new e(this)).h0(1).subscribe(new d(this));
        } else if (ordinal == 2 && this.j) {
            this.a.get().resume();
        }
    }

    public void g(Throwable th) {
        this.l.setMicButtonEnabled(false);
        this.s = DrivingVoiceState.ERROR;
        ((DrivingVoiceView) this.k).b0();
    }

    public /* synthetic */ boolean h(Optional optional) {
        return optional.isPresent() && this.u != null && !((String) optional.get()).equals(this.t);
    }

    public void i(Optional optional) {
        this.g.c(this.u, (String) optional.get());
        this.t = (String) optional.get();
    }

    public void j() {
        this.g.e();
        m();
    }

    public void k(wvb wvb, b bVar, c cVar, com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.b bVar2) {
        this.k = wvb;
        this.l = bVar;
        this.m = cVar;
        this.n = bVar2;
        bVar.setListener(this);
        LegacyPlayerState lastPlayerState = this.a.get().getLastPlayerState();
        this.j = lastPlayerState != null && !lastPlayerState.isPaused();
        e();
    }

    public void l() {
        this.o.dispose();
        this.p.dispose();
        this.q.dispose();
        if (this.j) {
            this.a.get().resume();
        }
    }

    public void m() {
        if (this.e.a()) {
            this.s = DrivingVoiceState.LISTENING;
            this.a.get().pause();
            ((DrivingVoiceView) this.k).Y();
            this.o.dispose();
            g<m> Q = this.b.a().Q(this.c);
            ewb b2 = this.d.b(this, 1);
            Q.subscribe((upf<? super m>) b2);
            this.o = b2;
            return;
        }
        c cVar = this.m;
        if (cVar != null) {
            ((DrivingModeVoiceFragment) cVar).K4();
        }
    }
}
