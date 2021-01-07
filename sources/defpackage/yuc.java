package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;
import com.spotify.encore.consumer.components.podcastinteractivity.entrypoint.EncoreConsumerReplyCardEpisodePageExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import defpackage.xuc;
import kotlin.jvm.internal.h;

/* renamed from: yuc  reason: default package */
public final class yuc implements fjf<ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public yuc(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        xuc.a aVar = xuc.a;
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration> replyCardEpisodePageFactory = EncoreConsumerReplyCardEpisodePageExtensions.replyCardEpisodePageFactory(encoreConsumerEntryPoint.getCards());
        yif.g(replyCardEpisodePageFactory, "Cannot return null from a non-@Nullable @Provides method");
        return replyCardEpisodePageFactory;
    }
}
