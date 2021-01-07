package com.spotify.music.features.carepackage;

import android.content.Context;
import com.spotify.mobile.android.share.menu.preview.api.a;
import com.spotify.mobile.android.share.menu.preview.api.d;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class CarePackageFragmentModule$SharePreviewModule {
    public final nmf<Set<a>, Set<a>> a(List<String> list) {
        h.e(list, "destinationList");
        return new CarePackageFragmentModule$SharePreviewModule$provideShareDestinationsFilter$1(list);
    }

    public final List<cmf<d>> b(Context context, Picasso picasso, li4 li4) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        h.e(li4, "playlistEntityProvider");
        return kotlin.collections.d.t(new CarePackageFragmentModule$SharePreviewModule$provideSharePayloadProvider$1(li4, context, picasso));
    }

    public final nmf<Set<a>, List<a>> c(List<String> list) {
        h.e(list, "destinationList");
        return new CarePackageFragmentModule$SharePreviewModule$provideSortShareDestinations$1(list);
    }
}
