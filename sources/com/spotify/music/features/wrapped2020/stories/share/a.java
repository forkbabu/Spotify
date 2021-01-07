package com.spotify.music.features.wrapped2020.stories.share;

import com.spotify.mobile.android.share.menu.preview.api.d;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class a {
    private final zy8 a;
    private final Picasso b;

    public a(zy8 zy8, Picasso picasso) {
        h.e(zy8, "wrappedEndpoint");
        h.e(picasso, "picasso");
        this.a = zy8;
        this.b = picasso;
    }

    public final List<cmf<d>> c(String str, List<String> list) {
        h.e(str, "storyType");
        h.e(list, "schemes");
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SharePayloadProviderFactory$createSharePayloadProvider$1(this, str, it.next()));
        }
        return arrayList;
    }
}
