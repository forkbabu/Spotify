package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.f;
import com.spotify.music.features.queue.a0;
import com.spotify.music.features.queue.view.c;

/* renamed from: lw7  reason: default package */
public class lw7 extends f<tx7> {
    private final jx7 a;

    public lw7(jx7 jx7) {
        this.a = jx7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, java.lang.Object, int] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public void b(RecyclerView.b0 b0Var, tx7 tx7, int i) {
        tx7 tx72 = tx7;
        c cVar = (c) b0Var;
        cVar.getTitleView().setText(tx72.b().a(cVar.getTitleView().getResources()));
        cVar.h0().setVisibility(tx72.a() ? 0 : 8);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.f
    public RecyclerView.b0 c(ViewGroup viewGroup) {
        c cVar = new c(viewGroup.getContext(), viewGroup);
        cVar.h0().setOnClickListener(new hw7(this));
        return cVar;
    }

    public /* synthetic */ void d(View view) {
        ((a0) this.a).g();
    }
}
