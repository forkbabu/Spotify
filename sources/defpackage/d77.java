package defpackage;

import com.spotify.music.podcast.entity.adapter.topics.TopicChipSectionAdapterDelegate;
import com.spotify.music.podcast.ui.topic.f;
import com.spotify.music.podcast.ui.topic.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: d77  reason: default package */
public final class d77 {
    private final ajf<a> a;
    private final f b;

    /* renamed from: d77$a */
    public interface a {
        void f(Class<? extends TopicChipSectionAdapterDelegate.a> cls);
    }

    public d77(ajf<a> ajf, f fVar) {
        h.e(ajf, "listener");
        h.e(fVar, "topicClickListener");
        this.a = ajf;
        this.b = fVar;
    }

    public final void a(qyd qyd, esc esc) {
        h.e(qyd, "showEntity");
        h.e(esc, "blueprint");
        pyd g = qyd.g();
        if (g != null) {
            List<oyd> b2 = g.b();
            if (!(b2 == null || b2.isEmpty())) {
                ArrayList arrayList = new ArrayList(d.e(b2, 10));
                for (T t : b2) {
                    arrayList.add(g.a(t.b(), t.c()));
                }
                esc.e().add(new TopicChipSectionAdapterDelegate.a(arrayList, this.b));
                this.a.get().f(TopicChipSectionAdapterDelegate.a.class);
            }
        }
    }
}
