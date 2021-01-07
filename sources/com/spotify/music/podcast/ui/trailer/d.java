package com.spotify.music.podcast.ui.trailer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {
    private final b a;
    private final cqe b;
    private final y c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final SpotifyIconDrawable h;
    private final SpotifyIconDrawable i;
    private final List<WeakReference<a>> j = new ArrayList();
    private io.reactivex.disposables.b k = EmptyDisposable.INSTANCE;
    private e l;

    public interface a {
        void a(e eVar);
    }

    public interface b {
        s<e> a();
    }

    public d(Context context, b bVar, cqe cqe, y yVar) {
        this.a = bVar;
        this.b = cqe;
        this.c = yVar;
        Resources resources = context.getResources();
        this.d = nud.g(64.0f, resources);
        this.e = nud.g(64.0f, resources);
        this.f = nud.g(4.0f, resources);
        this.g = (float) nud.g(2.0f, resources);
        float g2 = (float) nud.g(20.0f, resources);
        this.h = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, g2);
        this.i = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, g2);
    }

    public void a(a aVar) {
        this.j.add(new WeakReference<>(aVar));
        if (this.k.d()) {
            this.k = this.a.a().o0(this.c).subscribe(new a(this), b.a);
        }
        e eVar = this.l;
        if (eVar != null) {
            ((PodcastTrailerOverlayDrawable) aVar).a(eVar);
        }
    }

    public PodcastTrailerOverlayDrawable b(Bitmap bitmap) {
        return new PodcastTrailerOverlayDrawable(bitmap, this.d, this.e, this.f, this.h, this.i, this.g, this, this.b);
    }

    public void c(e eVar) {
        Iterator<WeakReference<a>> it = this.j.iterator();
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(eVar);
            } else {
                it.remove();
            }
        }
        if (this.j.isEmpty()) {
            this.k.dispose();
            this.l = null;
        }
        this.l = eVar;
    }

    public void d(a aVar) {
        Iterator<WeakReference<a>> it = this.j.iterator();
        while (it.hasNext()) {
            if (aVar == it.next().get()) {
                it.remove();
            }
        }
        if (this.j.isEmpty()) {
            this.k.dispose();
            this.l = null;
        }
    }
}
