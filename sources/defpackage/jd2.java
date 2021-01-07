package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.u;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.voice.api.model.m;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.v;
import io.reactivex.z;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jd2  reason: default package */
public final class jd2 {

    /* access modifiers changed from: private */
    /* renamed from: jd2$a */
    public static class a {
        final m a;
        final long b;

        a(m mVar, long j) {
            this.a = mVar;
            this.b = j;
        }
    }

    /* access modifiers changed from: private */
    public static z<zwd> a(d dVar) {
        return dVar.a(c.j(SkipToNextTrackCommand.builder().options(CommandOptions.builder().overrideRestrictions(true).build()).build()));
    }

    static v c(d dVar, r.l lVar) {
        z<zwd> a2 = a(dVar);
        a2.getClass();
        return new i(a2).g(o.a);
    }

    static /* synthetic */ void e(cqe cqe, kv3 kv3, gl0 gl0, r.g gVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_message", gVar.a());
        } catch (JSONException e) {
            Logger.e(e, "Unable to create json data", new Object[0]);
        }
        h("ad_voice_error", cqe, jSONObject.toString(), kv3, gVar.c(), 0, gl0, gVar.b());
    }

    /* access modifiers changed from: private */
    public static void h(String str, cqe cqe, String str2, kv3 kv3, u uVar, long j, gl0<com.google.protobuf.u> gl0, String str3) {
        yda yda;
        Set<yda> c = kv3.c();
        Iterator<yda> it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                yda = null;
                break;
            }
            yda = it.next();
            if ("bluetooth".equalsIgnoreCase(yda.i())) {
                break;
            }
        }
        if (yda == null && !c.isEmpty()) {
            yda = c.iterator().next();
        }
        VoiceAdLog.c q = VoiceAdLog.q();
        q.p(str);
        q.r(cqe.d());
        q.o(str2);
        q.m("ad_id", uVar.b());
        q.m("lineitem_id", uVar.g());
        q.m("creative_id", uVar.e());
        q.m(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY, uVar.c());
        q.q((double) j);
        q.s(str3);
        if (yda != null) {
            q.n("device_name", yda.f());
            q.n("device_model", yda.e());
            q.n("accessory_type", yda.a());
            q.n("transport_type", yda.i());
            q.n("company", yda.c());
        }
        gl0.c(q.build());
    }
}
