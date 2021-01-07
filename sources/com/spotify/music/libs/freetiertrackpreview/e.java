package com.spotify.music.libs.freetiertrackpreview;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.spotify.encore.foundation.R;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class e {
    private final Context a;

    static final class a implements DialogInterface.OnClickListener {
        public static final a a = new a();

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public e(Context context) {
        h.e(context, "mContext");
        this.a = context;
    }

    public final void a() {
        Context context = this.a;
        String string = context.getString(C0707R.string.preview_track_informative_dialog_title);
        String string2 = context.getString(C0707R.string.preview_track_informative_dialog_subtitle_one);
        h.d(string2, "getString(R.string.previ…tive_dialog_subtitle_one)");
        String string3 = context.getString(C0707R.string.preview_track_informative_dialog_subtitle_two);
        h.d(string3, "getString(R.string.previ…tive_dialog_subtitle_two)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        float dimension = this.a.getResources().getDimension(C0707R.dimen.dialog_body_text_size);
        Context context2 = this.a;
        d dVar = new d(context2, dimension / 2.0f, dimension, androidx.core.content.a.b(context2, R.color.white), androidx.core.content.a.b(this.a, R.color.green));
        dVar.setBounds(0, 0, dVar.getIntrinsicWidth(), dVar.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new ImageSpan(dVar, 1), kotlin.text.e.l(string2, "==", 0, false, 6, null), kotlin.text.e.l(string2, "==", 0, false, 6, null) + 2, 17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append((CharSequence) string3);
        f c = m.c(context, string, spannableStringBuilder2);
        c.f(context.getString(C0707R.string.preview_track_informative_dialog_confirmation), a.a);
        c.a(true);
        c.b().a();
    }
}
