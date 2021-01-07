package com.spotify.music.libs.mediabrowserservice;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.loginflow.LoginActivity;
import com.spotify.mediasession.playbackactions.MediaAction;
import com.spotify.mobile.android.service.media.d3;
import com.spotify.music.C0707R;
import com.spotify.music.libs.mediabrowserservice.login.AfterLoginDummyActivity;
import com.spotify.music.libs.mediasession.t0;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class p1 {

    /* access modifiers changed from: protected */
    public static class a extends p1 {
        private final PlaybackStateCompat.b a;

        protected a(boolean z, boolean z2) {
            PlaybackStateCompat.b bVar = new PlaybackStateCompat.b();
            bVar.g(0, -1, 0.0f);
            this.a = bVar;
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.spotify.music.extra.OFFLINE_MODE", z);
            bundle.putBoolean("com.spotify.music.extra.ON_DEMAND_ENABLED", z2);
            bVar.f(bundle);
        }

        @Override // com.spotify.music.libs.mediabrowserservice.p1
        public PlaybackStateCompat a(com.spotify.mediasession.playbackactions.a aVar) {
            if (aVar == null) {
                PlaybackStateCompat.b bVar = this.a;
                bVar.c(0);
                return bVar.b();
            }
            long j = 141312;
            Iterator it = ((ArrayList) new d3().a(null, 100)).iterator();
            while (it.hasNext()) {
                long c = ((com.spotify.mediasession.playbackactions.b) aVar).c((MediaAction) it.next());
                if (0 != c) {
                    j |= c;
                }
            }
            this.a.c(j);
            return this.a.b();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return a.class.getSimpleName();
        }
    }

    public static class b extends p1 {
        private final int a;
        private final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.p1
        public PlaybackStateCompat a(com.spotify.mediasession.playbackactions.a aVar) {
            long j = aVar == null ? 0 : 141312;
            PlaybackStateCompat.b bVar = new PlaybackStateCompat.b();
            bVar.g(7, -1, 0.0f);
            bVar.e(this.a, e());
            bVar.f(f());
            bVar.c(j);
            return bVar.b();
        }

        /* access modifiers changed from: protected */
        public String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            String str = this.b;
            return str == null ? bVar.b == null : str.equals(bVar.b);
        }

        /* access modifiers changed from: protected */
        public Bundle f() {
            return Bundle.EMPTY;
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return getClass().getSimpleName() + ": " + this.b + ' ' + this.a;
        }
    }

    public static class c extends b {
        private final Context c;

        public c(Context context) {
            super(3, null);
            this.c = context;
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.music.libs.mediabrowserservice.p1.b
        public String e() {
            return this.c.getString(C0707R.string.applink_logged_out_warning_linescombo);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.music.libs.mediabrowserservice.p1.b
        public Bundle f() {
            Bundle bundle = new Bundle(3);
            Context context = this.c;
            Context applicationContext = context.getApplicationContext();
            int i = AfterLoginDummyActivity.a;
            Intent intent = new Intent(applicationContext, AfterLoginDummyActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.addFlags(1082130432);
            PendingIntent activity = PendingIntent.getActivity(context, 0, LoginActivity.V0(context, intent, 268435456, false), 0);
            bundle.putString("android.media.extras.ERROR_RESOLUTION_ACTION_LABEL", this.c.getString(C0707R.string.login_button));
            bundle.putParcelable("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT", activity);
            return bundle;
        }
    }

    /* access modifiers changed from: protected */
    public static class d extends p1 {
        private final List<MediaAction> a;
        private final PlaybackStateCompat.b b;
        private final v2 c;
        private final int d;
        private final int e;

        protected d(MediaUriUtil mediaUriUtil, cqe cqe, PlayerState playerState, PlayerQueue playerQueue, boolean z, int i, lk1 lk1, boolean z2, boolean z3, boolean z4) {
            PlaybackStateCompat.b bVar = new PlaybackStateCompat.b();
            int i2 = 0;
            boolean z5 = playerState.isPlaying() && !playerState.isPaused();
            Optional<Long> position = playerState.position(cqe.d());
            long longValue = position.isPresent() ? position.get().longValue() : -1;
            float floatValue = playerState.playbackSpeed().isPresent() ? playerState.playbackSpeed().get().floatValue() : 0.0f;
            if (!z5) {
                bVar.g(2, longValue, floatValue);
            } else if (floatValue == 0.0f || !playerState.track().isPresent()) {
                bVar.g(6, longValue, floatValue);
            } else {
                bVar.g(3, longValue, floatValue);
            }
            Bundle bundle = new Bundle();
            if (playerState.isPlaying()) {
                bundle.putBoolean("com.amazon.alexa.externalmediaplayer.active", z);
                bundle.putBoolean("com.spotify.music.extra.ACTIVE_PLAYBACK_LOCAL", z);
            }
            bundle.putBoolean("com.spotify.music.extra.CROSSFADE_ENABLED", lk1.b());
            bundle.putInt("com.spotify.music.extra.CROSSFADE_DURATION", lk1.a().intValue());
            bundle.putBoolean("com.spotify.music.extra.OFFLINE_MODE", z2);
            bundle.putBoolean("com.spotify.music.extra.OFFLINE_ENABLED", z4);
            bundle.putBoolean("com.spotify.music.extra.ON_DEMAND_ENABLED", z3);
            bVar.f(bundle);
            PlayerOptions options = playerState.options();
            this.e = options.shufflingContext() ? 1 : 0;
            if (options.repeatingTrack()) {
                i2 = 1;
            } else if (options.repeatingContext()) {
                i2 = 2;
            }
            this.d = i2;
            if (playerQueue == null || !playerState.restrictions().disallowPeekingNextReasons().isEmpty()) {
                this.c = v2.b;
            } else {
                this.c = new v2(mediaUriUtil, options.repeatingContext(), playerQueue);
                bVar.d(0);
            }
            this.a = new d3().a(playerState, i);
            this.b = bVar;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.p1
        public PlaybackStateCompat a(com.spotify.mediasession.playbackactions.a aVar) {
            PlaybackStateCompat.CustomAction customAction;
            if (aVar == null) {
                return this.b.b();
            }
            ImmutableList<MediaAction> immutableList = t0.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.wearable.media.extra.CUSTOM_ACTION_SHOW_ON_WEAR", true);
            long j = 141312;
            Iterator it = new ArrayList(this.a).iterator();
            while (it.hasNext()) {
                MediaAction mediaAction = (MediaAction) it.next();
                com.spotify.mediasession.playbackactions.b bVar = (com.spotify.mediasession.playbackactions.b) aVar;
                long c2 = bVar.c(mediaAction);
                if (0 == c2) {
                    if (t0.a.contains(mediaAction)) {
                        customAction = bVar.b(mediaAction, bundle);
                    } else {
                        customAction = bVar.a(mediaAction);
                    }
                    if (customAction != null) {
                        this.b.a(customAction);
                    }
                } else {
                    j |= c2;
                }
            }
            this.b.c(j);
            return this.b.b();
        }

        @Override // com.spotify.music.libs.mediabrowserservice.p1
        public v2 b() {
            return this.c;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.p1
        public int c() {
            return this.d;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.p1
        public int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.d == dVar.d && this.e == dVar.e && this.a.equals(dVar.a);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.d) * 31) + this.e;
        }

        public String toString() {
            return d.class.getSimpleName() + ": " + this.b.b().f();
        }
    }

    public abstract PlaybackStateCompat a(com.spotify.mediasession.playbackactions.a aVar);

    public v2 b() {
        return v2.b;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }
}
