package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.z2;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: koc  reason: default package */
public class koc {
    private final jz1 a;
    private final cqe b;
    private final z2 c;

    public koc(jz1 jz1, cqe cqe, c cVar) {
        this.a = jz1;
        this.b = cqe;
        this.c = new z2(cVar.toString());
    }

    public nqe a(Integer num, String str) {
        return this.c.b().a(str, Integer.valueOf(num != null ? num.intValue() : 0));
    }

    @Deprecated
    public void b(Integer num) {
        String str;
        if (num != null) {
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            StringBuilder V0 = je.V0("spotify:contextmenu:episode:podcast:speedcontrol:");
            V0.append(decimalFormat.format((double) (((float) num.intValue()) / 100.0f)));
            V0.append('x');
            str = V0.toString();
        } else {
            str = String.format(Locale.ENGLISH, "%s:unknown", "spotify:contextmenu:episode:podcast:speedcontrol");
        }
        this.a.a(new fa1(null, "spotify:contextmenu:episode:podcast", "spotify:contextmenu:episode:podcast:speedcontrol", "speedcontrol", 0, str, "hit", "select", (double) this.b.d()));
    }
}
