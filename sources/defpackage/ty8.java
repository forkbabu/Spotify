package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import defpackage.wy8;
import defpackage.yda;

/* renamed from: ty8  reason: default package */
public final class ty8 {
    static final ImmutableMap<wy8.a, vy8> a;

    /* renamed from: ty8$a */
    static final class a implements vy8 {
        a(String str) {
        }

        @Override // defpackage.vy8
        public yda a() {
            yda.b bVar = new yda.b("GoogleAssistant");
            bVar.n(Constants.REFERRER_API_GOOGLE);
            bVar.r("com.google.android.googlequicksearchbox");
            bVar.s("android_media_session");
            bVar.l("voice_assistant");
            return bVar.k();
        }

        @Override // defpackage.vy8
        public String b() {
            return "ANDROID_GOOGLE_ASSISTANT";
        }
    }

    /* renamed from: ty8$b */
    public static class b implements vy8 {
        public b(String str) {
        }

        @Override // defpackage.vy8
        public yda a() {
            yda.b bVar = new yda.b("GoogleAssistant");
            bVar.n(Constants.REFERRER_API_GOOGLE);
            bVar.r("com.google.android.googlequicksearchbox");
            bVar.s("android_media_session");
            bVar.l("voice_assistant");
            bVar.t("driving_mode");
            return bVar.k();
        }

        @Override // defpackage.vy8
        public String b() {
            return "ANDROID_GOOGLE_ASSISTANT";
        }
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(new qy8("com.google.android.googlequicksearchbox", RootHintsParams.Mode.NONE), new a("com.google.android.googlequicksearchbox"));
        builder.mo51put(new qy8("com.google.android.googlequicksearchbox", RootHintsParams.Mode.DRIVING), new b("com.google.android.googlequicksearchbox"));
        a = builder.build();
    }
}
