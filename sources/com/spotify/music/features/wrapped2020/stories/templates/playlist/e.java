package com.spotify.music.features.wrapped2020.stories.templates.playlist;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.wrapped2020.stories.share.a;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import com.spotify.wrapped2020.v1.proto.Top100PlaylistStoryResponse;
import com.squareup.picasso.Picasso;
import defpackage.lx1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e implements cmf<lx1> {
    private final Activity a;
    private final Picasso b;
    private final a c;
    private final Top100PlaylistStoryResponse f;
    private final v n;
    private final p o;
    private final ez8 p;

    public e(Activity activity, Picasso picasso, a aVar, Top100PlaylistStoryResponse top100PlaylistStoryResponse, v vVar, p pVar, ez8 ez8) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        h.e(aVar, "sharePayloadProviderFactory");
        h.e(top100PlaylistStoryResponse, "remoteData");
        h.e(vVar, "rootlistOperation");
        h.e(pVar, "rootlistEndpoint");
        h.e(ez8, "storiesLogger");
        this.a = activity;
        this.b = picasso;
        this.c = aVar;
        this.f = top100PlaylistStoryResponse;
        this.n = vVar;
        this.o = pVar;
        this.p = ez8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public lx1 invoke() {
        try {
            Activity activity = this.a;
            String p2 = this.f.p();
            h.d(p2, "remoteData.id");
            String s = this.f.s();
            h.d(s, "remoteData.previewUrl");
            Uri g = yy8.g(s);
            h.d(g, "remoteData.previewUrl.toUri()");
            String h = this.f.h();
            h.d(h, "remoteData.backgroundColor");
            int d = yy8.d(h);
            String i = this.f.i();
            h.d(i, "remoteData.backgroundColorInitial");
            int d2 = yy8.d(i);
            String q = this.f.q();
            h.d(q, "remoteData.imageUrl");
            Bitmap c2 = yy8.c(q, this.b);
            h.d(c2, "remoteData.imageUrl.toBitmap(picasso)");
            Gradient l = this.f.l();
            h.d(l, "remoteData.backgroundGradient");
            WrappedGradient h2 = yy8.h(l);
            String w = this.f.w();
            h.d(w, "remoteData.textHeader");
            String u = this.f.u();
            h.d(u, "remoteData.textBody");
            String v = this.f.v();
            h.d(v, "remoteData.textColor");
            int d3 = yy8.d(v);
            String m = this.f.m();
            h.d(m, "remoteData.buttonText");
            String o2 = this.f.o();
            h.d(o2, "remoteData.disabledButtonText");
            String r = this.f.r();
            h.d(r, "remoteData.playlistUri");
            d dVar = new d(p2, g, d, d2, c2, h2, w, u, d3, m, o2, r);
            v vVar = this.n;
            p pVar = this.o;
            a aVar = this.c;
            ShareConfiguration t = this.f.t();
            h.d(t, "remoteData.shareConfiguration");
            String l2 = t.l();
            h.d(l2, "remoteData.shareConfiguration.shareStoryType");
            ShareConfiguration t2 = this.f.t();
            h.d(t2, "remoteData.shareConfiguration");
            List<String> i2 = t2.i();
            h.d(i2, "remoteData.shareConfiguration.shareSchemesList");
            return new lx1.b(new PlaylistStory(activity, dVar, vVar, pVar, aVar.c(l2, i2), this.p));
        } catch (IOException unused) {
            return lx1.a.a;
        }
    }
}
