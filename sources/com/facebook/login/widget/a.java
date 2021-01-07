package com.facebook.login.widget;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;

class a implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ LoginButton b;

    /* renamed from: com.facebook.login.widget.a$a  reason: collision with other inner class name */
    class RunnableC0074a implements Runnable {
        final /* synthetic */ n a;

        RunnableC0074a(n nVar) {
            this.a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    LoginButton.f(a.this.b, this.a);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    a(LoginButton loginButton, String str) {
        this.b = loginButton;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                this.b.getActivity().runOnUiThread(new RunnableC0074a(FetchedAppSettingsManager.n(this.a, false)));
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
