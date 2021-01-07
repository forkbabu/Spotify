package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import java.util.List;

public final class b3 {
    private static Uri d(Uri uri) {
        return uri != null ? uri : Uri.EMPTY;
    }

    public MediaBrowserItem[] a(List<gl1> list, Bundle bundle) {
        MediaBrowserItem[] mediaBrowserItemArr = new MediaBrowserItem[list.size()];
        for (int i = 0; i < list.size(); i++) {
            gl1 gl1 = list.get(i);
            Uri parse = Uri.parse(gl1.uri());
            b bVar = new b(d(parse));
            bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
            bVar.r(MoreObjects.nullToEmpty(gl1.name()));
            bVar.q(MoreObjects.nullToEmpty(gl1.a()));
            bVar.h(gl1.explicit().booleanValue());
            bVar.m(parse);
            String imageUri = gl1.imageUri();
            if (imageUri != null) {
                bVar.j(Uri.parse(imageUri));
            }
            bVar.i(bundle);
            mediaBrowserItemArr[i] = bVar.a();
        }
        return mediaBrowserItemArr;
    }

    public MediaBrowserItem[] b(List<nl1> list, Bundle bundle) {
        MediaBrowserItem[] mediaBrowserItemArr = new MediaBrowserItem[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nl1 nl1 = list.get(i);
            Uri parse = Uri.parse(nl1.uri());
            b bVar = new b(d(parse));
            bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
            bVar.r(MoreObjects.nullToEmpty(nl1.name()));
            bVar.q("");
            bVar.h(nl1.explicit().booleanValue());
            bVar.m(parse);
            String imageUri = nl1.imageUri();
            if (imageUri != null) {
                bVar.j(Uri.parse(imageUri));
            }
            bVar.i(bundle);
            mediaBrowserItemArr[i] = bVar.a();
        }
        return mediaBrowserItemArr;
    }

    public MediaBrowserItem[] c(List<ol1> list, Bundle bundle) {
        String imageUri;
        MediaBrowserItem[] mediaBrowserItemArr = new MediaBrowserItem[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ol1 ol1 = list.get(i);
            Uri parse = Uri.parse(ol1.uri());
            b bVar = new b(d(parse));
            bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
            bVar.r(MoreObjects.nullToEmpty(ol1.name()));
            bVar.q(MoreObjects.nullToEmpty(ol1.b()));
            bVar.h(ol1.explicit().booleanValue());
            bVar.m(parse);
            gl1 a = ol1.a();
            if (!(a == null || (imageUri = a.imageUri()) == null)) {
                bVar.j(Uri.parse(imageUri));
            }
            bVar.i(bundle);
            mediaBrowserItemArr[i] = bVar.a();
        }
        return mediaBrowserItemArr;
    }
}
