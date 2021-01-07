package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;

abstract class BaseComponent implements WatchFaceDecomposition.Component {
    protected final Bundle a;

    static abstract class BaseBuilder<T extends BaseBuilder<T, K>, K extends WatchFaceDecomposition.Component> {
        private final ComponentFactory<K> a;

        BaseBuilder(ComponentFactory<K> componentFactory) {
            new Bundle();
            this.a = componentFactory;
        }
    }

    interface ComponentFactory<T extends WatchFaceDecomposition.Component> {
    }

    BaseComponent(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.support.wearable.watchface.decomposition.WatchFaceDecomposition.Component
    public boolean a() {
        return (c() & 2) != 0;
    }

    public int c() {
        return this.a.getInt("display_modes");
    }
}
