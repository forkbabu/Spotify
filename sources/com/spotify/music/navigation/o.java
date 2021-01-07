package com.spotify.music.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.navigation.logger.c;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import kotlin.jvm.internal.h;

public class o {
    private final Context a;
    private final String b;

    public o(Context context, String str) {
        context.getClass();
        this.a = context;
        this.b = str;
    }

    public static f a(Intent intent) {
        String stringExtra = intent.getStringExtra("extra_interaction_id");
        if (stringExtra == null) {
            return f.C0160f.a;
        }
        c cVar = new c(stringExtra);
        h.e(cVar, "interactionId");
        return new f.g(cVar);
    }

    public Intent b(n nVar) {
        String j = nVar.j();
        j.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(j));
        if (l0.z(nVar.j()).q() != LinkType.DUMMY) {
            intent.setFlags(67108864);
            intent.setClassName(this.a, this.b);
        }
        if (!MoreObjects.isNullOrEmpty(nVar.i())) {
            intent.putExtra("title", nVar.i());
        }
        if (nVar.b()) {
            intent.putExtra("extra_clear_backstack", true);
        }
        if (nVar.c()) {
            intent.putExtra("extra_crossfade", true);
        }
        if (nVar.d() != 0) {
            intent.putExtra("extra_animation_in", nVar.d());
        }
        if (nVar.e() != 0) {
            intent.putExtra("extra_animation_out", nVar.e());
        }
        if (nVar.f()) {
            intent.putExtra("extra_pop_current_fragment", true);
        }
        if (!MoreObjects.isNullOrEmpty(nVar.g())) {
            intent.putExtra("extra_fragment_tag", nVar.g());
        }
        if (!MoreObjects.isNullOrEmpty(nVar.h())) {
            intent.putExtra("tag", nVar.h());
        }
        if (!MoreObjects.isNullOrEmpty(nVar.k())) {
            intent.putExtra("extra_interaction_id", nVar.k());
        }
        return intent;
    }
}
