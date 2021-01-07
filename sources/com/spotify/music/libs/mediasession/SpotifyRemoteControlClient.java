package com.spotify.music.libs.mediasession;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import io.reactivex.functions.g;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SpotifyRemoteControlClient implements m0 {
    public static final SpSharedPreferences.b<Object, Boolean> w = SpSharedPreferences.b.e("send_playback_broadcasts");
    private static final g<Throwable> x = x.a;
    private final Context a;
    private final AudioManager b;
    private final SpSharedPreferences<Object> c;
    private final o0 d;
    private final Picasso e;
    private final y f;
    private final io.reactivex.g<PlayerState> g;
    private final b0 h;
    private final cqe i;
    private final ConnectManager j;
    private final com.spotify.mediasession.playbackactions.a k;
    private n0 l;
    private q0 m;
    private h0 n;
    private boolean o;
    private boolean p;
    private d q;
    private PlayerState r;
    private Bitmap s;
    private Uri t;
    private final f0 u;
    final io.reactivex.disposables.a v = new io.reactivex.disposables.a();

    public enum Change {
        METADATA,
        PLAYBACK_STATE,
        QUEUE,
        PLAYBACK_LOCATION;
        
        public static final Change[] n = values();
    }

    private class b implements f0 {
        b(a aVar) {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            SpotifyRemoteControlClient.this.t = Uri.EMPTY;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            SpotifyRemoteControlClient.this.t = Uri.EMPTY;
            SpotifyRemoteControlClient spotifyRemoteControlClient = SpotifyRemoteControlClient.this;
            spotifyRemoteControlClient.w(spotifyRemoteControlClient.r, bitmap);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    /* access modifiers changed from: private */
    public class c implements l0 {
        c(a aVar) {
        }

        private void a(com.spotify.player.controls.c cVar) {
            if (SpotifyRemoteControlClient.this.q != null) {
                SpotifyRemoteControlClient spotifyRemoteControlClient = SpotifyRemoteControlClient.this;
                spotifyRemoteControlClient.v.b(spotifyRemoteControlClient.q.a(cVar).subscribe());
                return;
            }
            Assertion.g("Player not available!");
        }

        private void b(qg0<ContextTrack> qg0) {
            if (SpotifyRemoteControlClient.this.r != null) {
                Optional<ContextTrack> track = SpotifyRemoteControlClient.this.r.track();
                if (track.isPresent()) {
                    qg0.accept(track.get());
                }
            }
        }

        private void c(sg0<q0, z<zwd>> sg0) {
            q0 q0Var = SpotifyRemoteControlClient.this.m;
            if (q0Var == null) {
                Assertion.g("SkipActionHandler not available!");
            } else {
                SpotifyRemoteControlClient.this.v.b(sg0.apply(q0Var).subscribe());
            }
        }

        public /* synthetic */ void d(ContextTrack contextTrack) {
            c(new n(contextTrack));
        }

        public /* synthetic */ void e(ContextTrack contextTrack) {
            c(new m(contextTrack));
        }

        public void f() {
            a(com.spotify.player.controls.c.c());
        }

        public void g() {
            a(com.spotify.player.controls.c.e());
        }

        public void h(long j) {
            a(com.spotify.player.controls.c.g(j));
        }

        public void i() {
            b(new p(this));
        }

        public void j() {
            b(new o(this));
        }
    }

    public SpotifyRemoteControlClient(Context context, SpSharedPreferences<Object> spSharedPreferences, o0 o0Var, Picasso picasso, y yVar, io.reactivex.g<PlayerState> gVar, b0 b0Var, cqe cqe, ConnectManager connectManager) {
        this.a = context;
        this.c = spSharedPreferences;
        this.d = o0Var;
        this.f = yVar;
        this.g = gVar;
        this.h = b0Var;
        this.k = new com.spotify.mediasession.playbackactions.b();
        this.i = cqe;
        this.j = connectManager;
        this.b = (AudioManager) context.getSystemService("audio");
        this.l = m();
        this.e = picasso;
        this.u = new b(null);
    }

    private n0 m() {
        if (this.l == null) {
            n0 a2 = this.d.a(new c(null));
            this.l = a2;
            Logger.b("MediaSession has been created %s", a2.h());
            this.n = new h0(this.l);
        }
        this.o = this.l.d();
        return this.l;
    }

    /* access modifiers changed from: private */
    public static boolean n(PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        return track.isPresent() && track.get().metadata().containsKey("is_advertisement") && Boolean.valueOf(track.get().metadata().get("is_advertisement")).booleanValue();
    }

    private static boolean o(Map<String, String> map) {
        return map.containsKey("title") && map.containsKey("artist_name") && map.containsKey("album_title");
    }

    private static boolean p(PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        return track.isPresent() && "fallback".equalsIgnoreCase(track.get().metadata().get(PlayerTrack.Metadata.MFT_INJECTION_SOURCE));
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public void a() {
        n0 n0Var = this.l;
        if (n0Var != null) {
            n0Var.a();
        }
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public void b(i0 i0Var) {
        m().b(i0Var);
        h0 h0Var = this.n;
        if (h0Var != null) {
            h0Var.a(i0Var != null);
        }
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public void c() {
        m().c();
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public void d() {
        n0 n0Var = this.l;
        if (n0Var != null) {
            MediaSessionCompat h2 = n0Var.h();
            h2.i();
            Logger.b("MediaSession has been released %s", h2);
        }
        this.n = null;
        this.l = null;
        this.o = false;
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public MediaSessionCompat.Token getToken() {
        return m().getToken();
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public MediaSessionCompat h() {
        return m().h();
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public void i(d dVar) {
        if (!this.p) {
            this.q = dVar;
            io.reactivex.g<PlayerState> gVar = this.g;
            this.m = new q0(dVar, gVar, this.i);
            io.reactivex.g<PlayerState> Q = gVar.Q(this.f);
            s sVar = new s(this);
            g<Throwable> gVar2 = x;
            io.reactivex.disposables.b subscribe = Q.subscribe(sVar, gVar2);
            io.reactivex.g<R> A = Q.O(z.a).s().A(new r(this));
            io.reactivex.disposables.b subscribe2 = A.r(2, TimeUnit.SECONDS, io.reactivex.schedulers.a.a(), false).C(new q(this)).subscribe(new u(this), gVar2);
            io.reactivex.disposables.b subscribe3 = A.C(w.a).subscribe(new v(this), gVar2);
            io.reactivex.disposables.b subscribe4 = this.j.p(SpotifyRemoteControlClient.class.getSimpleName()).Q(y.a).subscribe(new t(this));
            this.v.b(subscribe);
            this.v.b(subscribe2);
            this.v.b(subscribe3);
            this.v.b(subscribe4);
            n0 n0Var = this.l;
            if (n0Var != null) {
                n0Var.start();
            }
            this.p = true;
        }
    }

    public /* synthetic */ void q(PlayerState playerState) {
        w(playerState, this.s);
    }

    public /* synthetic */ void r(Uri uri) {
        this.t = uri;
    }

    public /* synthetic */ boolean s(Uri uri) {
        return uri.equals(this.t);
    }

    @Override // com.spotify.music.libs.mediasession.m0
    public void stop() {
        if (this.p) {
            this.v.f();
            n0 n0Var = this.l;
            if (n0Var != null) {
                n0Var.stop();
            }
            this.p = false;
            this.q = null;
            this.m = null;
        }
    }

    public /* synthetic */ void t(Uri uri) {
        w(this.r, null);
    }

    public /* synthetic */ void u(Uri uri) {
        this.e.l(uri).o(this.u);
    }

    public /* synthetic */ void v(GaiaDevice gaiaDevice) {
        h0 h0Var = this.n;
        if (h0Var != null) {
            h0Var.b(gaiaDevice.isSelf());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0501  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(com.spotify.player.model.PlayerState r28, android.graphics.Bitmap r29) {
        /*
        // Method dump skipped, instructions count: 1300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.w(com.spotify.player.model.PlayerState, android.graphics.Bitmap):void");
    }
}
