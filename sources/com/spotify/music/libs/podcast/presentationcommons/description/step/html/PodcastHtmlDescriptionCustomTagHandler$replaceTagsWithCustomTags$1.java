package com.spotify.music.libs.podcast.presentationcommons.description.step.html;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;
import kotlin.text.c;

final class PodcastHtmlDescriptionCustomTagHandler$replaceTagsWithCustomTags$1 extends Lambda implements nmf<c, CharSequence> {
    public static final PodcastHtmlDescriptionCustomTagHandler$replaceTagsWithCustomTags$1 a = new PodcastHtmlDescriptionCustomTagHandler$replaceTagsWithCustomTags$1();

    PodcastHtmlDescriptionCustomTagHandler$replaceTagsWithCustomTags$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public CharSequence invoke(c cVar) {
        c cVar2 = cVar;
        h.e(cVar2, "matchResult");
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(cVar2.a().get(1));
        sb.append("custom-");
        return je.H0(sb, cVar2.a().get(2), '>');
    }
}
