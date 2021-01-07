package defpackage;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.spotify.music.lyrics.core.experience.model.c;
import com.spotify.music.lyrics.core.experience.ui.LyricsView;
import kotlin.jvm.internal.h;

/* renamed from: rcb  reason: default package */
public final class rcb {
    private ForegroundColorSpan a = null;
    private ForegroundColorSpan b = null;
    private int c = -1;
    private final LyricsView d;
    private final c e;

    public rcb(LyricsView lyricsView, c cVar) {
        h.e(lyricsView, "lyricsView");
        h.e(cVar, "lyricsUIModel");
        this.d = lyricsView;
        this.e = cVar;
        b(0);
    }

    public final int a() {
        return this.c;
    }

    public final void b(int i) {
        if (this.c != i) {
            this.c = i;
            if (this.a == null && this.b == null) {
                this.a = new ForegroundColorSpan(this.e.a());
                this.b = new ForegroundColorSpan(this.e.b());
            }
            Spannable spannable = this.d.getSpannable();
            if (spannable != null) {
                spannable.removeSpan(this.a);
                spannable.removeSpan(this.b);
                spannable.setSpan(this.a, 0, i, 18);
                spannable.setSpan(this.b, i, spannable.length(), 17);
                this.d.setText(spannable, TextView.BufferType.SPANNABLE);
            }
        }
    }
}
