package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.VoiceViewResponse;
import defpackage.awb;
import defpackage.yvb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cwb  reason: default package */
class cwb implements bwb {
    private static boolean b(VoiceViewResponse voiceViewResponse) {
        return (voiceViewResponse == null || voiceViewResponse.custom() == null) ? false : true;
    }

    @Override // defpackage.bwb
    public awb a(VoiceViewResponse voiceViewResponse, int i) {
        SlimoProto$ParsedQuery$Intent intent;
        String query;
        VoiceViewResponse.Body.Images.Image main;
        ArrayList arrayList = new ArrayList(i);
        List<VoiceViewResponse.Body> body = voiceViewResponse.body();
        String str = "";
        if (body != null && !body.isEmpty()) {
            Iterator<VoiceViewResponse.Body> it = body.iterator();
            while (it.hasNext() && arrayList.size() < i) {
                VoiceViewResponse.Body next = it.next();
                VoiceViewResponse.Body.Target target = next.target();
                VoiceViewResponse.Body.Text text = next.text();
                awb.a aVar = null;
                r7 = null;
                String str2 = null;
                aVar = null;
                aVar = null;
                aVar = null;
                if (target != null && !MoreObjects.isNullOrEmpty(target.uri()) && text != null && !MoreObjects.isNullOrEmpty(text.title())) {
                    yvb.b bVar = new yvb.b();
                    bVar.b(target.uri());
                    bVar.e(text.title());
                    bVar.d(text.subtitle() != null ? text.subtitle() : str);
                    VoiceViewResponse.Body.Images images = next.images();
                    if (!(images == null || (main = images.main()) == null)) {
                        str2 = main.uri();
                    }
                    if (str2 == null) {
                        str2 = str;
                    }
                    bVar.c(str2);
                    aVar = bVar.a();
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        }
        if (b(voiceViewResponse) && (query = voiceViewResponse.custom().query()) != null) {
            str = query;
        }
        String error = b(voiceViewResponse) ? voiceViewResponse.custom().error() : "INVALID_RESPONSE";
        boolean z = false;
        if (b(voiceViewResponse) && ((intent = voiceViewResponse.custom().intent()) == SlimoProto$ParsedQuery$Intent.PLAY || intent == SlimoProto$ParsedQuery$Intent.NO_INTENT)) {
            z = true;
        }
        return new awb(arrayList, str, error, z);
    }
}
