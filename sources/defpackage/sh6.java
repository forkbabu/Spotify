package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import defpackage.twd;

/* renamed from: sh6  reason: default package */
final class sh6 extends c {
    private final kh6 c;

    public sh6(kh6 kh6) {
        super(C0707R.id.item_list_impression_logged);
        this.c = kh6;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        if (b0Var instanceof twd.d) {
            twd.d dVar = (twd.d) b0Var;
            if (dVar.h0() instanceof jh6) {
                jh6 jh6 = (jh6) dVar.h0();
                String j0 = jh6.j0();
                if (!MoreObjects.isNullOrEmpty(j0)) {
                    this.c.a(j0, jh6.l0());
                }
            }
        }
    }
}
