package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q;
import io.reactivex.functions.l;

/* renamed from: f0a  reason: default package */
public final /* synthetic */ class f0a implements l {
    public static final /* synthetic */ f0a a = new f0a();

    private /* synthetic */ f0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = z0a.d;
        String c = q.c(((Metadata$Track) obj).h().m().A());
        int i2 = l0.h;
        MoreObjects.checkArgument(c.length() == 22);
        return l0.z("spotify:album:" + c).B();
    }
}
