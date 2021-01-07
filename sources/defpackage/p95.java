package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q;
import io.reactivex.functions.l;

/* renamed from: p95  reason: default package */
public final /* synthetic */ class p95 implements l {
    public static final /* synthetic */ p95 a = new p95();

    private /* synthetic */ p95() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Metadata$Track metadata$Track = (Metadata$Track) obj;
        String c = q.c(metadata$Track.l().A());
        String c2 = q.c(metadata$Track.h().m().A());
        int i = l0.h;
        boolean z = true;
        MoreObjects.checkArgument(c2.length() == 22);
        if (c.length() != 22) {
            z = false;
        }
        MoreObjects.checkArgument(z);
        return l0.z("spotify:album:" + c2 + ":play:" + c);
    }
}
