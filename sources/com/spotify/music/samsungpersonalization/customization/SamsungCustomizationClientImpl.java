package com.spotify.music.samsungpersonalization.customization;

import android.app.Application;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.customizationservice.result.CustomizationServiceException;
import com.spotify.base.java.logging.Logger;
import com.spotify.remoteconfig.oa;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

public final class SamsungCustomizationClientImpl implements c {
    private boolean a;
    private final Application b;
    private final a c;
    private final j60 d;
    private final oa e;

    static final class a<V> implements Callable<Boolean> {
        final /* synthetic */ SamsungCustomizationClientImpl a;

        a(SamsungCustomizationClientImpl samsungCustomizationClientImpl) {
            this.a = samsungCustomizationClientImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return Boolean.valueOf(this.a.d());
        }
    }

    static final class b<T, R> implements l<Boolean, Boolean> {
        final /* synthetic */ SamsungCustomizationClientImpl a;
        final /* synthetic */ String b;

        b(SamsungCustomizationClientImpl samsungCustomizationClientImpl, String str) {
            this.a = samsungCustomizationClientImpl;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Boolean bool) {
            boolean z;
            boolean z2;
            CustomizationServiceException e;
            if (!bool.booleanValue()) {
                return Boolean.FALSE;
            }
            boolean z3 = true;
            try {
                l60 a2 = this.a.c.a(this.a.b, this.b);
                z = h.a("OK", a2.a);
                try {
                    z2 = a2.b;
                } catch (CustomizationServiceException e2) {
                    e = e2;
                }
            } catch (CustomizationServiceException e3) {
                e = e3;
                z = false;
                Logger.d("%s", e.getLocalizedMessage());
                z2 = false;
                z3 = false;
                return Boolean.valueOf(z3);
            }
            if (!z || !z2) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    static final class c<V> implements Callable<Boolean> {
        final /* synthetic */ SamsungCustomizationClientImpl a;

        c(SamsungCustomizationClientImpl samsungCustomizationClientImpl) {
            this.a = samsungCustomizationClientImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return Boolean.valueOf(this.a.d());
        }
    }

    static final class d<T, R> implements l<Boolean, List<? extends m60>> {
        final /* synthetic */ SamsungCustomizationClientImpl a;
        final /* synthetic */ String b;

        d(SamsungCustomizationClientImpl samsungCustomizationClientImpl, String str) {
            this.a = samsungCustomizationClientImpl;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
        @Override // io.reactivex.functions.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<? extends defpackage.m60> apply(java.lang.Boolean r8) {
            /*
            // Method dump skipped, instructions count: 367
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.samsungpersonalization.customization.SamsungCustomizationClientImpl.d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable<Boolean> {
        final /* synthetic */ SamsungCustomizationClientImpl a;

        e(SamsungCustomizationClientImpl samsungCustomizationClientImpl) {
            this.a = samsungCustomizationClientImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return Boolean.valueOf(this.a.d());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements l<Boolean, Boolean> {
        final /* synthetic */ cmf a;

        f(cmf cmf) {
            this.a = cmf;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                this.a.invoke();
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    public SamsungCustomizationClientImpl(Application application, a aVar, j60 j60, oa oaVar) {
        h.e(application, "application");
        h.e(aVar, "customizationServiceAPIWrapper");
        h.e(j60, "customizationService");
        h.e(oaVar, "properties");
        this.b = application;
        this.c = aVar;
        this.d = j60;
        this.e = oaVar;
    }

    private final z<Boolean> i(cmf<kotlin.f> cmf) {
        z<Boolean> A = z.y(new e(this)).A(new f(cmf));
        h.d(A, "Single.fromCallable { in…    initialized\n        }");
        return A;
    }

    @Override // com.spotify.music.samsungpersonalization.customization.c
    public z<List<m60>> a(String str) {
        h.e(str, "token");
        z<List<m60>> A = z.y(new c(this)).A(new d(this, str));
        h.d(A, "Single.fromCallable { in…)\n            }\n        }");
        return A;
    }

    @Override // com.spotify.music.samsungpersonalization.customization.c
    public z<Boolean> b(String str) {
        h.e(str, "token");
        z<Boolean> A = z.y(new a(this)).A(new b(this, str));
        h.d(A, "Single.fromCallable { in… hasUserConsent\n        }");
        return A;
    }

    @Override // com.spotify.music.samsungpersonalization.customization.c
    public z<Boolean> c(Fragment fragment, String str) {
        h.e(fragment, "fragment");
        h.e(str, "token");
        return i(new SamsungCustomizationClientImpl$requestUserConsent$1(this, fragment, str));
    }

    @Override // com.spotify.music.samsungpersonalization.customization.c
    public boolean d() {
        if (this.a) {
            return true;
        }
        try {
            this.d.a(this.b);
            j60 j60 = this.d;
            j60.a = this.b;
            boolean b2 = j60.b(1);
            this.a = b2;
            return b2;
        } catch (SsdkUnsupportedException e2) {
            int a2 = e2.a();
            Logger.l(je.x0("SamsungPersonalization initialization error ", a2 != 0 ? a2 != 1 ? a2 != 2 ? "unknown error" : "sdk version mismatch" : "device not supported" : "vendor not supported"), new Object[0]);
            return false;
        }
    }

    @Override // com.spotify.music.samsungpersonalization.customization.c
    public boolean e() {
        return Build.VERSION.SDK_INT >= 28 && this.e.a() && d();
    }

    @Override // com.spotify.music.samsungpersonalization.customization.c
    public z<Boolean> f(Fragment fragment, String str) {
        h.e(fragment, "fragment");
        h.e(str, "token");
        return i(new SamsungCustomizationClientImpl$withdrawUserConsent$1(this, fragment, str));
    }
}
