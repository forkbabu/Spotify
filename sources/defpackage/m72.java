package defpackage;

import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.hls.j;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.i0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m72  reason: default package */
public class m72 implements f {
    @Override // com.spotify.mobile.android.video.drm.f
    public List<i0> a(Object obj) {
        return new ArrayList(0);
    }

    @Override // com.spotify.mobile.android.video.drm.f
    public l b(Object obj) {
        if (obj instanceof j) {
            List<f.a> list = ((j) obj).a.o;
            if (!list.isEmpty()) {
                return list.get(0).o;
            }
        }
        return null;
    }
}
