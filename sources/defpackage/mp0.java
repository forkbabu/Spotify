package defpackage;

import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.inappmessaging.proto.Triggers$TriggerResponseV1;
import com.spotify.inappmessaging.proto.Triggers$TriggerV1;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import okhttp3.e0;
import retrofit2.v;
import retrofit2.w;

/* renamed from: mp0  reason: default package */
public class mp0 {
    private final np0 a;
    private final op0 b;

    public mp0(np0 np0, op0 op0) {
        this.a = np0;
        this.b = op0;
    }

    public static np0 a(w wVar) {
        return (np0) wVar.d(np0.class);
    }

    public s<List<gp0>> b(boolean z, List<FormatType> list, List<TriggerType> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (TriggerType triggerType : list2) {
            arrayList.add(triggerType.toString());
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (FormatType formatType : list) {
            if (formatType != FormatType.FULLSCREEN) {
                arrayList2.add(formatType.toString().toLowerCase(Locale.US));
            }
        }
        return this.a.a(z ? "quicksilverdev" : "quicksilver", "application/protobuf", arrayList2, arrayList).P().j0(new ip0(this));
    }

    public List c(v vVar) {
        if (!vVar.f() || vVar.a() == null) {
            return Collections.emptyList();
        }
        op0 op0 = this.b;
        Triggers$TriggerResponseV1 l = Triggers$TriggerResponseV1.l(((e0) vVar.a()).b());
        op0.getClass();
        ArrayList arrayList = new ArrayList(l.h());
        for (Triggers$TriggerV1 triggers$TriggerV1 : l.i()) {
            arrayList.add(gp0.a(TriggerType.valueOf(triggers$TriggerV1.l()), triggers$TriggerV1.i(), FormatType.valueOf(triggers$TriggerV1.h().toUpperCase(Locale.US))));
        }
        return arrayList;
    }
}
