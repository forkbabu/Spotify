package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;

/* renamed from: m71  reason: default package */
public class m71 {
    private final SpotifyIconV2 a;
    private final Drawable b;
    private final Context c;
    private final c d = new c();
    private final float e;

    /* access modifiers changed from: private */
    /* renamed from: m71$b */
    public static final class b {
        public final SpotifyIconV2 a;
        public final HubsGlueImageDelegate.ImageConfig.ImageSize b;
        public final HubsGlueImageDelegate.ImageConfig.IconSize c;

        b(SpotifyIconV2 spotifyIconV2, HubsGlueImageDelegate.ImageConfig.ImageSize imageSize, HubsGlueImageDelegate.ImageConfig.IconSize iconSize, a aVar) {
            spotifyIconV2.getClass();
            this.a = spotifyIconV2;
            imageSize.getClass();
            this.b = imageSize;
            iconSize.getClass();
            this.c = iconSize;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
        }
    }

    /* renamed from: m71$c */
    private class c extends LruCache<b, Drawable> {
        c() {
            super(30);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public Drawable create(b bVar) {
            return m71.a(m71.this, bVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(b bVar, Drawable drawable) {
            int ordinal = bVar.b.ordinal();
            if (ordinal != 0) {
                return ordinal != 1 ? 3 : 2;
            }
            return 1;
        }
    }

    public m71(Context context, SpotifyIconV2 spotifyIconV2) {
        this.a = spotifyIconV2;
        context.getClass();
        this.c = context;
        this.b = nud.j(context, C0707R.attr.pasteColorPlaceholderBackground);
        this.e = (float) nud.g(32.0f, context.getResources());
    }

    static Drawable a(m71 m71, b bVar) {
        float f;
        float f2;
        m71.getClass();
        int ordinal = bVar.a.ordinal();
        if (ordinal == 20 || ordinal == 56 || ordinal == 82 || ordinal == 103 || ordinal == 119 || ordinal == 146 || ordinal == 158 || ordinal == 203) {
            HubsGlueImageDelegate.ImageConfig.IconSize iconSize = bVar.c;
            int ordinal2 = iconSize.ordinal();
            if (ordinal2 == 0) {
                f2 = 0.33f;
            } else if (ordinal2 == 1) {
                f2 = 0.5f;
            } else if (ordinal2 == 2) {
                f2 = 0.66f;
            } else if (ordinal2 != 3) {
                Assertion.g("Unmapped size : " + iconSize);
                f2 = 1.0f;
            } else {
                f2 = 0.75f;
            }
            f = f2;
        } else {
            f = Float.NaN;
        }
        if (bVar.b == HubsGlueImageDelegate.ImageConfig.ImageSize.SMALL) {
            return yc0.m(m71.c, bVar.a, f, true, false, m71.e);
        }
        return yc0.e(m71.c, bVar.a, f, false, false, m71.e);
    }

    public Drawable b(String str, HubsGlueImageDelegate.ImageConfig imageConfig) {
        if (str == null) {
            return this.b;
        }
        c cVar = this.d;
        cVar.getClass();
        return (Drawable) cVar.get(new b(n71.a(str).or((Optional<SpotifyIconV2>) this.a), imageConfig.g(), imageConfig.d(), null));
    }
}
