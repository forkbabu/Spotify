package com.google.android.gms.cast.framework.media.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.j;
import com.google.android.gms.cast.m;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.cast.o0;
import com.spotify.music.C0707R;

public final class k implements h.b {
    private static final b n = new b("MediaSessionManager");
    private final Context a;
    private final com.google.android.gms.cast.framework.b b;
    private final o c;
    private final ComponentName d;
    private final b e;
    private final b f;
    private final Handler g;
    private final Runnable h;
    private h i;
    private CastDevice j;
    private MediaSessionCompat k;
    private MediaSessionCompat.a l;
    private boolean m;

    public k(Context context, com.google.android.gms.cast.framework.b bVar, o oVar) {
        this.a = context;
        this.b = bVar;
        this.c = oVar;
        if (bVar.I1() == null || TextUtils.isEmpty(bVar.I1().I1())) {
            this.d = null;
        } else {
            this.d = new ComponentName(context, bVar.I1().I1());
        }
        b bVar2 = new b(context);
        this.e = bVar2;
        bVar2.d(new m(this));
        b bVar3 = new b(context);
        this.f = bVar3;
        bVar3.d(new l(this));
        this.g = new o0(Looper.getMainLooper());
        this.h = new j(this);
    }

    private final void g(int i2, MediaInfo mediaInfo) {
        long j2;
        PendingIntent pendingIntent;
        MediaSessionCompat mediaSessionCompat = this.k;
        if (mediaSessionCompat != null) {
            long j3 = 0;
            if (i2 == 0) {
                PlaybackStateCompat.b bVar = new PlaybackStateCompat.b();
                bVar.g(0, 0, 1.0f);
                mediaSessionCompat.p(bVar.b());
                this.k.o(new MediaMetadataCompat.b().a());
                return;
            }
            long j4 = 512;
            if (!this.i.o()) {
                j4 = 768;
            }
            com.google.android.gms.cast.o i3 = this.i.i();
            if (this.i.o()) {
                j2 = 0;
            } else {
                j2 = i3.y2();
            }
            MediaSessionCompat mediaSessionCompat2 = this.k;
            PlaybackStateCompat.b bVar2 = new PlaybackStateCompat.b();
            bVar2.g(i2, j2, 1.0f);
            bVar2.c(j4);
            mediaSessionCompat2.p(bVar2.b());
            MediaSessionCompat mediaSessionCompat3 = this.k;
            if (this.d == null) {
                pendingIntent = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.d);
                pendingIntent = PendingIntent.getActivity(this.a, 0, intent, 134217728);
            }
            mediaSessionCompat3.w(pendingIntent);
            if (this.k != null) {
                j Q1 = mediaInfo.Q1();
                if (!this.i.o()) {
                    j3 = mediaInfo.o2();
                }
                MediaMetadataCompat.b m2 = m();
                m2.d("android.media.metadata.TITLE", Q1.q2("com.google.android.gms.cast.metadata.TITLE"));
                m2.d("android.media.metadata.DISPLAY_TITLE", Q1.q2("com.google.android.gms.cast.metadata.TITLE"));
                m2.d("android.media.metadata.DISPLAY_SUBTITLE", Q1.q2("com.google.android.gms.cast.metadata.SUBTITLE"));
                m2.c("android.media.metadata.DURATION", j3);
                this.k.o(m2.a());
                Uri l2 = l(Q1, 0);
                if (l2 != null) {
                    this.e.e(l2);
                } else {
                    h(null, 0);
                }
                Uri l3 = l(Q1, 3);
                if (l3 != null) {
                    this.f.e(l3);
                } else {
                    h(null, 3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void h(Bitmap bitmap, int i2) {
        MediaSessionCompat mediaSessionCompat = this.k;
        if (mediaSessionCompat != null) {
            if (i2 == 0) {
                if (bitmap != null) {
                    MediaMetadataCompat.b m2 = m();
                    m2.b("android.media.metadata.DISPLAY_ICON", bitmap);
                    mediaSessionCompat.o(m2.a());
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                MediaSessionCompat mediaSessionCompat2 = this.k;
                MediaMetadataCompat.b m3 = m();
                m3.b("android.media.metadata.DISPLAY_ICON", createBitmap);
                mediaSessionCompat2.o(m3.a());
            } else if (i2 == 3) {
                MediaMetadataCompat.b m4 = m();
                m4.b("android.media.metadata.ALBUM_ART", bitmap);
                mediaSessionCompat.o(m4.a());
            }
        }
    }

    private final Uri l(j jVar, int i2) {
        hr hrVar;
        if (this.b.I1().Q1() != null) {
            hrVar = this.b.I1().Q1().a(jVar);
        } else {
            hrVar = jVar.s2() ? jVar.o2().get(0) : null;
        }
        if (hrVar == null) {
            return null;
        }
        return hrVar.I1();
    }

    private final MediaMetadataCompat.b m() {
        MediaSessionCompat mediaSessionCompat = this.k;
        MediaMetadataCompat a2 = mediaSessionCompat == null ? null : mediaSessionCompat.c().a();
        if (a2 == null) {
            return new MediaMetadataCompat.b();
        }
        return new MediaMetadataCompat.b(a2);
    }

    private final void n() {
        if (this.b.I1().q2() != null) {
            n.a("Stopping notification service.", new Object[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                MediaNotificationService.b();
                return;
            }
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.a.stopService(intent);
        }
    }

    private final void o() {
        if (this.b.Q1()) {
            this.g.removeCallbacks(this.h);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }

    private final void r(boolean z) {
        if (this.b.Q1()) {
            this.g.removeCallbacks(this.h);
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            try {
                this.a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.g.postDelayed(this.h, 1000);
                }
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public final void a() {
        q(false);
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public final void b() {
        q(false);
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public final void c() {
        q(false);
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public final void d() {
        q(false);
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public final void e() {
        q(false);
    }

    public final void i(h hVar, CastDevice castDevice) {
        com.google.android.gms.cast.framework.b bVar;
        if (!this.m && (bVar = this.b) != null && bVar.I1() != null && hVar != null && castDevice != null) {
            this.i = hVar;
            hVar.b(this);
            this.j = castDevice;
            if (!e.b()) {
                ((AudioManager) this.a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
            }
            ComponentName componentName = new ComponentName(this.a, this.b.I1().o2());
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, 0);
            if (this.b.I1().p2()) {
                this.k = new MediaSessionCompat(this.a, "CastMediaSession", componentName, broadcast);
                g(0, null);
                CastDevice castDevice2 = this.j;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.Q1())) {
                    MediaSessionCompat mediaSessionCompat = this.k;
                    MediaMetadataCompat.b bVar2 = new MediaMetadataCompat.b();
                    bVar2.d("android.media.metadata.ALBUM_ARTIST", this.a.getResources().getString(C0707R.string.cast_casting_to_device, this.j.Q1()));
                    mediaSessionCompat.o(bVar2.a());
                }
                n nVar = new n(this);
                this.l = nVar;
                this.k.l(nVar);
                this.k.k(true);
                this.c.D3(this.k);
            }
            this.m = true;
            q(false);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.h.b
    public final void k() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        r(false);
    }

    public final void q(boolean z) {
        boolean z2;
        boolean z3;
        MediaSessionCompat.Token token;
        m g2;
        h hVar = this.i;
        if (hVar != null) {
            MediaInfo h2 = hVar.h();
            int i2 = 6;
            if (!this.i.n()) {
                if (this.i.r()) {
                    i2 = 3;
                } else if (this.i.q()) {
                    i2 = 2;
                } else if (!this.i.p() || (g2 = this.i.g()) == null || g2.o2() == null) {
                    i2 = 0;
                } else {
                    h2 = g2.o2();
                }
            }
            if (h2 == null || h2.Q1() == null) {
                i2 = 0;
            }
            g(i2, h2);
            if (!this.i.m()) {
                n();
                o();
            } else if (i2 != 0) {
                if (this.j != null && MediaNotificationService.a(this.b)) {
                    Intent intent = new Intent(this.a, MediaNotificationService.class);
                    intent.putExtra("extra_media_notification_force_update", z);
                    intent.setPackage(this.a.getPackageName());
                    intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                    intent.putExtra("extra_media_info", this.i.h());
                    intent.putExtra("extra_remote_media_client_player_state", this.i.k());
                    intent.putExtra("extra_cast_device", this.j);
                    MediaSessionCompat mediaSessionCompat = this.k;
                    if (mediaSessionCompat != null) {
                        if (mediaSessionCompat == null) {
                            token = null;
                        } else {
                            token = mediaSessionCompat.f();
                        }
                        intent.putExtra("extra_media_session_token", token);
                    }
                    com.google.android.gms.cast.o i3 = this.i.i();
                    int x2 = i3.x2();
                    if (x2 == 1 || x2 == 2 || x2 == 3) {
                        z2 = true;
                        z3 = true;
                    } else {
                        Integer p2 = i3.p2(i3.Q1());
                        if (p2 != null) {
                            z3 = p2.intValue() > 0;
                            z2 = p2.intValue() < i3.w2() - 1;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                    }
                    intent.putExtra("extra_can_skip_next", z2);
                    intent.putExtra("extra_can_skip_prev", z3);
                    n.a("Starting notification service.", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.a.startForegroundService(intent);
                    } else {
                        this.a.startService(intent);
                    }
                }
                if (!this.i.p()) {
                    r(true);
                }
            }
        }
    }

    public final void s(int i2) {
        if (this.m) {
            this.m = false;
            h hVar = this.i;
            if (hVar != null) {
                hVar.w(this);
            }
            if (!e.b()) {
                ((AudioManager) this.a.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.c.D3(null);
            b bVar = this.e;
            if (bVar != null) {
                bVar.a();
            }
            b bVar2 = this.f;
            if (bVar2 != null) {
                bVar2.a();
            }
            MediaSessionCompat mediaSessionCompat = this.k;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.w(null);
                this.k.l(null);
                this.k.o(new MediaMetadataCompat.b().a());
                g(0, null);
                this.k.k(false);
                this.k.i();
                this.k = null;
            }
            this.i = null;
            this.j = null;
            this.l = null;
            n();
            if (i2 == 0) {
                o();
            }
        }
    }
}
