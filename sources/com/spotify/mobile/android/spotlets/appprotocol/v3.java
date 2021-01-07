package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.calls.EchoEndpoint;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import io.reactivex.s;

public class v3 implements a {
    private final tg0<e4> a;

    public v3(tg0<e4> tg0) {
        this.a = tg0;
    }

    public /* synthetic */ s A(AppProtocolBase.Empty empty) {
        return this.a.get().p0();
    }

    public /* synthetic */ s B(AppProtocol.SkipPrevious skipPrevious) {
        return this.a.get().q0(skipPrevious);
    }

    public /* synthetic */ s C(AppProtocol.Identifier identifier) {
        return this.a.get().t0(identifier);
    }

    public /* synthetic */ s D(AppProtocol.Uri uri) {
        return this.a.get().h0(uri);
    }

    public /* synthetic */ s E(AppProtocolBase.Empty empty) {
        return this.a.get().h();
    }

    public /* synthetic */ s F(AppProtocol.UriWithOptionExtras uriWithOptionExtras) {
        return this.a.get().g0(uriWithOptionExtras);
    }

    public /* synthetic */ s G(AppProtocol.Index index) {
        return this.a.get().r0(index.index);
    }

    public /* synthetic */ s H(AppProtocolBase.Empty empty) {
        return this.a.get().j();
    }

    public /* synthetic */ s I(AppProtocol.ImageIdentifier imageIdentifier) {
        return this.a.get().l(imageIdentifier);
    }

    public /* synthetic */ s J(AppProtocolBase.Empty empty) {
        return this.a.get().o();
    }

    public /* synthetic */ s K(AppProtocolBase.Empty empty) {
        return this.a.get().p();
    }

    public /* synthetic */ s L(AppProtocol.RootListOptions rootListOptions) {
        return this.a.get().r(rootListOptions);
    }

