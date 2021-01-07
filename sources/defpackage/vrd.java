package defpackage;

import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.functions.l;

/* renamed from: vrd  reason: default package */
public final /* synthetic */ class vrd implements l {
    public final /* synthetic */ bsd a;

    public /* synthetic */ vrd(bsd bsd) {
        this.a = bsd;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((AndroidDenylist) obj);
    }
}
