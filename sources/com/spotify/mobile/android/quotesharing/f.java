package com.spotify.mobile.android.quotesharing;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.spotify.mobile.android.share.menu.preview.api.c;
import com.spotify.mobile.android.share.menu.preview.api.d;
import com.spotify.mobile.android.share.menu.preview.api.e;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.jvm.internal.h;

public final class f implements e, i {
    private a a;
    private final e b;
    private final cb1 c;
    private final Picasso d;

    public f(e eVar, cb1 cb1, Picasso picasso) {
        h.e(eVar, "menu");
        h.e(cb1, "podcastQuotesLogger");
        h.e(picasso, "picasso");
        this.b = eVar;
        this.c = cb1;
        this.d = picasso;
    }

    public static final d b(f fVar) {
        Bitmap j;
        a aVar = fVar.a;
        if (aVar == null || (j = fVar.d.m(aVar.getImageUri()).j()) == null) {
            return d.a.a;
        }
        return new d.b(new c(aVar.e(), j, aVar.b(), aVar.c(), null, 16));
    }

    @Override // com.spotify.mobile.android.quotesharing.e
    public void a(a aVar) {
        h.e(aVar, "shareData");
        this.c.b(aVar.a());
        this.a = aVar;
        this.b.b();
    }

    @Override // com.spotify.mobile.android.quotesharing.i
    public void c(Bundle bundle) {
        h.e(bundle, "bundle");
        bundle.putParcelable("QuoteCardShareData", this.a);
    }

    @Override // com.spotify.mobile.android.quotesharing.i
    public void d(Bundle bundle) {
        this.a = bundle != null ? (a) bundle.getParcelable("QuoteCardShareData") : null;
    }

    public final List<cmf<d>> e() {
        return kotlin.collections.d.t(new QuoteShareActionHandlerImpl$providePayloadProvider$1(this));
    }
}