    public /* synthetic */ s M(AppProtocol.Identifier identifier) {
        return this.a.get().t(identifier);
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        qg0.accept(new EchoEndpoint());
        cf2 b = cf2.b(AppProtocolBase.Empty.class, AppProtocolBase.Empty.class);
        b.d("com.spotify.connect_switch_to_local_device");
        b.c(1);
        b.e(new g0(this));
        qg0.accept(b.a());
        cf2 b2 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.Capabilities.class);
        b2.d("com.spotify.get_capabilities");
        b2.c(0);
        b2.e(new i(this));
        qg0.accept(b2.a());
        cf2 b3 = cf2.b(AppProtocol.ChildrenPageRequest.class, AppProtocol.ListItems.class);
        b3.d("com.spotify.get_children_of_item");
        b3.c(8);
        b3.e(new e0(this));
        qg0.accept(b3.a());
        cf2 b4 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.Context.class);
        b4.d("com.spotify.get_current_context");
        b4.c(4);
        b4.e(new h0(this));
        qg0.accept(b4.a());
        cf2 b5 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.TrackData.class);
        b5.d("com.spotify.get_current_track");
        b5.c(4);
        b5.e(new n(this));
        qg0.accept(b5.a());
        cf2 b6 = cf2.b(AppProtocol.ImageIdentifier.class, AppProtocol.Image.class);
        b6.d("com.spotify.get_image");
        b6.c(4);
        b6.e(new m(this));
        qg0.accept(b6.a());
        cf2 b7 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.PlaybackSpeed.class);
        b7.d("com.spotify.get_playback_speed");
        b7.c(4);
        b7.e(new m0(this));
        qg0.accept(b7.a());
        cf2 b8 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.PlayerState.class);
        b8.d("com.spotify.get_player_state");
        b8.c(4);
        b8.e(new n0(this));
        qg0.accept(b8.a());
        cf2 b9 = cf2.b(AppProtocol.RootListOptions.class, AppProtocol.ListItems.class);
        b9.d("com.spotify.get_recommended_root_items");
        b9.c(8);
        b9.e(new a0(this));
        qg0.accept(b9.a());
        cf2 b10 = cf2.b(AppProtocol.Identifier.class, AppProtocol.Saved.class);
        b10.d("com.spotify.get_saved");
        b10.c(1);
        b10.e(new j0(this));
        qg0.accept(b10.a());
        cf2 b11 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.SessionState.class);
        b11.d("com.spotify.get_session_state");
        b11.c(4);
        b11.e(new s(this));
        qg0.accept(b11.a());
        cf2 b12 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.Rating.class);
        b12.d("com.spotify.get_rating");
        b12.c(4);
        b12.e(new x(this));
        qg0.accept(b12.a());
        cf2 b13 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.Repeat.class);
        b13.d("com.spotify.get_repeat");
        b13.c(4);
        b13.e(new k0(this));
        qg0.accept(b13.a());
        cf2 b14 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.Shuffle.class);
        b14.d("com.spotify.get_shuffle");
        b14.c(4);
        b14.e(new o(this));
        qg0.accept(b14.a());
        cf2 b15 = cf2.b(AppProtocol.ImageIdentifier.class, AppProtocol.Image.class);
        b15.d("com.spotify.get_thumbnail_image");
        b15.c(8);
        b15.e(new u(this));
        qg0.accept(b15.a());
        cf2 b16 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.TrackElapsed.class);
        b16.d("com.spotify.get_track_elapsed");
        b16.c(4);
        b16.e(new w(this));
        qg0.accept(b16.a());
        cf2 b17 = cf2.b(AppProtocol.LogMessage.class, AppProtocolBase.Empty.class);
        b17.d("com.spotify.log_message");
        b17.c(0);
        b17.e(new j(this));
        qg0.accept(b17.a());
        cf2 b18 = cf2.b(AppProtocol.Identifier.class, AppProtocolBase.Empty.class);
        b18.d("com.spotify.play_item");
        b18.c(8);
        b18.e(new p(this));
        qg0.accept(b18.a());
        cf2 b19 = cf2.b(AppProtocol.Uri.class, AppProtocolBase.Empty.class);
        b19.d("com.spotify.play_spotify_track_uri");
        b19.c(2);
        b19.e(new o0(this));
        qg0.accept(b19.a());
        cf2 b20 = cf2.b(AppProtocol.Uri.class, AppProtocolBase.Empty.class);
        b20.d("com.spotify.play_spotify_uri");
        b20.c(2);
        b20.e(new d0(this));
        qg0.accept(b20.a());
        cf2 b21 = cf2.b(AppProtocol.UriWithOptionExtras.class, AppProtocolBase.Empty.class);
        b21.d("com.spotify.play_spotify_uri_option_extras");
        b21.c(2);
        b21.e(new c0(this));
        qg0.accept(b21.a());
        cf2 b22 = cf2.b(AppProtocol.UriWithNamedOptions.class, AppProtocolBase.Empty.class);
        b22.d("com.spotify.play_uri");
        b22.c(2);
        b22.e(new v(this));
        qg0.accept(b22.a());
        cf2 b23 = cf2.b(AppProtocol.PlaybackPosition.class, AppProtocolBase.Empty.class);
        b23.d("com.spotify.set_playback_position");
        b23.c(1);
        b23.e(new y(this));
        qg0.accept(b23.a());
        cf2 b24 = cf2.b(AppProtocol.PlaybackPosition.class, AppProtocolBase.Empty.class);
        b24.d("com.spotify.seek_to_relative_position");
        b24.c(1);
        b24.e(new l0(this));
        qg0.accept(b24.a());
        cf2 b25 = cf2.b(AppProtocol.PlaybackSpeed.class, AppProtocolBase.Empty.class);
        b25.d("com.spotify.set_playback_speed");
        b25.c(1);
        b25.e(new r(this));
        qg0.accept(b25.a());
        cf2 b26 = cf2.b(AppProtocol.Rating.class, AppProtocolBase.Empty.class);
        b26.d("com.spotify.set_rating");
        b26.c(1);
        b26.e(new i0(this));
        qg0.accept(b26.a());
        cf2 b27 = cf2.b(AppProtocol.Repeat.class, AppProtocolBase.Empty.class);
        b27.d("com.spotify.set_repeat");
        b27.c(1);
        b27.e(new t(this));
        qg0.accept(b27.a());
        cf2 b28 = cf2.b(AppProtocolBase.Empty.class, AppProtocolBase.Empty.class);
        b28.d("com.spotify.toggle_repeat");
        b28.c(1);
        b28.e(new q0(this));
        qg0.accept(b28.a());
        cf2 b29 = cf2.b(AppProtocol.Saved.class, AppProtocolBase.Empty.class);
        b29.d("com.spotify.set_saved");
        b29.c(1);
        b29.e(new z(this));
        qg0.accept(b29.a());
        cf2 b30 = cf2.b(AppProtocol.Shuffle.class, AppProtocolBase.Empty.class);
        b30.d("com.spotify.set_shuffle");
        b30.c(1);
        b30.e(new h(this));
        qg0.accept(b30.a());
        cf2 b31 = cf2.b(AppProtocolBase.Empty.class, AppProtocolBase.Empty.class);
        b31.d("com.spotify.toggle_shuffle");
        b31.c(1);
        b31.e(new k(this));
        qg0.accept(b31.a());
        cf2 b32 = cf2.b(AppProtocolBase.Empty.class, AppProtocolBase.Empty.class);
        b32.d("com.spotify.skip_next");
        b32.c(1);
        b32.e(new q(this));
        qg0.accept(b32.a());
        cf2 b33 = cf2.b(AppProtocol.SkipPrevious.class, AppProtocolBase.Empty.class);
        b33.d("com.spotify.skip_previous");
        b33.c(1);
        b33.e(new b0(this));
        qg0.accept(b33.a());
        cf2 b34 = cf2.b(AppProtocol.Identifier.class, AppProtocolBase.Empty.class);
        b34.d("com.spotify.start_radio");
        b34.c(1);
        b34.e(new g(this));
        qg0.accept(b34.a());
        cf2 b35 = cf2.b(AppProtocol.Uri.class, AppProtocolBase.Empty.class);
        b35.d("com.spotify.queue_spotify_uri");
        b35.c(1);
        b35.e(new f(this));
        qg0.accept(b35.a());
        cf2 b36 = cf2.b(AppProtocolBase.Empty.class, AppProtocol.CrossfadeState.class);
        b36.d("com.spotify.get_crossfade");
        b36.c(4);
        b36.e(new p0(this));
        qg0.accept(b36.a());
        cf2 b37 = cf2.b(AppProtocol.UriWithOptionExtras.class, AppProtocolBase.Empty.class);
        b37.d("com.spotify.skip_to_index");
        b37.c(4);
        b37.e(new f0(this));
        qg0.accept(b37.a());
        cf2 b38 = cf2.b(AppProtocol.Index.class, AppProtocolBase.Empty.class);
        b38.d("com.spotify.skip_to_index_in_queue");
        b38.c(1);
        b38.e(new l(this));
        qg0.accept(b38.a());
    }

    public /* synthetic */ s b(AppProtocolBase.Empty empty) {
        return this.a.get().d();
    }

    public /* synthetic */ s c(AppProtocolBase.Empty empty) {
        return this.a.get().f();
    }

    public /* synthetic */ s d(AppProtocolBase.Empty empty) {
        return this.a.get().u();
    }

    public /* synthetic */ s e(AppProtocolBase.Empty empty) {
        return this.a.get().q();
    }

    public /* synthetic */ s f(AppProtocolBase.Empty empty) {
        return this.a.get().s();
    }

    public /* synthetic */ s g(AppProtocolBase.Empty empty) {
        return this.a.get().v();
    }

    public /* synthetic */ s h(AppProtocol.ImageIdentifier imageIdentifier) {
        return this.a.get().w(imageIdentifier);
    }

    public /* synthetic */ s i(AppProtocolBase.Empty empty) {
        return this.a.get().x();
    }

    public s j(AppProtocol.LogMessage logMessage) {
        this.a.get().getClass();
        StringBuilder sb = new StringBuilder("Log from IAP:");
        String str = logMessage.title;
        if (str != null && !str.isEmpty()) {
            sb.append(' ');
            sb.append(logMessage.title);
        }
        String str2 = logMessage.message;
        if (str2 != null && !str2.isEmpty()) {
            sb.append(' ');
            sb.append(logMessage.message);
        }
        String sb2 = sb.toString();
        if (AppProtocol.LogMessage.SEVERITY_ERROR.equals(logMessage.severity)) {
            Logger.d(sb2, new Object[0]);
        } else if (AppProtocol.LogMessage.SEVERITY_WARNING.equals(logMessage.severity)) {
            Logger.n(sb2, new Object[0]);
        } else if (AppProtocol.LogMessage.SEVERITY_INFO.equals(logMessage.severity)) {
            Logger.g(sb2, new Object[0]);
        } else {
            Logger.b(sb2, new Object[0]);
        }
        return s.i0(AppProtocolBase.a);
    }

    public /* synthetic */ s k(AppProtocol.Identifier identifier) {
        return this.a.get().d0(identifier);
    }

    public /* synthetic */ s l(AppProtocol.Uri uri) {
        return this.a.get().e0(uri);
    }

    public /* synthetic */ s m(AppProtocol.Uri uri) {
        return this.a.get().e0(uri);
    }

    public /* synthetic */ s n(AppProtocol.ChildrenPageRequest childrenPageRequest) {
        return this.a.get().g(childrenPageRequest);
    }

    public /* synthetic */ s o(AppProtocol.UriWithOptionExtras uriWithOptionExtras) {
        return this.a.get().g0(uriWithOptionExtras);
    }

    public /* synthetic */ s p(AppProtocol.UriWithNamedOptions uriWithNamedOptions) {
        return this.a.get().f0(uriWithNamedOptions);
    }

    public /* synthetic */ s q(AppProtocol.PlaybackPosition playbackPosition) {
        return this.a.get().i0(playbackPosition);
    }

    public /* synthetic */ s r(AppProtocol.PlaybackPosition playbackPosition) {
        return this.a.get().j0(playbackPosition);
    }

    public /* synthetic */ s s(AppProtocol.PlaybackSpeed playbackSpeed) {
        return this.a.get().k0(playbackSpeed);
    }

    public s t(AppProtocol.Rating rating) {
        this.a.get().getClass();
        return s.P(new IapException(new AppProtocol.Message("Operation is deprecated"), "wamp.error"));
    }

    public /* synthetic */ s u(AppProtocol.Repeat repeat) {
        return this.a.get().l0(repeat);
    }

    public /* synthetic */ s v(AppProtocolBase.Empty empty) {
        return this.a.get().w0();
    }

    public /* synthetic */ s w(AppProtocol.Saved saved) {
        return this.a.get().n0(saved);
    }

    public /* synthetic */ s x(AppProtocol.Shuffle shuffle) {
        return this.a.get().o0(shuffle);
    }

    public /* synthetic */ s y(AppProtocolBase.Empty empty) {
        return this.a.get().i();
    }

    public /* synthetic */ s z(AppProtocolBase.Empty empty) {
        return this.a.get().x0();
    }
}
