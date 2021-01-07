package defpackage;

import com.google.common.base.Optional;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.inappmessaging.proto.ClickActions$ClickActionV1;
import com.spotify.inappmessaging.proto.Messages$MessageResponseV1;
import com.spotify.inappmessaging.proto.Messages$MessageV1;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.e0;
import retrofit2.v;
import retrofit2.w;

/* renamed from: jp0  reason: default package */
public class jp0 {
    private final kp0 a;
    private final lp0 b;

    public jp0(kp0 kp0, lp0 lp0) {
        this.a = kp0;
        this.b = lp0;
    }

    public static kp0 a(w wVar) {
        return (kp0) wVar.d(kp0.class);
    }

    public s<Optional<u3<gp0, fp0>>> b(String str, String str2, TriggerType triggerType, boolean z, List<gp0> list, List<ActionType> list2, List<FormatType> list3, boolean z2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (gp0 gp0 : list) {
            arrayList.add(gp0.c());
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (ActionType actionType : list2) {
            arrayList2.add(actionType.name());
        }
        ArrayList arrayList3 = new ArrayList();
        for (FormatType formatType : list3) {
            if (formatType != FormatType.FULLSCREEN) {
                arrayList3.add(formatType.name().toLowerCase(Locale.US));
            }
        }
        return s.d1(this.a.a(z2 ? "quicksilverdev" : "quicksilver", "application/protobuf", str, str2, triggerType.toString(), z, arrayList3, arrayList2, arrayList).P(), s.i0(list), new hp0(this));
    }

    public Optional c(v vVar, List list) {
        fp0 fp0;
        gp0 gp0;
        if (!vVar.f() || vVar.a() == null) {
            return Optional.absent();
        }
        lp0 lp0 = this.b;
        Messages$MessageResponseV1 l = Messages$MessageResponseV1.l(((e0) vVar.a()).b());
        lp0.getClass();
        if (l.i().isEmpty()) {
            return Optional.absent();
        }
        Iterator it = list.iterator();
        while (true) {
            fp0 = null;
            if (!it.hasNext()) {
                gp0 = null;
                break;
            }
            gp0 gp02 = (gp0) it.next();
            String c = gp02.c();
            if (l.h(c)) {
                Messages$MessageV1 messages$MessageV1 = l.i().get(c);
                Map<String, ClickActions$ClickActionV1> i = messages$MessageV1.i();
                HashMap hashMap = new HashMap(messages$MessageV1.h());
                for (String str : messages$MessageV1.i().keySet()) {
                    ClickActions$ClickActionV1 clickActions$ClickActionV1 = i.get(str);
                    ActionType valueOf = ActionType.valueOf(clickActions$ClickActionV1.h());
                    hashMap.put(str, ep0.a(valueOf, clickActions$ClickActionV1.m(), clickActions$ClickActionV1.l(), (valueOf == ActionType.EXTERNAL_URL || valueOf == ActionType.SELECT_OPTION) ? false : true));
                }
                String l2 = messages$MessageV1.l();
                if (l2.equals("cards") && messages$MessageV1.n()) {
                    l2 = "fullscreen";
                }
                fp0 = fp0.a(messages$MessageV1.o(), hashMap, messages$MessageV1.q(), messages$MessageV1.p(), messages$MessageV1.r(), FormatType.valueOf(l2.toUpperCase(Locale.US)));
                gp0 = gp02;
            }
        }
        if (fp0 == null) {
            return Optional.absent();
        }
        return Optional.of(new u3(gp0, fp0));
    }
}
