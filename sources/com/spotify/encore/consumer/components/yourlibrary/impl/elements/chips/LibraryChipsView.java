package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.b;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.Element;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryFilterChipBackgroundBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryFilterChipTextBinding;
import com.spotify.encore.foundation.R;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class LibraryChipsView extends MotionLayout implements Element {
    private final int chipMargin;
    private Map<Integer, ChipView> chipViews;
    private p.b chipsTransition;
    private View clearButtonView;
    private int duration;
    private OnFilterSelectedChangedListener listener;
    private List<FilterRowLibrary.Filter> previous;
    private final int reducedChipMargin;
    private cmf<f> renderTask;
    private boolean transitioning;

    public LibraryChipsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LibraryChipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LibraryChipsView(Context context, AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final /* synthetic */ Map access$getChipViews$p(LibraryChipsView libraryChipsView) {
        Map<Integer, ChipView> map = libraryChipsView.chipViews;
        if (map != null) {
            return map;
        }
        h.k("chipViews");
        throw null;
    }

    public static final /* synthetic */ p.b access$getChipsTransition$p(LibraryChipsView libraryChipsView) {
        p.b bVar = libraryChipsView.chipsTransition;
        if (bVar != null) {
            return bVar;
        }
        h.k("chipsTransition");
        throw null;
    }

    public static final /* synthetic */ View access$getClearButtonView$p(LibraryChipsView libraryChipsView) {
        View view = libraryChipsView.clearButtonView;
        if (view != null) {
            return view;
        }
        h.k("clearButtonView");
        throw null;
    }

    private final void addMissingChips(List<FilterRowLibrary.Filter> list) {
        LayoutInflater from = LayoutInflater.from(getContext());
        for (FilterRowLibrary.Filter filter : list) {
            Map<Integer, ChipView> map = this.chipViews;
            if (map == null) {
                h.k("chipViews");
                throw null;
            } else if (!map.containsKey(Integer.valueOf(filter.getId()))) {
                LibraryFilterChipTextBinding inflate = LibraryFilterChipTextBinding.inflate(from, this, false);
                h.d(inflate, "it");
                TextView root = inflate.getRoot();
                h.d(root, "it.root");
                root.setId(q4.f());
                h.d(inflate, "LibraryFilterChipTextBin…Compat.generateViewId() }");
                LibraryFilterChipBackgroundBinding inflate2 = LibraryFilterChipBackgroundBinding.inflate(from, this, false);
                h.d(inflate2, "it");
                LibraryChipBackgroundView root2 = inflate2.getRoot();
                h.d(root2, "it.root");
                root2.setId(q4.f());
                h.d(inflate2, "LibraryFilterChipBackgro…Compat.generateViewId() }");
                ChipView chipView = new ChipView(inflate, inflate2);
                Map<Integer, ChipView> map2 = this.chipViews;
                if (map2 != null) {
                    map2.put(Integer.valueOf(filter.getId()), chipView);
                    chipView.setName(filter.getName());
                    addView(chipView.getBackground().getRoot());
                    addView(chipView.getText().getRoot());
                    chipView.getBackground().getRoot().setSibling(chipView.getText().getRoot());
                    LibraryChipBackgroundView root3 = chipView.getBackground().getRoot();
                    h.d(root3, "chipView.background.root");
                    LibraryChipBackgroundView root4 = chipView.getBackground().getRoot();
                    h.d(root4, "chipView.background.root");
                    Drawable background = root4.getBackground();
                    h.d(background, "chipView.background.root.background");
                    root3.setBackground(new PressedStateListDrawable(background, a.b(getContext(), R.color.black_30)));
                } else {
                    h.k("chipViews");
                    throw null;
                }
            }
        }
    }

    private final View createClearButton() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.spotify.encore.consumer.components.yourlibrary.impl.R.dimen.library_clear_chips_button_size);
        float dimensionPixelSize2 = (float) getResources().getDimensionPixelSize(com.spotify.encore.consumer.components.yourlibrary.impl.R.dimen.library_clear_chips_icon_size);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.X, dimensionPixelSize2);
        spotifyIconDrawable.s(a.c(getContext(), R.color.white));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a.d(getContext(), com.spotify.encore.consumer.components.yourlibrary.impl.R.drawable.library_clear_chips_background), new e(spotifyIconDrawable, dimensionPixelSize2 / ((float) dimensionPixelSize), 0)});
        Context context = getContext();
        h.d(context, "context");
        LibraryChipBackgroundView libraryChipBackgroundView = new LibraryChipBackgroundView(context, null, 0, 6, null);
        libraryChipBackgroundView.setBackground(new PressedStateListDrawable(layerDrawable, a.b(getContext(), R.color.black_30)));
        libraryChipBackgroundView.setId(q4.f());
        libraryChipBackgroundView.setOnClickListener(new LibraryChipsView$createClearButton$1(this));
        libraryChipBackgroundView.setAlpha(0.0f);
        libraryChipBackgroundView.setVisibility(8);
        dvd.a(libraryChipBackgroundView).a();
        addView(libraryChipBackgroundView);
        return libraryChipBackgroundView;
    }

    static /* synthetic */ void render$default(LibraryChipsView libraryChipsView, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        libraryChipsView.render(list, list2, z);
    }

    private final void updateConstraints(b bVar, List<FilterRowLibrary.Filter> list) {
        boolean z;
        ChipView chipView;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getSelected()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        View view = this.clearButtonView;
        if (view != null) {
            bVar.D(view.getId(), "1:1");
            View view2 = this.clearButtonView;
            if (view2 != null) {
                bVar.n(view2.getId(), 0);
                View view3 = this.clearButtonView;
                if (view3 != null) {
                    bVar.m(view3.getId(), 0);
                    View view4 = this.clearButtonView;
                    if (view4 != null) {
                        bVar.l(view4.getId(), 6, 0, 6);
                        View view5 = this.clearButtonView;
                        if (view5 != null) {
                            bVar.l(view5.getId(), 3, 0, 3);
                            View view6 = this.clearButtonView;
                            if (view6 != null) {
                                bVar.l(view6.getId(), 4, 0, 4);
                                View view7 = this.clearButtonView;
                                if (view7 != null) {
                                    bVar.C(view7.getId(), z ? 1.0f : 0.0f);
                                    Map<Integer, ChipView> map = this.chipViews;
                                    if (map != null) {
                                        Map X = d.X(map);
                                        FilterRowLibrary.Filter filter = (FilterRowLibrary.Filter) d.l(list);
                                        if (filter != null) {
                                            Map<Integer, ChipView> map2 = this.chipViews;
                                            if (map2 != null) {
                                                chipView = (ChipView) d.o(map2, Integer.valueOf(filter.getId()));
                                            } else {
                                                h.k("chipViews");
                                                throw null;
                                            }
                                        } else {
                                            chipView = null;
                                        }
                                        int i5 = 7;
                                        if (z) {
                                            View view8 = this.clearButtonView;
                                            if (view8 != null) {
                                                i2 = view8.getId();
                                                i = 7;
                                            } else {
                                                h.k("clearButtonView");
                                                throw null;
                                            }
                                        } else {
                                            i2 = 0;
                                            i = 6;
                                        }
                                        int i6 = i;
                                        for (FilterRowLibrary.Filter filter2 : list) {
                                            ChipView chipView2 = (ChipView) d.o(X, Integer.valueOf(filter2.getId()));
                                            X.remove(Integer.valueOf(filter2.getId()));
                                            bVar.n(chipView2.backgroundId(), i4);
                                            bVar.m(chipView2.backgroundId(), i4);
                                            bVar.C(chipView2.backgroundId(), 1.0f);
                                            if (filter2.getSelected()) {
                                                int backgroundId = chipView2.backgroundId();
                                                if (chipView != null) {
                                                    i4 = chipView.textId();
                                                }
                                                bVar.l(backgroundId, 6, i4, 6);
                                            } else {
                                                bVar.l(chipView2.backgroundId(), 6, chipView2.textId(), 6);
                                            }
                                            bVar.l(chipView2.backgroundId(), i5, chipView2.textId(), i5);
                                            bVar.l(chipView2.backgroundId(), 3, chipView2.textId(), 3);
                                            bVar.l(chipView2.backgroundId(), 4, chipView2.textId(), 4);
                                            bVar.n(chipView2.textId(), -2);
                                            bVar.m(chipView2.textId(), -2);
                                            bVar.C(chipView2.textId(), 1.0f);
                                            bVar.l(chipView2.textId(), 6, i2, i6);
                                            bVar.l(chipView2.textId(), 3, 0, 3);
                                            bVar.l(chipView2.textId(), 4, 0, 4);
                                            bVar.F(chipView2.textId(), 7, this.chipMargin);
                                            int textId = chipView2.textId();
                                            if (h.a(chipView, chipView2) && filter2.getSelected()) {
                                                i3 = this.chipMargin;
                                            } else if (h.a(chipView, chipView2)) {
                                                i3 = 0;
                                            } else if (filter2.getSelected()) {
                                                i3 = this.reducedChipMargin;
                                            } else {
                                                i3 = this.chipMargin;
                                            }
                                            bVar.F(textId, 6, i3);
                                            i2 = chipView2.backgroundId();
                                            i4 = 0;
                                            i6 = 7;
                                            i5 = 7;
                                        }
                                        for (ChipView chipView3 : ((LinkedHashMap) X).values()) {
                                            bVar.n(chipView3.backgroundId(), 0);
                                            bVar.m(chipView3.backgroundId(), 0);
                                            bVar.C(chipView3.backgroundId(), 0.0f);
                                            bVar.l(chipView3.backgroundId(), 6, chipView3.textId(), 6);
                                            bVar.l(chipView3.backgroundId(), 7, chipView3.textId(), 7);
                                            bVar.l(chipView3.backgroundId(), 3, chipView3.textId(), 3);
                                            bVar.l(chipView3.backgroundId(), 4, chipView3.textId(), 4);
                                            bVar.n(chipView3.textId(), -2);
                                            bVar.m(chipView3.textId(), -2);
                                            bVar.C(chipView3.textId(), 0.0f);
                                            bVar.l(chipView3.textId(), 6, 0, 7);
                                            bVar.l(chipView3.textId(), 3, 0, 3);
                                            bVar.l(chipView3.textId(), 4, 0, 4);
                                        }
                                        View view9 = this.clearButtonView;
                                        if (view9 != null) {
                                            bVar.G(view9.getId(), 1);
                                            Map<Integer, ChipView> map3 = this.chipViews;
                                            if (map3 != null) {
                                                for (ChipView chipView4 : map3.values()) {
                                                    bVar.G(chipView4.textId(), 1);
                                                    bVar.G(chipView4.backgroundId(), 1);
                                                }
                                                return;
                                            }
                                            h.k("chipViews");
                                            throw null;
                                        }
                                        h.k("clearButtonView");
                                        throw null;
                                    }
                                    h.k("chipViews");
                                    throw null;
                                }
                                h.k("clearButtonView");
                                throw null;
                            }
                            h.k("clearButtonView");
                            throw null;
                        }
                        h.k("clearButtonView");
                        throw null;
                    }
                    h.k("clearButtonView");
                    throw null;
                }
                h.k("clearButtonView");
                throw null;
            }
            h.k("clearButtonView");
            throw null;
        }
        h.k("clearButtonView");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsView */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updateConstraints$default(LibraryChipsView libraryChipsView, b bVar, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.a;
        }
        libraryChipsView.updateConstraints(bVar, list);
    }

    private final void updateViews(List<FilterRowLibrary.Filter> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getSelected()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            View view = this.clearButtonView;
            if (view != null) {
                view.setVisibility(0);
            } else {
                h.k("clearButtonView");
                throw null;
            }
        }
        Map<Integer, ChipView> map = this.chipViews;
        if (map != null) {
            for (ChipView chipView : map.values()) {
                chipView.getBackground().getRoot().setOnClickListener(null);
            }
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    FilterRowLibrary.Filter filter = list.get(size);
                    Map<Integer, ChipView> map2 = this.chipViews;
                    if (map2 != null) {
                        ChipView chipView2 = (ChipView) d.o(map2, Integer.valueOf(filter.getId()));
                        chipView2.selected(filter.getSelected(), size);
                        chipView2.visibility(0);
                        chipView2.getBackground().getRoot().setOnClickListener(new LibraryChipsView$updateViews$2(this, filter, size));
                        chipView2.getBackground().getRoot().bringToFront();
                        chipView2.getText().getRoot().bringToFront();
                    } else {
                        h.k("chipViews");
                        throw null;
                    }
                } else {
                    return;
                }
            }
        } else {
            h.k("chipViews");
            throw null;
        }
    }

    public final OnFilterSelectedChangedListener getListener$libs_encore_consumer_components_yourlibrary_impl() {
        return this.listener;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, f> nmf) {
        h.e(nmf, "event");
        Element.DefaultImpls.onEvent(this, nmf);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.duration = getResources().getInteger(com.spotify.encore.consumer.components.yourlibrary.impl.R.integer.library_filter_chips_duration);
        this.chipViews = new LinkedHashMap();
        this.clearButtonView = createClearButton();
        b constraintSet = getConstraintSet(com.spotify.encore.consumer.components.yourlibrary.impl.R.id.start);
        constraintSet.i(this);
        h.d(constraintSet, "startingSet");
        updateConstraints$default(this, constraintSet, null, 2, null);
        constraintSet.c(this);
        b constraintSet2 = getConstraintSet(com.spotify.encore.consumer.components.yourlibrary.impl.R.id.end);
        constraintSet2.i(this);
        h.d(constraintSet2, "endingSet");
        updateConstraints$default(this, constraintSet2, null, 2, null);
        p.b transition = getTransition(com.spotify.encore.consumer.components.yourlibrary.impl.R.id.transition);
        h.d(transition, "getTransition(R.id.transition)");
        this.chipsTransition = transition;
        setTransitionListener(new LibraryChipsView$onFinishInflate$transitionListener$1(this));
    }

    public final void setListener$libs_encore_consumer_components_yourlibrary_impl(OnFilterSelectedChangedListener onFilterSelectedChangedListener) {
        this.listener = onFilterSelectedChangedListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LibraryChipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.chipMargin = getResources().getDimensionPixelSize(com.spotify.encore.consumer.components.yourlibrary.impl.R.dimen.library_chip_horizontal_margin);
        this.reducedChipMargin = getResources().getDimensionPixelSize(com.spotify.encore.consumer.components.yourlibrary.impl.R.dimen.library_chip_horizontal_reduced_margin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsViewKt$sam$java_lang_Runnable$0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void render(java.util.List<com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary.Filter> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.h.e(r3, r0)
            java.util.List<com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary$Filter> r0 = r2.previous
            boolean r0 = kotlin.jvm.internal.h.a(r0, r3)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsViewKt.access$validate(r3)
            cmf<kotlin.f> r0 = r2.renderTask
            if (r0 == 0) goto L_0x001d
            com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsViewKt$sam$i$java_lang_Runnable$0 r1 = new com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsViewKt$sam$i$java_lang_Runnable$0
            r1.<init>(r0)
            r2.removeCallbacks(r1)
        L_0x001d:
            com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsView$render$2 r0 = new com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsView$render$2
            r0.<init>(r2, r3)
            r2.renderTask = r0
            if (r0 == 0) goto L_0x002c
            com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsViewKt$sam$java_lang_Runnable$0 r3 = new com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsViewKt$sam$java_lang_Runnable$0
            r3.<init>(r0)
            r0 = r3
        L_0x002c:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsView.render(java.util.List):void");
    }

    /* access modifiers changed from: private */
    public final void render(List<FilterRowLibrary.Filter> list, List<FilterRowLibrary.Filter> list2, boolean z) {
        addMissingChips(list);
        p.b bVar = this.chipsTransition;
        if (bVar != null) {
            b constraintSet = getConstraintSet(bVar.y());
            h.d(constraintSet, "start");
            updateConstraints(constraintSet, list2);
            p.b bVar2 = this.chipsTransition;
            if (bVar2 != null) {
                b constraintSet2 = getConstraintSet(bVar2.w());
                h.d(constraintSet2, "end");
                updateConstraints(constraintSet2, list);
                updateViews(list);
                p.b bVar3 = this.chipsTransition;
                if (bVar3 != null) {
                    int y = bVar3.y();
                    p.b bVar4 = this.chipsTransition;
                    if (bVar4 != null) {
                        setTransition(y, bVar4.w());
                        setTransitionDuration(z ? this.duration : 0);
                        transitionToEnd();
                        return;
                    }
                    h.k("chipsTransition");
                    throw null;
                }
                h.k("chipsTransition");
                throw null;
            }
            h.k("chipsTransition");
            throw null;
        }
        h.k("chipsTransition");
        throw null;
    }
}
