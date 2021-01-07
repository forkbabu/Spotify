package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import io.reactivex.functions.l;

/* renamed from: s2b  reason: default package */
public final /* synthetic */ class s2b implements l {
    public final /* synthetic */ s7b a;

    public /* synthetic */ s2b(s7b s7b) {
        this.a = s7b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s7b s7b = this.a;
        Logger.o((Throwable) obj, "Search online request failed for query = %s", s7b.a());
        return d7b.c(s7b.a(), HubsImmutableViewModel.EMPTY);
    }
}
