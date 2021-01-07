package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.h0;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.core.navcontext.f;
import java.lang.ref.WeakReference;

/* renamed from: asb  reason: default package */
public class asb extends h0 {
    private final WeakReference<Resources> b;

    public asb(Resources resources) {
        super(resources);
        this.b = new WeakReference<>(resources);
    }

    public String d(f fVar) {
        Resources resources = this.b.get();
        if (resources == null) {
            return "";
        }
        return fVar.c(resources);
    }

    public String e(f fVar) {
        Resources resources = this.b.get();
        if (resources == null) {
            return "";
        }
        return fVar.d(resources);
    }

    public String f(String str) {
        return c(C0707R.string.share_by_artist, str);
    }
}
