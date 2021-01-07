package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.quicksilver.v2.mobius.InAppMessagingModel;
import com.spotify.music.features.quicksilver.v2.mobius.g;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import com.spotify.music.features.quicksilver.v2.mobius.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: x08  reason: default package */
public class x08 implements d {
    private final MobiusLoop.f<InAppMessagingModel, h, g> a;
    private MobiusLoop<InAppMessagingModel, h, g> b;
    private final a c;
    private final b f;
    private final q18 n;

    /* access modifiers changed from: package-private */
    /* renamed from: x08$a */
    public static class a implements b18 {
        MobiusLoop<InAppMessagingModel, h, g> a;

        a() {
        }

        @Override // defpackage.b18
        public Set<String> a(gp0 gp0) {
            MobiusLoop<InAppMessagingModel, h, g> mobiusLoop = this.a;
            if (mobiusLoop == null) {
                return Collections.emptySet();
            }
            InAppMessagingModel i = mobiusLoop.i();
            i.getClass();
            HashSet hashSet = new HashSet();
            if (!gp0.c().equals(i.b().getOrDefault(gp0.e(), ""))) {
                hashSet.add("CONTEXT_SWITCHED");
            }
            if (i.a()) {
                hashSet.add("AD_IS_PLAYING");
            }
            if (i.c()) {
                hashSet.add("APP_IN_BACKGROUND");
            }
            i e = i.e();
            e.getClass();
            if (!(e instanceof i.b)) {
                hashSet.add("IS_RESENTING_MESSAGE");
            }
            if (i.d()) {
                hashSet.add("CAR_MODE_ENABLED");
            }
            return hashSet;
        }

        @Override // defpackage.b18
        public boolean b(gp0 gp0) {
            MobiusLoop<InAppMessagingModel, h, g> mobiusLoop = this.a;
            if (mobiusLoop == null) {
                return false;
            }
            InAppMessagingModel i = mobiusLoop.i();
            if (!gp0.f(i.b().getOrDefault(gp0.e(), "")) || !i.f()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.b18
        public void c(String str) {
            MobiusLoop<InAppMessagingModel, h, g> mobiusLoop = this.a;
            if (mobiusLoop != null) {
                mobiusLoop.h(h.e(i.a()));
            }
        }

        @Override // defpackage.b18
        public void d(String str) {
            MobiusLoop<InAppMessagingModel, h, g> mobiusLoop = this.a;
            if (mobiusLoop != null) {
                mobiusLoop.h(h.e(i.b(str)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x08$b */
    public static class b {
        b() {
        }
    }

    public x08(MobiusLoop.f<InAppMessagingModel, h, g> fVar, a aVar, b bVar, q18 q18) {
        this.a = fVar;
        this.c = aVar;
        this.f = bVar;
        this.n = q18;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.b == null) {
            MobiusLoop<InAppMessagingModel, h, g> g = this.a.g(InAppMessagingModel.a);
            this.b = g;
            this.c.a = g;
            this.f.getClass();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.n.b();
        MobiusLoop<InAppMessagingModel, h, g> mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
            this.b = null;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "DisplayController";
    }
}
