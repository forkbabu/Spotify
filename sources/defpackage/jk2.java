package defpackage;

import android.util.LruCache;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.player.model.ContextTrack;
import io.reactivex.s;

/* renamed from: jk2  reason: default package */
public class jk2 {
    private final fk2 a;
    private final LruCache<String, TrackAnnotationSet> b = new LruCache<>(10);

    public jk2(fk2 fk2) {
        this.a = fk2;
    }

    public s<TrackAnnotationSet> a(ContextTrack contextTrack) {
        String uri = contextTrack.uri();
        String substring = uri.substring(uri.lastIndexOf(58) + 1);
        TrackAnnotationSet trackAnnotationSet = this.b.get(substring);
        if (trackAnnotationSet == null) {
            return this.a.b(substring).P().N(new ik2(this, substring));
        }
        return s.i0(trackAnnotationSet);
    }

    public /* synthetic */ void b(String str, TrackAnnotationSet trackAnnotationSet) {
        this.b.put(str, trackAnnotationSet);
    }
}
