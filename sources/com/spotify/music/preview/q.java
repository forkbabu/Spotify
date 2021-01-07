package com.spotify.music.preview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q {
    private final v a;
    private final cqe b;
    private final y c;
    private final int d;
    private final int e;
    private final float f;
    private final SpotifyIconDrawable g;
    private final SpotifyIconDrawable h;
    private final Drawable i;
    private final List<WeakReference<b>> j = new ArrayList();
    private io.reactivex.disposables.b k = EmptyDisposable.INSTANCE;
    private z l;

    public interface a {
        q a(v vVar);
    }

    public interface b {
        void a(z zVar);
    }

    public q(Context context, v vVar, cqe cqe, y yVar) {
        this.a = vVar;
        this.b = cqe;
        this.c = yVar;
        Resources resources = context.getResources();
        this.d = nud.g(48.0f, resources);
        this.e = nud.g(48.0f, resources);
        this.f = (float) nud.g(2.0f, resources);
        float g2 = (float) nud.g(20.0f, resources);
        this.g = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, g2);
        this.h = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, g2);
        this.i = context.getResources().getDrawable(C0707R.drawable.icn_loading_indicator);
    }

    public void a(b bVar) {
        this.j.add(new WeakReference<>(bVar));
        if (this.k.d()) {
            this.k = this.a.g().o0(this.c).subscribe(new a(this), b.a);
        }
        z zVar = this.l;
        if (zVar != null) {
            ((PreviewOverlayDrawable) bVar).a(zVar);
        }
    }

    public PreviewOverlayDrawable b(Bitmap bitmap, String str, String str2, boolean z, boolean z2, int i2) {
        return new PreviewOverlayDrawable(bitmap, this.d, this.e, i2, z2 ? this.g : null, this.h, this.f, this.i, str, str2, z, this, this.b, this.a.c());
    }

    public void c(z zVar) {
        Iterator<WeakReference<b>> it = this.j.iterator();
        while (it.hasNext()) {
            b bVar = it.next().get();
            if (bVar != null) {
                bVar.a(zVar);
            } else {
                it.remove();
            }
        }
        if (this.j.isEmpty()) {
            this.k.dispose();
            this.l = null;
        }
        this.l = zVar;
    }

    public void d(b bVar) {
        Iterator<WeakReference<b>> it = this.j.iterator();
        while (it.hasNext()) {
            if (bVar == it.next().get()) {
                it.remove();
            }
        }
        if (this.j.isEmpty()) {
            this.k.dispose();
            this.l = null;
        }
    }
}
