package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;

abstract class BaseDrawnComponent extends BaseComponent implements WatchFaceDecomposition.DrawnComponent {

    static abstract class BaseDrawnBuilder<T extends BaseDrawnBuilder<T, K>, K extends WatchFaceDecomposition.Component> extends BaseComponent.BaseBuilder<T, K> {
        BaseDrawnBuilder(BaseComponent.ComponentFactory<K> componentFactory) {
            super(componentFactory);
        }
    }

    BaseDrawnComponent(Bundle bundle) {
        super(bundle);
    }

    @Override // android.support.wearable.watchface.decomposition.WatchFaceDecomposition.DrawnComponent
    public int b() {
        return this.a.getInt("zOrder");
    }
}
