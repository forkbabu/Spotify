package com.spotify.music.features.followfeed.hubs.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import com.spotify.music.features.followfeed.views.c;
import defpackage.s51;
import kotlin.jvm.internal.h;

public final class g implements s51<FollowRecsView> {
    private final c a;
    private final b b;

    public g(c cVar, b bVar) {
        h.e(cVar, "followRecsAdapter");
        h.e(bVar, "eventDispatcher");
        this.a = cVar;
        this.b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, s51$a, int[]] */
    @Override // defpackage.s51
    public void b(FollowRecsView followRecsView, s81 s81, s51.a aVar, int[] iArr) {
        h.e(followRecsView, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, w51, s51$b] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x0064 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, com.spotify.music.features.followfeed.views.FollowRecsView] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.s51
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.spotify.music.features.followfeed.views.FollowRecsView r12, defpackage.s81 r13, defpackage.w51 r14, defpackage.s51.b r15) {
        /*
            r11 = this;
            com.spotify.music.features.followfeed.views.FollowRecsView r12 = (com.spotify.music.features.followfeed.views.FollowRecsView) r12
            java.lang.String r0 = "view"
            kotlin.jvm.internal.h.e(r12, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.h.e(r13, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.h.e(r14, r0)
            java.lang.String r14 = "state"
            kotlin.jvm.internal.h.e(r15, r14)
            p81 r14 = r13.custom()
            r0 = -1
            java.lang.String r1 = "position"
            int r2 = r14.intValue(r1, r0)
            p81 r14 = r13.custom()
            java.lang.String r0 = ""
            java.lang.String r1 = "section_title"
            java.lang.String r14 = r14.string(r1, r0)
            p81 r1 = r13.custom()
            java.lang.String r3 = "artists"
            p81[] r1 = r1.bundleArray(r3)
            if (r1 == 0) goto L_0x0062
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r5 = 0
        L_0x0041:
            if (r5 >= r4) goto L_0x0064
            r6 = r1[r5]
            j45 r7 = new j45
            java.lang.String r8 = "artist_uri"
            java.lang.String r8 = r6.string(r8, r0)
            java.lang.String r9 = "display_name"
            java.lang.String r9 = r6.string(r9, r0)
            java.lang.String r10 = "image_url"
            java.lang.String r6 = r6.string(r10, r0)
            r7.<init>(r8, r9, r6)
            r3.add(r7)
            int r5 = r5 + 1
            goto L_0x0041
        L_0x0062:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.a
        L_0x0064:
            r6 = r3
            android.os.Parcelable r7 = r15.a(r13)
            r12.j(r14)
            com.spotify.music.features.followfeed.views.c r14 = r11.a
            r12.setAdapter(r14)
            com.spotify.music.features.followfeed.hubs.components.f r14 = new com.spotify.music.features.followfeed.hubs.components.f
            r0 = r14
            r1 = r11
            r3 = r15
            r4 = r13
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r12.i(r6, r14)
            if (r7 == 0) goto L_0x0087
            android.os.Parcelable r13 = r15.a(r13)
            r12.k(r13)
        L_0x0087:
            com.spotify.music.features.followfeed.hubs.components.FollowRecsComponentBinder$bindView$3 r13 = new com.spotify.music.features.followfeed.hubs.components.FollowRecsComponentBinder$bindView$3
            r13.<init>(r11)
            r12.setOnScrollListener(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.followfeed.hubs.components.g.c(android.view.View, s81, w51, s51$b):void");
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // defpackage.s51
    public FollowRecsView h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.follow_recs_feed_item, viewGroup, false);
        if (inflate != null) {
            return (FollowRecsView) inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.followfeed.views.FollowRecsView");
    }
}
