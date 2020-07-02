package com.example.camera2

import android.annotation.SuppressLint
import android.app.Application
import androidx.camera.camera2.Camera2Config
import androidx.camera.core.CameraXConfig
import androidx.camera.core.impl.*


class Application: Application(),  CameraXConfig.Provider  {


    @SuppressLint("RestrictedApi")
    override fun getCameraXConfig(): CameraXConfig {
//        return Camera2Config.defaultConfig()
        val surfaceManagerProvider = CameraDeviceSurfaceManager.Provider {
            RGBSurfaceManager()
        }

        return CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig())
            .setDeviceSurfaceManagerProvider(surfaceManagerProvider)
            .build();
    }

}