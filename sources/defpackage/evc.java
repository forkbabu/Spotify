package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.encore.consumer.components.podcastinteractivity.entrypoint.EncoreConsumerReplyRowQnAExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import defpackage.zuc;
import kotlin.jvm.internal.h;

/* renamed from: evc  reason: default package */
public final class evc implements fjf<ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public evc(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        zuc.a aVar = zuc.a;
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration> replyRowQnAFactory = EncoreConsumerReplyRowQnAExtensions.replyRowQnAFactory(encoreConsumerEntryPoint.getRows());
        yif.g(replyRowQnAFactory, "Cannot return null from a non-@Nullable @Provides method");
        return replyRowQnAFactory;
    }
}
