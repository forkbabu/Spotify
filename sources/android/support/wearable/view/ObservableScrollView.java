package android.support.wearable.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView {
    private a a;

    public interface a {
        void a(float f);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a((float) (i4 - i2));
        }
    }

    public void setOnScrollListener(a aVar) {
        this.a = aVar;
    }
}
