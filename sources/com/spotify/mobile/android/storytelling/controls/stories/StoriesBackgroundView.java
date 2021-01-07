package com.spotify.mobile.android.storytelling.controls.stories;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StoriesBackgroundView extends View {
    private final GestureDetector a = new GestureDetector(getContext(), new a());
    private nmf<? super StoryGesture, f> b;
    private boolean c;

    private final class a extends GestureDetector.SimpleOnGestureListener {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        private final void a(MotionEvent motionEvent) {
            float width = ((float) StoriesBackgroundView.this.getWidth()) / 3.0f;
            float f = 2.0f * width;
            float x = motionEvent.getX();
            if (x <= width) {
                StoriesBackgroundView.a(StoriesBackgroundView.this, StoryGesture.LEFT_CLICK);
            } else if (x >= f) {
                StoriesBackgroundView.a(StoriesBackgroundView.this, StoryGesture.RIGHT_CLICK);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            h.e(motionEvent, "motionEvent");
            a(motionEvent);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            h.e(motionEvent, "e1");
            h.e(motionEvent2, "e2");
            if (motionEvent2.getY() - motionEvent.getY() <= 200.0f) {
                return false;
            }
            StoriesBackgroundView.a(StoriesBackgroundView.this, StoryGesture.SWIPE_TOP_DOWN);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            h.e(motionEvent, "motionEvent");
            a(motionEvent);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesBackgroundView(Context context) {
        super(context);
        h.e(context, "context");
    }

    public static final void a(StoriesBackgroundView storiesBackgroundView, StoryGesture storyGesture) {
        nmf<? super StoryGesture, f> nmf = storiesBackgroundView.b;
        if (nmf != null) {
            nmf.invoke(storyGesture);
        }
    }

    public final void b() {
        this.b = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h.e(motionEvent, "event");
        if (!this.c && motionEvent.getAction() == 0) {
            StoryGesture storyGesture = StoryGesture.SCREEN_PRESS;
            nmf<? super StoryGesture, f> nmf = this.b;
            if (nmf != null) {
                nmf.invoke(storyGesture);
            }
            this.c = true;
        }
        if (this.c && 1 == motionEvent.getAction()) {
            StoryGesture storyGesture2 = StoryGesture.SCREEN_PRESS_RELEASE;
            nmf<? super StoryGesture, f> nmf2 = this.b;
            if (nmf2 != null) {
                nmf2.invoke(storyGesture2);
            }
            this.c = false;
        }
        if (this.a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setStoryGestureListener(nmf<? super StoryGesture, f> nmf) {
        h.e(nmf, "storyGestureListener");
        this.b = nmf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
