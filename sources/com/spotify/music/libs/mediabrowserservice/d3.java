package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import com.google.common.base.MoreObjects;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import java.util.ArrayList;
import java.util.List;

public final class d3 {
    private final MediaUriUtil a;
    private final d2 b;

    public d3(MediaUriUtil mediaUriUtil, d2 d2Var) {
        this.a = mediaUriUtil;
        this.b = d2Var;
    }

    public List<MediaBrowserCompat.MediaItem> a(List<MediaBrowserItem> list, String str) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaBrowserItem mediaBrowserItem : list) {
            if (mediaBrowserItem != null) {
                a aVar = new a(mediaBrowserItem.d());
                int i = 1;
                if (mediaBrowserItem.p()) {
                    aVar.l(true);
                }
                if (mediaBrowserItem.o() && MediaBrowserItem.ActionType.PLAYABLE == mediaBrowserItem.a()) {
                    aVar.k(true);
                }
                int ordinal = mediaBrowserItem.b().ordinal();
                aVar.d(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? -1 : 2 : 1 : 0);
                d2 d2Var = this.b;
                Uri f = mediaBrowserItem.f();
                d2Var.getClass();
                aVar.j(f == null ? Uri.EMPTY : d2Var.a(f.toString()));
                aVar.q(mediaBrowserItem.k());
                aVar.n(mediaBrowserItem.j());
                aVar.m(mediaBrowserItem.g());
                if (mediaBrowserItem.c() != null) {
                    aVar.g(mediaBrowserItem.c());
                }
                Bundle b2 = aVar.b();
                MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
                bVar.f(s1.a(str, mediaBrowserItem.e()));
                bVar.i(MoreObjects.nullToEmpty(mediaBrowserItem.i()));
                bVar.h(mediaBrowserItem.l());
                bVar.g(mediaBrowserItem.h());
                bVar.c(b2);
                if (mediaBrowserItem.f() != null) {
                    Uri a2 = this.a.a(mediaBrowserItem.f(), mediaBrowserItem.m());
                    if (!Uri.EMPTY.equals(a2)) {
                        bVar.e(a2);
                    }
                }
                MediaDescriptionCompat a3 = bVar.a();
                if (MediaBrowserItem.ActionType.BROWSABLE != mediaBrowserItem.a()) {
                    i = 2;
                }
                arrayList.add(new MediaBrowserCompat.MediaItem(a3, i));
            }
        }
        return arrayList;
    }
}
