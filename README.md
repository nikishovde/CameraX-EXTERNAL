# CameraX-EXTERNAL
Unfortunately,  CameraX does not support external cameras for 1.0.0-beta06, as posted in Android CameraX Discussion Group: https://groups.google.com/a/android.com/g/camerax-developers/c/Qfv9HPfq9HM

The solution provided in this project is to use custom CameraDeviceSurfaceManager

# Check your devices camera HAL
```
adb shell dumpsys media.camera
```
Check for android.info.supportedHardwareLevel in the output:
```
...
== Camera HAL device device@3.4/external//dev/video0 (v3.4) dumpState: ==
No active camera device session instance
== Camera HAL device device@3.4/external//dev/video2 (v3.4) static information: ==
  Resource cost: 100
  Conflicting devices: None
  API1 info:
    Has a flash unit: false
    Facing: Back
    Orientation: 0
  API2 camera characteristics:
    Dumping camera metadata array: 52 / 52 entries, 2472 / 2472 bytes of extra data.
      Version: 1, Flags: 00000000
      android.info.supportedHardwareLevel (150000): byte[1]
        [EXTERNAL ]
...
```
