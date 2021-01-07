package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: yra  reason: default package */
public abstract class yra extends asa implements xra {
    protected final TextView o;

    public yra(View view, ura ura) {
        super(view, ura);
        TextView textView = (TextView) view.findViewById(C0707R.id.text3);
        this.o = textView;
        bvd c = dvd.c(this.a.findViewById(C0707R.id.row_view));
        c.g(this.c, this.f, textView);
        c.f(this.b);
        c.a();
    }
}
