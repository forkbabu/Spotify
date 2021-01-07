package defpackage;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.results.model.e;

/* renamed from: sue  reason: default package */
public final /* synthetic */ class sue implements Function {
    public static final /* synthetic */ sue a = new sue();

    private /* synthetic */ sue() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        VoiceInteractionResponse.Display.Result result = (VoiceInteractionResponse.Display.Result) obj;
        return e.a.b(MoreObjects.nullToEmpty(result.title()), MoreObjects.nullToEmpty(result.image()), MoreObjects.nullToEmpty(result.uri()), MoreObjects.nullToEmpty(result.navigation()), result.playing(), MoreObjects.nullToEmpty(result.subtitle()), result.explicit(), ngf.a(result.uri()));
    }
}
