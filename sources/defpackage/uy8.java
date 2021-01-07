package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import defpackage.wy8;
import defpackage.yda;

/* renamed from: uy8  reason: default package */
final class uy8 implements vy8 {
    static final ImmutableMap<wy8.a, vy8> a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(new qy8("com.example.android.mediacontroller", RootHintsParams.Mode.NONE), new uy8("com.example.android.mediacontroller"));
        a = builder.build();
    }

    private uy8(String str) {
    }

    @Override // defpackage.vy8
    public yda a() {
        yda.b bVar = new yda.b("AssistantOther");
        bVar.r("com.example.android.mediacontroller");
        bVar.s("android_media_session");
        bVar.l("voice_assistant");
        return bVar.k();
    }

    @Override // defpackage.vy8
    public String b() {
        return "UNKNOWN";
    }
}
