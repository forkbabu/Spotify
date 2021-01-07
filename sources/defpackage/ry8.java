package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import defpackage.wy8;
import defpackage.yda;

/* renamed from: ry8  reason: default package */
final class ry8 implements vy8 {
    static final ImmutableMap<wy8.a, vy8> b;
    private final String a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        RootHintsParams.Mode mode = RootHintsParams.Mode.NONE;
        builder.mo51put(new qy8("com.samsung.android.bixby.service", mode), new ry8("com.samsung.android.bixby.service"));
        builder.mo51put(new qy8("com.samsung.android.bixby.agent", mode), new ry8("com.samsung.android.bixby.agent"));
        b = builder.build();
    }

    private ry8(String str) {
        this.a = str;
    }

    @Override // defpackage.vy8
    public yda a() {
        yda.b bVar = new yda.b("Bixby");
        bVar.n("samsung");
        bVar.r(this.a);
        bVar.s("android_media_session");
        bVar.l("voice_assistant");
        return bVar.k();
    }

    @Override // defpackage.vy8
    public String b() {
        return "SAMSUNG_BIXBY";
    }
}
