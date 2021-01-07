package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

/* renamed from: jod  reason: default package */
public final class jod {
    private final ConstraintLayout a;
    public final EditText b;
    public final TextView c;
    public final ProgressBar d;

    private jod(ConstraintLayout constraintLayout, EditText editText, TextView textView, ProgressBar progressBar) {
        this.a = constraintLayout;
        this.b = editText;
        this.c = textView;
        this.d = progressBar;
    }

    public static jod b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.update_email_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.email;
        EditText editText = (EditText) inflate.findViewById(C0707R.id.email);
        if (editText != null) {
            i = C0707R.id.input_error;
            TextView textView = (TextView) inflate.findViewById(C0707R.id.input_error);
            if (textView != null) {
                i = C0707R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0707R.id.progress_bar);
                if (progressBar != null) {
                    return new jod((ConstraintLayout) inflate, editText, textView, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
