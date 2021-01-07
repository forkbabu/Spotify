package com.spotify.music.features.onboarding.di;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.libs.onboarding.allboarding.AllBoardingActivity;
import com.spotify.libs.onboarding.allboarding.EntryPoint;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.tasteonboarding.TasteOnboardingActivity;
import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;
import defpackage.glb;
import kotlin.jvm.internal.h;

public final class a implements blb {
    private final Context a;
    private final AndroidFeatureAllboardingProperties b;

    /* renamed from: com.spotify.music.features.onboarding.di.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    static final class C0238a<T, U, R> implements glb.b<Intent, c, Intent> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public C0238a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.glb.b
        public final Intent a(Intent intent, c cVar) {
            int i = this.a;
            if (i == 0) {
                return AllBoardingActivity.C.a(((a) this.b).a, EntryPoint.f);
            }
            if (i == 1) {
                return AllBoardingActivity.C.a(((a) this.b).a, EntryPoint.c);
            }
            if (i == 2) {
                return TasteOnboardingActivity.U0(((a) this.b).a, false);
            }
            if (i == 3) {
                return TasteOnboardingActivity.U0(((a) this.b).a, true);
            }
            throw null;
        }
    }

    static final class b<T, U, R> implements glb.b<Intent, c, Intent> {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.glb.b
        public Intent a(Intent intent, c cVar) {
            EntryPoint entryPoint;
            Intent intent2 = intent;
            h.d(intent2, "intent");
            l0 z = l0.z(intent2.getDataString());
            EntryPoint.a aVar = EntryPoint.o;
            h.d(z, "link");
            String k = z.k();
            EntryPoint[] values = EntryPoint.values();
            int i = 0;
            while (true) {
                if (i >= 8) {
                    entryPoint = null;
                    break;
                }
                entryPoint = values[i];
                if (h.a(entryPoint.h(), k)) {
                    break;
                }
                i++;
            }
            if (entryPoint == null) {
                entryPoint = EntryPoint.f;
            }
            return AllBoardingActivity.C.a(this.a.a, entryPoint);
        }
    }

    public a(Context context, AndroidFeatureAllboardingProperties androidFeatureAllboardingProperties) {
        h.e(context, "context");
        h.e(androidFeatureAllboardingProperties, "androidFeatureAllboarding");
        this.a = context;
        this.b = androidFeatureAllboardingProperties;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.b.a() == AndroidFeatureAllboardingProperties.EnableAllboarding.ENABLED) {
            xkb xkb = (xkb) glb;
            xkb.h(LinkType.ALLBOARDING, "Open AllBoarding feature", new b(this));
            xkb.h(LinkType.TASTE_ONBOARDING, "Redirect to taste onboarding page", new C0238a(0, this));
            xkb.h(LinkType.TASTE_ONBOARDING_UPDATE, "Redirect to taste onboarding page", new C0238a(1, this));
            return;
        }
        xkb xkb2 = (xkb) glb;
        xkb2.h(LinkType.TASTE_ONBOARDING, "Redirect to taste onboarding page", new C0238a(2, this));
        xkb2.h(LinkType.TASTE_ONBOARDING_UPDATE, "Redirect to taste onboarding page", new C0238a(3, this));
    }
}
