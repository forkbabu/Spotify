package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: sj7  reason: default package */
public class sj7 implements tc0 {
    private View a;

    sj7() {
    }

    public void a(View view, s81 s81) {
        this.a = view.findViewById(C0707R.id.text_container);
        String title = s81.text().title();
        String description = s81.text().description();
        ((TextView) this.a.findViewById(C0707R.id.txt_title)).setText(title);
        ((TextView) this.a.findViewById(C0707R.id.txt_description)).setText(description);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f) {
        View view = this.a;
        if (view != null) {
            view.setTranslationY((float) (-i));
            this.a.setAlpha(1.0f - f);
        }
    }
}
