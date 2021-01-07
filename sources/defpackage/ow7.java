package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.f;

/* renamed from: ow7  reason: default package */
public class ow7 extends f<ksb> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, java.lang.Object, int] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public void b(RecyclerView.b0 b0Var, ksb ksb, int i) {
        View view = b0Var.a;
        int i2 = e90.i;
        ia0 ia0 = (ia0) l70.o(view, ia0.class);
        ia0.setTitle(ksb.a(ia0.getView().getContext().getResources()));
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public RecyclerView.b0 c(ViewGroup viewGroup) {
        return h90.h0(e90.e().d(viewGroup.getContext(), viewGroup));
    }
}
