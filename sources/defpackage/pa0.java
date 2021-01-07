package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: pa0  reason: default package */
public class pa0 extends ja0 implements oa0 {
    private final TextView o;

    public pa0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(C0707R.id.metadata);
        this.o = textView;
        TextView[] textViewArr = {textView};
        vc0.i(textViewArr);
        vc0.h(textViewArr);
        vc0.g(view);
    }

    @Override // defpackage.oa0
    public void e(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
