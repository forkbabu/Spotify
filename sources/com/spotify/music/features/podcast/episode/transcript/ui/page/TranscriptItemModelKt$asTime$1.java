package com.spotify.music.features.podcast.episode.transcript.ui.page;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TranscriptItemModelKt$asTime$1 extends Lambda implements nmf<Integer, String> {
    public static final TranscriptItemModelKt$asTime$1 a = new TranscriptItemModelKt$asTime$1();

    TranscriptItemModelKt$asTime$1() {
        super(1);
    }

    public final String a(int i) {
        CharSequence charSequence;
        String valueOf = String.valueOf(i);
        h.e(valueOf, "$this$padStart");
        h.e(valueOf, "$this$padStart");
        if (2 <= valueOf.length()) {
            charSequence = valueOf.subSequence(0, valueOf.length());
        } else {
            StringBuilder sb = new StringBuilder(2);
            int length = 2 - valueOf.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) valueOf);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return a(num.intValue());
    }
}
