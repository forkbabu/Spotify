package com.spotify.music.alexaaccountlinking.errors;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.ui.u;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a {
    private Component<ErrorBanner.Model, ErrorBanner.Events> a;
    private final Window b;
    private final ComponentFactory<Component<ErrorBanner.Model, ErrorBanner.Events>, ErrorBanner.Configuration> c;

    /* renamed from: com.spotify.music.alexaaccountlinking.errors.a$a  reason: collision with other inner class name */
    private static final class C0206a extends u {
        private final View b;
        private final cmf<f> c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0206a(Window.Callback callback, View view, cmf<f> cmf) {
            super(callback);
            h.e(cmf, "action");
            this.b = view;
            this.c = cmf;
        }

        @Override // com.spotify.mobile.android.util.ui.u, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Rect rect = new Rect();
            View view = this.b;
            if (view != null) {
                view.getGlobalVisibleRect(rect);
            }
            if (motionEvent != null && !rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.c.invoke();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.encore.ComponentFactory<com.spotify.encore.Component<com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner$Model, com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner$Events>, ? super com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner$Configuration> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Window window, ComponentFactory<Component<ErrorBanner.Model, ErrorBanner.Events>, ? super ErrorBanner.Configuration> componentFactory) {
        h.e(window, "window");
        h.e(componentFactory, "errorBannerFactory");
        this.b = window;
        this.c = componentFactory;
    }

    public final void a(ViewGroup viewGroup) {
        h.e(viewGroup, "parentView");
        Component<ErrorBanner.Model, ErrorBanner.Events> component = this.a;
        viewGroup.removeView(component != null ? component.getView() : null);
    }

    public final void b(c cVar, ViewGroup viewGroup) {
        View view;
        View view2;
        h.e(cVar, AppProtocol.LogMessage.SEVERITY_ERROR);
        h.e(viewGroup, "parentView");
        Component<ErrorBanner.Model, ErrorBanner.Events> component = this.a;
        View view3 = null;
        if (!((component == null || (view2 = component.getView()) == null || viewGroup.indexOfChild(view2) == -1) ? false : true)) {
            this.a = this.c.make();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 81;
            Context context = viewGroup.getContext();
            h.d(context, "parentView.context");
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.error_banner_margin_side);
            Context context2 = viewGroup.getContext();
            h.d(context2, "parentView.context");
            int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(C0707R.dimen.error_banner_margin_side);
            Context context3 = viewGroup.getContext();
            h.d(context3, "parentView.context");
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize2, context3.getResources().getDimensionPixelSize(C0707R.dimen.error_banner_margin_bottom));
            Component<ErrorBanner.Model, ErrorBanner.Events> component2 = this.a;
            if (!(component2 == null || (view = component2.getView()) == null)) {
                view.setLayoutParams(layoutParams);
            }
            Component<ErrorBanner.Model, ErrorBanner.Events> component3 = this.a;
            viewGroup.addView(component3 != null ? component3.getView() : null);
        }
        Component<ErrorBanner.Model, ErrorBanner.Events> component4 = this.a;
        if (component4 != null) {
            String string = viewGroup.getContext().getString(C0707R.string.alexa_linking_error_title);
            h.d(string, "parentView.context.getString(error.title)");
            String string2 = viewGroup.getContext().getString(C0707R.string.invalid_alexa_account_linking_error);
            h.d(string2, "parentView.context.getString(error.description)");
            String string3 = viewGroup.getContext().getString(C0707R.string.dismiss);
            h.d(string3, "parentView.context.getString(error.actionTitle)");
            component4.render(new ErrorBanner.Model(string, string2, string3, false, 8, null));
        }
        Component<ErrorBanner.Model, ErrorBanner.Events> component5 = this.a;
        if (component5 != null) {
            component5.onEvent(new ErrorBannerComponent$setErrorBannerClickListener$1(this, viewGroup));
        }
        Component<ErrorBanner.Model, ErrorBanner.Events> component6 = this.a;
        if (component6 != null) {
            view3 = component6.getView();
        }
        Window window = this.b;
        window.setCallback(new C0206a(window.getCallback(), view3, new ErrorBannerComponent$setCloseErrorBannerCallback$1(this, viewGroup)));
    }
}
