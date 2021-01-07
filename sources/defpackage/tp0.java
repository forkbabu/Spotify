package defpackage;

import com.google.common.base.Optional;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.inappmessaging.proto.ClickActions$ClickActionV1;
import com.spotify.inappmessaging.proto.Messages$MessageV1;
import com.spotify.inappmessaging.proto.Preview$PreviewResponseV1;
import com.spotify.localization.SpotifyLocale;
import io.reactivex.s;
import io.reactivex.v;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.e0;

/* renamed from: tp0  reason: default package */
public class tp0 {
    private final up0 a;
    private final vp0 b;

    public tp0(up0 up0, vp0 vp0) {
        this.a = up0;
        this.b = vp0;
    }

    public v a(TriggerType triggerType, String str, retrofit2.v vVar) {
        Optional optional;
        if (!vVar.f() || vVar.a() == null) {
            return s.i0(Optional.absent());
        }
        vp0 vp0 = this.b;
        Preview$PreviewResponseV1 l = Preview$PreviewResponseV1.l(((e0) vVar.a()).b());
        vp0.getClass();
        if (l.i() == 0) {
            optional = Optional.absent();
        } else {
            Messages$MessageV1 h = l.h(0);
            Map<String, ClickActions$ClickActionV1> i = h.i();
            HashMap hashMap = new HashMap(h.h());
            for (String str2 : h.i().keySet()) {
                ClickActions$ClickActionV1 clickActions$ClickActionV1 = i.get(str2);
                ActionType valueOf = ActionType.valueOf(clickActions$ClickActionV1.h());
                hashMap.put(str2, ep0.a(valueOf, clickActions$ClickActionV1.m(), clickActions$ClickActionV1.l(), (valueOf == ActionType.EXTERNAL_URL || valueOf == ActionType.SELECT_OPTION) ? false : true));
            }
            String l2 = h.l();
            if (l2.equals("cards") && h.n()) {
                l2 = "fullscreen";
            }
            String o = h.o();
            String q = h.q();
            String p = h.p();
            String r = h.r();
            Locale locale = Locale.US;
            optional = Optional.of(new u3(gp0.a(triggerType, str, FormatType.valueOf(l2.toUpperCase(locale))), fp0.a(o, hashMap, q, p, r, FormatType.valueOf(l2.toUpperCase(locale)))));
        }
        return s.i0(optional);
    }

    public s<Optional<u3<gp0, fp0>>> b(TriggerType triggerType, String str, String str2, boolean z) {
        return this.a.a(str, "application/protobuf", z ? "quicksilverdev" : "quicksilver", SpotifyLocale.c(), triggerType.toString(), str, str2, true).P().W(new sp0(this, triggerType, str), false, Integer.MAX_VALUE);
    }
}
