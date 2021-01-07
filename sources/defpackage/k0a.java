package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q;
import io.reactivex.functions.l;

/* renamed from: k0a  reason: default package */
public final /* synthetic */ class k0a implements l {
    public static final /* synthetic */ k0a a = new k0a();

    private /* synthetic */ k0a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = b1a.d;
        boolean z = false;
        String c = q.c(((Metadata$Track) obj).i(0).h().A());
        int i2 = l0.h;
        if (c.length() == 22) {
            z = true;
        }
        MoreObjects.checkArgument(z);
        return l0.z("spotify:artist:" + c).B();
    }
}
