package com.spotify.encore;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;

public interface ComponentFactory<ComponentType extends Component<?, ?>, Configuration extends ComponentConfiguration> {

    public static final class DefaultImpls {
        public static <ComponentType extends Component<?, ?>, Configuration extends ComponentConfiguration> ComponentType make(ComponentFactory<ComponentType, ? super Configuration> componentFactory) {
            return componentFactory.make(null);
        }
    }

    ComponentType make();

    ComponentType make(Configuration configuration);
}
