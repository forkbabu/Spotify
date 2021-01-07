package defpackage;

import com.spotify.voice.v1.VoiceInteractionManagerFeature;

/* renamed from: b6f  reason: default package */
public final /* synthetic */ class b6f implements nmf {
    public static final /* synthetic */ b6f a = new b6f();

    private /* synthetic */ b6f() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        return Integer.valueOf(VoiceInteractionManagerFeature.valueOf((String) obj).getNumber());
    }
}
