package defpackage;

import com.spotify.music.libs.collection.util.UriBuilder;

/* renamed from: ky3  reason: default package */
public final class ky3 {
    private final String a;

    private ky3(String str) {
        this.a = str;
    }

    public static ky3 a(String str) {
        return new ky3(str);
    }

    public UriBuilder b() {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/@/view/album/<b62-album-id>");
        uriBuilder.x(500);
        uriBuilder.p(this.a);
        uriBuilder.v(new ane("trackNumber", false, null, 6));
        uriBuilder.o(UriBuilder.Format.JSON);
        return uriBuilder;
    }
}
