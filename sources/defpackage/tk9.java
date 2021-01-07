package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: tk9  reason: default package */
public class tk9 extends c {
    private final ImpressionLogger c;
    private final l81 f;
    private final rk9 n;
    private boolean o;

    public tk9(ImpressionLogger impressionLogger, l81 l81, rk9 rk9) {
        super(C0707R.id.free_tier_impression_logged);
        this.c = impressionLogger;
        this.f = l81;
        this.n = rk9;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        super.b(view);
        if (this.o && (view instanceof RecyclerView)) {
            m((RecyclerView) view);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
        super.d(view);
        if (this.o && (view instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) view;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= recyclerView.getItemDecorationCount()) {
                    break;
                } else if (equals(recyclerView.f0(i))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                g(recyclerView);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        this.n.getClass();
        s81 d = i61.f0(b0Var).d();
        p81 logging = d.logging();
        String string = logging.string("ui:uri");
        String string2 = logging.string("ui:group");
        this.c.b(logging.string("ui:source"), string, string2, i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
        this.f.a(d);
    }

    public void o(boolean z) {
        this.o = z;
    }
}
