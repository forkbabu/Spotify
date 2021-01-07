package defpackage;

import com.spotify.voice.api.model.VoiceInteractionResponse;
import defpackage.uue;
import io.reactivex.functions.l;
import java.util.Queue;

/* renamed from: uwe  reason: default package */
public final /* synthetic */ class uwe implements l {
    public final /* synthetic */ tue a;

    public /* synthetic */ uwe(tue tue) {
        this.a = tue;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Queue<VoiceInteractionResponse.Action> queue;
        tue tue = this.a;
        if (((uue.i) obj).a()) {
            queue = tue.b();
        } else {
            queue = tue.c();
        }
        return vue.h(queue);
    }
}
