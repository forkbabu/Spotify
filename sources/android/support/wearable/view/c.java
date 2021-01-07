package android.support.wearable.view;

class c implements Runnable {
    final /* synthetic */ DismissOverlayView a;

    c(DismissOverlayView dismissOverlayView) {
        this.a = dismissOverlayView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.setVisibility(8);
        this.a.setAlpha(1.0f);
    }
}
