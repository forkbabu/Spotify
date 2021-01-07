package com.spotify.music.features.album;

import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.pageloader.i0;
import com.spotify.pageloader.m0;
import com.spotify.pageloader.n0;
import com.spotify.pageloader.o0;
import kotlin.jvm.internal.h;

public final class f {
    public static final ContentRestriction a(s81 s81) {
        h.e(s81, "data");
        String string = s81.custom().string("label");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1929091532) {
                if (hashCode == 1576 && string.equals("19")) {
                    return ContentRestriction.Over19Only;
                }
            } else if (string.equals("explicit")) {
                return ContentRestriction.Explicit;
            }
        }
        return ContentRestriction.None;
    }

    public static o0<b91> b(String str, boolean z, boolean z2, zv3 zv3, ty3 ty3) {
        if (z2) {
            return n0.c(HubsImmutableViewModel.EMPTY);
        }
        if (z) {
            return m0.a(zv3.a(str).D(new i0(ty3.a(str))));
        }
        return m0.a(zv3.a(str));
    }
}
