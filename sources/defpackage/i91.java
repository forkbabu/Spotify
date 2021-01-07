package defpackage;

import android.view.View;

/* renamed from: i91  reason: default package */
public class i91 {

    /* renamed from: i91$a */
    private static final class a implements b, d, e, c, View.OnClickListener, View.OnLongClickListener {
        private final o61 a;
        private String b;
        private s81 c;
        private View f;
        boolean n;

        public a(o61 o61) {
            o61.getClass();
            this.a = o61;
        }

        private void f() {
            if (this.n) {
                throw new AssertionError("Listener is already in use");
            }
        }

        private void g() {
            if (this.b == null) {
                throw new AssertionError("Event name not set");
            } else if (this.c == null) {
                throw new AssertionError("Model not set");
            } else if (this.f == null) {
                throw new AssertionError("View not set");
            }
        }

        @Override // defpackage.i91.c
        public void a() {
            f();
            g();
            this.n = true;
            this.f.setFocusable(true);
            this.f.setClickable(true);
            this.f.setOnClickListener(this);
        }

        @Override // defpackage.i91.c
        public void b() {
            f();
            g();
            this.n = true;
            this.f.setLongClickable(true);
            this.f.setOnLongClickListener(this);
        }

        @Override // defpackage.i91.e
        public c c(View view) {
            f();
            view.getClass();
            this.f = view;
            return this;
        }

        @Override // defpackage.i91.d
        public e d(s81 s81) {
            f();
            s81.getClass();
            this.c = s81;
            return this;
        }

        @Override // defpackage.i91.b
        public d e(String str) {
            f();
            str.getClass();
            this.b = str;
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.a(n61.b(this.b, this.c));
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.a.a(n61.b(this.b, this.c));
            return true;
        }
    }

    /* renamed from: i91$b */
    public interface b {
        d e(String str);
    }

    /* renamed from: i91$c */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: i91$d */
    public interface d {
        e d(s81 s81);
    }

    /* renamed from: i91$e */
    public interface e {
        c c(View view);
    }

    public static void a(View view) {
        view.setFocusable(false);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }

    public static b b(o61 o61) {
        return new a(o61);
    }
}
