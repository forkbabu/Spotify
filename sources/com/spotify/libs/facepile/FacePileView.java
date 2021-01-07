package com.spotify.libs.facepile;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;

public class FacePileView extends LinearLayout {
    private static final float DEFAULT_BORDER_THICKNESS = 0.0f;
    private static final int DEFAULT_FACE_VIEW_COUNT = 2;
    private static final boolean DEFAULT_SHOW_ADDITIONAL_COUNT = true;
    private final float mBorderThicknessPx;
    private final int mConsecutiveFaceMarginPx;
    private final FacePileContainer mFaceViewContainer;
    private final List<FaceView> mFaceViews;
    private boolean mShowAdditionalCount;
    private final yud mStateListAnimatorHelper;

    public FacePileView(Context context) {
        this(context, null);
    }

    private static void setFaceStartMargin(FaceView faceView, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) faceView.getLayoutParams();
        if (nud.m(faceView.getContext())) {
            marginLayoutParams.rightMargin = i;
        } else {
            marginLayoutParams.leftMargin = i;
        }
        faceView.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.mStateListAnimatorHelper.a();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mStateListAnimatorHelper.c();
    }

    public void setFacePile(Picasso picasso, d dVar) {
        List<FaceView> list = this.mFaceViews;
        boolean z = this.mShowAdditionalCount;
        picasso.getClass();
        list.getClass();
        dVar.getClass();
        List<c> b = dVar.b();
        if (!list.isEmpty()) {
            Iterator<FaceView> it = list.iterator();
            Iterator<c> it2 = b.iterator();
            if (b.size() <= list.size() || !z) {
                while (it.hasNext() && it2.hasNext()) {
                    it.next().a(picasso, it2.next());
                }
                while (it.hasNext()) {
                    it.next().a(picasso, null);
                }
                return;
            }
            int size = list.size() - 1;
            for (int i = 0; i < size; i++) {
                it.next().a(picasso, it2.next());
            }
            it.next().setAdditionalCount(b.size() - size);
        }
    }

    public void setFaceSize(int i) {
        this.mFaceViewContainer.a(((float) i) / 2.0f, this.mBorderThicknessPx, (float) this.mConsecutiveFaceMarginPx);
        for (FaceView faceView : this.mFaceViews) {
            setFaceSize(faceView, i);
        }
    }

    public FacePileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FacePileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStateListAnimatorHelper = new yud(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(C0707R.dimen.face_size));
        this.mConsecutiveFaceMarginPx = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(C0707R.dimen.second_face_left_margin));
        int integer = obtainStyledAttributes.getInteger(2, 2);
        this.mShowAdditionalCount = obtainStyledAttributes.getBoolean(4, DEFAULT_SHOW_ADDITIONAL_COUNT);
        this.mBorderThicknessPx = obtainStyledAttributes.getDimension(0, DEFAULT_BORDER_THICKNESS);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(getContext());
        FacePileContainer facePileContainer = (FacePileContainer) from.inflate(C0707R.layout.face_pile_container_view, (ViewGroup) this, false);
        this.mFaceViewContainer = facePileContainer;
        addView(facePileContainer);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < integer; i2++) {
            FaceView faceView = (FaceView) from.inflate(C0707R.layout.face_view, (ViewGroup) this.mFaceViewContainer, false);
            if (i2 == 0) {
                faceView.setId(C0707R.id.face_pile_first);
            } else {
                setFaceStartMargin(faceView, this.mConsecutiveFaceMarginPx);
            }
            if (this.mBorderThicknessPx <= DEFAULT_BORDER_THICKNESS && Build.VERSION.SDK_INT >= 21) {
                faceView.setElevation(((float) ((integer - i2) - 1)) * getResources().getDisplayMetrics().density);
            }
            builder.mo53add((ImmutableList.Builder) faceView);
            this.mFaceViewContainer.addView(faceView);
        }
        this.mFaceViews = builder.build();
        setFaceSize(dimensionPixelSize);
    }

    private static void setFaceSize(FaceView faceView, int i) {
        ViewGroup.LayoutParams layoutParams = faceView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        faceView.setLayoutParams(layoutParams);
    }
}
