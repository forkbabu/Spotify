package com.spotify.encore.consumer.components.podcastinteractivity.impl.replyrow;

import com.spotify.encore.consumer.components.podcastinteractivity.impl.R;
import com.spotify.music.C0707R;

public enum ReplyButtonType {
    REPLY(C0707R.drawable.glue_button_small_colored, C0707R.color.glue_button_primary_white_text, R.string.reply_button_qna),
    REPLIED(C0707R.drawable.solar_tertiary_outline_button, C0707R.color.glue_tertiary_button_text_color, R.string.see_your_reply_button_qna);
    
    private final int background;
    private final int text;
    private final int textColor;

    private ReplyButtonType(int i, int i2, int i3) {
        this.background = i;
        this.textColor = i2;
        this.text = i3;
    }

    public final int getBackground() {
        return this.background;
    }

    public final int getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }
}
