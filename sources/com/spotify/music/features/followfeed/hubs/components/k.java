package com.spotify.music.features.followfeed.hubs.components;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.views.FeedStaticReleaseItem;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import kotlin.jvm.internal.h;

public final class k implements s51<FeedStaticReleaseItem> {
    private final Picasso a;
    private final b b;
    private final f45 c;

    public k(Picasso picasso, b bVar, f45 f45) {
        h.e(picasso, "picasso");
        h.e(bVar, "eventDispatcher");
        h.e(f45, "releaseDateUtil");
        this.a = picasso;
        this.b = bVar;
        this.c = f45;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, s51$a, int[]] */
    @Override // defpackage.s51
    public void b(FeedStaticReleaseItem feedStaticReleaseItem, s81 s81, s51.a aVar, int[] iArr) {
        h.e(feedStaticReleaseItem, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, w51, s51$b] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x014d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.s51
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.spotify.music.features.followfeed.views.FeedStaticReleaseItem r22, defpackage.s81 r23, defpackage.w51 r24, defpackage.s51.b r25) {
        /*
        // Method dump skipped, instructions count: 347
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.followfeed.hubs.components.k.c(android.view.View, s81, w51, s51$b):void");
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // defpackage.s51
    public FeedStaticReleaseItem h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        return new FeedStaticReleaseItem(context, this.a);
    }
}
