package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.onboarding.allboarding.room.y;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: fw0  reason: default package */
public final class fw0 extends RecyclerView.b0 {
    private final TextView C;
    private final TextView D;
    private final ConstraintLayout E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw0(View view) {
        super(view);
        h.e(view, "view");
        this.C = (TextView) view.findViewById(C0707R.id.title);
        this.D = (TextView) view.findViewById(C0707R.id.subtitle);
        this.E = (ConstraintLayout) view.findViewById(C0707R.id.root);
    }

    public final void h0(y yVar) {
        h.e(yVar, "sectionTitle");
        TextView textView = this.C;
        h.d(textView, "titleTv");
        boolean z = true;
        int i = 0;
        int i2 = 8;
        textView.setVisibility(yVar.b() != null ? 0 : 8);
        if (yVar.b() != null) {
            TextView textView2 = this.C;
            h.d(textView2, "titleTv");
            textView2.setText(yVar.b());
        }
        TextView textView3 = this.D;
        h.d(textView3, "subtitleTv");
        if (yVar.a() == null) {
            z = false;
        }
        if (z) {
            i2 = 0;
        }
        textView3.setVisibility(i2);
        String a = yVar.a();
        if (a != null) {
            TextView textView4 = this.D;
            h.d(textView4, "subtitleTv");
            textView4.setText(a);
        }
        if (!(yVar.b() == null && yVar.a() == null)) {
            ConstraintLayout constraintLayout = this.E;
            h.d(constraintLayout, "rootLayout");
            i = constraintLayout.getResources().getDimensionPixelOffset(C0707R.dimen.std_8dp);
        }
        ConstraintLayout constraintLayout2 = this.E;
        h.d(constraintLayout2, "rootLayout");
        constraintLayout2.setPadding(i, i, i, i);
    }
}
