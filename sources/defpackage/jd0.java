package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.spotify.mobile.android.util.ui.Lifecycle$Listeners;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.l;

@Deprecated
/* renamed from: jd0  reason: default package */
public abstract class jd0 extends id0 implements k {
    private final Lifecycle$Listeners B = new Lifecycle$Listeners();

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean e1(l lVar) {
        return this.B.e1(lVar);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.B.b(i, i2, intent);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        this.B.d(menu);
        return onCreateOptionsMenu;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.B.e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.B.f();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.B.g(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.B.h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.B.i(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.B.j();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.B.k();
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean y0(l lVar) {
        Lifecycle$Listeners lifecycle$Listeners = this.B;
        lVar.getClass();
        return lifecycle$Listeners.y0(lVar);
    }
}
