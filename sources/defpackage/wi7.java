package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: wi7  reason: default package */
public class wi7 extends c {
    private final ImpressionLogger c;
    private final yi7 f;
    private final l81 n;

    public wi7(ImpressionLogger impressionLogger, yi7 yi7, l81 l81) {
        super(C0707R.id.hubs_premium_page_logger);
        this.c = impressionLogger;
        this.f = yi7;
        this.n = l81;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        this.f.getClass();
        s81 d = i61.f0(b0Var).d();
        p81 logging = d.logging();
        String string = logging.string("ui:uri");
        String string2 = logging.string("ui:group");
        this.c.b(logging.string("ui:source"), string, string2, i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
        this.n.a(d);
        for (s81 s81 : d.children()) {
            this.n.a(s81);
        }
    }
}
