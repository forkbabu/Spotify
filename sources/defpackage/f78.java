package defpackage;

import android.view.View;
import androidx.fragment.app.c;
import com.spotify.music.features.search.SearchFragment;
import defpackage.yg8;

/* renamed from: f78  reason: default package */
public final /* synthetic */ class f78 implements yg8.e {
    public final /* synthetic */ SearchFragment a;

    public /* synthetic */ f78(SearchFragment searchFragment) {
        this.a = searchFragment;
    }

    @Override // defpackage.yg8.e
    public final View a() {
        c B2 = this.a.B2();
        if (B2 == null) {
            return null;
        }
        return B2.getCurrentFocus();
    }
}
