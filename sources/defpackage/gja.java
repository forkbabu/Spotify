package defpackage;

import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.functions.g;

/* renamed from: gja  reason: default package */
public final /* synthetic */ class gja implements g {
    public final /* synthetic */ hja a;

    public /* synthetic */ gja(hja hja) {
        this.a = hja;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        hja.l(this.a, (AndroidDenylist) obj);
    }
}
