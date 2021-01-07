package com.spotify.encore.consumer.elements.creator;

import android.view.View;
import androidx.core.widget.c;
import com.spotify.encore.consumer.elements.creator.Creator;
import kotlin.jvm.internal.h;

public final class CreatorButton$render$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ Creator.Model $model$inlined;
    final /* synthetic */ CreatorButton this$0;

    public CreatorButton$render$$inlined$doOnLayout$1(CreatorButton creatorButton, Creator.Model model) {
        this.this$0 = creatorButton;
        this.$model$inlined = model;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        h.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.this$0.setText(CreatorAuthorsFormatterKt.format(this.$model$inlined.getAuthorNames(), (float) this.this$0.getWidth(), new CreatorButton$render$$inlined$doOnLayout$1$lambda$1(this.this$0.getPaint())));
        if (this.$model$inlined.getAuthorNames().size() == 1) {
            this.this$0.setClickable(true);
            this.this$0.loadAuthorImage(this.$model$inlined);
            return;
        }
        this.this$0.setClickable(false);
        c.h(this.this$0, null, null, null, null);
    }
}
