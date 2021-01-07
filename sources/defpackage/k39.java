package defpackage;

import android.view.ViewGroup;
import com.spotify.encore.ViewProvider;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import defpackage.d39;

/* renamed from: k39  reason: default package */
public final /* synthetic */ class k39 implements d39.f {
    public final /* synthetic */ w59 a;

    public /* synthetic */ k39(w59 w59) {
        this.a = w59;
    }

    @Override // defpackage.d39.f
    public final ViewProvider a(ViewGroup viewGroup) {
        this.a.getClass();
        return Rows.d(viewGroup.getContext(), viewGroup, 64, 8);
    }
}
