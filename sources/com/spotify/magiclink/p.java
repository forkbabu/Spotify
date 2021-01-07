package com.spotify.magiclink;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.magiclink.a;
import java.util.regex.Pattern;

public final class p {
    private static final Pattern a = Pattern.compile("#");

    static Optional<o> a(String str) {
        if (MoreObjects.isNullOrEmpty(str)) {
            return Optional.absent();
        }
        Uri parse = Uri.parse(MoreObjects.nullToEmpty(str));
        if (!"/login/ott/music".equalsIgnoreCase(parse.getEncodedPath())) {
            return Optional.absent();
        }
        Uri parse2 = Uri.parse(a.matcher(parse.toString()).replaceFirst("?"));
        String queryParameter = parse2.getQueryParameter("username");
        String queryParameter2 = parse2.getQueryParameter("token");
        String queryParameter3 = parse2.getQueryParameter("passwordToken");
        if (MoreObjects.isNullOrEmpty(queryParameter) || MoreObjects.isNullOrEmpty(queryParameter2)) {
            return Optional.absent();
        }
        a.C0170a aVar = new a.C0170a();
        aVar.d(queryParameter);
        aVar.c(queryParameter2);
        aVar.b(queryParameter3);
        return Optional.of(aVar.a());
    }
}
