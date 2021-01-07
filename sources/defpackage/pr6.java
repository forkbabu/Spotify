package defpackage;

import com.spotify.playlist.endpoints.exceptions.ForbiddenException;
import com.spotify.playlist.endpoints.exceptions.NotFoundException;
import defpackage.as6;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: pr6  reason: default package */
public final /* synthetic */ class pr6 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ pr6(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Throwable th = (Throwable) obj;
        if (th instanceof NotFoundException) {
            return z.z(new as6.d(str));
        }
        if (th instanceof ForbiddenException) {
            return z.z(new as6.b(str));
        }
        return z.q(th);
    }
}
