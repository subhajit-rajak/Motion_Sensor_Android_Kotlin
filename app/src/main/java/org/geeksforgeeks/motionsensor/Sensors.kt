package org.geeksforgeeks.motionsensor

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class MotionSensor(
    context: Context
): AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_ACCELEROMETER,
    sensorType = Sensor.TYPE_ACCELEROMETER
)