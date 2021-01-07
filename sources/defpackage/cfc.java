package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.common.uri.SpotifyUriParserException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonSerialize(using = ToStringSerializer.class)
/* renamed from: cfc  reason: default package */
public final class cfc {
    public static final a b = new a(null);
    private final SpotifyUri a;

    /* renamed from: cfc$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    @JsonCreator
    public cfc(String str) {
        SpotifyUri spotifyUri;
        if (!(str == null || str.length() == 0)) {
            try {
                spotifyUri = new SpotifyUri(str);
            } catch (SpotifyUriParserException unused) {
                Logger.l("Invalid/unsupported URI: %s", str);
            }
            this.a = spotifyUri;
        }
        spotifyUri = null;
        this.a = spotifyUri;
    }

    public final String a() {
        SpotifyUri spotifyUri = this.a;
        if (spotifyUri != null) {
            return spotifyUri.toString();
        }
        return null;
    }

    public boolean equals(Object obj) {
        SpotifyUri spotifyUri;
        SpotifyUri spotifyUri2 = this.a;
        return spotifyUri2 != null && (obj instanceof cfc) && (spotifyUri = ((cfc) obj).a) != null && spotifyUri2.k(spotifyUri);
    }

    public int hashCode() {
        SpotifyUri spotifyUri = this.a;
        boolean z = true;
        if (spotifyUri == null) {
            return 1;
        }
        SpotifyUri.Kind i = spotifyUri.i();
        h.d(i, "uri.kind");
        if (!(i == SpotifyUri.Kind.PLAYLIST || i == SpotifyUri.Kind.PLAYLIST_V2)) {
            z = false;
        }
        if (!z) {
            return this.a.hashCode();
        }
        String h = this.a.h();
        if (h != null) {
            return h.hashCode();
        }
        return 0;
    }

    public String toString() {
        String a2 = a();
        return !(a2 == null || a2.length() == 0) ? a2 : "<empty>";
    }
}
