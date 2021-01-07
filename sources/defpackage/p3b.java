package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: p3b  reason: default package */
public class p3b {
    public static Optional<String> a(b91 b91) {
        if (b91.body().isEmpty() && !rqa.i(b91) && !rqa.l(b91) && !rqa.k(b91)) {
            return Optional.absent();
        }
        return Optional.of(b91.custom().string("pageIdentifier", PageIdentifiers.SEARCH.path()));
    }
}
