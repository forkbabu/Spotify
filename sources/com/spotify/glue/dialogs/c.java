package com.spotify.glue.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;

public class c extends Dialog {
    private static final k o = new a();
    private boolean a;
    private final Button b;
    private final Button c;
    private k f = o;
    private final e n;

    static class a implements k {
        a() {
        }

        @Override // com.spotify.glue.dialogs.k
        public void a() {
        }

        @Override // com.spotify.glue.dialogs.k
        public void b() {
        }
    }

    protected c(Context context, int i, e eVar) {
        super(context, i);
        this.n = eVar;
        View inflate = getLayoutInflater().inflate(C0707R.layout.glue_dialog, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(C0707R.id.button_positive);
        this.b = button;
        Button button2 = (Button) inflate.findViewById(C0707R.id.button_negative);
        this.c = button2;
        me.grantland.widget.a.d(button);
        me.grantland.widget.a.d(button2);
        ScrollView scrollView = (ScrollView) inflate.findViewById(C0707R.id.content);
        eVar.b(getLayoutInflater(), scrollView);
        f(scrollView, -eVar.c());
        setContentView(inflate);
    }

    private static void f(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = i;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(k kVar) {
        this.f = (k) MoreObjects.firstNonNull(kVar, o);
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.c.setText(charSequence);
        this.c.setOnClickListener(onClickListener);
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        if (!z) {
            f(this.b, getContext().getResources().getDimensionPixelSize(C0707R.dimen.single_positive_button_margin));
        } else {
            f(this.b, getContext().getResources().getDimensionPixelSize(C0707R.dimen.glue_dialog_button_spacing));
        }
    }

    /* access modifiers changed from: package-private */
    public void d(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.b.setText(charSequence);
        this.b.setOnClickListener(onClickListener);
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.a) {
            this.f.b();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a();
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        this.a = true;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.n.a();
    }
}
