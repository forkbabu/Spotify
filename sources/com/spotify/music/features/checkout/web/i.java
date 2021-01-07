package com.spotify.music.features.checkout.web;

import android.net.Uri;
import android.os.Parcelable;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.a;
import com.spotify.music.libs.viewuri.ViewUris;

public abstract class i implements Parcelable {

    public static abstract class a {
        public abstract i a();

        /* access modifiers changed from: package-private */
        public abstract a b(String str);

        /* access modifiers changed from: package-private */
        public abstract a c(Integer num);

        public a d(t tVar) {
            c(Integer.valueOf(tVar.h()));
            b(tVar.y());
            return this;
        }

        public abstract a e(boolean z);

        public abstract a f(ViewUris.SubView subView);

        public abstract a g(String str);

        public abstract a h(Uri uri);
    }

    public static a c() {
        a.C0215a aVar = new a.C0215a();
        aVar.f(ViewUris.SubView.NONE);
        aVar.e(true);
        aVar.h(Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_premium&utm_source=spotify&utm_medium=android_client"));
        aVar.c(-2);
        return aVar;
    }

    public abstract String a();

    public abstract Integer b();

    public abstract boolean e();

    public abstract ViewUris.SubView f();

    public abstract String g();

    public abstract Uri h();
}
