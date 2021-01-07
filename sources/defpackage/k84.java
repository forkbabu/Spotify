package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: k84  reason: default package */
public class k84 extends nc0 {
    private final TextView c;

    public k84(Context context, ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(context).inflate(i, viewGroup, false));
        TextView textView = (TextView) q4.G(getView(), C0707R.id.header_title);
        this.c = textView;
        vc0.c(textView);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
