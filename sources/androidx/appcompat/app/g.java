package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.n0;
import androidx.core.app.a;
import androidx.core.app.u;
import androidx.fragment.app.c;
import defpackage.q0;

public class g extends c implements h, u.a {
    private i z;

    @Override // androidx.fragment.app.c
    public void G0() {
        H0().k();
    }

    public i H0() {
        if (this.z == null) {
            int i = i.c;
            this.z = new j(this, this);
        }
        return this.z;
    }

    public ActionBar I0() {
        return H0().i();
    }

    /* access modifiers changed from: protected */
    public void K0() {
    }

    public void L0() {
    }

    public boolean M0() {
        Intent l = e2.l(this);
        if (l == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (shouldUpRecreateTask(l)) {
            u h = u.h(this);
            h.e(this);
            L0();
            h.j();
            try {
                int i2 = a.c;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            navigateUpTo(l);
            return true;
        }
    }

    @Override // androidx.appcompat.app.h
    public void Y(q0 q0Var) {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H0().d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(H0().e(context));
    }

    @Override // androidx.appcompat.app.h
    public void b0(q0 q0Var) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        I0();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        I0();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.h
    public q0 f0(q0.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) H0().f(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return H0().h();
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public Resources getResources() {
        int i = n0.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        H0().k();
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H0().l(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        i H0 = H0();
        H0.j();
        H0.m(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        H0().n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar I0 = I0();
        if (menuItem.getItemId() != 16908332 || I0 == null || (I0.c() & 4) == 0) {
            return false;
        }
        return M0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        H0().o(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        H0().p();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        H0().q(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        H0().r();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        H0().s();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        H0().A(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        I0();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        H0().w(i);
    }

    @Override // android.app.Activity, android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void setTheme(int i) {
        super.setTheme(i);
        H0().z(i);
    }

    @Override // androidx.core.app.u.a
    public Intent y() {
        return e2.l(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        H0().x(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H0().y(view, layoutParams);
    }
}
