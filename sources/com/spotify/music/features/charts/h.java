package com.spotify.music.features.charts;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.k;

public final class h implements blb, k {
    private static final LinkType[] a = {LinkType.CHARTS_ROOT, LinkType.CHARTS_ALBUM_SPECIFIC, LinkType.CHARTS_SUBPAGE};

    @Override // com.spotify.music.navigation.k
    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        com.spotify.music.libs.viewuri.c cVar2;
        kotlin.jvm.internal.h.e(l0Var, "link");
        kotlin.jvm.internal.h.e(cVar, "flags");
        LinkType q = l0Var.q();
        String B = l0Var.B();
        if (B != null) {
            boolean z = true;
            boolean z2 = LinkType.CHARTS_ROOT == q;
            if (LinkType.CHARTS_ALBUM_SPECIFIC != q) {
                z = false;
            }
            kotlin.jvm.internal.h.e(B, "uri");
            kotlin.jvm.internal.h.e(cVar, "flags");
            if (z2) {
                cVar2 = ViewUris.p;
                kotlin.jvm.internal.h.d(cVar2, "ViewUris.CHARTS_OVERVIEW");
            } else if (z) {
                cVar2 = ViewUris.q.b(B);
                kotlin.jvm.internal.h.d(cVar2, "ViewUris.CHARTS_ALBUM_SPECIFIC.verify(uri)");
            } else {
                cVar2 = ViewUris.r.b(B);
                kotlin.jvm.internal.h.d(cVar2, "ViewUris.CHARTS_BLOCK.verify(uri)");
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_root", z2);
            bundle.putBoolean("is_album_chart", z);
            bundle.putParcelable("uri", cVar2);
            bundle.putString("title", str);
            ChartsFragment chartsFragment = new ChartsFragment();
            chartsFragment.r4(bundle);
            d.a(chartsFragment, cVar);
            return chartsFragment;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        kotlin.jvm.internal.h.e(glb, "registry");
        LinkType[] linkTypeArr = a;
        for (LinkType linkType : linkTypeArr) {
            StringBuilder V0 = je.V0("Charts routine for ");
            V0.append(linkType.name());
            ((xkb) glb).i(linkType, V0.toString(), this);
        }
    }
}
