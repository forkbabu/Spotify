package com.spotify.remoteconfig.runtime.model;

public interface PropertyModel {

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class PropertyModelType extends Enum<PropertyModelType> {
        public static final PropertyModelType a;
        private static final /* synthetic */ PropertyModelType[] b;

        static {
            PropertyModelType propertyModelType = new PropertyModelType("ENUM", 2);
            a = propertyModelType;
            b = new PropertyModelType[]{new PropertyModelType("INTEGER", 0), new PropertyModelType("BOOL", 1), propertyModelType};
        }

        private PropertyModelType(String str, int i) {
        }

        public static PropertyModelType valueOf(String str) {
            return (PropertyModelType) Enum.valueOf(PropertyModelType.class, str);
        }

        public static PropertyModelType[] values() {
            return (PropertyModelType[]) b.clone();
        }
    }

    public static abstract class a<T extends PropertyModel> {
    }

    String name();

    Object value();
}
