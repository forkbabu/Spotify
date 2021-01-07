package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.ViewProvider;
import com.spotify.music.yourlibrary.filterchips.FilterChipsView;
import defpackage.d39;

/* renamed from: w49  reason: default package */
public final /* synthetic */ class w49 implements d39.f {
    public final /* synthetic */ c69 a;

    public /* synthetic */ w49(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.f
    public final ViewProvider a(ViewGroup viewGroup) {
        this.a.getClass();
        FilterChipsView filterChipsView = new FilterChipsView(viewGroup.getContext());
        filterChipsView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new p49(filterChipsView);
    }
}
