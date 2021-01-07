package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.voice.interaction.v1.InteractionResponse;
import io.reactivex.functions.l;
import kotlin.collections.d;

/* renamed from: p4f  reason: default package */
public final /* synthetic */ class p4f implements l {
    public static final /* synthetic */ p4f a = new p4f();

    private /* synthetic */ p4f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        InteractionResponse interactionResponse = (InteractionResponse) obj;
        return q2f.c(interactionResponse.l(), Collections2.newArrayDeque(d.v(interactionResponse.h(), new j7f())));
    }
}
