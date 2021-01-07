package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;
import kotlin.jvm.internal.h;

/* renamed from: et8  reason: default package */
public final class et8 extends c {
    private final ImpressionLogger c;
    private final l81 f;
    private final gt8 n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public et8(ImpressionLogger impressionLogger, l81 l81, gt8 gt8) {
        super(C0707R.id.topic_impression_logger);
        h.e(impressionLogger, "impressionLogger");
        h.e(l81, "ubiImpressionLogger");
        h.e(gt8, "loggingBundleExtractor");
        this.c = impressionLogger;
        this.f = l81;
        this.n = gt8;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        h.e(view, "view");
        super.b(view);
        if (view instanceof RecyclerView) {
            m((RecyclerView) view);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
        h.e(view, "view");
        super.d(view);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= itemDecorationCount) {
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

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        h.e(view, "view");
        h.e(b0Var, "viewHolder");
        this.n.getClass();
        h.e(b0Var, "viewHolder");
        w61<?> f0 = i61.f0(b0Var);
        h.d(f0, "HubsAdapter.unwrap(viewHolder)");
        s81 d = f0.d();
        h.d(d, "HubsAdapter.unwrap(viewHolder).model");
        p81 logging = d.logging();
        this.c.b(logging.string("ui:source"), logging.string("ui:uri"), logging.string("ui:group"), i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
        this.f.a(d);
    }
}
