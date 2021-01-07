package com.spotify.encore.consumer.components.podcastinteractivity.impl.replyrow;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.databinding.ReplyRowQnaLayoutBinding;
import kotlin.jvm.internal.h;

public final class ReplyRowQnAViewBindingsExtensions {
    public static final void init(ReplyRowQnaLayoutBinding replyRowQnaLayoutBinding) {
        h.e(replyRowQnaLayoutBinding, "$this$init");
        ConstraintLayout root = replyRowQnaLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bvd b = dvd.b(replyRowQnaLayoutBinding.getRoot());
        b.g(replyRowQnaLayoutBinding.responseCount);
        b.a();
    }
}
