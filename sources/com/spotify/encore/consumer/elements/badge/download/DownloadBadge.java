package com.spotify.encore.consumer.elements.badge.download;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface DownloadBadge extends Element<DownloadState, Void> {

    public static final class DefaultImpls {
        public static void onEvent(DownloadBadge downloadBadge, nmf<? super Void, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(downloadBadge, nmf);
        }
    }
}
