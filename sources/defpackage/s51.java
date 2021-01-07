package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: s51  reason: default package */
public interface s51<V extends View> {

    /* renamed from: s51$a */
    public interface a<V extends View> {
    }

    /* renamed from: s51$b */
    public interface b {
        Parcelable a(s81 s81);

        boolean b(s81 s81, Parcelable parcelable);
    }

    /* renamed from: s51$c */
    public static abstract class c<H extends a<?>> implements s51<View> {

        /* renamed from: s51$c$a */
        public static abstract class a<V extends View> {
            public final V a;

            protected a(V v) {
                v.getClass();
                this.a = v;
            }

            /* access modifiers changed from: protected */
            public abstract void A(s81 s81, a<View> aVar, int... iArr);

            /* access modifiers changed from: protected */
            public abstract void z(s81 s81, w51 w51, b bVar);
        }

        /* access modifiers changed from: protected */
        public abstract H a(ViewGroup viewGroup, w51 w51);

        @Override // defpackage.s51
        public void b(View view, s81 s81, a<View> aVar, int... iArr) {
            Object tag = view.getTag(C0707R.id.hub_framework_view_holder_tag);
            tag.getClass();
            ((a) tag).A(s81, aVar, iArr);
        }

        @Override // defpackage.s51
        public final void c(View view, s81 s81, w51 w51, b bVar) {
            Object tag = view.getTag(C0707R.id.hub_framework_view_holder_tag);
            tag.getClass();
            ((a) tag).z(s81, w51, bVar);
        }

        @Override // defpackage.s51
        public final View h(ViewGroup viewGroup, w51 w51) {
            H a2 = a(viewGroup, w51);
            a2.getClass();
            a2.a.setTag(C0707R.id.hub_framework_view_holder_tag, a2);
            return a2.a;
        }
    }

    void b(V v, s81 s81, a<View> aVar, int... iArr);

    void c(V v, s81 s81, w51 w51, b bVar);

    V h(ViewGroup viewGroup, w51 w51);
}
