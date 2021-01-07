package defpackage;

import com.spotify.voice.v1.VoiceInteractionManagerFeature;

/* renamed from: l5f  reason: default package */
public final /* synthetic */ class l5f implements nmf {
    public static final /* synthetic */ l5f a = new l5f();

    private /* synthetic */ l5f() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        return Integer.valueOf(VoiceInteractionManagerFeature.valueOf((String) obj).getNumber());
    }
}
