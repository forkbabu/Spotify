package com.spotify.android.paste.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.spotify.paste.widgets.DialogLayout;

public class a extends Dialog {
    private dj9 a;
    private String b;
    private String c;
    private boolean f;

    /* renamed from: com.spotify.android.paste.app.a$a  reason: collision with other inner class name */
    public static class C0151a {
        protected final Context a;
        protected final int b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private DialogInterface.OnClickListener g;
        private DialogInterface.OnClickListener h;
        private DialogInterface.OnCancelListener i;
        private DialogInterface.OnDismissListener j;
        private boolean k;
        private dj9 l;
        private String m;
        private String n;

        /* renamed from: com.spotify.android.paste.app.a$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC0152a implements View.OnClickListener {
            final /* synthetic */ a a;

            View$OnClickListenerC0152a(a aVar) {
                this.a = aVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C0151a.this.g != null) {
                    C0151a.this.g.onClick(this.a, -1);
                }
                this.a.dismiss();
            }
        }

        /* renamed from: com.spotify.android.paste.app.a$a$b */
        class b implements View.OnClickListener {
            final /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C0151a.this.h != null) {
                    C0151a.this.h.onClick(this.a, -2);
                }
                this.a.dismiss();
            }
        }

        public C0151a(Context context, int i2) {
            this.a = context;
            this.b = i2;
        }

        public a c() {
            a aVar = new a(this.a, this.b);
            aVar.setCancelable(true);
            aVar.setOnCancelListener(this.i);
            aVar.setOnDismissListener(this.j);
            DialogLayout dialogLayout = new DialogLayout(aVar.getContext(), this.k);
            CharSequence charSequence = this.e;
            if (charSequence != null) {
                dialogLayout.d(charSequence, new View$OnClickListenerC0152a(aVar));
            }
            CharSequence charSequence2 = this.f;
            if (charSequence2 != null) {
                dialogLayout.b(charSequence2, new b(aVar));
            }
            CharSequence charSequence3 = this.c;
            if (charSequence3 != null) {
                dialogLayout.setTitle(charSequence3);
            }
            CharSequence charSequence4 = this.d;
            if (charSequence4 != null) {
                dialogLayout.setBody(charSequence4);
            }
            dialogLayout.getNegativeButton();
            dialogLayout.getPositiveButton();
            aVar.a = this.l;
            aVar.b = this.m;
            aVar.c = this.n;
            aVar.setContentView(dialogLayout);
            return aVar;
        }

        public C0151a d(int i2) {
            this.d = this.a.getResources().getText(i2);
            return this;
        }

        public C0151a e(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public C0151a f(dj9 dj9, String str, String str2) {
            this.l = dj9;
            this.m = str;
            this.n = str2;
            return this;
        }

        public C0151a g(int i2, DialogInterface.OnClickListener onClickListener) {
            this.f = this.a.getResources().getText(i2);
            this.h = onClickListener;
            return this;
        }

        public C0151a h(DialogInterface.OnCancelListener onCancelListener) {
            this.i = onCancelListener;
            return this;
        }

        public C0151a i(DialogInterface.OnDismissListener onDismissListener) {
            this.j = onDismissListener;
            return this;
        }

        public C0151a j(int i2, DialogInterface.OnClickListener onClickListener) {
            this.e = this.a.getResources().getText(i2);
            this.g = onClickListener;
            return this;
        }

        public C0151a k(boolean z) {
            this.k = z;
            return this;
        }

        public C0151a l(int i2) {
            this.c = this.a.getResources().getText(i2);
            return this;
        }
    }

    protected a(Context context, int i) {
        super(context, i);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        dj9 dj9 = this.a;
        if (dj9 != null && (str = this.b) != null && !this.f) {
            dj9.E(str, this.c);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dj9 dj9 = this.a;
        if (dj9 != null) {
            dj9.K();
        }
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        this.f = true;
    }
}
