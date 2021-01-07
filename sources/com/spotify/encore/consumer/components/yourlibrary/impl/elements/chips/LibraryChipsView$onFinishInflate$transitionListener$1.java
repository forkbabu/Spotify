package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.b;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;

public final class LibraryChipsView$onFinishInflate$transitionListener$1 extends t {
    final /* synthetic */ LibraryChipsView this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LibraryChipsView$onFinishInflate$transitionListener$1(LibraryChipsView libraryChipsView) {
        this.this$0 = libraryChipsView;
    }

    @Override // androidx.constraintlayout.motion.widget.t, androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        this.this$0.transitioning = false;
        Map X = d.X(LibraryChipsView.access$getChipViews$p(this.this$0));
        List<FilterRowLibrary.Filter> list = this.this$0.previous;
        if (list != null) {
            ArrayList arrayList = new ArrayList(d.e(list, 10));
            for (FilterRowLibrary.Filter filter : list) {
                arrayList.add(Integer.valueOf(filter.getId()));
            }
            d.F(((LinkedHashMap) X).keySet(), arrayList);
        }
        for (ChipView chipView : ((LinkedHashMap) X).values()) {
            chipView.visibility(8);
        }
        List list2 = this.this$0.previous;
        boolean z = true;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((FilterRowLibrary.Filter) it.next()).getSelected()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            LibraryChipsView.access$getClearButtonView$p(this.this$0).setVisibility(8);
        } else {
            LibraryChipsView.access$getClearButtonView$p(this.this$0).setVisibility(0);
            LibraryChipsView.access$getClearButtonView$p(this.this$0).setAlpha(1.0f);
        }
        LibraryChipsView libraryChipsView = this.this$0;
        b constraintSet = libraryChipsView.getConstraintSet(LibraryChipsView.access$getChipsTransition$p(libraryChipsView).y());
        LibraryChipsView libraryChipsView2 = this.this$0;
        constraintSet.j(libraryChipsView2.getConstraintSet(LibraryChipsView.access$getChipsTransition$p(libraryChipsView2).w()));
    }

    @Override // androidx.constraintlayout.motion.widget.t, androidx.constraintlayout.motion.widget.MotionLayout.h
    public void onTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        this.this$0.transitioning = true;
    }
}
