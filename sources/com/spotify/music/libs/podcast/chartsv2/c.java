package com.spotify.music.libs.podcast.chartsv2;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.k;

public final class c implements blb, k {
    private static final LinkType[] a = {LinkType.PODCAST_CHARTS_ROOT, LinkType.PODCAST_CHARTS_REGIONS, LinkType.PODCAST_CHARTS_CATEGORIES_REGION, LinkType.PODCAST_CHARTS_CHART_CHART_TYPE_REGION, LinkType.PODCAST_CHARTS_REGION, LinkType.PODCAST_CHARTS_CHART_CATEGORY_REGION_CATEGORY};

    @Override // com.spotify.music.navigation.k
    public s a(Intent intent, l0 l0Var, String str, com.spotify.android.flags.c cVar, SessionState sessionState) {
        com.spotify.music.libs.viewuri.c cVar2;
        boolean z = LinkType.PODCAST_CHARTS_ROOT == l0Var.q();
        String B = l0Var.B();
        B.getClass();
        switch (l0Var.q().ordinal()) {
            case 190:
                cVar2 = ViewUris.m.b(B);
                break;
            case 191:
                cVar2 = ViewUris.o.b(B);
                break;
            case 192:
                cVar2 = ViewUris.n.b(B);
                break;
            case 193:
                cVar2 = ViewUris.l.b(B);
                break;
            case 194:
                cVar2 = ViewUris.k;
                break;
            default:
                cVar2 = ViewUris.j;
                break;
        }
        int i = PodcastChartsFragment.i0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_root", z);
        bundle.putParcelable("uri", cVar2);
        PodcastChartsFragment podcastChartsFragment = new PodcastChartsFragment();
        podcastChartsFragment.r4(bundle);
        d.a(podcastChartsFragment, cVar);
        return podcastChartsFragment;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        LinkType[] linkTypeArr = a;
        for (LinkType linkType : linkTypeArr) {
            StringBuilder V0 = je.V0("Podcast charts route for ");
            V0.append(linkType.name());
            ((xkb) glb).i(linkType, V0.toString(), this);
        }
    }
}
