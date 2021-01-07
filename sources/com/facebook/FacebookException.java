package com.facebook;

import com.facebook.internal.FeatureManager;
import java.util.Random;

public class FacebookException extends RuntimeException {
    static final long serialVersionUID = 1;

    class a implements FeatureManager.b {
        final /* synthetic */ String a;

        a(FacebookException facebookException, String str) {
            this.a = str;
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                try {
                    new vf(this.a).d();
                } catch (Exception unused) {
                }
            }
        }
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable, java.lang.Object
    public String toString() {
        return getMessage();
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null && k.u() && random.nextInt(100) > 50) {
            FeatureManager.a(FeatureManager.Feature.ErrorReport, new a(this, str));
        }
    }

    public FacebookException(String str, Object... objArr) {
        this(String.format(str, objArr));
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
