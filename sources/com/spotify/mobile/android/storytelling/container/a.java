package com.spotify.mobile.android.storytelling.container;

import android.net.Uri;
import kotlin.jvm.internal.h;

public final class a {

    /* renamed from: com.spotify.mobile.android.storytelling.container.a$a  reason: collision with other inner class name */
    public static final class C0198a implements mx1 {
        final /* synthetic */ t31 a;

        C0198a(t31 t31) {
            this.a = t31;
        }

        @Override // defpackage.mx1
        public void a(Uri uri) {
            h.e(uri, "audioUri");
            this.a.a(uri);
        }
    }

    public static final mx1 a(t31 t31) {
        h.e(t31, "audioPlayer");
        return new C0198a(t31);
    }
}
