package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

/* renamed from: leb  reason: default package */
public final class leb extends RecyclerView.b0 {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final TextView F;
    private final ImageView G;
    private final feb H;
    private final feb I;
    private final View J;
    private final e K;

    /* access modifiers changed from: package-private */
    /* renamed from: leb$a */
    public static final class a<T> implements qg0<Integer> {
        final /* synthetic */ leb a;

        a(leb leb) {
            this.a = leb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.qg0
        public void accept(Integer num) {
            Integer num2 = num;
            Drawable background = this.a.J.getBackground();
            h.d(background, "view.background");
            h.d(num2, "it");
            background.setColorFilter(new PorterDuffColorFilter(num2.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leb$b */
    public static final class b<T> implements qg0<Integer> {
        final /* synthetic */ leb a;
        final /* synthetic */ peb b;

        b(leb leb, peb peb) {
            this.a = leb;
            this.b = peb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.qg0
        public void accept(Integer num) {
            this.a.D.setTextColor(this.b.e());
            this.a.E.setTextColor(this.b.e());
            this.a.F.setTextColor(this.b.e());
            this.a.G.setColorFilter(this.b.e());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public leb(View view, e eVar) {
        super(view);
        h.e(view, "view");
        h.e(eVar, "colorTransitionHelperFactory");
        this.J = view;
        this.K = eVar;
        this.C = (ImageView) view.findViewById(C0707R.id.coverImage);
        this.D = (TextView) view.findViewById(C0707R.id.title);
        this.E = (TextView) view.findViewById(C0707R.id.artist);
        this.F = (TextView) view.findViewById(C0707R.id.lyrics);
        this.G = (ImageView) view.findViewById(C0707R.id.logo);
        h.e(eVar, "factory");
        this.H = new feb(eVar);
        h.e(eVar, "factory");
        this.I = new feb(eVar);
    }

    public final void u0(int i, qeb qeb, Picasso picasso) {
        h.e(qeb, "item");
        h.e(picasso, "picasso");
        peb peb = qeb.b().get(qeb.a());
        String b2 = qeb.e().b();
        TextView textView = this.D;
        h.d(textView, "title");
        textView.setText(qeb.e().c());
        TextView textView2 = this.E;
        h.d(textView2, "artist");
        textView2.setText(qeb.e().a());
        TextView textView3 = this.F;
        h.d(textView3, "lyrics");
        textView3.setText(qeb.c());
        View view = this.a;
        h.d(view, "itemView");
        view.setTag(Integer.valueOf(i));
        this.H.b(peb.b(), new a(this));
        this.I.b(peb.e(), new b(this, peb));
        picasso.b(this.C);
        if (b2 != null) {
            ImageView imageView = this.C;
            h.d(imageView, "coverImage");
            imageView.setVisibility(0);
            z m = picasso.m(b2);
            ImageView imageView2 = this.C;
            h.d(imageView2, "coverImage");
            m.t(yc0.a(imageView2.getContext()));
            ImageView imageView3 = this.C;
            h.d(imageView3, "coverImage");
            m.g(yc0.a(imageView3.getContext()));
            m.m(this.C);
            return;
        }
        ImageView imageView4 = this.C;
        h.d(imageView4, "coverImage");
        imageView4.setVisibility(8);
    }
}
