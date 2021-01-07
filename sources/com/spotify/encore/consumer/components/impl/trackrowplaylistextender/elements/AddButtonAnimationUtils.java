package com.spotify.encore.consumer.components.impl.trackrowplaylistextender.elements;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;

final class AddButtonAnimationUtils {
    private static final long ADD_ANIMATION_DURATION = 1000;
    private static final Keyframe[] ADD_ANIMATION_OPACITY_KEYFRAMES = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.15f, 1.0f), Keyframe.ofFloat(0.2f, 0.5f), Keyframe.ofFloat(0.25f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)};
    private static final Keyframe[] ADD_ANIMATION_SCALE_KEYFRAMES = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.75f), Keyframe.ofFloat(0.4f, 1.2f), Keyframe.ofFloat(1.0f, 1.0f)};

    private AddButtonAnimationUtils() {
    }

    public static ValueAnimator make(Object obj) {
        Property property = View.SCALE_X;
        Keyframe[] keyframeArr = ADD_ANIMATION_SCALE_KEYFRAMES;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofKeyframe(property, keyframeArr), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeArr), PropertyValuesHolder.ofKeyframe(View.ALPHA, ADD_ANIMATION_OPACITY_KEYFRAMES));
        ofPropertyValuesHolder.setDuration(ADD_ANIMATION_DURATION);
        return ofPropertyValuesHolder;
    }
}
