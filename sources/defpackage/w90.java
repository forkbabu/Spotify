package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: w90  reason: default package */
public class w90 extends q90 implements t90 {
    private final TextView c;

    public w90(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908308);
        this.c = textView;
        bvd c2 = dvd.c(getView().findViewById(C0707R.id.row_view));
        c2.g(textView);
        c2.a();
    }

    @Override // defpackage.t90
    public TextView Z() {
        return this.c;
    }

    @Override // defpackage.t90
    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
