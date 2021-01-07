package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.u;
import io.reactivex.z;
import java.util.Calendar;
import java.util.Locale;
import okhttp3.e0;
import retrofit2.v;

/* access modifiers changed from: package-private */
/* renamed from: oe7  reason: default package */
public class oe7 {
    private final ne7 a;
    private final se7 b;
    private final cqe c;
    private final t d;
    private final String e;

    public oe7(ne7 ne7, se7 se7, cqe cqe, t tVar, String str) {
        this.a = ne7;
        this.b = se7;
        this.c = cqe;
        this.d = tVar;
        this.e = str;
    }

    public z<re7> a(String str) {
        ne7 ne7 = this.a;
        Calendar e2 = this.c.e();
        e2.set(11, 0);
        e2.set(12, 0);
        e2.set(13, 0);
        e2.set(14, 0);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("platform", "android");
        builder.mo51put("dt", u.a(e2));
        builder.mo51put("locale", this.e);
        builder.mo51put("region", Locale.getDefault().getCountry());
        builder.mo51put("signal", String.format("episodeURI:%s", str));
        builder.mo51put("version", this.d.c());
        z<v<e0>> a2 = ne7.a(builder.build());
        se7 se7 = this.b;
        se7.getClass();
        return a2.A(new zd7(se7));
    }
}
