package com.spotify.music.playlist.ui;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i0 implements h0 {
    private final Context a;

    public i0(Context context) {
        this.a = context;
    }

    private static String b(o oVar) {
        ImmutableList<b> artists = oVar.getArtists();
        if (artists == null) {
            return "";
        }
        return Joiner.on(", ").join(Collections2.transform((List) artists, (Function) w.a));
    }

    @Override // com.spotify.music.playlist.ui.h0
    public String a(l lVar, boolean z, boolean z2) {
        Show w;
        o g = lVar.g();
        Episode c = lVar.c();
        if (g != null) {
            ArrayList arrayList = new ArrayList();
            p b = lVar.b();
            String str = " • ";
            if (z2 && b != null) {
                String a2 = b.a();
                if (!MoreObjects.isNullOrEmpty(a2)) {
                    arrayList.add(a2.substring(0, Math.min(50, a2.length())));
                    arrayList.add(str);
                }
            }
            if (z) {
                a album = g.getAlbum();
                String b2 = b(g);
                String g2 = album.g();
                StringBuilder V0 = je.V0(b2);
                if (MoreObjects.isNullOrEmpty(b2) || MoreObjects.isNullOrEmpty(g2)) {
                    str = "";
                }
                V0.append(str);
                V0.append(g2);
                arrayList.add(V0.toString());
            } else {
                arrayList.add(b(g));
            }
            if (nud.m(this.a)) {
                Collections.reverse(arrayList);
            }
            return Joiner.on("").join(arrayList);
        } else if (c == null || (w = c.w()) == null) {
            return "";
        } else {
            return w.h();
        }
    }
}
