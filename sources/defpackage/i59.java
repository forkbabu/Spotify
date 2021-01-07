package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import defpackage.d39;

/* renamed from: i59  reason: default package */
public final /* synthetic */ class i59 implements d39.f {
    public final /* synthetic */ c69 a;

    public /* synthetic */ i59(c69 c69) {
        this.a = c69;
    }

    @Override // defpackage.d39.f
    public final ViewProvider a(ViewGroup viewGroup) {
        this.a.getClass();
        DownloadHeaderView a2 = DownloadHeaderView.a(viewGroup.getContext(), viewGroup);
        a2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new u49(a2);
    }
}
