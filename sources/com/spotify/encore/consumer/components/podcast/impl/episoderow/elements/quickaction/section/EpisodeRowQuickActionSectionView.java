package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements.EpisodeRowQuickActionElement;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements.EpisodeRowQuickActionElementFactory;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.section.EpisodeRowQuickActionSection;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class EpisodeRowQuickActionSectionView extends LinearLayout implements EpisodeRowQuickActionSection {
    private final int actionPadding;
    private final int actionSize;
    private ViewContext viewContext;

    public static final class ViewContext {
        private final LottieIconStateMachine lottieIconStateMachine;

        public ViewContext(LottieIconStateMachine lottieIconStateMachine2) {
            h.e(lottieIconStateMachine2, "lottieIconStateMachine");
            this.lottieIconStateMachine = lottieIconStateMachine2;
        }

        public final LottieIconStateMachine getLottieIconStateMachine() {
            return this.lottieIconStateMachine;
        }
    }

    public EpisodeRowQuickActionSectionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EpisodeRowQuickActionSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EpisodeRowQuickActionSectionView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void tuneSize(View view) {
        int i = this.actionSize;
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        int i2 = this.actionPadding;
        view.setPadding(i2, i2, i2, i2);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super EpisodeRowQuickActionSection.ClickEvent, kotlin.f> nmf) {
        h.e(nmf, "event");
        Iterator<View> it = ((v4) e4.b(this)).iterator();
        while (true) {
            w4 w4Var = (w4) it;
            if (w4Var.hasNext()) {
                View view = (View) w4Var.next();
                if (view instanceof EpisodeRowQuickActionElement) {
                    ((EpisodeRowQuickActionElement) view).onEvent(new EpisodeRowQuickActionSectionView$onEvent$$inlined$forEach$lambda$1(nmf));
                }
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Iterator<View> it = ((v4) e4.b(this)).iterator();
        while (true) {
            w4 w4Var = (w4) it;
            if (w4Var.hasNext()) {
                ((View) w4Var.next()).setEnabled(z);
            } else {
                return;
            }
        }
    }

    public final void setViewContext(ViewContext viewContext2) {
        h.e(viewContext2, "viewContext");
        this.viewContext = viewContext2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpisodeRowQuickActionSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setOrientation(0);
        this.actionSize = context.getResources().getDimensionPixelSize(R.dimen.episode_quick_action_size);
        this.actionPadding = context.getResources().getDimensionPixelSize(R.dimen.episode_quick_action_padding);
    }

    public void render(EpisodeRowQuickActionSection.Model model) {
        h.e(model, "model");
        removeAllViews();
        List<EpisodeRowQuickAction> actions = model.getActions();
        ArrayList<EpisodeRowQuickAction> arrayList = new ArrayList();
        for (T t : actions) {
            if (!h.a(t, EpisodeRowQuickAction.None.INSTANCE)) {
                arrayList.add(t);
            }
        }
        for (EpisodeRowQuickAction episodeRowQuickAction : arrayList) {
            EpisodeRowQuickActionElementFactory episodeRowQuickActionElementFactory = EpisodeRowQuickActionElementFactory.INSTANCE;
            Context context = getContext();
            h.d(context, "context");
            EpisodeRowQuickActionElement<EpisodeRowQuickAction> renderQuickAction = episodeRowQuickActionElementFactory.renderQuickAction(episodeRowQuickAction, context, this.viewContext);
            addView(renderQuickAction);
            tuneSize(renderQuickAction);
            renderQuickAction.render(episodeRowQuickAction);
        }
    }
}
