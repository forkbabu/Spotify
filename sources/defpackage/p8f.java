package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import defpackage.x2f;

/* renamed from: p8f  reason: default package */
public final class p8f {
    private final Resources a;
    private x2f b;
    private final n8f c;

    p8f(Context context, n8f n8f) {
        this.a = context.getResources();
        this.c = n8f;
    }

    public /* synthetic */ u8f a(x2f.h hVar) {
        Optional optional;
        if (hVar.k()) {
            optional = Optional.of(this.a.getString(C0707R.string.try_saying));
        } else {
            optional = Optional.absent();
        }
        return u8f.j(optional);
    }

    public u8f b(x2f.a aVar) {
        int i;
        if (aVar.l() == null) {
            return u8f.h(null);
        }
        n8f n8f = this.c;
        VoiceInteractionResponse.Action l = aVar.l();
        n8f.getClass();
        if (l instanceof VoiceInteractionResponse.Display) {
            VoiceInteractionResponse.Display display = (VoiceInteractionResponse.Display) l;
            return u8f.a(display.getTitle(), display.getSubtitle(), true, display.action(), display.getResults());
        } else if (!(l instanceof VoiceInteractionResponse.Generic)) {
            return u8f.h(l.action());
        } else {
            VoiceInteractionResponse.Generic generic = (VoiceInteractionResponse.Generic) l;
            if (MoreObjects.isNullOrEmpty(generic.getData().get("score"))) {
                i = 0;
            } else {
                i = Integer.parseInt(generic.getData().get("score"));
            }
            if (generic.getData().containsKey("correctArtistName")) {
                return u8f.b(i, MoreObjects.nullToEmpty(generic.getData().get("correctArtistImageUri")), MoreObjects.nullToEmpty(generic.getData().get("correctArtistName")));
            }
            return u8f.i(i);
        }
    }

    public /* synthetic */ u8f c(x2f.i iVar) {
        return u8f.c(r8f.c(this.a.getString(C0707R.string.offline_title), this.a.getString(C0707R.string.offline_description), C0707R.drawable.ic_voice_error));
    }

    public /* synthetic */ u8f d(x2f.k kVar) {
        return u8f.c(r8f.a(this.a.getString(C0707R.string.error_unsupported_intent_title), this.a.getString(C0707R.string.did_not_catch_description), C0707R.drawable.ic_mic_retry, s8f.a()));
    }

    public /* synthetic */ u8f e(x2f.b bVar) {
        return u8f.c(r8f.a(this.a.getString(C0707R.string.did_not_catch_title), this.a.getString(C0707R.string.did_not_catch_description), C0707R.drawable.ic_mic_retry, s8f.b()));
    }

    public t8f f(w2f w2f) {
        x2f x2f = this.b;
        if (x2f != null) {
            x2f.getClass();
            if (!(x2f instanceof x2f.a) && this.b.equals(w2f.d())) {
                return t8f.a(u8f.h(null), w2f.b(), w2f.h());
            }
        }
        x2f d = w2f.d();
        this.b = d;
        return t8f.a((u8f) d.i(c8f.a, g8f.a, new l8f(this), e8f.a, d8f.a, new i8f(this), new m8f(this), new j8f(this), new h8f(this), k8f.a, f8f.a), w2f.b(), w2f.h());
    }
}
