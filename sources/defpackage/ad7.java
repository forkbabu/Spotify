package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.ubi.specification.factories.w2;

/* renamed from: ad7  reason: default package */
public class ad7 extends c {
    private final w2 c;
    private final ere f;
    private final ImpressionLogger n;
    private final yc7 o;

    public ad7(w2 w2Var, ere ere, ImpressionLogger impressionLogger, yc7 yc7) {
        super(C0707R.id.podcast_episode_impression_recommendations);
        this.c = w2Var;
        this.f = ere;
        this.n = impressionLogger;
        this.o = yc7;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        this.o.getClass();
        p81 logging = i61.f0(b0Var).d().logging();
        String string = logging.string("ui:uri");
        String string2 = logging.string("ui:group");
        this.n.b(logging.string("ui:source"), string, string2, i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
        this.f.a(this.c.b(Integer.valueOf(i), MoreObjects.nullToEmpty(string)).b());
    }
}
