package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: ma7  reason: default package */
public class ma7 extends c {
    private final ImpressionLogger c;
    private final l81 f;

    public ma7(ImpressionLogger impressionLogger, l81 l81) {
        super(C0707R.id.podcast_episode_impression_logged);
        this.c = impressionLogger;
        this.f = l81;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        s81 d = i61.f0(b0Var).d();
        p81 logging = d.logging();
        String string = logging.string("ui:uri");
        String string2 = logging.string("ui:group");
        this.c.b(logging.string("ui:source"), string, string2, i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
        this.f.a(d);
    }
}
