package com.example.camera2

import android.util.Rational
import android.util.Rational.ZERO
import android.util.Size
import androidx.camera.core.impl.CameraDeviceSurfaceManager
import androidx.camera.core.impl.SurfaceConfig
import androidx.camera.core.impl.UseCaseConfig


class RGBSurfaceManager : CameraDeviceSurfaceManager {
    override fun requiresCorrectedAspectRatio(cameraId: String): Boolean {
//        TODO("Not yet implemented")
        return true
    }

    override fun checkSupported(
        cameraId: String?,
        surfaceConfigList: MutableList<SurfaceConfig>?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun transformSurfaceConfig(
        cameraId: String?,
        imageFormat: Int,
        size: Size?
    ): SurfaceConfig {
        TODO("Not yet implemented")
    }

    override fun getSuggestedResolutions(
        cameraId: String,
        existingSurfaces: MutableList<SurfaceConfig>,
        newUseCaseConfigs: MutableList<UseCaseConfig<*>>
    ): MutableMap<UseCaseConfig<*>, Size> {

        return mutableMapOf(newUseCaseConfigs[0] to Size(1920, 1080),
            newUseCaseConfigs[1] to Size(1920, 1080))
    }

    override fun getPreviewSize(): Size {
        return Size(1920, 1080)
    }

    override fun getCorrectedAspectRatio(cameraId: String, rotation: Int): Rational? {
        return ZERO
    }

    override fun getMaxOutputSize(cameraId: String?, imageFormat: Int): Size? {
        TODO("Not yet implemented")
    }

}
