package com.spotify.music.features.carepackage.sharecardimage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class ShareCardImageKt {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap a(android.content.Context r32, com.spotify.playlist.models.k r33, com.squareup.picasso.Picasso r34) {
        /*
        // Method dump skipped, instructions count: 656
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.carepackage.sharecardimage.ShareCardImageKt.a(android.content.Context, com.spotify.playlist.models.k, com.squareup.picasso.Picasso):android.graphics.Bitmap");
    }

    private static final Bitmap b(String str, Picasso picasso, Bitmap bitmap) {
        if (str == null || e.n(str)) {
            return bitmap;
        }
        Bitmap j = picasso.m(str).j();
        h.c(j);
        return j;
    }

    private static final StaticLayout c(String str, TextPaint textPaint, int i, Configuration configuration) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(str, 0, str.length(), textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true, TextUtils.TruncateAt.END, 0);
        }
        if (configuration.getLayoutDirection() != 1) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        }
        StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setTextDirection(textDirectionHeuristic).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).build();
        h.d(build, "StaticLayout.Builder\n   …s(1)\n            .build()");
        return build;
    }
}
