package com.spotify.encore.consumer.components.podcastinteractivity.impl.replyrow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.R;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.databinding.ReplyRowQnaLayoutBinding;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import kotlin.a;
import kotlin.d;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultReplyRowQnA implements ReplyRowQnA {
    private final ReplyRowQnaLayoutBinding binding;
    private final Context context;
    private final d icon$delegate = a.b(new DefaultReplyRowQnA$icon$2(this));

    public DefaultReplyRowQnA(Context context2) {
        h.e(context2, "context");
        this.context = context2;
        ReplyRowQnaLayoutBinding inflate = ReplyRowQnaLayoutBinding.inflate(LayoutInflater.from(context2));
        h.d(inflate, "it");
        ReplyRowQnAViewBindingsExtensions.init(inflate);
        h.d(inflate, "ReplyRowQnaLayoutBinding…{\n        it.init()\n    }");
        this.binding = inflate;
    }

    private final SpotifyIconDrawable getIcon() {
        return (SpotifyIconDrawable) this.icon$delegate.getValue();
    }

    private final void setupReplyButton(ReplyButtonType replyButtonType, boolean z) {
        StateListAnimatorButton stateListAnimatorButton = this.binding.replyButton;
        stateListAnimatorButton.setTag(replyButtonType);
        stateListAnimatorButton.setVisibility(z ? 8 : 0);
        stateListAnimatorButton.setBackground(androidx.core.content.a.d(stateListAnimatorButton.getContext(), replyButtonType.getBackground()));
        stateListAnimatorButton.setText(stateListAnimatorButton.getContext().getString(replyButtonType.getText()));
        stateListAnimatorButton.setTextColor(androidx.core.content.a.b(stateListAnimatorButton.getContext(), replyButtonType.getTextColor()));
    }

    private final void setupReplyCountView(int i) {
        TextView textView = this.binding.responseCount;
        textView.setVisibility(i > 0 ? 0 : 8);
        textView.setText(textView.getResources().getQuantityString(R.plurals.response_count, i, Integer.valueOf(i)));
        textView.setCompoundDrawablesWithIntrinsicBounds(getIcon(), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ReplyRowQnA.Events, f> nmf) {
        h.e(nmf, "event");
        this.binding.replyButton.setOnClickListener(new DefaultReplyRowQnA$onEvent$1(nmf));
    }

    public void render(ReplyRowQnA.Model model) {
        h.e(model, "model");
        ReplyButtonType replyButtonType = model.getHasUserResponse() ? ReplyButtonType.REPLIED : ReplyButtonType.REPLY;
        setupReplyCountView(model.getTotalResponses());
        setupReplyButton(replyButtonType, model.isUserResponseFeatured());
    }
}
