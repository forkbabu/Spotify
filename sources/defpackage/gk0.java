package defpackage;

import android.content.Context;
import android.os.Build;
import com.spotify.eventsender.n0;
import com.spotify.eventsender.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gk0  reason: default package */
public class gk0 {
    private final List<fk0> a;

    /* renamed from: gk0$b */
    public static class b {
        private final Map<String, fk0> a;

        public b(Context context, n0 n0Var, kl0 kl0, t tVar, ik0 ik0) {
            bk0 bk0;
            HashMap hashMap = new HashMap();
            this.a = hashMap;
            Context applicationContext = context.getApplicationContext();
            hashMap.put("context_time", new qk0());
            lk0 lk0 = new lk0();
            if (Build.VERSION.SDK_INT < 24) {
                bk0 = new nk0(n0Var, new ck0(kl0));
            } else {
                bk0 = new mk0(n0Var, new ak0(applicationContext, kl0));
            }
            hashMap.put("context_monotonic_clock", new jk0(lk0, new kk0(n0Var, bk0)));
            hashMap.put("context_device_android", new dk0(tVar));
            hashMap.put("context_sdk", new ok0());
            hashMap.put("context_application_android", new zj0(applicationContext, kl0));
            hashMap.put("context_installation_id", new hk0(ik0));
        }

        public b a(List<fk0> list) {
            HashMap hashMap = new HashMap();
            for (fk0 fk0 : list) {
                hashMap.put(fk0.f(), fk0);
            }
            this.a.putAll(hashMap);
            return this;
        }

        public gk0 b() {
            return new gk0(new ArrayList(this.a.values()), null);
        }
    }

    gk0(List list, a aVar) {
        this.a = list;
    }

    public List<fk0> a() {
        return new ArrayList(this.a);
    }
}
