package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: gc0  reason: default package */
public class gc0 extends hc0 implements fc0 {
    private final TextView f;

    gc0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(C0707R.id.metadata);
        this.f = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.fc0
    public void e(CharSequence charSequence) {
        this.f.setText(charSequence);
    }
}
