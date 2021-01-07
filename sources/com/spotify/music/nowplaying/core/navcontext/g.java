package com.spotify.music.nowplaying.core.navcontext;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class g {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final PlayerState g;

    g(PlayerState playerState) {
        String contextUri;
        this.g = playerState;
        this.a = playerState.playOrigin().viewUri();
        this.b = playerState.contextUri();
        this.c = ((MoreObjects.isNullOrEmpty(q(playerState.track(), PlayerTrack.Metadata.MFT_INJECTION_SOURCE)) ^ true) || playerState.track().transform(e.a).or((V) Boolean.FALSE).booleanValue()) ? "" : contextUri;
        this.e = q(playerState.track(), "album_title");
        this.f = q(playerState.track(), "artist_name");
        this.d = MoreObjects.nullToEmpty(playerState.contextMetadata().get("context_description"));
    }

    private f k(ksb ksb, ksb ksb2) {
        return new f(ksb, ksb2, this.b, this.c);
    }

    private f l(ksb ksb, ksb ksb2, String str) {
        return new f(ksb, ksb2, this.b, str);
    }

    private static String q(Optional<ContextTrack> optional, String str) {
        return optional.transform(new b(str)).or((Optional<V>) "");
    }

    /* access modifiers changed from: package-private */
    public f a(EntityType entityType) {
        String q = q(this.g.track(), "advertiser");
        return l(entityType.i(), new msb(q), q(this.g.track(), "click_url"));
    }

    /* access modifiers changed from: package-private */
    public f b(EntityType entityType) {
        return k(entityType.i(), new msb(this.e));
    }

    /* access modifiers changed from: package-private */
    public f c(EntityType entityType) {
        String str = this.f;
        String q = q(this.g.track(), "artist_uri");
        String str2 = this.f;
        int i = 1;
        while (true) {
            if (MoreObjects.isNullOrEmpty(q)) {
                break;
            } else if (!this.b.equals(q)) {
                q = q(this.g.track(), String.format(Locale.getDefault(), "artist_uri:%d", Integer.valueOf(i)));
                str2 = q(this.g.track(), String.format(Locale.getDefault(), "artist_name:%d", Integer.valueOf(i)));
                i++;
            } else if (!MoreObjects.isNullOrEmpty(str2)) {
                str = str2;
            }
        }
        return k(entityType.i(), new msb(str));
    }

    public f d(EntityType entityType) {
        Optional<ContextTrack> track = this.g.track();
        if (!track.isPresent()) {
            return k(entityType.i(), new msb(this.d));
        }
        return l(entityType.i(), new msb(this.d), l0.z(this.g.contextUri()).D(track.get().uri()));
    }

    /* access modifiers changed from: package-private */
    public f e(EntityType entityType) {
        return l(entityType.i(), new msb(this.d), this.a);
    }

    /* access modifiers changed from: package-private */
    public f f(EntityType entityType) {
        return l(entityType.i(), entityType.h(), this.a);
    }

    /* access modifiers changed from: package-private */
    public f g(EntityType entityType) {
        String str;
        ksb i = entityType.i();
        String str2 = this.b;
        int i2 = agd.b;
        l0 z = l0.z(str2);
        int ordinal = z.q().ordinal();
        if (ordinal == 131 || ordinal == 217) {
            str = d0.a(z.k(), Locale.getDefault());
        } else {
            str = "";
        }
        return l(i, new msb(str), this.a);
    }

    /* access modifiers changed from: package-private */
    public f h(EntityType entityType) {
        return l(entityType.i(), new msb(""), this.a);
    }

    /* access modifiers changed from: package-private */
    public f i(EntityType entityType) {
        return k(entityType.i(), new msb(""));
    }

    /* access modifiers changed from: package-private */
    public f j(EntityType entityType) {
        return new f(entityType.i(), entityType.h(), this.b, this.c);
    }

    /* access modifiers changed from: package-private */
    public f m(EntityType entityType) {
        return k(entityType.i(), new msb(this.d));
    }

    /* access modifiers changed from: package-private */
    public f n(EntityType entityType) {
        return k(entityType.i(), new jsb(C0707R.string.player_title_by, this.e, this.f));
    }

    /* access modifiers changed from: package-private */
    public f o(EntityType entityType) {
        ksb i = entityType.i();
        msb msb = new msb(this.d);
        String str = (String) x.n(agd.b(this.a), "");
        String str2 = (String) x.n(agd.c(str), "");
        if (ViewUris.r0.a(str2)) {
            str = str2;
        }
        return l(i, msb, str);
    }

    /* access modifiers changed from: package-private */
    public f p(EntityType entityType) {
        return k(entityType.i(), new jsb(C0707R.string.player_title_search_for, l0.x(this.a) ? l0.z(this.a).k() : ""));
    }

    /* access modifiers changed from: package-private */
    public f r(EntityType entityType) {
        return new f(entityType.i(), entityType.h(), this.b, ViewUris.t1.toString());
    }

    /* access modifiers changed from: package-private */
    public f s(EntityType entityType) {
        return k(entityType.i(), new msb(this.f));
    }
}
