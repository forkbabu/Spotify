package defpackage;

import com.spotify.voice.v1.VoiceInteractionManagerFeature;

/* renamed from: i5f  reason: default package */
public final /* synthetic */ class i5f implements nmf {
    public static final /* synthetic */ i5f a = new i5f();

    private /* synthetic */ i5f() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        return Integer.valueOf(VoiceInteractionManagerFeature.valueOf((String) obj).getNumber());
    }
}
