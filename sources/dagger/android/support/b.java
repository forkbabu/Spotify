package dagger.android.support;

import android.os.Bundle;
import androidx.appcompat.app.g;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.a;
import dagger.android.h;

public abstract class b extends g implements h {
    DispatchingAndroidInjector<Object> A;

    @Override // dagger.android.h
    public dagger.android.b<Object> C() {
        return this.A;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        a.a(this);
        super.onCreate(bundle);
    }
}
