package com.spotify.music.features.playlistentity.trackcloud;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TrackCloudShuffling {

    /* access modifiers changed from: private */
    public enum TrackType {
        IN_PLAYLIST,
        RECOMMENDATION
    }

    private static float a(u3<l, TrackType> u3Var, boolean z) {
        F f;
        float f2 = 0.0f;
        if (u3Var == null || (f = u3Var.a) == null) {
            return 0.0f;
        }
        o g = f.g();
        if (g != null && g.isInCollection()) {
            f2 = 3.0f;
        }
        S s = u3Var.b;
        float f3 = 1.0f;
        if (s == TrackType.IN_PLAYLIST) {
            if (z) {
                f3 = 5.0f;
            }
        } else if (s != TrackType.RECOMMENDATION) {
            return f2;
        }
        return f2 + f3;
    }

    public List<l> b(List<l> list, List<l> list2, Random random) {
        boolean z = true;
        MoreObjects.checkArgument((list == null && list2 == null) ? false : true, "At least one list should be not null");
        if (list == null || list2 == null) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(Collections2.transform((List) list, (Function) f.a));
        }
        if (list2 != null) {
            arrayList.addAll(Collections2.transform((List) list2, (Function) g.a));
        }
        Iterator it = arrayList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += a((u3) it.next(), z);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        while (!arrayList.isEmpty()) {
            float nextFloat = random.nextFloat() * f;
            u3 u3Var = null;
            Iterator it2 = arrayList.iterator();
            float f2 = 0.0f;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                u3 u3Var2 = (u3) it2.next();
                if (a(u3Var2, z) + f2 >= nextFloat) {
                    u3Var = u3Var2;
                    break;
                }
                f2 += a(u3Var2, z);
            }
            arrayList.remove(u3Var);
            f -= a(u3Var, z);
            u3Var.getClass();
            arrayList2.add(u3Var.a);
        }
        return arrayList2;
    }
}
