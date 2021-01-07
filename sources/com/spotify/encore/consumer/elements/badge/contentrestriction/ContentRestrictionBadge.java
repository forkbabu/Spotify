package com.spotify.encore.consumer.elements.badge.contentrestriction;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ContentRestrictionBadge extends Element<ContentRestriction, Void> {

    public static final class DefaultImpls {
        public static void onEvent(ContentRestrictionBadge contentRestrictionBadge, nmf<? super Void, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(contentRestrictionBadge, nmf);
        }
    }
}
