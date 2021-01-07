package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import io.reactivex.functions.l;

/* renamed from: e5b  reason: default package */
public class e5b implements l<d7b<b91>, b91> {
    e5b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(d7b<b91> d7b) {
        d7b<b91> d7b2 = d7b;
        if (d7b2.i().isPresent()) {
            return d7b2.i().get();
        }
        return HubsImmutableViewModel.EMPTY;
    }
}
