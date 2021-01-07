package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d4;
import defpackage.q0;

public class p extends Dialog implements h {
    private i a;
    private final d4.a b;

    class a implements d4.a {
        a() {
        }

        @Override // defpackage.d4.a
        public boolean F(KeyEvent keyEvent) {
            return p.this.b(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969033(0x7f0401c9, float:1.7546736E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            androidx.appcompat.app.p$a r2 = new androidx.appcompat.app.p$a
            r2.<init>()
            r4.b = r2
            androidx.appcompat.app.i r2 = r4.a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.z(r6)
            r5 = 0
            r2.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.p.<init>(android.content.Context, int):void");
    }

    @Override // androidx.appcompat.app.h
    public void Y(q0 q0Var) {
    }

    public i a() {
        if (this.a == null) {
            int i = i.c;
            this.a = new j(this, this);
        }
        return this.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.h
    public void b0(q0 q0Var) {
    }

    public boolean c(int i) {
        return a().v(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d4.b(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.h
    public q0 f0(q0.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().f(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().k();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().j();
        super.onCreate(bundle);
        a().m(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().s();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().w(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().A(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().x(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().y(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().A(getContext().getString(i));
    }
}
