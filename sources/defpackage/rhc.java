package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.qhc;
import kotlin.jvm.internal.h;

/* renamed from: rhc  reason: default package */
public final class rhc implements qhc {
    private TextView a;
    private Button b;
    private final oic c;

    public rhc(oic oic) {
        h.e(oic, "touchAreaCorrector");
        this.c = oic;
    }

    public void a(qhc.b bVar) {
        h.e(bVar, "viewModel");
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(bVar.a());
            Button button = this.b;
            if (button != null) {
                button.setEnabled(bVar.c());
                Button button2 = this.b;
                if (button2 != null) {
                    button2.setOnClickListener(bVar.b());
                } else {
                    h.k("filterButton");
                    throw null;
                }
            } else {
                h.k("filterButton");
                throw null;
            }
        } else {
            h.k("titleTextView");
            throw null;
        }
    }

    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_adapter_delegate_filter_bar, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.title);
        h.d(findViewById, "view.findViewById(R.id.title)");
        this.a = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.button);
        h.d(findViewById2, "view.findViewById(R.id.button)");
        this.b = (Button) findViewById2;
        TextView textView = this.a;
        if (textView != null) {
            q4.J(textView, true);
            oic oic = this.c;
            Button button = this.b;
            if (button != null) {
                oic.a(button, C0707R.dimen.podcast_filter_button_offset);
                h.d(inflate, "view");
                return inflate;
            }
            h.k("filterButton");
            throw null;
        }
        h.k("titleTextView");
        throw null;
    }
}
