package com.just1gaming321.bedrockvrmod.vr;

public class VRSettings {
    private static float renderScale = 1.0f;
    private static float fov = 90.0f;

    public static float getRenderScale() {
        return renderScale;
    }

    public static void setRenderScale(float scale) {
        renderScale = scale;
    }

    public static float getFov() {
        return fov;
    }

    public static void setFov(float fov) {
        VRSettings.fov = fov;
    }
}
