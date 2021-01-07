package com.spotify.music.libs.mediasession;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.libs.mediasession.a0;
import com.spotify.player.model.PlayerState;

public class h0 {
    private final n0 a;
    private a b;

    /* access modifiers changed from: package-private */
    public static abstract class a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.spotify.music.libs.mediasession.h0$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC0297a {
            AbstractC0297a() {
            }

            public abstract a a();

            public abstract AbstractC0297a b(Optional<String> optional);

            public abstract AbstractC0297a c(boolean z);

            public abstract AbstractC0297a d(Optional<Boolean> optional);

            public abstract AbstractC0297a e(Optional<String> optional);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract Optional<String> a();

        /* access modifiers changed from: package-private */
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (!c()) {
                bundle.putBoolean("android.media.session.extra.NEED_CONNECT", true);
            }
            bundle.putBoolean("watch_app_auto_launch_enabled", true);
            Bundle bundle2 = new Bundle();
            if (f().isPresent()) {
                bundle2.putString("com.spotify.music.extra.TRACK_URI", f().get());
            }
            if (a().isPresent()) {
                bundle2.putString("com.spotify.music.extra.CONTEXT_URI", a().get());
            }
            if (d().isPresent()) {
                bundle2.putBoolean("com.spotify.music.extra.LOCAL_PLAYBACK", d().get().booleanValue());
            }
            bundle.putBundle("wear_media_bundle", bundle2);
            return bundle;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract Optional<Boolean> d();

        /* access modifiers changed from: package-private */
        public abstract AbstractC0297a e();

        /* access modifiers changed from: package-private */
        public abstract Optional<String> f();
    }

    public h0(n0 n0Var) {
        this.a = n0Var;
        a0.b bVar = new a0.b();
        bVar.b(Optional.absent());
        bVar.e(Optional.absent());
        bVar.d(Optional.absent());
        bVar.c(false);
        a a2 = bVar.a();
        this.b = a2;
        n0Var.e(a2.b());
    }

    private void d(a aVar) {
        if (!this.b.equals(aVar)) {
            this.b = aVar;
            this.a.e(aVar.b());
        }
    }

    public void a(boolean z) {
        a.AbstractC0297a e = this.b.e();
        e.c(z);
        d(e.a());
    }

    public void b(boolean z) {
        a.AbstractC0297a e = this.b.e();
        e.d(Optional.of(Boolean.valueOf(z)));
        d(e.a());
    }

    public void c(PlayerState playerState) {
        a.AbstractC0297a e = this.b.e();
        e.b(Optional.fromNullable(playerState.contextUri()));
        e.e(Optional.fromNullable(playerState.track().isPresent() ? playerState.track().get().uri() : null));
        d(e.a());
    }
}
