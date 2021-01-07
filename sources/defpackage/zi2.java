package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.share.menu.preview.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import defpackage.g2;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: zi2  reason: default package */
class zi2 implements Callable<ShortcutInfo> {
    private final cj2 a;
    private final Context b;
    private final Picasso c;

    zi2(Context context, Picasso picasso, cj2 cj2) {
        this.b = context;
        this.c = picasso;
        this.a = cj2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public ShortcutInfo call() {
        IconCompat iconCompat;
        Bitmap bitmap;
        g2.a aVar = new g2.a(this.b, this.a.c());
        aVar.d(this.a.b());
        aVar.c(b.a(this.a.c(), "app_shortcut"));
        String a2 = this.a.a();
        Uri parse = !TextUtils.isEmpty(a2) ? Uri.parse(a2) : Uri.EMPTY;
        if (!parse.equals(Uri.EMPTY)) {
            try {
                bitmap = this.c.l(parse).j();
            } catch (IOException e) {
                Assertion.w("Failed to load image for shortcut item, uri: " + parse, e);
                bitmap = null;
            }
            if (bitmap != null) {
                iconCompat = IconCompat.d(bitmap);
                aVar.b(iconCompat);
                return aVar.a().a();
            }
            Logger.n("Failed to load image for app shortcut: %s", this.a);
        }
        iconCompat = IconCompat.e(this.b, C0707R.drawable.shortcut_icon_placeholder);
        aVar.b(iconCompat);
        return aVar.a().a();
    }
}
