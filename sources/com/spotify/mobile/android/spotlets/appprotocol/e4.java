package com.spotify.mobile.android.spotlets.appprotocol;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.i2;
import com.spotify.mobile.android.service.media.q2;
import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.u2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.w1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat;
import com.spotify.mobile.android.spotlets.appprotocol.image.c;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.b;
import com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.connectivity.r;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$Info;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import defpackage.yda;
import defpackage.zwd;
import io.reactivex.a0;
import io.reactivex.d0;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class e4 {
    private static final Pattern A = Pattern.compile(",\\s*");
    private static final PlayOrigin B = PlayOrigin.builder(kfd.x0.getName()).referrerIdentifier(bu9.o.getName()).build();
    private static final yda C;
    public static final /* synthetic */ int D = 0;
    private final Context a;
    private final ls1 b;
    private final v1 c;
    private final SpeedControlInteractor d;
    private final c e;
    private final w f;
    private final g<SessionState> g;
    private final g<PlayerState> h;
    private final cqe i;
    private final b j;
    private final y k;
    private final pea l;
    private final AtomicInteger m = new AtomicInteger();
    private final z3 n;
    private HelloDetailsAppProtocol$HelloDetails o;
    private String p;
    private boolean q;
    private ks1 r;
    private t2 s;
    private io.reactivex.disposables.b t;
    private w1 u;
    private i2 v;
    private q2 w;
    private f4 x;
    private String y = "default";
    private yda z;

    private static class a implements c.a {
        private final a0<AppProtocol.Image> a;
        private final int b;
        private final int c;

        public a(a0<AppProtocol.Image> a0Var, int i, int i2) {
            this.a = a0Var;
            this.b = i;
            this.c = i2;
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.image.c.a
        public void a(Uri uri) {
            this.a.onError(new IapException(new AppProtocol.Message("Failed to load image."), "wamp.error"));
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.image.c.a
        public void b(Uri uri) {
            this.a.onError(new IapException(new AppProtocol.Message("Image was cancelled due to throttling."), "wamp.error"));
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.image.c.a
        public void c(Uri uri, byte[] bArr) {
            this.a.onSuccess(new AppProtocol.Image(bArr, this.b, this.c));
        }
    }

    static {
        yda.b bVar = new yda.b("inter_app");
        bVar.q("inter_app");
        bVar.l("unknown");
        bVar.s("unknown");
        C = bVar.k();
    }

    public e4(Context context, ls1 ls1, v1 v1Var, z3 z3Var, c cVar, SpeedControlInteractor speedControlInteractor, y yVar, kd0 kd0, w wVar, g<SessionState> gVar, g<PlayerState> gVar2, cqe cqe, pea pea) {
        this.a = context;
        this.b = ls1;
        this.n = z3Var;
        this.c = v1Var;
        this.d = speedControlInteractor;
        this.e = cVar;
        this.f = wVar;
        this.g = gVar;
        this.h = gVar2;
        this.i = cqe;
        this.l = pea;
        this.j = new b();
        this.k = yVar;
    }

    static AppProtocolBase.Empty G(String str, zwd zwd) {
        zwd.getClass();
        if (!(zwd instanceof zwd.a)) {
            return AppProtocolBase.a;
        }
        throw ExceptionHelper.e(new IapException(new AppProtocol.Message(String.format(je.x0(str, ": [%s]"), n(ImmutableSet.copyOf((Collection) Arrays.asList(A.split(((zwd.a) zwd).c())))))), "wamp.error"));
    }

    public static z H(e4 e4Var, String str) {
        z<String> v2 = e4Var.l.v(e4Var.z, str);
        v2.getClass();
        return new i(v2).h(e4Var.w.a(str));
    }

    static void N(String[] strArr, String str, a0 a0Var) {
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        try {
            HashMap<OptionExtrasUtil.UriOptionExtras, ?> c2 = OptionExtrasUtil.c(strArr);
            OptionExtrasUtil.UriOptionExtras uriOptionExtras = OptionExtrasUtil.UriOptionExtras.STREAMTYPE;
            if (c2.containsKey(uriOptionExtras) && OptionExtrasUtil.Streamtype.ALARM == ((OptionExtrasUtil.Streamtype) c2.get(uriOptionExtras))) {
                Logger.b("UriOptionExtra StreamTypeAlarm", new Object[0]);
                builder.audioStream(AudioStream.ALARM);
            }
            b(str, c2, builder);
            a0Var.onSuccess(builder.build());
        } catch (Exception e2) {
            a0Var.onError(new IapException(e2.getMessage(), "wamp.error"));
        }
    }

    static /* synthetic */ void P(AppProtocol.UriWithNamedOptions uriWithNamedOptions, a0 a0Var) {
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        try {
            a(OptionExtrasUtil.b(uriWithNamedOptions), builder);
            a0Var.onSuccess(builder.build());
        } catch (Exception e2) {
            a0Var.onError(new IapException(e2.getMessage(), "wamp.error"));
        }
    }

    private static void a(HashMap<OptionExtrasUtil.UriOptionExtras, ?> hashMap, PreparePlayOptions.Builder builder) {
        OptionExtrasUtil.a aVar;
        OptionExtrasUtil.UriOptionExtras uriOptionExtras = OptionExtrasUtil.UriOptionExtras.TRACK_UID;
        if (hashMap.containsKey(uriOptionExtras)) {
            String str = (String) hashMap.get(uriOptionExtras);
            if (str != null) {
                Logger.b("UriOptionExtra TrackUid %s", str);
                builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackUid(str).build());
                return;
            }
            return;
        }
        OptionExtrasUtil.UriOptionExtras uriOptionExtras2 = OptionExtrasUtil.UriOptionExtras.TRACK_URI;
        if (hashMap.containsKey(uriOptionExtras2)) {
            String str2 = (String) hashMap.get(uriOptionExtras2);
            if (str2 != null) {
                Logger.b("UriOptionExtra TrackUri %s", str2);
                builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackUri(str2).build());
                return;
            }
            return;
        }
        OptionExtrasUtil.UriOptionExtras uriOptionExtras3 = OptionExtrasUtil.UriOptionExtras.TRACK_INDEX;
        if (hashMap.containsKey(uriOptionExtras3) && (aVar = (OptionExtrasUtil.a) hashMap.get(uriOptionExtras3)) != null) {
            Logger.b("UriOptionExtra TrackIndex %s", Integer.valueOf(aVar.a()));
            builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf((long) aVar.a())).build());
        }
    }

    private static void b(String str, HashMap<OptionExtrasUtil.UriOptionExtras, ?> hashMap, PreparePlayOptions.Builder builder) {
        OptionExtrasUtil.a aVar;
        if (l0.b(str, LinkType.ALBUM) || l0.b(str, LinkType.PLAYLIST_V2)) {
            OptionExtrasUtil.UriOptionExtras uriOptionExtras = OptionExtrasUtil.UriOptionExtras.TRACK_INDEX;
            if (hashMap.containsKey(uriOptionExtras) && (aVar = (OptionExtrasUtil.a) hashMap.get(uriOptionExtras)) != null) {
                Logger.b("UriOptionExtra TrackIndex %s", Integer.valueOf(aVar.a()));
                builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf((long) aVar.a())).build());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public z<AppProtocolBase.Empty> O(String str, PreparePlayOptions preparePlayOptions, String str2) {
        s P = z.z(a4.a(str)).s(new k2(this, preparePlayOptions, str2)).A(new r1("Cannot play specified uri")).P();
        z<String> n2 = this.l.n(this.z, str, null);
        n2.getClass();
        return P.E0(new i(n2).N()).B0();
    }

    /* access modifiers changed from: private */
    public static AppProtocol.ListItems e(List<MediaBrowserItem> list, int i2, int i3) {
        int i4 = i2;
        int i5 = i3 == 0 ? Integer.MAX_VALUE : i3;
        if (i5 <= 0 || i4 < 0 || i4 >= list.size()) {
            return new AppProtocol.ListItems(i5, i4, list.size(), new AppProtocol.ListItem[0]);
        }
        ArrayList arrayList = new ArrayList(Math.min(list.size(), i5));
        int i6 = i4;
        while (i6 < i4 + i5 && i6 < list.size()) {
            MediaBrowserItem mediaBrowserItem = list.get(i6);
            String e2 = mediaBrowserItem.e();
            String e3 = mediaBrowserItem.e();
            String valueOf = String.valueOf(mediaBrowserItem.f());
            String i7 = mediaBrowserItem.i();
            String l2 = mediaBrowserItem.l() == null ? "" : mediaBrowserItem.l();
            boolean z2 = mediaBrowserItem.a() == MediaBrowserItem.ActionType.PLAYABLE;
            boolean z3 = mediaBrowserItem.a() == MediaBrowserItem.ActionType.BROWSABLE;
            boolean o2 = mediaBrowserItem.o();
            AppProtocol.Metadata metadata = new AppProtocol.Metadata();
            if (l0.z(mediaBrowserItem.e()).q() == LinkType.TRACK || l0.z(mediaBrowserItem.e()).q() == LinkType.SHOW_EPISODE) {
                metadata.setExplicitContent(Boolean.valueOf(mediaBrowserItem.p()));
                if (mediaBrowserItem.d().containsKey("com.spotify.music.extra.DURATION_MS")) {
                    metadata.setDuration(Long.valueOf(mediaBrowserItem.d().getLong("com.spotify.music.extra.DURATION_MS", -1)));
                }
            }
            if (l0.z(mediaBrowserItem.e()).q() == LinkType.SHOW_EPISODE) {
                if (mediaBrowserItem.d().containsKey("com.spotify.music.extra.TIME_LEFT_MS")) {
                    metadata.setTimeLeft(Long.valueOf(mediaBrowserItem.d().getLong("com.spotify.music.extra.TIME_LEFT_MS", -1)));
                }
                metadata.setIsPlayed(Boolean.valueOf(mediaBrowserItem.b() == MediaBrowserItem.CompletionState.FULLY_PLAYED));
            }
            arrayList.add(new AppProtocol.ListItem(e2, e3, valueOf, i7, l2, z2, z3, o2, metadata));
            i6++;
            i4 = i2;
            i5 = i5;
        }
        return new AppProtocol.ListItems(i5, i2, list.size(), (AppProtocol.ListItem[]) arrayList.toArray(new AppProtocol.ListItem[0]));
    }

    private s<AppProtocol.Image> m(AppProtocol.ImageIdentifier imageIdentifier, int i2, int i3, boolean z2) {
        return z.g(new z1(this, imageIdentifier, i2, i3, z2)).P();
    }

    private io.reactivex.a m0(boolean z2, String str, String str2) {
        if (z2) {
            return this.c.n2().a(str, str2);
        }
        return this.c.n2().c(str);
    }

    private static String n(Set<String> set) {
        if (set.contains(DisallowReasons.MFT) || set.contains("disallow-mft-radio")) {
            return "CANT_PLAY_ON_DEMAND";
        }
        if (set.contains(DisallowReasons.AD) || set.contains("endless_context") || set.contains("disallow-radio")) {
            return "ACTION_NOT_ALLOWED_IN_CONTEXT";
        }
        if (set.contains("invalid_uri")) {
            return "NOT_A_VALID_URI";
        }
        return set.contains(PlayerError.ERROR_IN_OFFLINE_MODE) ? "TRACK_UNAVAILABLE_OFFLINE" : "UNKNOWN";
    }

    public void A(AppProtocol.ImageIdentifier imageIdentifier, int i2, int i3, boolean z2, a0 a0Var) {
        int i4;
        int i5;
        int i6 = imageIdentifier.width;
        if (i6 > 0) {
            i4 = Math.min(i6, (int) AppProtocol.Image.MAX_IMAGE_DIMENSION);
        } else {
            i4 = Math.min(i2, (int) AppProtocol.Image.MAX_IMAGE_DIMENSION);
        }
        int i7 = imageIdentifier.height;
        if (i7 > 0) {
            i5 = Math.min(i7, (int) AppProtocol.Image.MAX_IMAGE_DIMENSION);
        } else {
            i5 = Math.min(i3, (int) AppProtocol.Image.MAX_IMAGE_DIMENSION);
        }
        String str = imageIdentifier.imageType;
        if (str == null) {
            str = this.o.info.imageType;
        }
        if (!this.q) {
            this.e.i();
        }
        c cVar = this.e;
        Uri parse = Uri.parse(imageIdentifier.id);
        ImageFormat imageFormat = ImageFormat.JPEG;
        if (!"jpeg".equals(str) && "png".equals(str)) {
            imageFormat = ImageFormat.PNG;
        }
        a0Var.e(new y1(this, cVar.g(parse, imageFormat, i4, i5, z2, new a(a0Var, i4, i5))));
    }

    public /* synthetic */ AppProtocol.PlayerState B(PlayerState playerState) {
        return AppProtocol.PlayerState.playerStateFrom(playerState, this.i);
    }

    public /* synthetic */ AppProtocol.SessionState D(SessionState sessionState) {
        return new AppProtocol.SessionState(sessionState, r.a(this.a));
    }

    public /* synthetic */ void E() {
        this.c.A3().h();
    }

    public /* synthetic */ AppProtocol.TrackElapsed F(PlayerState playerState) {
        return new AppProtocol.TrackElapsed(playerState, this.i);
    }

    public d0 I(String str, AppProtocol.Identifier identifier, LoggingParams loggingParams) {
        PlayOrigin playOrigin;
        i2 i2Var = this.v;
        h2.a c2 = h2.c(str);
        String str2 = identifier.featureIdentifier;
        String b2 = this.z.b();
        if (str2 == null) {
            playOrigin = B;
        } else {
            playOrigin = PlayOrigin.builder(str2).referrerIdentifier(b2).build();
        }
        c2.f(playOrigin);
        c2.d(loggingParams);
        return i2Var.p(c2.b());
    }

    public /* synthetic */ void J(Optional optional) {
        if (optional.isPresent()) {
            this.e.d((c.b) optional.get());
        }
    }

    public e K(Optional optional) {
        z<zwd> s2 = this.v.s(optional);
        s2.getClass();
        return new i(s2);
    }

    public e L(LoggingParams loggingParams) {
        z<zwd> r2 = this.v.r(loggingParams);
        r2.getClass();
        return new i(r2);
    }

    public d0 M(PreparePlayOptions preparePlayOptions, String str, String str2) {
        PlayOrigin playOrigin;
        String b2 = ((u2) this.s).b().b();
        l0 z2 = l0.z(str2);
        boolean z3 = false;
        if ("9cc4aaeb43f24b098cff096385f00233".equals(b2) && z2.q() == LinkType.TRACK) {
            z3 = true;
        }
        if (z3) {
            return this.x.a(str2, preparePlayOptions);
        }
        h2.a c2 = h2.c(str2);
        if (str == null) {
            playOrigin = B;
        } else {
            playOrigin = PlayOrigin.builder(str).referrerIdentifier(b2).build();
        }
        c2.f(playOrigin);
        if (preparePlayOptions != null) {
            c2.g(preparePlayOptions);
        }
        return this.c.Z2().p(c2.b());
    }

    public /* synthetic */ d0 Q(AppProtocol.UriWithNamedOptions uriWithNamedOptions, PreparePlayOptions preparePlayOptions) {
        return O(uriWithNamedOptions.uri, preparePlayOptions, uriWithNamedOptions.featureIdentifier);
    }

    public /* synthetic */ AppProtocolBase.Empty R(AppProtocol.Uri uri, PlayerState playerState) {
        Restrictions restrictions = playerState.restrictions();
        if (restrictions.disallowInsertingIntoNextTracksReasons().isEmpty()) {
            this.c.C0().i(this.a, uri.uri);
            return AppProtocolBase.a;
        }
        throw new IapException(new AppProtocol.Message(String.format("Cannot queue specified uri: [%s]", n(restrictions.disallowInsertingIntoNextTracksReasons()))), "wamp.error");
    }

    public /* synthetic */ d0 S(AppProtocol.PlaybackPosition playbackPosition, Optional optional) {
        return this.v.t(playbackPosition.position, optional);
    }

    public /* synthetic */ d0 T(AppProtocol.PlaybackPosition playbackPosition, Optional optional) {
        return this.v.l(playbackPosition.position, optional);
    }

    public /* synthetic */ AppProtocolBase.Empty U(AppProtocol.Repeat repeat) {
        int i2 = repeat.repeat;
        if (i2 == 0) {
            this.v.c();
        } else if (i2 == 1) {
            this.v.o();
        } else if (i2 != 2) {
            StringBuilder V0 = je.V0("Unexpected repeat ");
            V0.append(repeat.repeat);
            Assertion.p(V0.toString());
        } else {
            this.v.b();
        }
        return AppProtocolBase.a;
    }

    public /* synthetic */ e V(AppProtocol.Saved saved, PlayerState playerState) {
        String contextUri = playerState.contextUri();
        String str = saved.uri;
        if (str != null || saved.id != null) {
            return m0(saved.saved, (String) MoreObjects.firstNonNull(str, saved.id), contextUri);
        }
        ContextTrack orNull = playerState.track().orNull();
        if (orNull == null) {
            Assertion.p("Track is null");
            return io.reactivex.internal.operators.completable.b.a;
        }
        return m0(saved.saved, orNull.uri(), contextUri);
    }

    public /* synthetic */ AppProtocolBase.Empty W(AppProtocol.Shuffle shuffle, PlayerState playerState) {
        Restrictions restrictions = playerState.restrictions();
        if (restrictions.disallowTogglingShuffleReasons().isEmpty()) {
            if (shuffle.shuffle) {
                this.v.i();
            } else {
                this.v.q();
            }
            return AppProtocolBase.a;
        }
        throw new IapException(new AppProtocol.Message(String.format("Cannot set shuffle: [%s]", n(restrictions.disallowTogglingShuffleReasons()))), "wamp.error");
    }

    public /* synthetic */ d0 X(LoggingParams loggingParams) {
        return this.v.e(Optional.of(loggingParams));
    }

    public /* synthetic */ d0 Y(AppProtocol.SkipPrevious skipPrevious, Optional optional) {
        return this.v.k(optional, skipPrevious == null || !skipPrevious.forceSkipPrevious);
    }

    public v Z(AppProtocol.Identifier identifier) {
        if (identifier == null || MoreObjects.isNullOrEmpty(identifier.id)) {
            return new io.reactivex.internal.operators.observable.v(this.h.O(m3.a).C(d.a).O(e.a).O(a.a).h0(1));
        }
        return s.i0(identifier.id);
    }

    public v a0(AppProtocol.Identifier identifier, String str) {
        return this.l.n(this.z, str, null).A(e2.a).s(new q1(this, str, identifier)).A(new r1("Couldn't start radio")).P();
    }

    public void b0(df2 df2, int i2) {
        c(4);
        b bVar = this.j;
        int g2 = df2.g();
        String h2 = df2.h();
        bVar.f(0, Integer.MAX_VALUE, g2, "request id");
        bVar.d(h2, "uri");
        ff2 a2 = this.r.a(df2.h());
        if (a2 != null) {
            a2.f(df2, i2);
        } else {
            Logger.n("Attempted to notify subscribed to unknown topic \"%s\".", df2.h());
        }
    }

    public void c(int i2) {
        this.n.d(i2).i();
    }

    public s<AppProtocolBase.Empty> d() {
        s g2 = this.n.c(1).d(io.reactivex.a.u(new l1(this))).g(this.c.A3().j().P0(n3.a).W(g1.a, false, Integer.MAX_VALUE).R0(25, TimeUnit.SECONDS).q0(q2.a));
        z<String> m2 = this.l.m(this.z);
        m2.getClass();
        return g2.E0(new i(m2).N());
    }

    public s<AppProtocolBase.Empty> d0(AppProtocol.Identifier identifier) {
        return O(identifier.id, null, identifier.featureIdentifier).P().E0(this.n.c(8).N());
    }

    public s<AppProtocolBase.Empty> e0(AppProtocol.Uri uri) {
        return O(uri.uri, null, uri.featureIdentifier).P().E0(this.n.c(2).N());
    }

    public s<AppProtocol.Capabilities> f() {
        s<String> a2 = this.f.a("type");
        z3 z3Var = this.n;
        z3Var.getClass();
        return a2.E0(io.reactivex.a.u(new t0(z3Var)).N()).j0(o3.a).q0(a2.a);
    }

    public s<AppProtocolBase.Empty> f0(AppProtocol.UriWithNamedOptions uriWithNamedOptions) {
        return z.g(new f1(uriWithNamedOptions)).s(new d1(this, uriWithNamedOptions)).P().E0(this.n.c(2).N());
    }

    public s<AppProtocol.ListItems> g(AppProtocol.ChildrenPageRequest childrenPageRequest) {
        Integer num = childrenPageRequest.limit;
        int intValue = num == null ? 20 : num.intValue();
        String str = childrenPageRequest.parentId;
        if (str.equals("spotify:recently-played")) {
            str = "com.spotify.recently-played";
        } else if (str.equals("spotify:browse")) {
            str = "com.spotify.browse";
        }
        w1 w1Var = this.u;
        BrowserParams.a c2 = BrowserParams.c(str, false);
        c2.g(this.o.info.name);
        c2.c(this.o.info.id);
        c2.b(this.y);
        s<R> P = w1Var.a(c2.build(), new Bundle(), (long) childrenPageRequest.offset, (long) intValue).A(new b2(childrenPageRequest, intValue)).m(new p2(str)).P();
        z<String> q2 = this.l.q(this.z, childrenPageRequest.parentId);
        q2.getClass();
        return P.E0(new i(q2).N()).E0(this.n.c(8).N());
    }

    public s<AppProtocolBase.Empty> g0(AppProtocol.UriWithOptionExtras uriWithOptionExtras) {
        String str = uriWithOptionExtras.uri;
        return z.g(new j1(uriWithOptionExtras.options, str)).s(new l2(this, str, uriWithOptionExtras.featureIdentifier)).P().E0(this.n.c(2).N());
    }

    public s<AppProtocol.CrossfadeState> h() {
        return this.c.i1().j0(n2.a);
    }

    public s<AppProtocolBase.Empty> h0(AppProtocol.Uri uri) {
        s<PlayerState> P = this.h.c0(this.n.c(2).M()).E().P();
        z<String> t2 = this.l.t(this.z, uri.uri);
        t2.getClass();
        return P.E0(new i(t2).N()).j0(new t1(this, uri));
    }

    public s<AppProtocol.Context> i() {
        return new tq1(this.c, this.k, this.h).a().E0(this.n.c(4).N()).T().P().j0(new p1(this));
    }

    public s<AppProtocolBase.Empty> i0(AppProtocol.PlaybackPosition playbackPosition) {
        return this.l.g(this.z, playbackPosition.position).A(n1.a).s(new e1(this, playbackPosition)).A(new r1("Cannot seek in song")).P().E0(this.n.c(1).N());
    }

    public s<AppProtocol.TrackData> j() {
        g<R> c0 = this.h.O(p3.a).c0(this.n.c(4).M());
        c0.getClass();
        return new io.reactivex.internal.operators.observable.v(c0);
    }

    public s<AppProtocolBase.Empty> j0(AppProtocol.PlaybackPosition playbackPosition) {
        return this.l.c(this.z, playbackPosition.position).A(h1.a).s(new i1(this, playbackPosition)).A(new r1("Cannot seek by in a song")).P().E0(this.n.c(1).N());
    }

    public yda k() {
        yda yda = this.z;
        return yda == null ? C : yda;
    }

    public s<AppProtocolBase.Empty> k0(AppProtocol.PlaybackSpeed playbackSpeed) {
        int i2 = playbackSpeed.playbackSpeed;
        if (i2 == 0) {
            return new io.reactivex.internal.operators.observable.v(this.h.c0(this.n.c(1).M()).c0(this.l.u(this.z).A(h2.a).t(new b3(this)).M()).i0(y2.a).C(w1.a).O(z2.a).j0(25, TimeUnit.SECONDS)).q0(v1.a);
        } else if (i2 == 1) {
            return new io.reactivex.internal.operators.observable.v(this.h.c0(this.n.c(1).M()).c0(this.l.h(this.z).A(v2.a).t(new m1(this)).M()).i0(b1.a).C(u1.a).O(u2.a).j0(25, TimeUnit.SECONDS)).q0(z0.a);
        } else if (i2 == 50 || i2 == 80 || i2 == 100 || i2 == 120 || i2 == 150 || i2 == 200 || i2 == 300) {
            SpeedControlInteractor speedControlInteractor = this.d;
            speedControlInteractor.getClass();
            return speedControlInteractor.d(i2).E(this.n.c(2)).l(new io.reactivex.internal.operators.observable.z(this.c.A3().j().T().P().W(a3.a, false, Integer.MAX_VALUE))).l(new io.reactivex.internal.operators.observable.z(p().T().P().W(c1.a, false, Integer.MAX_VALUE))).N().x(s.i0(AppProtocolBase.a)).j0(k1.a).R0(25, TimeUnit.SECONDS).q0(s2.a);
        } else {
            StringBuilder V0 = je.V0("Unexpected playback speed ");
            V0.append(playbackSpeed.playbackSpeed);
            return IapException.b(V0.toString());
        }
    }

    public s<AppProtocol.Image> l(AppProtocol.ImageIdentifier imageIdentifier) {
        HelloDetailsAppProtocol$Info helloDetailsAppProtocol$Info = this.o.info;
        return m(imageIdentifier, helloDetailsAppProtocol$Info.defaultImageWidth, helloDetailsAppProtocol$Info.defaultImageHeight, true).E0(this.n.b(4, imageIdentifier).N());
    }

    public s<AppProtocolBase.Empty> l0(AppProtocol.Repeat repeat) {
        io.reactivex.a aVar;
        i iVar;
        int i2 = repeat.repeat;
        if (i2 == 0) {
            z<String> o2 = this.l.o(this.z);
            o2.getClass();
            iVar = new i(o2);
        } else if (i2 == 1) {
            z<String> a2 = this.l.a(this.z);
            a2.getClass();
            iVar = new i(a2);
        } else if (i2 != 2) {
            aVar = io.reactivex.internal.operators.completable.b.a;
            return s.c0(new x2(this, repeat)).E0(this.n.c(1).N()).E0(aVar.N());
        } else {
            z<String> p2 = this.l.p(this.z);
            p2.getClass();
            iVar = new i(p2);
        }
        aVar = iVar;
        return s.c0(new x2(this, repeat)).E0(this.n.c(1).N()).E0(aVar.N());
    }

    public s<AppProtocolBase.Empty> n0(AppProtocol.Saved saved) {
        s g2 = this.h.c0(this.n.c(1).M()).E().t(new r2(this, saved)).g(s.i0(AppProtocolBase.a));
        z<String> j2 = this.l.j(this.z, saved.saved);
        j2.getClass();
        return g2.E0(new i(j2).N());
    }

    public s<AppProtocol.PlaybackSpeed> o() {
        return this.h.c0(this.n.c(4).M()).E().P().j0(c.a);
    }

    public s<AppProtocolBase.Empty> o0(AppProtocol.Shuffle shuffle) {
        s<R> j0 = this.h.c0(this.n.c(1).M()).E().P().j0(new a1(this, shuffle));
        z<String> i2 = this.l.i(this.z, shuffle.shuffle);
        i2.getClass();
        return j0.E0(new i(i2).N());
    }

    public s<AppProtocol.PlayerState> p() {
        return this.h.c0(this.n.c(4).M()).E().P().j0(new w2(this));
    }

    public s<AppProtocolBase.Empty> p0() {
        return this.l.s(this.z).A(j2.a).s(new m2(this)).A(new r1("Cannot skip song")).P().E0(this.n.c(1).N());
    }

    @Deprecated
    public s<AppProtocol.Rating> q() {
        return this.n.c(4).g(s.i0(new AppProtocol.Rating(ThumbState.NONE)));
    }

    public s<AppProtocolBase.Empty> q0(AppProtocol.SkipPrevious skipPrevious) {
        return this.l.f(this.z).A(o1.a).s(new g2(this, skipPrevious)).A(new r1("Cannot skip song")).P().E0(this.n.c(1).N());
    }

    public s<AppProtocol.ListItems> r(AppProtocol.RootListOptions rootListOptions) {
        String str;
        String str2 = "default";
        if (rootListOptions == null || str2.equals(rootListOptions.type)) {
            if ("car".equals(this.z.a())) {
                str2 = "default-cars";
            }
            str = str2;
        } else {
            str = rootListOptions.type;
        }
        this.y = str;
        Bundle E = je.E("_type", str);
        BrowserParams.a c2 = BrowserParams.c(this.p, true);
        c2.g(this.o.info.name);
        c2.c(this.o.info.id);
        c2.b(str);
        s<R> E0 = this.u.a(c2.build(), E, 0, 20).A(d2.a).P().E0(this.n.c(8).N());
        z<String> q2 = this.l.q(this.z, this.p);
        q2.getClass();
        return E0.E0(new i(q2).N());
    }

    public s<AppProtocolBase.Empty> r0(int i2) {
        return new wl1(this.l, this.c.C0(), this.v).b(i2, this.z).E(this.n.c(1)).g(s.i0(AppProtocolBase.a));
    }

    public s<AppProtocol.Repeat> s() {
        return this.h.c0(this.n.c(4).M()).E().P().j0(l3.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s0(int r2, defpackage.ff2.a r3, com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails r4, java.lang.String r5, java.lang.String r6, com.spotify.music.libs.bluetooth.CategorizerResponse r7) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.appprotocol.e4.s0(int, ff2$a, com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails, java.lang.String, java.lang.String, com.spotify.music.libs.bluetooth.CategorizerResponse):void");
    }

    public s<AppProtocol.Saved> t(AppProtocol.Identifier identifier) {
        String str;
        if (identifier != null && (str = identifier.id) != null && !str.isEmpty()) {
            return this.c.n2().b(identifier.id).A(new i2(identifier)).P();
        }
        g<R> c0 = this.h.O(k3.a).c0(this.n.c(1).M());
        c0.getClass();
        return new io.reactivex.internal.operators.observable.v(c0);
    }

    public s<AppProtocolBase.Empty> t0(AppProtocol.Identifier identifier) {
        return s.i0(identifier).E0(this.n.c(1).N()).J0(new s1(this)).a0(new t2(this)).Q(d.a).j0(c3.a).W(new y0(this, identifier), false, Integer.MAX_VALUE).R0(15, TimeUnit.SECONDS).q0(f2.a);
    }

    public s<AppProtocol.SessionState> u() {
        g<SessionState> gVar = this.g;
        gVar.getClass();
        return new io.reactivex.internal.operators.observable.v(gVar).E0(this.n.d(4).N()).j0(new o2(this));
    }

    public void u0() {
        io.reactivex.disposables.b bVar = this.t;
        if (bVar != null) {
            if (!bVar.d()) {
                this.t.dispose();
            }
            this.t = null;
        }
        t2 t2Var = this.s;
        if (t2Var != null) {
            ((u2) t2Var).a();
        }
        this.e.h();
        ks1 ks1 = this.r;
        if (ks1 != null) {
            ks1.f();
        }
    }

    public s<AppProtocol.Shuffle> v() {
        return this.h.c0(this.n.c(4).M()).E().P().j0(r3.a);
    }

    public int v0(int i2, String str) {
        c(4);
        b bVar = this.j;
        bVar.f(0, Integer.MAX_VALUE, i2, "request id");
        bVar.d(str, "uri");
        ff2 a2 = this.r.a(str);
        if (a2 != null) {
            return a2.i();
        }
        Logger.n("Attempted to subscribe to unknown topic \"%s\".", str);
        return this.m.getAndIncrement();
    }

    public s<AppProtocol.Image> w(AppProtocol.ImageIdentifier imageIdentifier) {
        HelloDetailsAppProtocol$Info helloDetailsAppProtocol$Info = this.o.info;
        return m(imageIdentifier, helloDetailsAppProtocol$Info.defaultThumbnailImageWidth, helloDetailsAppProtocol$Info.defaultThumbnailImageHeight, false).E0(this.n.b(8, imageIdentifier).N());
    }

    public s<AppProtocolBase.Empty> w0() {
        g<PlayerState> gVar = this.h;
        gVar.getClass();
        return new io.reactivex.internal.operators.observable.v(gVar).j0(v0.a).W(new j3(this), false, Integer.MAX_VALUE);
    }

    public s<AppProtocol.TrackElapsed> x() {
        return new io.reactivex.internal.operators.observable.v(this.h.c0(this.n.c(4).M()).O(new x1(this)));
    }

    public s<AppProtocolBase.Empty> x0() {
        g<PlayerState> gVar = this.h;
        gVar.getClass();
        return new io.reactivex.internal.operators.observable.v(gVar).j0(c2.a).W(new q3(this), false, Integer.MAX_VALUE);
    }

    public boolean y0(int i2, int i3) {
        b bVar = this.j;
        bVar.f(0, Integer.MAX_VALUE, i2, "request id");
        bVar.f(Integer.MIN_VALUE, Integer.MAX_VALUE, i3, "subscription id");
        ff2 b2 = this.r.b(i3);
        if (b2 == null) {
            return false;
        }
        b2.j(i3);
        return true;
    }

    public AppProtocol.Context z(u3 u3Var) {
        if (u3Var.a == null || u3Var.b == null) {
            return AppProtocol.Context.EMPTY;
        }
        S s2 = u3Var.b;
        s2.getClass();
        F f2 = u3Var.a;
        f2.getClass();
        return new AppProtocol.Context(s2, f2, this.a);
    }
}
