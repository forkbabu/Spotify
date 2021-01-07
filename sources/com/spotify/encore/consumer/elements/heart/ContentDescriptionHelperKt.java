package com.spotify.encore.consumer.elements.heart;

import android.content.res.Resources;
import com.spotify.encore.consumer.elements.R;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class ContentDescriptionHelperKt {
    public static final String getContentDescription(Resources resources, boolean z, String str) {
        String str2;
        h.e(resources, "resources");
        if (str == null || e.n(str)) {
            if (z) {
                str2 = resources.getString(R.string.heart_active_button_content_description);
            } else {
                str2 = resources.getString(R.string.heart_button_content_description);
            }
        } else if (z) {
            str2 = resources.getString(R.string.heart_active_button_context_content_description, str);
        } else {
            str2 = resources.getString(R.string.heart_button_context_content_description, str);
        }
        h.d(str2, "if (contentDescContext.i…        )\n        }\n    }");
        return str2;
    }
}
