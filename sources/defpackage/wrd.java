package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.packagevalidator.denylist.cache.db.a;
import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.functions.l;

/* renamed from: wrd  reason: default package */
public final /* synthetic */ class wrd implements l {
    public final /* synthetic */ Optional a;

    public /* synthetic */ wrd(Optional optional) {
        this.a = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = this.a;
        Logger.d(((Throwable) obj).getLocalizedMessage(), new Object[0]);
        if (!optional.isPresent()) {
            return AndroidDenylist.createEmpty();
        }
        a aVar = (a) optional.get();
        return AndroidDenylist.create(aVar.b(), aVar.a());
    }
}
