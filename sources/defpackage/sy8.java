package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import defpackage.wy8;
import defpackage.yda;

/* renamed from: sy8  reason: default package */
final class sy8 implements vy8 {
    static final ImmutableMap<wy8.a, vy8> b;
    private final String a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        RootHintsParams.Mode mode = RootHintsParams.Mode.NONE;
        builder.mo51put(new qy8("com.microsoft.cortana", mode), new sy8("com.microsoft.cortana"));
        builder.mo51put(new qy8("com.microsoft.cortana.wip", mode), new sy8("com.microsoft.cortana.wip"));
        builder.mo51put(new qy8("com.microsoft.cortana.daily", mode), new sy8("com.microsoft.cortana.daily"));
        b = builder.build();
    }

    private sy8(String str) {
        this.a = str;
    }

    @Override // defpackage.vy8
    public yda a() {
        yda.b bVar = new yda.b("Cortana");
        bVar.n("microsoft");
        bVar.r(this.a);
        bVar.s("android_media_session");
        bVar.l("voice_assistant");
        return bVar.k();
    }

    @Override // defpackage.vy8
    public String b() {
        return "CORTANA";
    }
}
