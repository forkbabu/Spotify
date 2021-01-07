package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.quotesharing.c;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: upa  reason: default package */
public final class upa extends c {
    private final cb1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public upa(cb1 cb1) {
        super(C0707R.id.podcast_quotes_impression_logged);
        h.e(cb1, "podcastQuotesLogger");
        this.c = cb1;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        h.e(view, "view");
        h.e(b0Var, "viewHolder");
        cb1 cb1 = this.c;
        String str = ((c.C0184c) b0Var).D;
        if (str != null) {
            cb1.d(str);
        } else {
            h.k("loggingUri");
            throw null;
        }
    }
}
