package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: jr6  reason: default package */
public final /* synthetic */ class jr6 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ jr6(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed to lookup Personal Playlist Lookup URI %s.", this.a);
        return z.z(Optional.absent());
    }
}
