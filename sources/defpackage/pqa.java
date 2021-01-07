package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.p81;

/* renamed from: pqa  reason: default package */
public final class pqa {
    public static p81 a(wsa wsa) {
        p81.a builder = n81.a(wsa.f()).toBuilder();
        if (wsa.b().isPresent()) {
            builder = builder.j("ui:index_in_block", wsa.b().get().intValue());
        }
        if (wsa.e().isPresent()) {
            builder = builder.p("ui:uri", wsa.e().get());
        }
        if (wsa.d().isPresent()) {
            builder = builder.p("ui:group", wsa.d().get());
        }
        if (wsa.c().isPresent()) {
            builder = builder.p("ui:source", wsa.c().get());
        }
        return builder.d();
    }

    public static String b(Optional<String> optional, Optional<Integer> optional2) {
        if (!optional.isPresent()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(optional.get());
        if (optional2.isPresent()) {
            sb.append('-');
            sb.append(optional2.get());
        }
        return sb.toString();
    }

    public static ImageConfig c(x81 x81) {
        if (x81 == null) {
            x81 = z81.e().e(SpotifyIconV2.PODCASTS).c();
        }
        ImageConfig.a a = ImageConfig.a();
        a.c(x81);
        a.b(ImageConfig.Size.SMALL);
        a.d(ImageConfig.Style.ROUNDED_SQUARE);
        a.a(false);
        return a.build();
    }

    public static boolean d(String str) {
        c.b bVar = ViewUris.q0;
        str.getClass();
        return bVar.a(str);
    }
}
