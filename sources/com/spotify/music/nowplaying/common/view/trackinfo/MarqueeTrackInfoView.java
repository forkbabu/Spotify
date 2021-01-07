package com.spotify.music.nowplaying.common.view.trackinfo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.trackinfo.e;

public class MarqueeTrackInfoView extends LinearLayout implements e, fqd {
    public static final /* synthetic */ int o = 0;
    private final TextView a;
    private final TextView b;
    private e.a c;
    private final GestureDetector f;
    private final GestureDetector n;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (MarqueeTrackInfoView.this.c == null) {
                return true;
            }
            ((c) MarqueeTrackInfoView.this.c).c();
            return true;
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (MarqueeTrackInfoView.this.c == null) {
                return true;
            }
            ((c) MarqueeTrackInfoView.this.c).b();
            return true;
        }
    }

    public MarqueeTrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        this.b.setTextColor(i);
    }

    @Override // com.spotify.music.nowplaying.common.view.trackinfo.e
    public void setListener(e.a aVar) {
        this.c = aVar;
    }

    @Override // com.spotify.music.nowplaying.common.view.trackinfo.e
    public void setSubtitle(String str) {
        if (!str.contentEquals(this.b.getText())) {
            this.b.setText(str);
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.trackinfo.e
    public void setTitle(String str) {
        if (!str.contentEquals(this.a.getText())) {
            this.a.setText(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public MarqueeTrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new a());
        this.f = gestureDetector;
        GestureDetector gestureDetector2 = new GestureDetector(getContext(), new b());
        this.n = gestureDetector2;
        LinearLayout.inflate(context, C0707R.layout.marquee_track_info_view, this);
        setOrientation(1);
        TextView textView = (TextView) findViewById(C0707R.id.marquee_track_info_view_title);
        this.a = textView;
        TextView textView2 = (TextView) findViewById(C0707R.id.marquee_track_info_view_subtitle);
        this.b = textView2;
        textView.setSelected(true);
        textView2.setSelected(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qqb.a, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(1, C0707R.style.res_2132083406_textappearance_marqueetracktitle);
            int resourceId2 = obtainStyledAttributes.getResourceId(0, C0707R.style.res_2132083404_textappearance_marqueetracksubtitle);
            c.n(textView, resourceId);
            c.n(textView2, resourceId2);
            obtainStyledAttributes.recycle();
            textView.setOnTouchListener(new a(gestureDetector));
            textView2.setOnTouchListener(new a(gestureDetector2));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
