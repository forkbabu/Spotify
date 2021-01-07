package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.util.Map;

public class ConfigOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    protected JsonInclude.Value _defaultInclusion;
    protected Boolean _defaultMergeable;
    protected JsonSetter.Value _defaultSetterInfo;
    protected Map<Class<?>, Object> _overrides = null;
    protected VisibilityChecker<?> _visibilityChecker;

    public ConfigOverrides() {
        JsonInclude.Value empty = JsonInclude.Value.empty();
        JsonSetter.Value empty2 = JsonSetter.Value.empty();
        VisibilityChecker.Std defaultInstance = VisibilityChecker.Std.defaultInstance();
        this._defaultInclusion = empty;
        this._defaultSetterInfo = empty2;
        this._visibilityChecker = defaultInstance;
        this._defaultMergeable = null;
    }

    public ConfigOverride findOverride(Class<?> cls) {
        Map<Class<?>, Object> map = this._overrides;
        if (map == null) {
            return null;
        }
        return (ConfigOverride) map.get(cls);
    }

    public VisibilityChecker<?> getDefaultVisibility() {
        return this._visibilityChecker;
    }

    public void setDefaultInclusion(JsonInclude.Value value) {
        this._defaultInclusion = value;
    }

    public void setDefaultVisibility(VisibilityChecker<?> visibilityChecker) {
        this._visibilityChecker = visibilityChecker;
    }
}
