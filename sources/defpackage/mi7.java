package defpackage;

import com.spotify.mobile.android.service.session.e;
import com.spotify.mobile.android.service.session.f;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.remoteconfig.PremiumDestinationProperties;
import io.reactivex.z;

/* renamed from: mi7  reason: default package */
public class mi7 {
    public static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.c("debug_tools_premium_destination_date_override");
    public static final SpSharedPreferences.b<Object, String> f = SpSharedPreferences.b.c("debug_tools_premium_destination_locale_override");
    public static final SpSharedPreferences.b<Object, String> g = SpSharedPreferences.b.c("debug_tools_premium_destination_eligibility_override");
    public static final SpSharedPreferences.b<Object, String> h = SpSharedPreferences.b.c("debug_tools_premium_destination_build_model_override");
    public static final SpSharedPreferences.b<Object, String> i = SpSharedPreferences.b.c("debug_tools_premium_destination_environment_override");
    private final PremiumDestinationProperties a;
    private final f b;
    private final cqe c;
    private final oi7 d;

    public mi7(PremiumDestinationProperties premiumDestinationProperties, f fVar, cqe cqe, oi7 oi7) {
        this.a = premiumDestinationProperties;
        this.b = fVar;
        this.c = cqe;
        this.d = oi7;
    }

    public boolean a() {
        this.d.getClass();
        DebugFlag debugFlag = DebugFlag.PREMIUM_DESTINATION_LOCAL_HUBS;
        return this.a.c();
    }

    public z<Boolean> b(String str, ozd ozd) {
        if (!ozd.a(str)) {
            return z.z(Boolean.FALSE);
        }
        return this.b.b().j0(new li7(this, ozd, str)).N0(1).B0();
    }

    public boolean c() {
        return this.a.c();
    }

    public /* synthetic */ Boolean d(ozd ozd, String str, e eVar) {
        long j;
        if (eVar.call().isPresent()) {
            j = eVar.call().get().longValue();
        } else {
            j = this.c.d();
        }
        return Boolean.valueOf(ozd.b(str, j * 1000));
    }
}
