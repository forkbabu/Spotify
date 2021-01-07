package defpackage;

import android.graphics.Color;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.spotify.music.lyrics.core.experience.contract.LyricsContract$SelectionStyle;
import com.spotify.music.lyrics.core.experience.ui.LyricsView;
import io.reactivex.subjects.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: scb  reason: default package */
public final class scb {
    private static final int d = Color.parseColor("#121212");
    private static final int e = Color.parseColor("#33000000");
    private static final int f = Color.parseColor("#00FFFFFF");
    private Spannable a;
    private final HashMap<Pair<Integer, Integer>, pdb> b = new HashMap<>();
    private final LyricsView c;

    public scb(LyricsView lyricsView) {
        h.e(lyricsView, "lyricsView");
        this.c = lyricsView;
        Spannable spannable = lyricsView.getSpannable();
        h.c(spannable);
        this.a = spannable;
    }

    private final void a(int i, int i2, int i3) {
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.b.containsKey(pair)) {
            this.a.removeSpan(this.b.get(pair));
        }
        pdb pdb = new pdb(i3);
        this.b.put(pair, pdb);
        this.a.setSpan(pdb, i, i2, 18);
        this.c.setText(this.a, TextView.BufferType.SPANNABLE);
    }

    public final void b(HashMap<Integer, Pair<Integer, Integer>> hashMap, a<Integer> aVar) {
        h.e(hashMap, "charCountForLineMap");
        h.e(aVar, "lineSelectedSubject");
        for (Map.Entry<Integer, Pair<Integer, Integer>> entry : hashMap.entrySet()) {
            int intValue = entry.getKey().intValue();
            Pair<Integer, Integer> value = entry.getValue();
            this.a.setSpan(new odb(intValue, aVar), value.c().intValue(), value.d().intValue(), 18);
        }
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.c.setText(this.a, TextView.BufferType.SPANNABLE);
        this.c.setShadowLayer((float) 10, 0.0f, 0.0f, 0);
        this.c.setPadding(10, 10, 10, 10);
    }

    public final void c(LyricsContract$SelectionStyle lyricsContract$SelectionStyle, int i, int i2) {
        h.e(lyricsContract$SelectionStyle, "style");
        int ordinal = lyricsContract$SelectionStyle.ordinal();
        if (ordinal == 0) {
            a(i, i2, e);
        } else if (ordinal == 1) {
            a(i, i2, d);
        } else if (ordinal == 2) {
            a(i, i2, f);
        } else if (ordinal == 3) {
            for (Map.Entry<Pair<Integer, Integer>, pdb> entry : this.b.entrySet()) {
                this.a.removeSpan(entry.getValue());
            }
            this.b.clear();
            this.c.setText(this.a, TextView.BufferType.SPANNABLE);
        }
    }
}
