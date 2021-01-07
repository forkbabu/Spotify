package defpackage;

import android.os.Parcelable;
import com.spotify.music.C0707R;
import com.spotify.music.slate.model.BackgroundColor;
import com.spotify.music.slate.model.q;
import com.spotify.music.slate.model.u;
import defpackage.c3d;
import defpackage.d3d;
import defpackage.e3d;

/* renamed from: k3d  reason: default package */
public abstract class k3d implements i3d {

    /* renamed from: k3d$a */
    public static abstract class a {
        public abstract a a(BackgroundColor backgroundColor);

        public abstract k3d b();

        public abstract a c(q qVar);

        public abstract a d(b bVar);

        public abstract a e(u uVar);

        public abstract a f(u uVar);

        public abstract a g(u uVar);
    }

    /* renamed from: k3d$b */
    public static abstract class b implements Parcelable {

        /* renamed from: k3d$b$a */
        public static abstract class a {
            public abstract b a();

            public abstract a b(AbstractC0631b bVar);

            public abstract a c(int i);

            public abstract a d(int i);
        }

        /* renamed from: k3d$b$b  reason: collision with other inner class name */
        public static abstract class AbstractC0631b implements Parcelable {
            public static final AbstractC0631b a;

            /* renamed from: k3d$b$b$a */
            public static abstract class a {
                public abstract a a(int i);

                public abstract AbstractC0631b b();

                public abstract a c(int i);

                public abstract a d(int i);

                public abstract a e(int i);
            }

            static {
                e3d.a aVar = new e3d.a();
                aVar.e(C0707R.id.title);
                aVar.d(C0707R.id.sub_title);
                aVar.a(C0707R.id.action_button);
                aVar.c(C0707R.id.image_view);
                a = aVar.b();
            }

            public static a b() {
                return new e3d.a();
            }

            public abstract int a();

            public abstract int c();

            public abstract int e();

            public abstract int f();
        }

        static {
            d3d.a aVar = new d3d.a();
            aVar.c(C0707R.layout.slate_modal);
            aVar.d(C0707R.layout.slate_modal);
            aVar.b(AbstractC0631b.a);
            aVar.a();
        }

        public static a a() {
            return new d3d.a();
        }

        public abstract AbstractC0631b b();

        public abstract int c();

        public abstract int e();
    }

    public static a b() {
        return new c3d.a();
    }

    public abstract BackgroundColor a();

    public abstract q c();

    public abstract b e();

    public abstract u f();

    public abstract u g();

    public abstract u h();
}
