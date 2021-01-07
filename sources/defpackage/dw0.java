package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.onboarding.allboarding.room.b0;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: dw0  reason: default package */
public final class dw0 extends RecyclerView.b0 {
    private final TextView C;
    private final View D;
    private final rmf<j, Integer, f> E;
    private final smf<j, Integer, Boolean, f> F;

    /* renamed from: dw0$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ dw0 a;
        final /* synthetic */ j b;

        a(dw0 dw0, j jVar) {
            this.a = dw0;
            this.b = jVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.D.setSelected(!this.a.D.isSelected());
            smf smf = this.a.F;
            if (smf != null) {
                f fVar = (f) smf.c(this.b, Integer.valueOf(this.a.w()), Boolean.valueOf(this.a.D.isSelected()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: rmf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, kotlin.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: smf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw0(View view, rmf<? super j, ? super Integer, f> rmf, smf<? super j, ? super Integer, ? super Boolean, f> smf) {
        super(view);
        h.e(view, "view");
        this.D = view;
        this.E = rmf;
        this.F = smf;
        this.C = (TextView) view.findViewById(C0707R.id.title);
    }

    public final void l0(j jVar) {
        h.e(jVar, "item");
        rmf<j, Integer, f> rmf = this.E;
        if (rmf != null) {
            rmf.invoke(jVar, Integer.valueOf(w()));
        }
        TextView textView = this.C;
        h.d(textView, "title");
        textView.setText(jVar.h());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.D.getResources().getDimension(C0707R.dimen.allboarding_item_pillow_more_background_radius));
        b0 n = jVar.n();
        h.c(n);
        gradientDrawable.setColor(Color.parseColor(n.b()));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColors(new int[]{androidx.core.content.a.b(this.D.getContext(), C0707R.color.pillow_textprotection_from), androidx.core.content.a.b(this.D.getContext(), C0707R.color.pillow_textprotection_to)});
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.TL_BR);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
        int dimension = (int) this.D.getResources().getDimension(C0707R.dimen.allboarding_item_pillow_more_background_inset);
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.setLayerInset(i, dimension, dimension, dimension, dimension);
        }
        TextView textView2 = this.C;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        textView2.setBackground(layerDrawable);
        this.D.setOnClickListener(new a(this, jVar));
    }
}
