package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: ea0  reason: default package */
public class ea0 extends aa0 implements da0 {
    private final TextView n;

    public ea0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(C0707R.id.paste_listtile_number);
        this.n = textView;
        textView.getLayoutParams().width = nud.k(textView.getPaint(), 2);
        bvd c = dvd.c(getView().findViewById(C0707R.id.row_view));
        c.g(getTitleView(), getSubtitleView(), textView);
        c.a();
    }

    @Override // defpackage.da0
    public void X(int i) {
        this.n.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)));
    }

    @Override // defpackage.da0
    public void d1(Drawable drawable) {
        this.n.setCompoundDrawables(null, null, null, drawable);
    }
}
