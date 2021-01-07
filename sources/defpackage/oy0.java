package defpackage;

import android.util.Base64;
import com.google.common.collect.Collections2;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import java.util.HashSet;

/* renamed from: oy0  reason: default package */
public class oy0 implements ny0 {
    private static final SpSharedPreferences.b<Object, String> b = SpSharedPreferences.b.c("pre-signup-experiment-flags-overrides-enabled");
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("pre-signup-experiment-flags-overrides-disabled");
    private static final SpSharedPreferences.b<Object, String> d = SpSharedPreferences.b.c("sic-configuration-response-override");
    private final SpSharedPreferences<Object> a;

    public oy0(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    @Override // defpackage.ny0
    public ConfigurationResponse a(ConfigurationResponse configurationResponse) {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, String> bVar = d;
        ConfigurationResponse configurationResponse2 = null;
        if (spSharedPreferences.a(bVar)) {
            try {
                configurationResponse2 = ConfigurationResponse.v(Base64.decode(this.a.m(bVar, null), 0));
            } catch (InvalidProtocolBufferException unused) {
            }
        }
        if (configurationResponse2 != null) {
            configurationResponse = configurationResponse2;
        }
        HashSet newHashSet = Collections2.newHashSet(configurationResponse.n());
        newHashSet.addAll(yw0.a(this.a.n(b, "")));
        newHashSet.removeAll(yw0.a(this.a.n(c, "")));
        ConfigurationResponse.b t = ConfigurationResponse.t(configurationResponse);
        t.n();
        t.m(newHashSet);
        return (ConfigurationResponse) t.build();
    }
}
