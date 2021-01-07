package com.spotify.music.features.fullscreen.story;

import com.google.common.base.MoreObjects;
import com.spotify.music.libs.fullscreen.story.domain.OverlayModel;
import com.spotify.music.libs.fullscreen.story.domain.b;
import com.spotify.music.libs.fullscreen.story.domain.c;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class k {
    private final Picasso a;

    public k(Picasso picasso) {
        this.a = picasso;
    }

    public void a(List<c> list) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : list) {
            if (cVar.b() instanceof b.a) {
                arrayList.add(((b.a) cVar.b()).getImageUri());
            }
            OverlayModel c = cVar.c();
            if (c == null ? false : !MoreObjects.isNullOrEmpty(c.getImageUri())) {
                arrayList.add(cVar.c().getImageUri());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.m((String) it.next()).h(null);
        }
    }
}
