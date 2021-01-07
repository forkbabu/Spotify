package defpackage;

import android.view.ViewGroup;
import com.spotify.encore.ViewProvider;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import defpackage.d39;

/* renamed from: h39  reason: default package */
public final /* synthetic */ class h39 implements d39.f {
    public final /* synthetic */ u59 a;

    public /* synthetic */ h39(u59 u59) {
        this.a = u59;
    }

    @Override // defpackage.d39.f
    public final ViewProvider a(ViewGroup viewGroup) {
        this.a.getClass();
        return Rows.c(viewGroup.getContext(), viewGroup, 64, 8);
    }
}
