package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.onboarding.allboarding.room.c;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: aw0  reason: default package */
public final class aw0 extends RecyclerView.b0 {
    private final TextView C;
    private final View D;
    private final rmf<j, Integer, f> E;
    private final smf<j, Integer, Boolean, f> F;

    /* renamed from: aw0$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ aw0 a;
        final /* synthetic */ j b;

        a(aw0 aw0, j jVar) {
            this.a = aw0;
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
    public aw0(View view, rmf<? super j, ? super Integer, f> rmf, smf<? super j, ? super Integer, ? super Boolean, f> smf) {
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
        Drawable b = i0.b(this.D.getContext(), C0707R.drawable.allboarding_item_circle_placeholder);
        Drawable l = b != null ? androidx.core.graphics.drawable.a.l(b) : null;
        if (l != null) {
            c c = jVar.c();
            h.c(c);
            androidx.core.graphics.drawable.a.h(l, Color.parseColor(c.a()));
        }
        TextView textView2 = this.C;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        textView2.setBackground(l);
        this.D.setOnClickListener(new a(this, jVar));
    }
}
