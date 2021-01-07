package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: ca0  reason: default package */
public class ca0 extends z90 implements ba0 {
    private final TextView o;

    public ca0(View view) {
        super(view);
        this.o = (TextView) view.findViewById(C0707R.id.prefixAccessory);
    }

    @Override // defpackage.ba0
    public void H(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
