package com.spotify.music.lyrics.core.experience.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.core.experience.model.SyncMode;
import com.spotify.music.lyrics.core.experience.model.c;
import kotlin.jvm.internal.h;

public final class LyricsFooterView extends AppCompatTextView {
    private Spannable a;

    public LyricsFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void j(c cVar) {
        int i;
        h.e(cVar, "model");
        if (!cVar.f()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        StringBuilder sb = new StringBuilder();
        String string = cVar.d().getProvider() != null ? getContext().getString(C0707R.string.lyrics_full_screen_provider, cVar.d().getProvider()) : "";
        h.d(string, "if (model.lyrics.provide…\n            \"\"\n        }");
        sb.append(string);
        if (!h.a("プチリリ", cVar.d().getProvider()) || cVar.d().getSyncMode() != SyncMode.a) {
            i = 0;
        } else {
            String string2 = getContext().getString(C0707R.string.lyrics_full_screen_sync_these_lyrics_no_html);
            h.d(string2, "context.getString(R.stri…ync_these_lyrics_no_html)");
            sb.append('\n');
            sb.append(string2);
            i = string2.length();
        }
        this.a = new SpannableString(sb.toString());
        setHeight(cVar.c().a() * 4);
        Spannable spannable = this.a;
        if (spannable != null) {
            spannable.setSpan(new TextAppearanceSpan(getContext(), C0707R.style.style1), 0, spannable.length(), 17);
            spannable.setSpan(new ForegroundColorSpan(-16777216), 0, spannable.length(), 33);
            if (i != 0) {
                spannable.setSpan(new a(this, cVar), spannable.length() - i, spannable.length(), 33);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        setText(this.a, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
