package defpackage;

import com.spotify.voice.v1.VoiceInteractionManagerFeature;

/* renamed from: v5f  reason: default package */
public final /* synthetic */ class v5f implements nmf {
    public static final /* synthetic */ v5f a = new v5f();

    private /* synthetic */ v5f() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        return Integer.valueOf(VoiceInteractionManagerFeature.valueOf((String) obj).getNumber());
    }
}
