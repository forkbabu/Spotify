package com.spotify.music.features.blendtastematch;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import defpackage.glb;

public final class h implements blb {
    private final Context a;

    static final class a<T, U, R> implements glb.b<Intent, c, Intent> {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.glb.b
        public Intent a(Intent intent, c cVar) {
            Intent intent2 = intent;
            Context applicationContext = this.a.a.getApplicationContext();
            kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
            kotlin.jvm.internal.h.d(intent2, "intent");
            kotlin.jvm.internal.h.e(applicationContext, "context");
            kotlin.jvm.internal.h.e(intent2, "intent");
            Intent intent3 = new Intent(applicationContext, BlendTasteMatchActivity.class);
            intent3.setFlags(268435456);
            intent3.setData(intent2.getData());
            l0 z = l0.z(intent2.getDataString());
            kotlin.jvm.internal.h.d(z, "SpotifyLink.of(intent.dataString)");
            intent3.putExtra("key-invitation-token", z.k());
            return intent3;
        }
    }

    public h(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        this.a = context;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        kotlin.jvm.internal.h.e(glb, "registry");
        ((xkb) glb).h(LinkType.BLEND_TASTE_MATCH, "Open Blend Taste Match view", new a(this));
    }
}
