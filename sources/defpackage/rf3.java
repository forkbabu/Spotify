package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.util.x;
import com.spotify.music.libs.podcast.download.f0;
import io.reactivex.g;
import java.util.Map;

/* renamed from: rf3  reason: default package */
public class rf3 {
    private static final String d = String.valueOf(true);
    private final v a;
    private final String b;
    private final Context c;

    public rf3(v vVar, String str, Context context) {
        this.a = vVar;
        this.b = str;
        this.c = context;
    }

    public static ImmutableMap b(rf3 rf3, c cVar) {
        rf3.getClass();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        boolean C = z42.C(cVar);
        boolean booleanValue = ((Boolean) cVar.M0(rna.d)).booleanValue();
        boolean c2 = f0.c(cVar);
        String valueOf = String.valueOf(booleanValue);
        String valueOf2 = String.valueOf(c2);
        String valueOf3 = String.valueOf(C);
        boolean equals = "active".equals((String) cVar.M0(g51.g));
        builder.mo51put("locale", rf3.b);
        builder.mo51put("application", "nft");
        builder.mo51put("platform", "android");
        builder.mo51put("video", valueOf);
        builder.mo51put("podcast", valueOf2);
        builder.mo51put("checkDeviceCapability", valueOf3);
        if (equals) {
            builder.mo51put("on-demand-trial", d);
        }
        if (x.g(rf3.c)) {
            builder.mo51put("signal", "device_type:tablet");
        }
        return builder.build();
    }

    public g<Map<String, String>> a() {
        return this.a.b().O(new qf3(this));
    }
}
