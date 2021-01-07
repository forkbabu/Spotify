package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.e;
import com.google.firebase.components.g;
import java.io.File;

final /* synthetic */ class b implements g {
    private final CrashlyticsNdkRegistrar a;

    private b(CrashlyticsNdkRegistrar crashlyticsNdkRegistrar) {
        this.a = crashlyticsNdkRegistrar;
    }

    public static g b(CrashlyticsNdkRegistrar crashlyticsNdkRegistrar) {
        return new b(crashlyticsNdkRegistrar);
    }

    @Override // com.google.firebase.components.g
    public Object a(e eVar) {
        this.a.getClass();
        Context context = (Context) eVar.get(Context.class);
        return new c(new a(context, new JniNativeApi(), new f(new File(context.getFilesDir(), ".com.google.firebase.crashlytics-ndk"))));
    }
}
