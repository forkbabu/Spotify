package com.spotify.mobile.android.shortcut;

import android.app.Application;
import android.content.Context;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.mobile.android.share.menu.preview.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.q;
import com.squareup.picasso.Picasso;
import defpackage.g2;
import java.io.IOException;

public class a {
    private final Context a;
    private final Picasso b;
    private final ere c;
    private final IntentSender d;

    public a(Application application, Picasso picasso, ere ere, IntentSender intentSender) {
        this.a = application;
        this.b = picasso;
        this.c = ere;
        this.d = intentSender;
    }

    private void a(String str, String str2, Bitmap bitmap, c cVar) {
        Context context = this.a;
        g2.a aVar = new g2.a(context, str);
        aVar.c(b.a(str, "context_shortcut"));
        aVar.b(IconCompat.d(bitmap));
        aVar.d(str2);
        h2.a(context, aVar.a(), this.d);
        this.c.a(new q().b().a(str));
    }

    public void b(String str, String str2, String str3, c cVar) {
        try {
            a(str, str2, this.b.l(!TextUtils.isEmpty(str3) ? Uri.parse(str3) : Uri.EMPTY).j(), cVar);
        } catch (IOException e) {
            Assertion.i("Failed to load image for shortcut, not installing...", e);
        }
    }
}
