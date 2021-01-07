package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.ads.voice.domain.IntentType;
import com.spotify.music.ads.voice.domain.q;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.voice.api.model.VoiceViewResponse;
import com.spotify.voice.api.model.m;
import com.spotify.voiceassistant.player.models.ParsedQuery;
import defpackage.jd2;
import io.reactivex.functions.l;

/* renamed from: gc2  reason: default package */
public final /* synthetic */ class gc2 implements l {
    public final /* synthetic */ ObjectMapper a;
    public final /* synthetic */ String b;

    public /* synthetic */ gc2(ObjectMapper objectMapper, String str) {
        this.a = objectMapper;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str;
        ObjectMapper objectMapper = this.a;
        String str2 = this.b;
        jd2.a aVar = (jd2.a) obj;
        m mVar = aVar.a;
        long j = aVar.b;
        mVar.getClass();
        if (mVar instanceof m.c) {
            return s.m(((m.c) mVar).g());
        }
        if (mVar instanceof m.a) {
            return s.n(j);
        }
        if (!(mVar instanceof m.e)) {
            return s.l(j);
        }
        VoiceViewResponse.Custom custom = ((VoiceViewResponse) objectMapper.convertValue(((m.e) mVar).g(), VoiceViewResponse.class)).custom();
        if (custom == null) {
            str = null;
        } else {
            str = custom.rawIntent();
        }
        if (str == null) {
            return s.k(q.b);
        }
        Logger.b("[VoiceAd] Query: %s", custom.query());
        IntentType intentType = IntentType.NO_INTENT;
        if (IntentType.d(str, str2)) {
            if (ParsedQuery.INTENT_PLAY.equalsIgnoreCase(str)) {
                intentType = IntentType.PLAY;
            } else if ("SAVE".equalsIgnoreCase(str)) {
                intentType = IntentType.SAVE;
            }
        }
        return s.j(intentType);
    }
}
