package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: mvc  reason: default package */
public final class mvc {
    private ViewGroup a;
    private TextView b;

    /* access modifiers changed from: package-private */
    /* renamed from: mvc$a */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ mvc a;

        a(mvc mvc) {
            this.a = mvc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewGroup viewGroup = this.a.a;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    public final void b(ViewGroup viewGroup) {
        h.e(viewGroup, "container");
        this.a = viewGroup;
        View G = je.G(viewGroup, C0707R.layout.error_state_view, viewGroup, false);
        TextView textView = (TextView) G.findViewById(C0707R.id.error_title);
        if (textView != null) {
            textView.setText(C0707R.string.podcast_qna_error_title);
        }
        this.b = (TextView) G.findViewById(C0707R.id.error_subtitle);
        ((Button) G.findViewById(C0707R.id.error_button)).setOnClickListener(new a(this));
        ViewGroup viewGroup2 = this.a;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.a;
        if (viewGroup3 != null) {
            viewGroup3.addView(G);
        }
    }

    public final void c() {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(C0707R.string.podcast_qna_error_deleting_subtitle);
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public final void d() {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(C0707R.string.podcast_qna_error_sending_subtitle);
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }
}
