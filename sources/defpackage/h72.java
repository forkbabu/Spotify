package defpackage;

import com.google.android.exoplayer2.drm.l;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.exo.j;
import com.spotify.mobile.android.video.exo.k;
import com.spotify.mobile.android.video.exo.model.a;
import com.spotify.mobile.android.video.exo.r;
import com.spotify.mobile.android.video.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: h72  reason: default package */
public class h72 implements f {
    @Override // com.spotify.mobile.android.video.drm.f
    public List<i0> a(Object obj) {
        a d;
        if (!(obj instanceof r) || (d = ((r) obj).d()) == null) {
            return new ArrayList(0);
        }
        return ImmutableList.copyOf((Collection) d.a());
    }

    @Override // com.spotify.mobile.android.video.drm.f
    public l b(Object obj) {
        if (!(obj instanceof r)) {
            return null;
        }
        for (k kVar : ((r) obj).c(0).d()) {
            Iterator<j> it = kVar.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    l lVar = it.next().c().u;
                    if (lVar != null) {
                        return lVar;
                    }
                }
            }
        }
        return null;
    }
}
