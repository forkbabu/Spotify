package com.spotify.music.features.followfeed.hubs.components;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.views.FeedExpandableReleaseItem;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import kotlin.jvm.internal.h;

public final class c implements s51<FeedExpandableReleaseItem> {
    private final Picasso a;
    private final b b;
    private final int c;
    private final f45 f;

    public interface a {
        void a(String str, String str2, int i);

        void b(String str, int i);

        void c(String str, String str2, int i);
    }

    public c(Picasso picasso, b bVar, int i, f45 f45) {
        h.e(picasso, "picasso");
        h.e(bVar, "eventDispatcher");
        h.e(f45, "releaseDateUtil");
        this.a = picasso;
        this.b = bVar;
        this.c = i;
        this.f = f45;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, s51$a, int[]] */
    @Override // defpackage.s51
    public void b(FeedExpandableReleaseItem feedExpandableReleaseItem, s81 s81, s51.a aVar, int[] iArr) {
        h.e(feedExpandableReleaseItem, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, w51, s51$b] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x01e4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, com.spotify.music.features.followfeed.views.FeedExpandableReleaseItem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f5  */
    /* JADX WARNING: Unknown variable types count: 3 */
    @Override // defpackage.s51
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.spotify.music.features.followfeed.views.FeedExpandableReleaseItem r35, defpackage.s81 r36, defpackage.w51 r37, defpackage.s51.b r38) {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.followfeed.hubs.components.c.c(android.view.View, s81, w51, s51$b):void");
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // defpackage.s51
    public FeedExpandableReleaseItem h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        return new FeedExpandableReleaseItem(context, this.a);
    }
}
