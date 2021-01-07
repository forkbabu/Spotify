package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.mediabrowserservice.d2;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: mja  reason: default package */
public class mja {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final long k;
    private final long l;
    private final long m;

    public mja(MediaUriUtil mediaUriUtil, d2 d2Var, kja kja, c4e c4e, PlayerState playerState, ImmutableMap<String, String> immutableMap, Optional<pja> optional) {
        String str;
        String str2;
        boolean parseBoolean = Boolean.parseBoolean(immutableMap.get("is_advertisement"));
        this.a = immutableMap.get("title");
        if (parseBoolean) {
            str = immutableMap.get("advertiser");
        } else {
            str = immutableMap.get("artist_name");
        }
        this.b = str;
        String str3 = "";
        if (parseBoolean) {
            str2 = str3;
        } else {
            str2 = immutableMap.get("album_title");
        }
        this.c = str2;
        this.d = mediaUriUtil.c(immutableMap.get("image_large_url"), MediaUriUtil.Transformation.NONE).toString();
        this.e = d2Var.a(immutableMap.get("image_large_url")).toString();
        String contextUri = playerState.contextUri();
        l0 z = l0.z(contextUri);
        contextUri = z.q() == LinkType.PROFILE_PLAYLIST ? l0.A(z.i()).B() : contextUri;
        this.f = contextUri;
        String str4 = null;
        this.g = contextUri != null ? c4e.a(contextUri) : null;
        this.h = kja.a(playerState, immutableMap, contextUri, optional);
        this.i = optional.isPresent() ? optional.get().a() : str3;
        Optional<ContextTrack> track = playerState.track();
        this.j = track.isPresent() ? track.get().uri() : str4;
        long j2 = 1;
        this.k = Boolean.parseBoolean(immutableMap.get("is_explicit")) ? 1 : 0;
        this.l = !parseBoolean ? 0 : j2;
        this.m = playerState.duration().isPresent() ? playerState.duration().get().longValue() : -1;
    }

    public MediaMetadataCompat a() {
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        bVar.d("android.media.metadata.TITLE", this.a);
        bVar.d("android.media.metadata.ARTIST", this.b);
        bVar.d("android.media.metadata.ALBUM", this.c);
        bVar.c("android.media.metadata.DURATION", this.m);
        bVar.d("android.media.metadata.ALBUM_ART_URI", this.d);
        bVar.d("com.spotify.music.extra.ART_HTTPS_URI", this.e);
        bVar.c("android.media.IS_EXPLICIT", this.k);
        bVar.c("android.media.metadata.ADVERTISEMENT", this.l);
        bVar.d("com.spotify.music.extra.CONTEXT_SHARE_URL", this.g);
        bVar.d("com.spotify.music.extra.CONTEXT_URI", this.f);
        bVar.d("com.spotify.music.extra.CONTEXT_TITLE", this.h);
        bVar.d("com.spotify.music.extra.CONTEXT_DESCRIPTION", this.i);
        bVar.d("android.media.metadata.MEDIA_ID", this.j);
        return bVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mja)) {
            return false;
        }
        mja mja = (mja) obj;
        if (this.k != mja.k || this.l != mja.l || Math.abs(this.m - mja.m) >= 1000) {
            return false;
        }
        String str = this.a;
        if (str == null ? mja.a != null : !str.equals(mja.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? mja.b != null : !str2.equals(mja.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? mja.c != null : !str3.equals(mja.c)) {
            return false;
        }
        if (!this.d.equals(mja.d) || !this.e.equals(mja.e)) {
            return false;
        }
        String str4 = this.f;
        if (str4 == null ? mja.f != null : !str4.equals(mja.f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? mja.h != null : !str5.equals(mja.h)) {
            return false;
        }
        String str6 = this.i;
        if (str6 == null ? mja.i != null : !str6.equals(mja.i)) {
            return false;
        }
        String str7 = this.j;
        String str8 = mja.j;
        return str7 == null ? str8 == null : str7.equals(str8);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int Y0 = je.Y0(this.e, je.Y0(this.d, (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
        String str4 = this.f;
        int hashCode3 = (Y0 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode4 = (hashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.i;
        int hashCode5 = (hashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.j;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        long j2 = this.k;
        long j3 = this.l;
        long j4 = this.m;
        return ((((((hashCode5 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return String.format("{title: %s, trackUri: %s, contextUri: %s, contextTitle: %s, contextDescription: %s, artist: %s, album: %s, coverArtUri: %s, isExplicit: %s, isAd: %s}", this.a, this.j, this.f, this.h, this.i, this.b, this.c, this.d, Long.valueOf(this.k), Long.valueOf(this.l));
    }
}
