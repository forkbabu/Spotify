package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.performance.tracking.i0;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: zc8  reason: default package */
public class zc8 extends i0<b91> {
    zc8(k kVar, h0 h0Var, c cVar, ij9 ij9) {
        super(kVar, h0Var, cVar, ij9);
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return super.g(sVar).N(new wc8(this));
    }

    @Override // com.spotify.music.libs.performance.tracking.i0
    public s<b91> g(s<b91> sVar) {
        return super.g(sVar).N(new wc8(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.performance.tracking.i0
    public boolean i(b91 b91) {
        b91 b912 = b91;
        if (!HubsImmutableViewModel.EMPTY.equals(b912)) {
            int i = t71.c;
            if (!"hubs/placeholder".equals(b912.id())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void o(b91 b91) {
        if (yf8.f(b91)) {
            h();
        }
    }
}
