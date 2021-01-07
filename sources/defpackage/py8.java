package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import defpackage.wy8;
import defpackage.yda;

/* renamed from: py8  reason: default package */
final class py8 implements vy8 {
    static final ImmutableMap<wy8.a, vy8> b;
    private final String a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        RootHintsParams.Mode mode = RootHintsParams.Mode.NONE;
        builder.mo51put(new qy8("com.amazon.dee.app", mode), new py8("com.amazon.dee.app"));
        builder.mo51put(new qy8("com.amazon.aca", mode), new py8("com.amazon.aca"));
        builder.mo51put(new qy8("com.amazon.alexa.multimodal.lyra", mode), new py8("com.amazon.alexa.multimodal.lyra"));
        builder.mo51put(new qy8("amazon.speech.sim", mode), new py8("amazon.speech.sim"));
        b = builder.build();
    }

    private py8(String str) {
        this.a = str;
    }

    @Override // defpackage.vy8
    public yda a() {
        yda.b bVar = new yda.b("Alexa");
        bVar.n("amazon");
        bVar.r(this.a);
        bVar.s("android_media_session");
        bVar.l("voice_assistant");
        return bVar.k();
    }

    @Override // defpackage.vy8
    public String b() {
        return "ANDROID_ALEXA";
    }
}
