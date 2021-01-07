package com.spotify.encore.consumer.elements.contextmenu;

import android.content.res.Resources;
import kotlin.jvm.internal.h;

public final class ContextMenuFormatterKt {
    public static final String formatContentDescription(Resources resources, ContextMenuType contextMenuType, String str) {
        h.e(resources, "resources");
        h.e(contextMenuType, "type");
        h.e(str, "title");
        String string = resources.getString(contextMenuType.getContentDescriptionResourceId(), str);
        h.d(string, "resources.getString(\n   …ceId,\n        title\n    )");
        return string;
    }
}
