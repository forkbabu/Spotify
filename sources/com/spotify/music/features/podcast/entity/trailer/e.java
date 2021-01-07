package com.spotify.music.features.podcast.entity.trailer;

import defpackage.unc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class e implements unc {
    private final bre a;
    private final x57 b;

    public e(bre bre, x57 x57) {
        h.e(bre, "pageInstanceIdentifierProvider");
        h.e(x57, "logger");
        this.a = bre;
        this.b = x57;
    }

    @Override // defpackage.unc
    public String a() {
        String str = this.a.get();
        h.d(str, "pageInstanceIdentifierProvider.get()");
        return str;
    }

    @Override // defpackage.unc
    public String b(unc.a aVar) {
        h.e(aVar, "interaction");
        if (aVar instanceof unc.a.b) {
            String k = this.b.k(aVar.a());
            h.d(k, "logger.logTrailerPlayed(interaction.uri)");
            return k;
        } else if (aVar instanceof unc.a.C0688a) {
            String d = this.b.d(aVar.a());
            h.d(d, "logger.logTrailerPaused(interaction.uri)");
            return d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
