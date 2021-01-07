package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.interaction.v1.InteractionResponse;

/* renamed from: c3f  reason: default package */
public final /* synthetic */ class c3f implements nmf {
    public static final /* synthetic */ c3f a = new c3f();

    private /* synthetic */ c3f() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        InteractionResponse.Result result = (InteractionResponse.Result) obj;
        return VoiceInteractionResponse.Display.Result.create(result.n(), result.m(), result.h(), result.o(), result.l(), result.getIsExplicit(), result.i());
    }
}
