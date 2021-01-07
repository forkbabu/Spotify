package com.spotify.encore.consumer.elements.follow;

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
                str2 = resources.getString(R.string.follow_button_active_content_description);
            } else {
                str2 = resources.getString(R.string.follow_button_content_description);
            }
            h.d(str2, "if (isFollowed) {\n      …nt_description)\n        }");
        } else {
            if (z) {
                str2 = resources.getString(R.string.follow_button_active_context_content_description, str);
            } else {
                str2 = resources.getString(R.string.follow_button_context_content_description, str);
            }
            h.d(str2, "if (isFollowed) {\n      …entDescContext)\n        }");
        }
        return str2;
    }
}
