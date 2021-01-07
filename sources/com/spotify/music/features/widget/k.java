package com.spotify.music.features.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.C0707R;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import io.reactivex.g;
import io.reactivex.y;

public class k implements d, SpotifyServiceIntentProcessor {
    private final Context a;
    private final i b;
    private final g<PlayerState> c;
    private final o f;
    private String n;
    private Bitmap o;
    private PlayerState p;
    private final Picasso q;
    private final b r;
    private final q s = new q();

    private class b implements f0 {
        private String a;

        b(a aVar) {
        }

        public void a(String str) {
            this.a = str;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            k.this.i();
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            String str = this.a;
            if (str == null || !str.equals(k.this.n)) {
                k.this.o = null;
            } else {
                k.this.o = bitmap;
            }
            k.this.i();
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public k(Context context, i iVar, g<PlayerState> gVar, y yVar, o oVar, Picasso picasso) {
        this.a = context;
        this.b = iVar;
        this.c = gVar.Q(yVar);
        this.f = oVar;
        this.q = picasso;
        this.r = new b(null);
    }

    public static void h(k kVar, PlayerState playerState) {
        String c2;
        kVar.p = playerState;
        if (playerState.track().isPresent() && (c2 = kxd.c(kVar.p.track().get())) != null && !c2.equals(kVar.n)) {
            kVar.n = c2;
            kVar.o = null;
            kVar.r.a(c2);
            kVar.q.m(c2).v(C0707R.dimen.widget_cover_size, C0707R.dimen.widget_cover_size).a().o(kVar.r);
        }
        kVar.i();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i() {
        this.b.f(this.a, n.d(this.a, Optional.fromNullable(this.p), Optional.fromNullable(this.o), this.f.b(this.a)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        i();
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return com.spotify.mobile.android.service.plugininterfaces.a.a(this, z, intent, aVar);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.s.a(this.c.subscribe(new c(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.s.c();
        this.p = null;
        this.o = null;
        i();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SpotifyWidgetUpdaterPlugin";
    }
}
