package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: j90  reason: default package */
public class j90 implements i90 {
    private final View a;
    private final TextView b;
    private final TextView c;

    public j90(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        this.c = (TextView) view.findViewById(C0707R.id.value_row_value);
    }

    public void b(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void c(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
