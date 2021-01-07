package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import android.app.Activity;
import android.net.Uri;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.TopFiveStoryResponse;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.h;

public final class g implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final TopFiveStoryResponse f;
    private final ez8 n;

    public g(Activity activity, Picasso picasso, a aVar, TopFiveStoryResponse topFiveStoryResponse, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(topFiveStoryResponse, "remoteData");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = topFiveStoryResponse;
        this.n = ez8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.spotify.music.features.wrapped2020.stories.templates.topfive.b] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.spotify.music.features.wrapped2020.stories.templates.topfive.b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.spotify.music.features.wrapped2020.stories.templates.topfive.a> a(com.spotify.wrapped2020.v1.proto.TopFiveStoryResponse r19) {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.wrapped2020.stories.templates.topfive.g.a(com.spotify.wrapped2020.v1.proto.TopFiveStoryResponse):java.util.List");
    }

    private final String d(String str) {
        return str.length() > 0 ? str : "#000000";
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String l = this.f.l();
            h.d(l, "remoteData.id");
            String m = this.f.m();
            h.d(m, "remoteData.previewUrl");
            Uri g = yy8.g(m);
            h.d(g, "remoteData.previewUrl.toUri()");
            String h = this.f.h();
            h.d(h, "remoteData.backgroundColor");
            f fVar = new f(l, g, yy8.d(h), a(this.f), this.f.o().size() == 3 ? 16 : 12);
            a aVar = this.c;
            ShareConfiguration n2 = this.f.n();
            h.d(n2, "remoteData.shareConfiguration");
            String l2 = n2.l();
            h.d(l2, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration n3 = this.f.n();
            h.d(n3, "remoteData.shareConfiguration");
            List<String> i = n3.i();
            h.d(i, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new e(activity, fVar, aVar.c(l2, i), this.n));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
