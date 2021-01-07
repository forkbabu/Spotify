package defpackage;

import android.view.ViewGroup;
import com.spotify.encore.ViewProvider;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import defpackage.d39;

/* renamed from: y39  reason: default package */
public final /* synthetic */ class y39 implements d39.f {
    public final /* synthetic */ y59 a;

    public /* synthetic */ y39(y59 y59) {
        this.a = y59;
    }

    @Override // defpackage.d39.f
    public final ViewProvider a(ViewGroup viewGroup) {
        this.a.getClass();
        return Rows.a(viewGroup.getContext(), viewGroup);
    }
}
